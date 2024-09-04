package edu.wearedev;

public class EX5 {
    public static void main(String[] args) {
        // String a ser invertida
        String str = "Exemplo de string";

        // Converta a string para um array de caracteres
        char[] chars = str.toCharArray();

        // StringBuilder para armazenar a string invertida
        StringBuilder invertedStr = new StringBuilder();

        // Laço for para percorrer o array de caracteres do final para o início
        for (int i = chars.length - 1; i >= 0; i--) {
            invertedStr.append(chars[i]);
        }

        // Exiba a string invertida
        System.out.println("String original: " + str);
        System.out.println("String invertida: " + invertedStr.toString());
    }
}
