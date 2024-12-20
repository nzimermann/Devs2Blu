package br.com.exer17.bridge.q1.formas;

import br.com.exer17.bridge.q1.cores.Cor;
import br.com.exer17.bridge.q1.estilos.Estilo;

//Abstra��o Refinada para um C�rculo
public class Circulo extends Forma {
 public Circulo(Cor cor, Estilo estilo) {
     super(cor, estilo);
 }

 @Override
 public void desenhar() {
     System.out.print("Desenhando um c�rculo com ");
     cor.aplicarCor();
 }
}