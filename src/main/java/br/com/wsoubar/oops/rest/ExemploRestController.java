package br.com.wsoubar.oops.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wsoubar.oops.others.OopsData;
import br.com.wsoubar.oops.vo.Pessoa;

@RestController
@RequestMapping("/example")
public class ExemploRestController {

	private final Logger logger = LoggerFactory.getLogger(ExemploRestController.class);

	@GetMapping("/run")
	public ResponseEntity<String> run() {
		// Pessoa p = new Pessoa("Wagner", "Barbosa", 45);
		logger.trace("trace logging");
		logger.debug("debug logging");
		logger.info("info logging");
		logger.warn("warning logging");
		logger.error("error logging", new RuntimeException("help"));
		return new ResponseEntity<>("funcionando", HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pessoa> findById(@PathVariable Integer id) {
		Pessoa p = OopsData.pessoas().get(id);
		return new ResponseEntity<Pessoa>(p, HttpStatus.NOT_FOUND);
	}

}
