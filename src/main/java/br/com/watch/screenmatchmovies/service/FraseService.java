package br.com.watch.screenmatchmovies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.watch.screenmatchmovies.dto.FraseDTO;
import br.com.watch.screenmatchmovies.model.Frase;
import br.com.watch.screenmatchmovies.repository.FraseRepository;

@Service
public class FraseService {
	@Autowired
	private FraseRepository repositorio;
	
	public FraseDTO obterDadosSerieAleatoria() {
		Frase frase = repositorio.buscarFraseAleatoria();
		return new FraseDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
	}
}
