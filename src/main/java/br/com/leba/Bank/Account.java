package br.com.leba.Bank;

import br.com.leba.DTO.Client;

public abstract class Account implements IAccount {

    private static final int STANDARD_AGENCY = 1;
    private static int SEQUENTIAL = 1;

    protected int agency;
    protected int number;
    protected double balance;
    protected Client client;

    public Account(Client client) {
        this.agency = Account.STANDARD_AGENCY;
        this.number = SEQUENTIAL++;
        this.client = client;
    }

    @Override
    public void withdraw(double value) {
        balance -= value;
    }

    @Override
    public void deposit(double value) {
        balance += value;
    }

    @Override
    public void transfer(double value, IAccount destinationAccount) {
        this.withdraw(value);
        destinationAccount.deposit(value);
    }

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }
    //operação de saldo
    public double getBalance() {
        return balance;
    }

    protected void printCommonInfo() {
        System.out.println(String.format("Titular: %s", this.client.getName()));
        System.out.println(String.format("Agencia: %d", this.agency));
        System.out.println(String.format("Numero: %d", this.number));
        System.out.println(String.format("Saldo: %.2f", this.balance));
    }

}
