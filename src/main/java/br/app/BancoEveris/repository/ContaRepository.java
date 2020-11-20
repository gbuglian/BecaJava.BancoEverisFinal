package br.app.BancoEveris.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.app.BancoEveris.model.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long> {
	
	 Conta  findByHash(String hash);
	
   
}
