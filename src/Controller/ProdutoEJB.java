/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Produto;
import Util.Manager;
import java.util.List;

/**
 *
 * @author Suporte4
 */
public class ProdutoEJB extends Manager {

    
    public void salvar(Produto produto) {
        em.persist(produto);
    }

    public void alterar(Produto produto) {
        em.merge(produto);
    }

    public void excluir(Produto produto) {
        produto = em.find(Produto.class, produto.getId());
        em.remove(produto);
    }

    public List<Produto> listar(){
        return em.createNamedQuery("Produto.findByAll").getResultList();
    }
}
