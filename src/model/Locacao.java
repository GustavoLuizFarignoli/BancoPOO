package model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Locacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Date data_locacao;
    @ManyToOne
    @JoinColumn(name = "automovel_id")
    private String automovel_id;
    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private String cliente_id;




}
