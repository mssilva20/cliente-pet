package br.com.pet.Clientepetz.cliente.application.service;

import br.com.pet.Clientepetz.cliente.application.api.ClienteRequest;
import br.com.pet.Clientepetz.cliente.application.api.ClienteResponse;

public interface ClienteService {

	ClienteResponse criaCliente(ClienteRequest clienteRequest);

}
