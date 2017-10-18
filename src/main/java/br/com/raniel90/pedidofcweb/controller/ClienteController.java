package br.com.raniel90.pedidofcweb.controller;

import br.com.raniel90.pedidofcweb.domain.Cliente;
import br.com.raniel90.pedidofcweb.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by trinity on 16/10/2017.
 */
@Controller
public class ClienteController {

    @Autowired
    private ClienteService service;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/listaclientes")
    public String listaClientes(Model model){

        Iterable<Cliente> clientes = service.obterTodos();
        model.addAttribute("clientes", clientes);

        return "listaclientes";
    }

    @RequestMapping(value= "salvar", method = RequestMethod.POST)
    public String salvar(@RequestParam("nome") String nome, @RequestParam("email") String email,
                         @RequestParam("telefone") String telefone, Model model ){

        Cliente novoCliente = new Cliente(nome, email, telefone);
        service.salvar(novoCliente);

        Iterable<Cliente> clientes = service.obterTodos();
        model.addAttribute("clientes", clientes);

        return "listaclientes";
    }
}