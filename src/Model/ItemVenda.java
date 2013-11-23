/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "item_venda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ItemVenda.findAll", query = "SELECT i FROM ItemVenda i"),
    @NamedQuery(name = "ItemVenda.findByCodlocacao", query = "SELECT i FROM ItemVenda i WHERE i.itemVendaPK.codlocacao = :codlocacao"),
    @NamedQuery(name = "ItemVenda.findByCodproduto", query = "SELECT i FROM ItemVenda i WHERE i.itemVendaPK.codproduto = :codproduto"),
    @NamedQuery(name = "ItemVenda.findByQtde", query = "SELECT i FROM ItemVenda i WHERE i.qtde = :qtde"),
    @NamedQuery(name = "ItemVenda.findByValorunit", query = "SELECT i FROM ItemVenda i WHERE i.valorunit = :valorunit")})
public class ItemVenda implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItemVendaPK itemVendaPK;
    @Basic(optional = false)
    @Column(name = "QTDE")
    private int qtde;
    @Basic(optional = false)
    @Column(name = "VALORUNIT")
    private float valorunit;
    @JoinColumn(name = "CODPRODUTO", referencedColumnName = "CODPRODUTO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Produto produto;
    @JoinColumn(name = "CODLOCACAO", referencedColumnName = "CODLOCACAO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Locacao locacao;

    public ItemVenda() {
    }

    public ItemVenda(ItemVendaPK itemVendaPK) {
        this.itemVendaPK = itemVendaPK;
    }

    public ItemVenda(ItemVendaPK itemVendaPK, int qtde, float valorunit) {
        this.itemVendaPK = itemVendaPK;
        this.qtde = qtde;
        this.valorunit = valorunit;
    }

    public ItemVenda(int codlocacao, int codproduto) {
        this.itemVendaPK = new ItemVendaPK(codlocacao, codproduto);
    }

    public ItemVendaPK getItemVendaPK() {
        return itemVendaPK;
    }

    public void setItemVendaPK(ItemVendaPK itemVendaPK) {
        this.itemVendaPK = itemVendaPK;
    }

    public int getQtde() {
        return qtde;
    }

    public void setQtde(int qtde) {
        this.qtde = qtde;
    }

    public float getValorunit() {
        return valorunit;
    }

    public void setValorunit(float valorunit) {
        this.valorunit = valorunit;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Locacao getLocacao() {
        return locacao;
    }

    public void setLocacao(Locacao locacao) {
        this.locacao = locacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemVendaPK != null ? itemVendaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItemVenda)) {
            return false;
        }
        ItemVenda other = (ItemVenda) object;
        if ((this.itemVendaPK == null && other.itemVendaPK != null) || (this.itemVendaPK != null && !this.itemVendaPK.equals(other.itemVendaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.ItemVenda[ itemVendaPK=" + itemVendaPK + " ]";
    }
    
}
