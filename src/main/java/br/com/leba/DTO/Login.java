package br.com.leba.DTO;

public class Login {

    private Integer id;
    private String name;
    private String password;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNome() {
        return name;
    }
    public void setNome(String nome) {
        this.name = nome;
    }
    public String getSenha() {
        return password;
    }
    public void setSenha(String senha) {
        this.password = senha;
    }


}
