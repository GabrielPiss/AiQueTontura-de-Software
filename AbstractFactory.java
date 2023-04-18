/*
 O Abstract Factory é um padrão de projeto de software que 
fornece uma interface para criar famílias de objetos 
relacionados ou dependentes sem especificar suas classes 
concretas. 
Ou seja, o objetivo do padrão é permitir que o cliente crie 
objetos relacionados sem conhecer os detalhes da implementação.

O Abstract Factory é útil em situações em que é necessário 
criar objetos que possuem relacionamentos complexos entre 
si e/ou quando há vários produtos relacionados que precisam 
ser criados em conjunto. 
Com o Abstract Factory, esses objetos relacionados podem ser 
criados de forma consistente e fácil de manter.

Um exemplo em Java pode ser a criação de botões e caixas de texto
para uma interface gráfica de usuário. Para isso, podemos 
definir uma interface abstrata chamada AbstractWidgetFactory 
que define métodos para criar botões e caixas de texto. 
Em seguida, podemos criar duas classes concretas que 
implementam essa interface: a WindowsWidgetFactory e a 
MacOSWidgetFactory.

Aqui está um exemplo de código em Java para implementar esse 
padrão:
 */
public class AbstractFactory {
    public interface AbstractWidgetFactory {
        public Button createButton();
        public TextBox createTextBox();
    }
    
    public class WindowsWidgetFactory implements AbstractWidgetFactory {
        public Button createButton() {
            return new WindowsButton();
        }
        public TextBox createTextBox() {
            return new WindowsTextBox();
        }
    }
    
    public class MacOSWidgetFactory implements AbstractWidgetFactory {
        public Button createButton() {
            return new MacOSButton();
        }
        public TextBox createTextBox() {
            return new MacOSTextBox();
        }
    }
    
    public interface Button {
        public void paint();
    }
    
    public class WindowsButton implements Button {
        public void paint() {
            System.out.println("Renderizando um botão estilo Windows.");
        }
    }
    
    public class MacOSButton implements Button {
        public void paint() {
            System.out.println("Renderizando um botão estilo MacOS.");
        }
    }
    
    public interface TextBox {
        public void display();
    }
    
    public class WindowsTextBox implements TextBox {
        public void display() {
            System.out.println("Renderizando uma caixa de texto estilo Windows.");
        }
    }
    
    public class MacOSTextBox implements TextBox {
        public void display() {
            System.out.println("Renderizando uma caixa de texto estilo MacOS.");
        }
    }
       
}

/*
Com essa implementação, podemos criar uma fábrica de widgets 
específica para cada sistema operacional e, em seguida, criar 
botões e caixas de texto usando essa fábrica, sem precisar 
saber a classe concreta desses objetos:
 */

 AbstractWidgetFactory widgetFactory;

 if (os.equals("Windows")) {
     widgetFactory = new WindowsWidgetFactory();
 } else if (os.equals("MacOS")) {
     widgetFactory = new MacOSWidgetFactory();
 } else {
     throw new RuntimeException("Sistema operacional não suportado.");
 }
 
 Button button = widgetFactory.createButton();
 button.paint();
 
 TextBox textBox = widgetFactory.createTextBox();
 textBox.display();
