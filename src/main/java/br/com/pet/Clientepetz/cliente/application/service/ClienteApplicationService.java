package br.com.pet.Clientepetz.cliente.application.service;

import org.springframework.stereotype.Service;

import br.com.pet.Clientepetz.cliente.application.api.ClienteRequest;
import br.com.pet.Clientepetz.cliente.application.api.ClienteResponse;
import br.com.pet.Clientepetz.cliente.application.repository.ClienteReposiotory;
import br.com.pet.Clientepetz.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	private final ClienteReposiotory clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicio] ClienteApplicationService -criaCliente ");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[fim] ClienteApplicationService -criaCliente ");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente()).build();
	}
}
