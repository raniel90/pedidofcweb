package br.com.raniel90.pedidofcweb.service;

import br.com.raniel90.pedidofcweb.domain.Cliente;
import br.com.raniel90.pedidofcweb.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by trinity on 16/10/2017.
 */
@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;


    public Iterable<Cliente> obterTodos() {
        Iterable<Cliente> clientes = repository.findAll();
        return clientes;
    }

    public void salvar(Cliente cliente) {
        repository.save(cliente);
    }
}
