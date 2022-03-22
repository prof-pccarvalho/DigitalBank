package br.com.leba.Bank;
import br.com.leba.DTO.Client;

public class CheckingAccount extends Account {

    public CheckingAccount(Client client) {
        super(client);
    }

    @Override
    public void printDetails() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.printCommonInfo();
    }
}
