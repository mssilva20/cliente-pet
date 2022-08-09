package br.com.pet.Clientepetz.cliente.infra;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.pet.Clientepetz.cliente.domain.Cliente;

public interface ClienteSpringDataJpa extends JpaRepository<Cliente, UUID> {

}
