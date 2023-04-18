/*
O padrão de projeto Builder é um padrão de criação que tem como 
objetivo separar a construção de um objeto complexo da sua 
representação, permitindo que o mesmo processo de construção 
possa criar diferentes representações do objeto.

Em outras palavras, o padrão Builder é útil quando você precisa 
construir um objeto complexo que pode ter diferentes 
configurações, mas não quer ter que criar várias classes 
diferentes para representar cada uma dessas configurações.

Aqui está um exemplo simples em Java para ilustrar como o 
padrão Builder pode ser implementado:

Suponha que precisamos criar um objeto Pizza que pode ser 
configurado com diferentes ingredientes e tamanhos. 
Podemos usar o padrão Builder para criar um construtor de objeto
PizzaBuilder que possa configurar esses diferentes atributos. 
O código Java pode ser algo assim:
 */
public class Builder {
    public class Pizza {
        private String dough = "";
        private String sauce = "";
        private String topping = "";
     
        public void setDough(String dough) {
            this.dough = dough;
        }
     
        public void setSauce(String sauce) {
            this.sauce = sauce;
        }
     
        public void setTopping(String topping) {
            this.topping = topping;
        }
    }    
}

/*
Aqui está a classe PizzaBuilder que pode ser usada para 
configurar os diferentes atributos da Pizza:
 */

 public class PizzaBuilder {
    private Pizza pizza;
 
    public PizzaBuilder() {
        pizza = new Pizza();
    }
 
    public PizzaBuilder setDough(String dough) {
        pizza.setDough(dough);
        return this;
    }
 
    public PizzaBuilder setSauce(String sauce) {
        pizza.setSauce(sauce);
        return this;
    }
 
    public PizzaBuilder setTopping(String topping) {
        pizza.setTopping(topping);
        return this;
    }
 
    public Pizza build() {
        return pizza;
    }
}

/*
Agora podemos criar uma Pizza com diferentes configurações usando 
o PizzaBuilder. Aqui está um exemplo:
 */

 Pizza pizza = new PizzaBuilder()
 .setDough("Pan")
 .setSauce("Tomato")
 .setTopping("Cheese")
 .build();

/*
Neste exemplo, criamos uma pizza com massa pan, molho de tomate 
e queijo.

Note que o padrão Builder permite criar diferentes configurações 
de Pizza sem ter que criar várias classes diferentes. 
Além disso, ele garante que a Pizza seja construída corretamente, 
porque cada atributo é definido individualmente e não há como 
criar uma pizza incompleta ou com atributos inválidos.
 */