/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.infraestrutura.repositorios.implementacoes;

/**
 *
 * @author esdra
 */

import br.edu.ifpe.infraestrutura.repositorios.comportamentos.RepositorioGenerico;
import br.edu.ifpe.negocio.Edicao;
import java.util.List;
import java.util.ArrayList;

public class RepositorioEdicao implements RepositorioGenerico<Edicao, Integer> {

    private List<Edicao> edicoes = null;

    public RepositorioEdicao() {
        this.edicoes = new ArrayList<>();
    }

    @Override
    public void inserir(Edicao t) {
        this.edicoes.add(t);
    }

    @Override
    public void alterar(Edicao t) {
        for (Edicao e : this.edicoes) {
            if (e.getCodigo() == t.getCodigo()) {
                e.setCodigo(t.getCodigo());
                e.setData(t.getData());
                e.setNome(t.getNome());
                e.setPreco(t.getPreco());
                e.setTitulo(t.getTitulo());
                e.setTipo(t.getTipo());
            }
        }

    }

    public Edicao recuperar(Integer codigo) {
        for (Edicao e : this.edicoes) {
            if (e.getNome().equals(codigo)) {
                return e;
            }
        }
        return null;
    }

    @Override
    public void deletar(Edicao t) {
        this.edicoes.remove(t);
    }

    @Override
    public List<Edicao> recuperarTodos() {
        return this.edicoes;
    }

}
