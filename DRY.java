/*
DRY é uma sigla que significa "Don't Repeat Yourself" 
(Não Se Repita, em português). 
É uma técnica de programação que preconiza a reutilização de 
código e a minimização da duplicação de código em um software.

Por outro lado, a técnica NÃO DRY é quando o código possui muita 
repetição, ou seja, uma mesma funcionalidade é implementada várias
vezes em locais diferentes.

Um exemplo de código DRY em Java seria a criação de um método que 
calcula a média de um conjunto de números, que pode ser utilizado 
em diferentes partes do programa. 
Em vez de escrever o cálculo da média várias vezes, o desenvolvedor 
pode simplesmente chamar o método sempre que precisar dessa 
funcionalidade. 

Veja o exemplo abaixo:
 */

public class DRY{
    public class Calculadora {
        public static double calcularMedia(double[] numeros) {
            double soma = 0;
            for (double numero : numeros) {
                soma += numero;
            }
            return soma / numeros.length;
        }
    }
}

/*
Com este método, em vez de repetir o código de cálculo da média 
várias vezes em diferentes partes do programa, o desenvolvedor 
pode simplesmente chamar o método calcularMedia sempre que 
precisar dessa funcionalidade:
 */

double[] notas = { 7.5, 8.0, 9.5, 6.5, 8.5 };
double media = Calculadora.calcularMedia(notas);

/*
Por outro lado, um exemplo de código NÃO DRY em Java seria se o 
desenvolvedor implementasse o mesmo cálculo da média várias vezes 
em diferentes partes do programa, sem reutilizar o código. 
Isso resultaria em uma duplicação desnecessária de código e 
tornaria o programa mais difícil de manter e modificar no futuro.
 */