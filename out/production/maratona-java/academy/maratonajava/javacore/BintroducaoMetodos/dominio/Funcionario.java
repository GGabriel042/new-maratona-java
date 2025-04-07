package academy.devdojo.maratonajava.javacore.BintroducaoMetodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimeDados() {
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios == null) {
            return;
        }
        for (double salario : this.salarios) {
            System.out.println(salario);
        }
        imprimeMediaSalarial();
    }

    public void imprimeMediaSalarial() {

        if (salarios == null) {
            return;
        }

        for (double salario : this.salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println(media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
