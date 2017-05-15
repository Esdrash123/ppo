/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.infraestrutura.repositorios.implementacoes;

import br.edu.ifpe.infraestrutura.repositorios.comportamentos.RepositorioGenerico;

/**
 *
 * @author 1860915
 */
public class FabricaRepositorios {
    
    public static final int PERSONAGEM = 1;
    public static final int EDICAO = 2;
    
    public static final int MEMORIA = 1;
    public static final int BANCODADOS = 2;
    public static final int ARQUIVO =3;
    
    public static RepositorioGenerico manufactor(int tipoNegocio, int tipoPersistencia){
        
        if(tipoPersistencia==MEMORIA){
            if(tipoNegocio==PERSONAGEM){
                return new RepositorioPersonagemImplMemo();
            }
            if(tipoNegocio==EDICAO){
                return null;
            }
        }
        if(tipoPersistencia==BANCODADOS){
            if(tipoNegocio==PERSONAGEM){
                return null;
            }
        }
        return null;
    }
    
}
