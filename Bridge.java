public class Bridge {
        // Abstração
    interface Forma {
        void desenhar();
        void redimensionar(float fator);
    }

    // Implementação
    interface Renderizador {
        void renderizarCirculo(float raio);
        void renderizarQuadrado(float lado);
    }

    // Implementação concreta
    class RenderizadorOpenGL implements Renderizador {
        public void renderizarCirculo(float raio) {
            System.out.printf("Desenhando círculo com raio %f usando OpenGL\n", raio);
        }

        public void renderizarQuadrado(float lado) {
            System.out.printf("Desenhando quadrado com lado %f usando OpenGL\n", lado);
        }
    }

    // Implementação concreta
    class RenderizadorDirectX implements Renderizador {
        public void renderizarCirculo(float raio) {
            System.out.printf("Desenhando círculo com raio %f usando DirectX\n", raio);
        }

        public void renderizarQuadrado(float lado) {
            System.out.printf("Desenhando quadrado com lado %f usando DirectX\n", lado);
        }
    }

    // Abstração refinada
    class Circulo implements Forma {
        private float raio;
        private Renderizador renderizador;

        public Circulo(Renderizador renderizador, float raio) {
            this.renderizador = renderizador;
            this.raio = raio;
        }

        public void desenhar() {
            renderizador.renderizarCirculo(raio);
        }

        public void redimensionar(float fator) {
            raio *= fator;
        }
    }

    // Abstração refinada
    class Quadrado implements Forma {
        private float lado;
        private Renderizador renderizador;

        public Quadrado(Renderizador renderizador, float lado) {
            this.renderizador = renderizador;
            this.lado = lado;
        }

        public void desenhar() {
            renderizador.renderizarQuadrado(lado);
        }

        public void redimensionar(float fator) {
            lado *= fator;
        }
    }

    // Cliente
    class Cliente {
        public static void main(String[] args) {
            RenderizadorOpenGL opengl = new RenderizadorOpenGL();
            RenderizadorDirectX directx = new RenderizadorDirectX();

            Forma circulo = new Circulo(opengl, 5);
            Forma quadrado = new Quadrado(directx, 10);

            circulo.desenhar();
            quadrado.desenhar();
        }
    }    
}
