package br.com.watch.screenmatchmovies.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.watch.screenmatchmovies.dto.FraseDTO;
import br.com.watch.screenmatchmovies.service.FraseService;

@RestController
public class FraseController {

	@Autowired
	private FraseService servico;
	
	@GetMapping("/series/frases")
	public FraseDTO obterFraseAleatoria() {
		return servico.obterDadosSerieAleatoria();
	}
}
