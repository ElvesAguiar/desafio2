package com.elves.desafio2.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_bloco")
public class Bloco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Date inicio;
    @Column(columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private Date fim;

    @ManyToOne
    @JoinColumn(name = "atividade_id")
    private Atividade atividade;


    public Bloco(){

    }

    public Bloco(Integer id, Date inicio, Date fim) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;

    }

    public Integer getId() {

        return id;
    }

    public void setId(Integer id) {

        this.id = id;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }
}
