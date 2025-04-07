package academy.devdojo.maratonajava.javacore.Uregex.test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
    public static void main(String[] args) {
        //    \d   = retorna todos os digitos
        //    \D   = retorna todos que não sao digitos
        //    \s   = retorna todos espaços em branco        \t \n \f \r
        //    \S   = retorna todos exceto os espaços em branco
        //    \w   = retorna a-z A-Z, digitos, _
        //    \W   = retorna todos que não forem a-z A-Z, digitos, _
        //    []   = retorna expecificando as letras

        //String regex = "[a-zA-C]";
        String regex = "0[xX][0-9a-fA-F]";
        //String texto = "abaaba";
        String texto2 = "12 0x 0X 0xFFABC 0x109 0x1";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto2);
        System.out.println("texto:  "+texto2);
        System.out.println("indice: 0123456789");
        System.out.println("regex: "+regex);
        System.out.println("Posições encontradas");
        while (matcher.find()){
            System.out.print(matcher.start()+" "+matcher.group()+"\n");
        }

    }
}
