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
    /*@ManyToOne
    @JoinColumn(name = "marca_id")
    private String marca_id;

    @ManyToOne
    @JoinColumn(name = "modelo_id")
    private String modelo_id;*/

    public Automovel() {
    }

    public Automovel(String ano, String chassi) {
        this.ano = ano;
        this.chassi = chassi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
