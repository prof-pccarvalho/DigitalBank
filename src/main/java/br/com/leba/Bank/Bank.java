package br.com.leba.Bank;

import br.com.leba.DTO.Client;

public class Bank {
    public String name;
    Account conta;
    public Client clients[];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Client[] getClients() {
        return clients;
    }

    public void setClients(Client[] clients) {
        this.clients = clients;
    }
}
