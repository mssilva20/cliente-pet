package br.com.pet.Clientepetz.cliente.application.api;

import java.util.List;

import org.springframework.web.bind.annotation.RestController;

import br.com.pet.Clientepetz.cliente.application.service.ClienteService;
import lombok.RequiredArgsConstructor;
import lombok.extern.java.Log;

@RestController
@Log
@RequiredArgsConstructor
public class ClienteController implements ClienteApi {

	private final ClienteService clienteService;

	@Override
	public ClienteResponse clienteResponse(ClienteRequest clienteRequest) {
		log.info("[incio] ClienteController - clienteResponse ");
		ClienteResponse clienteCriado = clienteService.criaCliente(clienteRequest);
		log.info("[fim] ClienteController - clienteResponse ");

		return clienteCriado;
	}

	@Override
	public List<ClienteListResponse> getTodosClientes() {
		log.info("[incio] ClienteController - ClienteListResponse ");
		log.info("[final ] ClienteController - ClienteListResponse ");

		return null;
	}

}
