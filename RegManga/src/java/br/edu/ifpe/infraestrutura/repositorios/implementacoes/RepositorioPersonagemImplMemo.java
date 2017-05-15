/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.infraestrutura.repositorios.implementacoes;

import br.edu.ifpe.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import br.edu.ifpe.negocio.Personagem;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 1860915
 */
public class RepositorioPersonagemImplMemo implements RepositorioGenerico<Personagem, String>{
    
    private List<Personagem> personagens = null;

    public RepositorioPersonagemImplMemo() {
        this.personagens = new ArrayList<>();
    }
    
    @Override
    public void inserir(Personagem t) {
        this.personagens.add(t);
    }

    @Override
    public void alterar(Personagem t) {
        for(Personagem p:this.personagens){
            if(p.getNome().equals(t.getNome())){
                p.setArmadura(t.getArmadura());
                p.setArmas(t.getArmas());
                p.setHabilidades(t.getHabilidades());
                p.setHistoria(t.getHistoria());
                p.setIdade(t.getIdade());
                p.setIdeologia(p.getIdeologia());
                p.setImportancia(p.getImportancia());
                p.setSexo(p.getSexo());
                return;
            }
        }
        
        /*Personagem p = null;
        for(int i = 0;i<this.personagens.size();i++){
            p = this.personagens.get(i);
        }*/
    }

    @Override
    public Personagem recuperar(String codigo) {
        for(Personagem p:this.personagens){
            if(p.getNome().equals(codigo)){
                return p;
            }
        }
        return null;
    }

    @Override
    public void deletar(Personagem t) {
        this.personagens.remove(t);
    }

    @Override
    public List<Personagem> recuperarTodos() {
        return this.personagens;
    }
    
}
