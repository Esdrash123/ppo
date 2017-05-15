
import br.edu.ifpe.negocio.Personagem;
import br.edu.ifpe.negocio.builders.BuilderPersonagem;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 1860915
 */
public class MAIN {
    
    
    public static void main(String args[]){
        
        
        String nome = "naruto";
        int idade = 20;
        String importancia = "protagonista";
        String habilidades = "rasengan, senin, clone das sombras";
        String sexo = "masculino";
        String armas = "kunai, shuriken";
        
        BuilderPersonagem bPersonagem = new BuilderPersonagem(nome, habilidades, importancia);
        bPersonagem.setIdade(idade);
        bPersonagem.setSexo(sexo);
        bPersonagem.setArmas(armas);
        
        Personagem personagem = bPersonagem.buildPersonagem();
        
        
    }
    
}
