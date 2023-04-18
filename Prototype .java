/*
O padrão de projeto Prototype é um padrão de criação que 
permite criar novos objetos clonando uma instância existente, 
em vez de criar um novo objeto do zero. 
Isso pode ser útil em situações onde a criação de um objeto é 
cara ou complexa, ou quando um objeto já existente possui o 
estado desejado.

O padrão Prototype define uma interface de clonagem que os 
objetos podem implementar. Essa interface geralmente contém um 
método chamado clone() que cria e retorna uma cópia do objeto. 
O processo de clonagem pode ser feito de duas maneiras: 
shallow copy (cópia superficial) e deep copy (cópia profunda). 
Na cópia superficial, apenas os atributos do objeto são copiados, 
enquanto que na cópia profunda, os atributos do objeto e seus 
objetos internos são copiados.

Aqui está um exemplo em Java que ilustra o uso do padrão 
Prototype:
 */

public class Prototype  {
    public abstract class Shape implements Cloneable {
        private String id;
        protected String type;
    
        abstract void draw();
    
        public String getId() {
            return id;
        }
    
        public void setId(String id) {
            this.id = id;
        }
    
        public String getType() {
            return type;
        }
    
        public void setType(String type) {
            this.type = type;
        }
    
        public Object clone() {
            Object clone = null;
    
            try {
                clone = super.clone();
            } catch (CloneNotSupportedException e) {
                e.printStackTrace();
            }
    
            return clone;
        }
    }
    
    public class Circle extends Shape {
        public Circle() {
            type = "Circle";
        }
    
        @Override
        public void draw() {
            System.out.println("Drawing a circle.");
        }
    }
    
    public class Square extends Shape {
        public Square() {
            type = "Square";
        }
    
        @Override
        public void draw() {
            System.out.println("Drawing a square.");
        }
    }
    
    public class ShapeCache {
        private static HashMap<String, Shape> shapeMap = new HashMap<>();
    
        public static Shape getShape(String shapeId) {
            Shape cachedShape = shapeMap.get(shapeId);
            return (Shape) cachedShape.clone();
        }
    
        public static void loadCache() {
            Circle circle = new Circle();
            circle.setId("1");
            shapeMap.put(circle.getId(), circle);
    
            Square square = new Square();
            square.setId("2");
            shapeMap.put(square.getId(), square);
        }
    }
    
    public class PrototypeDemo {
        public static void main(String[] args) {
            ShapeCache.loadCache();
    
            Shape clonedShape1 = ShapeCache.getShape("1");
            System.out.println("Shape : " + clonedShape1.getType());
    
            Shape clonedShape2 = ShapeCache.getShape("2");
            System.out.println("Shape : " + clonedShape2.getType());
        }
    }    
}

/*
Neste exemplo, temos a classe Shape que define a interface de 
clonagem e as subclasses Circle e Square que implementam a 
clonagem. 
A classe ShapeCache é responsável por armazenar as formas em um 
mapa e retornar a cópia clonada quando solicitado. 
Por fim, a classe PrototypeDemo demonstra como usar a classe 
ShapeCache para obter cópias de objetos Circle e Square.
 */