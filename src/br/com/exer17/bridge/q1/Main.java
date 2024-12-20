package br.com.exer17.bridge.q1;

import br.com.exer17.bridge.q1.cores.*;
import br.com.exer17.bridge.q1.estilos.*;
import br.com.exer17.bridge.q1.formas.*;

public class Main {
    public static void main(String[] args) {
    	Cor vermelho = new Vermelho();
    	Cor azul = new Azul();
    	Cor verde = new Verde();
    	Estilo solido = new Solido();
    	Estilo tracejado = new Tracejado();
    	
        Forma circuloVermelho = new Circulo(vermelho, solido);
        circuloVermelho.desenhar();

        Forma quadradoAzul = new Quadrado(azul, solido);
        quadradoAzul.desenhar();
        
        Forma circuloVerde = new Circulo(verde, tracejado);
        circuloVerde.desenhar();
        
        Forma quadradoVerde = new Quadrado(verde, tracejado);
        quadradoVerde.desenhar();
        
        Forma trianguloAzul = new Triangulo(azul, solido);
        trianguloAzul.desenhar();
        
        Forma trianguloVermelho = new Triangulo(vermelho, tracejado);
        trianguloVermelho.desenhar();
    }
}
