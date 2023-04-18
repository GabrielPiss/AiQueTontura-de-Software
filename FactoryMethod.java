
/*
O Factory Method é um padrão de projeto de software que 
pertence à categoria dos padrões de criação (creational patterns) 
e tem como objetivo fornecer uma interface para criação de objetos,
permitindo que as subclasses decidam qual classe concreta 
instanciar. Em outras palavras, ele permite que uma classe 
delegue a responsabilidade de criação de objetos para suas 
subclasses.

Em Java, o Factory Method pode ser implementado de diversas formas,
mas uma das mais comuns é através da criação de uma interface
ou classe abstrata que define o método factory. 
As subclasses podem então implementar esse método factory 
para retornar diferentes instâncias da classe apropriada.

A seguir, apresento um exemplo simples de implementação do 
Factory Method em Java:
*/

public class FactoryMethod {
    public interface Animal {
        void makeSound();
    }

    public class Dog implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Woof!");
        }
    }

    public class Cat implements Animal {
        @Override
        public void makeSound() {
            System.out.println("Meow!");
        }
    }

    public interface AnimalFactory {
        Animal createAnimal();
    }

    public class DogFactory implements AnimalFactory {
        @Override
        public Animal createAnimal() {
            return new Dog();
        }
    }

    public class CatFactory implements AnimalFactory {
        @Override
        public Animal createAnimal() {
            return new Cat();
        }
    }

    public class Main {
        public static void main(String[] args) {
            AnimalFactory dogFactory = new DogFactory();
            AnimalFactory catFactory = new CatFactory();

            Animal dog = dogFactory.createAnimal();
            Animal cat = catFactory.createAnimal();

            dog.makeSound(); // Output: Woof!
            cat.makeSound(); // Output: Meow!
        }
    }
}

/*
Nesse exemplo, temos as interfaces Animal e AnimalFactory. 
As classes Dog e Cat implementam a interface Animal e a 
DogFactory e CatFactory implementam a interface AnimalFactory.

A classe Main cria uma instância de DogFactory e outra de 
CatFactory. Em seguida, usa essas fábricas para criar instâncias 
de Dog e Cat, respectivamente, e chama o método makeSound() 
de cada um deles.

Observe que a classe Main não precisa saber exatamente 
qual tipo de animal está sendo criado ou como ele é criado.
Ela apenas usa a interface AnimalFactory para criar novas 
instâncias de animais e chama os métodos correspondentes, 
delegando a responsabilidade de criação de objetos para as 
fábricas. Isso permite que o código seja mais flexível e 
extensível, pois novos tipos de animais podem ser adicionados 
facilmente apenas implementando a interface Animal e a 
interface AnimalFactory. 
*/