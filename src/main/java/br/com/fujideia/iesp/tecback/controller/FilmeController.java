package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.repository.FilmeRepository;
import br.com.fujideia.iesp.tecback.service.FilmeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@AllArgsConstructor
@RestController
@RequestMapping ("/filme")
public class FilmeController {private FilmeService service;

    @PostMapping
    public Filme salvar(@RequestBody Filme filme){
        return service.salvar(filme);
    }
    @GetMapping
    public List<Filme> listarTodos(){
        return service.listarTodos();
    }

    @PutMapping
    public Filme atualizar(@RequestBody Filme filme){
        return service.atualizar(filme);

    }

    @GetMapping("/{id")
    public Filme buscarPorId(@PathVariable Integer id){
        return service.buscarPorId(id);
    }
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Integer id){
         service.excluir(id);
    }


}
