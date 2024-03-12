package br.com.fujideia.iesp.tecback.service;

import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.repository.FilmeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor //injeção de dependencia / instanciacao
@Service
public class FilmeService {

    private FilmeRepository repository;

    //SALVAR FILMES
    public Filme salvar(Filme filme){
        return repository.save(filme);
    }


    //LISTAR FILMES
    public List<Filme> listarTodos(){
        return repository.findByAll();
    }


    //ATUALZIAR FILME EXISTENTE NA BASE DE DADOS
    public Filme atualizar(Filme filme){
        if (filme.getId()==null){
            throw new RuntimeException("Filme sem ID");
        }
        return repository.save(filme);
    }

    public Filme buscarPorId(Integer id){
        return repository.findById(id).get();
    }


    //EXCLUIR FILME
    public void excluir(Integer id){
        repository.deleteById(id);
    }



}
