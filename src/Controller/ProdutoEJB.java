/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Produto;
import Util.Manager;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Suporte4
 */
public class ProdutoEJB extends Manager {

    public void salvar(Produto produto) {
        try {
            em.getTransaction().begin();
            em.persist(produto);
            em.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void alterar(Produto produto) {
        try {
            em.getTransaction().begin();
            em.merge(produto);
            em.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }

    }

    public void excluir(Produto produto) {
        try {
            em.getTransaction().begin();
            produto = em.find(Produto.class, produto.getId());
            em.remove(produto);
            em.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    public List<Produto> listar() {
        try {
            em.getTransaction().begin();
            query = em.createNamedQuery("Produto.findByAll");
            em.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return query.getResultList();
    }
    public Object findByCodigo(Produto produto){
        try {
            query = em.createNamedQuery("Produto.findByCodproduto").setParameter("codigo", produto.getId());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return query.getSingleResult();
    }
}
