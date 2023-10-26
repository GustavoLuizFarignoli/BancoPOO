package model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Locacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date data_locacao;
    /*@ManyToOne
    @JoinColumn(name = "automovel_id")
    private String automovel_id;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private String cliente_id;*/

    public Locacao(Date data_locacao) {
        this.data_locacao = data_locacao;
    }

    public Locacao() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData_locacao() {
        return data_locacao;
    }

    public void setData_locacao(Date data_locacao) {
        this.data_locacao = data_locacao;
    }
}
