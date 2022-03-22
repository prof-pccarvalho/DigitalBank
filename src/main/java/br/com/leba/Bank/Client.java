package br.com.leba.Bank;

import java.text.SimpleDateFormat;
import java.util.Date;

class Client {
    Long id;
    String name;
    String sex;

    String cpf;
    String email;
    String phone;
    //create birthDate and cast to date type
    Date date = null;
    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String birthDate = formatter.format(new Date());
    Address adress;
}
