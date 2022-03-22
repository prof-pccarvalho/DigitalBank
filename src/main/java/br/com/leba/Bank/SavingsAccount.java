package br.com.leba.Bank;

import br.com.leba.DTO.Client;

public class SavingsAccount extends Account{

    public SavingsAccount(Client client) {
        super(client);
    }

    @Override
    public void printDetails() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.printCommonInfo();
    }
}
