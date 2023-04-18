/*
O princípio de Liskov, também conhecido como Princípio da 
Substituição de Liskov, é um conceito importante em programação 
orientada a objetos que estabelece que um objeto de uma classe 
derivada deve ser capaz de ser substituído por um objeto de sua 
classe base sem interromper o comportamento do programa.

Em outras palavras, se uma classe B é uma subclasse de uma classe A,
então um objeto da classe B deve ser capaz de substituir um objeto 
da classe A sem afetar a integridade do programa.

Um exemplo em Java pode ser o seguinte:

Suponha que temos uma classe Animal e uma classe Cachorro que 
herda de Animal. 
A classe Animal tem um método chamado emitirSom() que simplesmente 
imprime "Som de animal" na tela. 
A classe Cachorro também tem um método emitirSom() que imprime 
"Latido" na tela.

Agora, se temos um método que aceita um objeto da classe Animal e 
chama o método emitirSom(), podemos passar um objeto da classe 
Cachorro como argumento e o método deve imprimir "Latido" na tela.

Veja o código abaixo:
 */

public class Liskov {
    class Animal {
        public void emitirSom() {
           System.out.println("Som de animal");
        }
     }
     
     class Cachorro extends Animal {
        public void emitirSom() {
           System.out.println("Latido");
        }
     }
     
     public class Teste {
        public static void main(String[] args) {
           Animal animal = new Cachorro();
           animal.emitirSom();
        }
     }     
}

/* 
Neste exemplo, o objeto da classe Cachorro pode ser substituído 
por um objeto da classe Animal sem interromper o comportamento do 
programa, pois o método emitirSom() é substituído na classe 
Cachorro para produzir um som diferente.
*/