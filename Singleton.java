/*
O padrão de projeto Singleton é um padrão de projeto de criação 
que visa garantir que uma classe tenha apenas uma única 
instância e que forneça um ponto global de acesso para essa 
instância.

A ideia é criar uma classe que seja responsável por gerenciar 
a criação e a existência de uma única instância dessa classe, 
que é compartilhada em toda a aplicação. 
Isso é especialmente útil em situações em que apenas uma única 
instância de uma classe é necessária para coordenar tarefas em 
toda a aplicação.

Um exemplo de implementação do padrão Singleton em Java é o 
seguinte:
 */
    public class Singleton {
        private static Singleton instance = null;
        
        private Singleton() {
           // construtor privado para evitar a criação de instâncias fora da classe
        }
        
        public static Singleton getInstance() {
           if (instance == null) {
              instance = new Singleton();
           }
           return instance;
        }
     }

/*
Nesse exemplo, a classe Singleton tem um construtor privado que 
impede a criação de novas instâncias fora da própria classe. 
A classe também tem um método estático getInstance() que cria 
uma instância única da classe, se ela ainda não existir, e a 
retorna.

Dessa forma, toda vez que getInstance() é chamado, ele retorna 
a mesma instância da classe Singleton, garantindo que apenas 
uma única instância exista em toda a aplicação. 
Isso pode ser útil em casos em que é importante ter uma única 
instância de uma classe em toda a aplicação, como uma conexão 
de banco de dados ou uma configuração global.
 */