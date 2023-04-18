/*
O princípio da Segregação de Interfaces, ou Princípio da 
Segregação de Responsabilidade, é um conceito importante em 
programação orientada a objetos que estabelece que uma classe não 
deve ser forçada a implementar interfaces e métodos que ela não 
precisa.

Em outras palavras, as interfaces devem ser segregadas em partes 
menores, para que as classes que as implementam não tenham que 
implementar métodos que não são relevantes para elas.

Um exemplo em Java pode ser o seguinte:

Suponha que temos uma interface Animal, que define dois métodos: 
comer() e dormir(). 
Em seguida, temos duas classes que implementam a interface Animal: 
Cachorro e Gato.

Agora, suponha que precisamos adicionar um novo método, chamado 
voar(), na interface Animal. 
No entanto, nem todos os animais voam, então não faz sentido que 
Cachorro e Gato implementem esse novo método.

Nesse caso, o princípio da Segregação de Interfaces é violado, 
porque estamos forçando as classes Cachorro e Gato a implementar 
um método que elas não precisam.

Para resolver esse problema, podemos criar duas interfaces separadas:
uma para os animais que voam e outra para os animais que não voam.

Veja o código abaixo:
 */

public class Segregacao {
    interface AnimalQueNaoVoa {
        void comer();
        void dormir();
     }
     
     interface AnimalQueVoa {
        void voar();
     }
     
     class Cachorro implements AnimalQueNaoVoa {
        public void comer() {
           System.out.println("Cachorro comendo");
        }
     
        public void dormir() {
           System.out.println("Cachorro dormindo");
        }
     }
     
     class Pato implements AnimalQueNaoVoa, AnimalQueVoa {
        public void comer() {
           System.out.println("Pato comendo");
        }
     
        public void dormir() {
           System.out.println("Pato dormindo");
        }
     
        public void voar() {
           System.out.println("Pato voando");
        }
     }
     
     public class Teste {
        public static void main(String[] args) {
           Cachorro cachorro = new Cachorro();
           Pato pato = new Pato();
     
           cachorro.comer();
           cachorro.dormir();
     
           pato.comer();
           pato.dormir();
           pato.voar();
        }
     }     
}

/*
Neste exemplo, criamos duas interfaces separadas para os animais 
que voam e os que não voam. 
A classe Cachorro implementa apenas a interface AnimalQueNaoVoa, 
enquanto a classe Pato implementa ambas as interfaces 
AnimalQueNaoVoa e AnimalQueVoa. 
Isso garante que cada classe implemente apenas os métodos 
relevantes para ela, seguindo o princípio da Segregação de 
Interfaces.
 */