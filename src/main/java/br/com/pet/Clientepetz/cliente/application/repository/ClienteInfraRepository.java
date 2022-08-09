package br.com.pet.Clientepetz.cliente.application.repository;

import org.springframework.stereotype.Repository;

import br.com.pet.Clientepetz.cliente.domain.Cliente;
import br.com.pet.Clientepetz.cliente.infra.ClienteSpringDataJpa;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Repository
@Log4j2
@RequiredArgsConstructor
public class ClienteInfraRepository implements ClienteReposiotory {

	private final ClienteSpringDataJpa clienteSpringDataJpa;
	@Override
	public Cliente salva(Cliente cliente) {
		log.info("[inicio] ClienteInfraRepositor -  metodo Salva ");
		clienteSpringDataJpa.save(cliente);
		log.info("[finaliza] ClienteInfraRepositor -  metodo Salva ");
		return cliente;
	}

}
