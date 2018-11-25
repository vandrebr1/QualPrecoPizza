package br.com.vandre.coursera.qualprecopizza;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pizza {

	private ArrayList<String> ingredientes;
	static Map<String, Integer> ingredientesAdicionados = new HashMap<String, Integer>();

	public Pizza() {
		super();
		ingredientes = new ArrayList<>();
	}

	public void adicionaIngrediente(String ingrediente) {
		ingredientes.add(ingrediente);
		contabilizaIngrediente(ingrediente);

	}

	public double getPreco() {
		if (ingredientes.size() > 5) {
			return 23;
		} else if (ingredientes.size() >= 3) {
			return 20;
		}

		return 15;

	}

	private static void contabilizaIngrediente(String ingrediente) {
		if (ingredientesAdicionados.containsKey(ingrediente)) {
			ingredientesAdicionados.put(ingrediente, ingredientesAdicionados.get(ingrediente) + 1);
		} else {
			ingredientesAdicionados.put(ingrediente, 1);
		}

	}

	public ArrayList<String> getIngredientes() {
		return ingredientes;
	}

}
