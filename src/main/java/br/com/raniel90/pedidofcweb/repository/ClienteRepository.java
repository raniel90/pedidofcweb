package br.com.raniel90.pedidofcweb.repository;

import br.com.raniel90.pedidofcweb.domain.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by trinity on 16/10/2017.
 */
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

    List<Cliente> findByNome(String nome);
}
