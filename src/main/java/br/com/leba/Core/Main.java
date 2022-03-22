package br.com.leba.Core;

import br.com.leba.Bank.Account;
import br.com.leba.Bank.CheckingAccount;
import br.com.leba.Bank.SavingsAccount;
import br.com.leba.DTO.Client;

public class Main {
    public static void main(String[] args) {
        Client venilton = new Client();
        venilton.setName("Venilton");

        Account cc = new CheckingAccount(venilton);
        SavingsAccount poup = new SavingsAccount(venilton);

        cc.deposit(100);
        cc.transfer(100, poup);

        cc.printDetails();
        poup.printDetails();
    }
}
