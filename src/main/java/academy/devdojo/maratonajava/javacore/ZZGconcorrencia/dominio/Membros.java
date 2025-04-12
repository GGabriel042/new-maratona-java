package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.dominio;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Membros extends academy.devdojo.maratonajava.javacore.ZZFthreads.dominio.Membros {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean open = true;

    public boolean isOpen(){
        return open;
    }

    public int pendingEmail(){
        lock.lock();
        try {
            return emails.size();
        } finally {
            lock.unlock();
        }
    }

    public void addMemberEmail(String email) {
        lock.lock();
        try {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " adicionou email na lista");
            this.emails.add(email);
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public String retriveEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName()+ " checking if there are emails");
        lock.lock();
        try {
            while (this.emails.size()==0){
                if (!open) return null;
                System.out.println(Thread.currentThread().getName()+ " não tem email disponivel na lista, entrando em modo de espera");
                condition.await();
            }
            return this.emails.poll();
        } finally {
            lock.unlock();
        }
    }

    public void close(){
        open = false;
        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " notificando a todos, que não estamos adicionando emails");
            condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
