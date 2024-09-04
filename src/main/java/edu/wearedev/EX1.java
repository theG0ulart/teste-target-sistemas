package edu.wearedev;

public class EX1 {
    public static void main(String[] args) {
        int i = 13;
        int SOMA = 0;
        int K = 0;


        while (true) {
            if(K < i){
                K++;
                SOMA += K;
            } else {
                System.out.print(SOMA);
                break;
            }
        }
    }
}
