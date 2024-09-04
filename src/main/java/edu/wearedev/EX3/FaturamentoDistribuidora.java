package edu.wearedev.EX3;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;


    class FaturamentoDia {
        public int dia;
        public double valor;
    }

    public class FaturamentoDistribuidora {

        public static void main(String[] args) {
            try {
                ObjectMapper mapper = new ObjectMapper();
                List<FaturamentoDia> faturamentos = mapper.readValue(new File("src/main/java/edu/wearedev/teste3/dados.json"), new TypeReference<List<FaturamentoDia>>() {});

                double menorValor = Double.MAX_VALUE;
                double maiorValor = Double.MIN_VALUE;
                double soma = 0;
                int diasComFaturamento = 0;

                for (FaturamentoDia faturamento : faturamentos) {
                    if (faturamento.valor > 0) {
                        if (faturamento.valor < menorValor) {
                            menorValor = faturamento.valor;
                        }
                        if (faturamento.valor > maiorValor) {
                            maiorValor = faturamento.valor;
                        }
                        soma += faturamento.valor;
                        diasComFaturamento++;
                    }
                }

                // Calcula a média mensal (excluindo dias sem faturamento)
                double mediaMensal = soma / diasComFaturamento;
                int diasAcimaDaMedia = 0;

                // Conta o número de dias com faturamento acima da média mensal
                for (FaturamentoDia faturamento : faturamentos) {
                    if (faturamento.valor > mediaMensal) {
                        diasAcimaDaMedia++;
                    }
                }

                // Resultados
                System.out.println("Menor valor de faturamento: " + menorValor);
                System.out.println("Maior valor de faturamento: " + maiorValor);
                System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


