package br.com.ferreiracosta.pedidofcweb.service;

import br.com.ferreiracosta.pedidofcweb.domain.Cliente;
import br.com.ferreiracosta.pedidofcweb.repository.ClienteRepository;
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
