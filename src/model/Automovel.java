package model;

import jakarta.persistence.*;

@Entity
public class Automovel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 4)
    private String ano;
    @Column(length = 17)
    private String chassi;
    @ManyToOne
    @JoinColumn(name = "marca_id")
    private String marca_id;

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private String modelo_id;
}
