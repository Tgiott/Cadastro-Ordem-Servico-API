package br.com.ordemservice.domains.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ordemservice.domains.model.Cliente;



@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	
	List<Cliente> findByName(String nome);

	Cliente findByEmail(String email);
	
	
	
}
