/*
O padrão de projeto Strategy é um padrão comportamental que 
permite definir uma família de algoritmos, 
encapsulá-los e torná-los intercambiáveis. 
Dessa forma, é possível variar os algoritmos independentemente 
do cliente que os utiliza.

O padrão Strategy é composto por três elementos principais: 
a interface Strategy, que define a assinatura dos algoritmos; 
as classes ConcreteStrategy, que implementam os algoritmos 
específicos; e a classe Context, que utiliza a interface 
Strategy para executar o algoritmo correto em tempo de execução.

Aqui está um exemplo em Java:
 */

public class Strategy {
        // Interface Strategy
    public interface SortingStrategy {
        void sort(int[] array);
    }

    // ConcreteStrategy: QuickSort
    public class QuickSort implements SortingStrategy {
        public void sort(int[] array) {
            // Implementação do algoritmo de QuickSort
        }
    }

    // ConcreteStrategy: MergeSort
    public class MergeSort implements SortingStrategy {
        public void sort(int[] array) {
            // Implementação do algoritmo de MergeSort
        }
    }

    // Context
    public class ArraySorter {
        private SortingStrategy sortingStrategy;
        
        public void setSortingStrategy(SortingStrategy sortingStrategy) {
            this.sortingStrategy = sortingStrategy;
        }
        
        public void sort(int[] array) {
            sortingStrategy.sort(array);
        }
    }

    // Utilização do padrão
    public class Main {
        public static void main(String[] args) {
            int[] array = {5, 1, 4, 2, 3};
            ArraySorter arraySorter = new ArraySorter();
            
            // Utiliza QuickSort para ordenar o array
            arraySorter.setSortingStrategy(new QuickSort());
            arraySorter.sort(array);
            
            // Utiliza MergeSort para ordenar o array
            arraySorter.setSortingStrategy(new MergeSort());
            arraySorter.sort(array);
        }
    }    
}

/*
Nesse exemplo, a interface SortingStrategy define a assinatura 
dos algoritmos de ordenação. As classes QuickSort e MergeSort 
implementam essa interface com as implementações específicas 
desses algoritmos. A classe ArraySorter utiliza a interface 
SortingStrategy para executar o algoritmo correto em tempo de 
execução. 
Por fim, a classe Main exemplifica a utilização do padrão, 
permitindo alternar entre as implementações de algoritmo de 
ordenação durante a execução.
 */