package com.gabrielrleal.demo.api.controller;


import com.gabrielrleal.demo.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {
    @GetMapping("/clientes")
    public List<Cliente> listar() {
        var cliente1 = new Cliente();
        cliente1.setId(1L);
        cliente1.setNome("gabriel");
        cliente1.setTelefone("123123123");
        cliente1.setEmail("gabriel@gmail.com");

        var cliente2 = new Cliente();
        cliente2.setId(2L);
        cliente2.setNome("fuaslano");
        cliente2.setTelefone("123456789");
        cliente2.setEmail("fulano@gmail.com");



        return Arrays.asList(cliente1, cliente2);

    }
}
