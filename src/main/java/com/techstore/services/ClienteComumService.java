package com.techstore.services;

import com.techstore.interfaces.ICadastroCliente;

public class ClienteComumService implements ICadastroCliente {

    @Override
    public void cadastrarCliente(String nome, String email) {
        System.out.println("COMUM: Cadastrando " + nome);
    }

    @Override
    public String buscarClientePorEmail(String email) {
        return "COMUM: Cliente encontrado com email " + email;
    }
}