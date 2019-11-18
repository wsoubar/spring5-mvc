package br.com.wsoubar.oops.others;

import java.util.HashMap;
import java.util.Map;

import br.com.wsoubar.oops.vo.Pessoa;

public class OopsData {

	public static Map<Integer, Pessoa> pessoas () {
		Pessoa wagner = new Pessoa("Wagner", "Barbosa", 45);
		Pessoa manu = new Pessoa("Manuela", "Mattos", 7);
		Pessoa thalita = new Pessoa("Thalita", "Mattos", 31);
		
		HashMap<Integer, Pessoa> map = new HashMap<>();
		map.put(1, manu);
		map.put(2, thalita);
		map.put(3, wagner);
		return map;
	}
	
}
