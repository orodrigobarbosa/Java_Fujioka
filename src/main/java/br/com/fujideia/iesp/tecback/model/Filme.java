package br.com.fujideia.iesp.tecback.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter //lombok
@Setter

@Entity
public class Filme {

    @Id
    private Integer id;
    private String titulo;
    private String descricao;

}
