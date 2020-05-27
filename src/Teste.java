public class Teste {
        /*
            A implementação deve considerar as seguintes regras:
            - Caso o número passado por parâmetro seja ímpar, retorne "ÍMPAR";
            - Caso seja par, retorne "PAR".
            Exemplos de entrada e saída:
                imparOuPar(2); // retorna "PAR"
                imparOuPar(7); // retorna "ÍMPAR"
                imparOuPar(252); // retorna "PAR"
        */
        public static String imparOuPar(int numero) {
            return "";
        }

        /*
            A implementação deve considerar as seguintes regras:
            - Caso um dos números seja negativo, deve retornar -1;
            - Caso os dois números sejam positivos, deve retornar a soma dos dois.
            Exemplos de entrada e saída:
                somarPositivos(-2, 3); // retorna -1
                somarPositivos(2, 5); // retorna 7
        */
        public static int somarPositivos(int num1, int num2) {
            return -1;
        }

        /*
            A implementação deve considerar as seguintes regras:
            - Para calcular a média, deve-se somar as notas das 3 provas (p1,p2,p3) e dividir por 3;
            Exemplos de entrada e saída:
                calcularMedia(6.2, 5.5, 7.6); // retorna 6.4
                calcularMedia(8.0, 9.2, 6.8 ); // retorna 8.0
        */
        public static double calcularMedia(double p1, double p2, double p3) {
            return 10;
        }

        /*
            A implementação deve considerar as seguintes regras:
            - A função avaliarMedia recebe uma média por parâmetro e retorna "APROVADO", "REPROVADO" ou "EM RECUPERACAO" dependendo do seu valor;
            - Se a média for maior que 6, deve retornar "APROVADO";
            - Se a média for maior que 5 e menor que 6, deve retornar "EM RECUPERACAO";
            - Se a média for menor que 5, deve retornar "REPROVADO".
            Exemplos de entrada e saída:
                avaliarMedia(7.3); // retorna "APROVADO"
                avaliarMedia(5.4); // retorna "EM RECUPERACAO"
                avaliarMedia(2.3); // retorna "REPROVADO"
        */
        public static String avaliarMedia(double media) {
            return "";
        }


        /*
            A implementação deve considerar as seguintes regras:
            - A função fazerBolo recebe 3 ingredientes e no final retorna se o bolo foi feito com sucesso;
            - Se forem inseridos os ingredientes "farinha", "ovos" e "leite" exatamente nessa ordem, a função retorna "HM... BOLO GOSTOSO! (* ^ ω ^)";
            - Se forem inseridos os ingredientes "farinha", "ovos" e qualquer outra coisa depois, a função retorna "TÁ FALTANDO ALGUMA COISA (・_・;)";
            - Se forem inseridos os ingredientes "farinha" e qualquer outra coisa depois, a função retorna "TÁ UMA MERDA! (╯°益°)╯彡┻━┻ ";
            Exemplos de entrada e saída:
                fazerBolo("farinha", "ovos", "leite"); // retorna "HM... BOLO GOSTOSO! (* ^ ω ^)"
                fazerBolo("farinha", "ovos", "batata"); // retorna "TÁ FALTANDO ALGUMA COISA (・_・;)"
                fazerBolo("farinha", "laranja", "limao"); // retorna "TÁ UMA MERDA! (╯°益°)╯彡┻━┻ "
        */
        public static String fazerBolo(String ingrediente1, String ingrediente2, String ingrediente3) {
            return "";
        }

        public static void main(String[] args) {
            // Teste as funções aqui
        }
}
