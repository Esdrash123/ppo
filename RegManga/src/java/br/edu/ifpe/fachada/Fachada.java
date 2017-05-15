/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.fachada;

import br.edu.ifpe.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import br.edu.ifpe.infraestrutura.repositorios.implementacoes.FabricaRepositorios;
import br.edu.ifpe.infraestrutura.repositorios.implementacoes.RepositorioEdicao;
import br.edu.ifpe.negocio.Edicao;

import br.edu.ifpe.negocio.Personagem;
import java.util.List;

/**
 *
 * @author 1860915
 */
public class Fachada {
    
    private static Fachada myself = null;
    
    private RepositorioGenerico<Personagem,String> repositorioPersonagem = null;
    private RepositorioGenerico<Edicao,Integer> repositorioEdicao = null;
    
    private Fachada(){
        this.repositorioPersonagem = FabricaRepositorios.manufactor(FabricaRepositorios.PERSONAGEM, 
                FabricaRepositorios.MEMORIA);
        this.repositorioEdicao = new RepositorioEdicao();
    }
      
    public static Fachada getInstance(){
        if(myself == null)
            myself = new Fachada();
        
        return myself;
    }
    
    public void inserir(Personagem personagem){
        this.repositorioPersonagem.inserir(personagem);
    }
    
    public void alterar(Personagem personagem){
        this.repositorioPersonagem.alterar(personagem);
    }
    
    public Personagem recuperarPersonagem(String nome){
        return this.repositorioPersonagem.recuperar(nome);
    }
    
    public void deletar(Personagem personagem){
        this.repositorioPersonagem.deletar(personagem);
    }
    
    public List<Personagem> recuperarTodosPersonagens(){
        return this.repositorioPersonagem.recuperarTodos();
    }
    
    public void inserir(Edicao edicao){
        this.repositorioEdicao.inserir(edicao);
    }
    
    public void alterar(Edicao edicao){
        this.repositorioEdicao.alterar(edicao);
    }
    
    public Edicao recuperarEdicao(int codigo){
        return this.repositorioEdicao.recuperar(codigo);
    }
    
    public void deletar(Edicao edicao){
        this.repositorioEdicao.deletar(edicao);
    }
    
    public List<Edicao> recuperarTodasEdicoes(){
        return this.repositorioEdicao.recuperarTodos();
    }
}
