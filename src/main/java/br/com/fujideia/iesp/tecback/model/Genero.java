package br.com.fujideia.iesp.tecback.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Genero {


    private String ficcao;
    private String documentario;

}
