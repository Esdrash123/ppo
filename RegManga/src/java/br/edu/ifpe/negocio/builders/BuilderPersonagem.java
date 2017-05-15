/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocio.builders;

import br.edu.ifpe.negocio.Personagem;

/**
 *
 * @author 1860915
 */
public class BuilderPersonagem {
    private String nome;
    private int idade;
    private String habilidades;
    private String armas;
    private String armadura;
    private String ideologia;
    private String historia;
    private String sexo;
    private String importancia;

    public BuilderPersonagem(String nome, String habilidades, String importancia) {
        this.nome = nome;
        this.habilidades = habilidades;
        this.importancia = importancia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(String habilidades) {
        this.habilidades = habilidades;
    }

    public String getArmas() {
        return armas;
    }

    public void setArmas(String armas) {
        this.armas = armas;
    }

    public String getArmadura() {
        return armadura;
    }

    public void setArmadura(String armadura) {
        this.armadura = armadura;
    }

    public String getIdeologia() {
        return ideologia;
    }

    public void setIdeologia(String ideologia) {
        this.ideologia = ideologia;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }
    
    public Personagem buildPersonagem(){
        return new Personagem (nome, idade, habilidades, armas, armadura, ideologia, historia, sexo, importancia);
    }
    
}
