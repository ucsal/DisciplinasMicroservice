package br.ucsal.disciplinas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Disciplinas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeDisciplina;
    private String modalidade;
    private String docente;
    private String turno;
    private int semestre;
    private String cargaHoraria;
    private String referencias;
}
