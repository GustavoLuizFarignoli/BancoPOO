package model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Marca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 20)
    private String descricao;

    @OneToMany(mappedBy = "Automovel")
    private List<Automovel> automovels;

    public Marca(int id) {
        this.id = id;
    }

    public Marca(String descricao) {
        this.descricao = descricao;
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
