package br.com.watch.screenmatchmovies.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.watch.screenmatchmovies.model.Frase;

public interface FraseRepository extends JpaRepository<Frase, Long>{

	@Query("SELECT f FROM Frase f ORDER BY FUNCTION('RANDOM') LIMIT 1")
	Frase buscarFraseAleatoria();
	
}
