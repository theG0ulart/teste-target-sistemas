package edu.wearedev;

public class EX2 {
    public static void main(String[] args) {
        int numeroInformado = 21; // Número que você quer verificar se está na sequência de Fibonacci
        int num1 = 0, num2 = 1;

        boolean pertence = false;

        while (num1 <= numeroInformado) {
            if (num1 == numeroInformado) {
                pertence = true;
                break;
            }

            int somaDosAnteriores = num1 + num2;
            num1 = num2;
            num2 = somaDosAnteriores;
        }

        if (pertence) {
            System.out.println("O número " + numeroInformado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numeroInformado + " não pertence à sequência de Fibonacci.");
        }
    }
}
