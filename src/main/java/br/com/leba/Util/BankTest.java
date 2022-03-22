package br.com.leba.Util;

import br.com.leba.Bank.Bank;

public class BankTest {

    public static void main(String args[]) {
        Bank myBank = new Bank();
        myBank.name = "Banco do Brasil";
        System.out.println(myBank.name);
    }

}
