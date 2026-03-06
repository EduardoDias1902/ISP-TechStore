package com.techstore.main;

import com.techstore.services.ClienteComumService;
import com.techstore.services.ClienteVIPService;

public class Main {

    public static void main(String[] args) {

        ClienteComumService clienteComum = new ClienteComumService();
        clienteComum.cadastrarCliente("João", "joao@email.com");
        System.out.println(clienteComum.buscarClientePorEmail("joao@email.com"));

        System.out.println("----------------------");

        ClienteVIPService clienteVIP = new ClienteVIPService();
        clienteVIP.cadastrarCliente("Maria", "maria@email.com");
        System.out.println(clienteVIP.buscarClientePorEmail("maria@email.com"));
        clienteVIP.enviarNotificacao("maria@email.com", "Promoção especial!");
        clienteVIP.aplicarDescontoVIP("maria@email.com", 15);

    }
}