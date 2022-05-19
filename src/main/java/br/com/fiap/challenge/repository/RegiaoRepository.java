package br.com.fiap.challenge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.fiap.challenge.model.Regiao;

@Repository
public interface RegiaoRepository extends JpaRepository<Regiao, Integer> {

}
