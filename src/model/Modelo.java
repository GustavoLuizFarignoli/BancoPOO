package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "modelo_id")
    @OneToMany(mappedBy = "Automovel")
    private int id;
    @Column(length = 20)
    private String descricao;


    public Modelo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

