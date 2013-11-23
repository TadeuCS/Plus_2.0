/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Tadeu
 */
@Embeddable
public class ItemVendaPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "CODLOCACAO")
    private int codlocacao;
    @Basic(optional = false)
    @Column(name = "CODPRODUTO")
    private int codproduto;

    public ItemVendaPK() {
    }

    public ItemVendaPK(int codlocacao, int codproduto) {
        this.codlocacao = codlocacao;
        this.codproduto = codproduto;
    }

    public int getCodlocacao() {
        return codlocacao;
    }

    public void setCodlocacao(int codlocacao) {
        this.codlocacao = codlocacao;
    }

    public int getCodproduto() {
        return codproduto;
    }

    public void setCodproduto(int codproduto) {
        this.codproduto = codproduto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codlocacao;
        hash += (int) codproduto;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemVendaPK)) {
            return false;
        }
        ItemVendaPK other = (ItemVendaPK) object;
        if (this.codlocacao != other.codlocacao) {
            return false;
        }
        if (this.codproduto != other.codproduto) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.ItemVendaPK[ codlocacao=" + codlocacao + ", codproduto=" + codproduto + " ]";
    }
    
}
