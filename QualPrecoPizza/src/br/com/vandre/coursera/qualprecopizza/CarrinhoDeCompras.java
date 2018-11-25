package br.com.vandre.coursera.qualprecopizza;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Pizza> pizzas;
	private double valorTotal;

	public CarrinhoDeCompras() {
		super();
		pizzas = new ArrayList<>();
		valorTotal = 0;
	}

	public boolean adicionar(Pizza pizza) {
		if (pizza.getIngredientes().size() > 0) {
			pizzas.add(pizza);
			valorTotal += pizza.getPreco();
			return true;
		} else {
			return false;

		}
	}

	public double valorTotal() {
		return valorTotal;

	}

	public void ingredientesUtilizados() {

	}

}
