package academy.devdojo.maratonajava.javacore.QString.test;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "   Gabriela";
        String numeros = "012345";

        System.out.println(nome.charAt(5));
        System.out.println(nome.length());
        System.out.println(nome.replace("a", "g"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(0,2));
        System.out.println(numeros.substring(0));
        System.out.println(nome.trim());
    }
}
