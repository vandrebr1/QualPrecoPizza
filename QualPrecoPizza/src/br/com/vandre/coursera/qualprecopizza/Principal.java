package br.com.vandre.coursera.qualprecopizza;

import java.util.Map;

public class Principal {

	public static void main(String[] args) {

		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		Pizza pizza = new Pizza();

		pizza.adicionaIngrediente("Mussarela");
		pizza.adicionaIngrediente("Cebola");
		pizza.adicionaIngrediente("Presunto");
		pizza.adicionaIngrediente("Ovo");
		pizza.adicionaIngrediente("Tomate");
		pizza.adicionaIngrediente("Bacon");
		carrinhoDeCompras.adicionar(pizza);

		pizza = new Pizza();
		pizza.adicionaIngrediente("Mussarela");
		pizza.adicionaIngrediente("Cebola");
		pizza.adicionaIngrediente("Lombo");
		carrinhoDeCompras.adicionar(pizza);

		pizza = new Pizza();
		pizza.adicionaIngrediente("Mussarela");
		pizza.adicionaIngrediente("Presunto");
		carrinhoDeCompras.adicionar(pizza);

		System.out.println("Total do carrinho: R$ " + carrinhoDeCompras.valorTotal());
		System.out.println("\nIngrediente(s): Quantidade(s)");

		for (Map.Entry<String, Integer> ingredientes : Pizza.ingredientesAdicionados.entrySet()) {
			System.out.println(ingredientes.getKey() + ": " + ingredientes.getValue());
		}


	}

}
