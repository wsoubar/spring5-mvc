package br.com.wsoubar.oops.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wsoubar.oops.others.OopsData;
import br.com.wsoubar.oops.vo.Pessoa;

@RestController
@RequestMapping("/example")
public class ExemploRestController {

	@GetMapping("/run")
	public Pessoa run() {
		Pessoa p = new Pessoa("Wagner", "Barbosa", 45);
		return p;
	}
	
	@GetMapping("/{id}") 
	public Pessoa findById(@PathVariable Integer id) {
		Pessoa p = OopsData.pessoas().get(id);
		return p;
	}
	
}
