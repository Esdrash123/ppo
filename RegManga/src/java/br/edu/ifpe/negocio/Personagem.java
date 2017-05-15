/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocio;

/**
 *
 * @author 1860915
 */
public class Personagem {
    
    private String nome;
    private int idade;
    private String habilidades;
    private String armas;
    private String armadura;
    private String ideologia;
    private String historia;
    private String sexo;
    private String importancia;

    public Personagem(String nome, int idade, String habilidades, String armas, String armadura, String ideologia, String historia, String sexo, String importancia) {
        this.nome = nome;
        this.idade = idade;
        this.habilidades = habilidades;
        this.armas = armas;
        this.armadura = armadura;
        this.ideologia = ideologia;
        this.historia = historia;
        this.sexo = sexo;
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
    
    
    
}
