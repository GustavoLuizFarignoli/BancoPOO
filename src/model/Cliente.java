package model;

import jakarta.persistence.*;

@Entity
public class Cliente {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(length = 50)
    private String nome;
    @Column(length = 40)
    private String email;
    @Column(length = 14)
    private String cpf;
    @Column(length = 13)
    private String fone;

    public Cliente(String nome, String email, String cpf, String fone) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.fone = fone;
    }

    public Cliente() {
    }

    public Cliente(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
}
