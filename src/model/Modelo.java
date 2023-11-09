package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Modelo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "modelo_id")
    @OneToMany(mappedBy = "Modelo")
    private int modelo_id;
    @Column(length = 20)
    private String descricao;


    public Modelo() {
    }

    public Modelo(int id) {
        this.modelo_id = id;
    }

    public Modelo(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return modelo_id;
    }

    public void setId(int id) {
        this.modelo_id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

