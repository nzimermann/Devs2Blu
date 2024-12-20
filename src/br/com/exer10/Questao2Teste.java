package br.com.exer10;

import br.com.exer10.imposto.*;

public class Questao2Teste {

	public static void main(String[] args) {
		Contribuinte pf1 = new PessoaFisica("Felipe", 1400, "123.345.567-89");
		Contribuinte pf2 = new PessoaFisica("Gabriela", 2600, "223.345.567-89");
		Contribuinte pf3 = new PessoaFisica("Jean", 4000, "323.345.567-89");
		Contribuinte pj1 = new PessoaJuridica("Lucas", 1000, "32.334.556/6890-90");
		Contribuinte pj2 = new PessoaJuridica("Julia", 3000, "26.334.556/7320-40");
		Contribuinte pj3 = new PessoaJuridica("Ana", 5000, "15.334.556/4140-14");

		System.out.println("Pessoa Física 1: " + pf1.getNome() + " - R$" + pf1.calcularImposto());
		System.out.println("Pessoa Física 2: " + pf2.getNome() + " - R$" + pf2.calcularImposto());
		System.out.println("Pessoa Física 3: " + pf3.getNome() + " - R$" + pf3.calcularImposto());
		System.out.println("Pessoa Jurídica 1: " + pj1.getNome() + " - R$" + pj1.calcularImposto());
		System.out.println("Pessoa Jurídica 2: " + pj2.getNome() + " - R$" + pj2.calcularImposto());
		System.out.println("Pessoa Jurídica 3: " + pj3.getNome() + " - R$" + pj3.calcularImposto());
	}

}
