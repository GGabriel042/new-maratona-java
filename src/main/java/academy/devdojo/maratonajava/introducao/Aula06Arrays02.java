package academy.devdojo.maratonajava.introducao;

public class Aula06Arrays02 {
    public static void main(String[] args) {

        String[] nomes = new String[3];

        nomes[0] = "Goku";
        nomes[1] = "Gohan";
        nomes[2] = "Vegeta";

        nomes = new String[5];

        nomes[1] = "Gohan";
        nomes[3] = "Picollo";
        nomes[4] = "Bulma";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
