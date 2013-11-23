/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "produto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Produto.findAll", query = "SELECT p FROM Produto p"),
    @NamedQuery(name = "Produto.findByCodproduto", query = "SELECT p FROM Produto p WHERE p.codproduto = :codproduto"),
    @NamedQuery(name = "Produto.findByDescricao", query = "SELECT p FROM Produto p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Produto.findByReferencia", query = "SELECT p FROM Produto p WHERE p.referencia = :referencia"),
    @NamedQuery(name = "Produto.findByDisponivel", query = "SELECT p FROM Produto p WHERE p.disponivel = :disponivel")})
public class Produto implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODPRODUTO")
    private Integer codproduto;
    @Basic(optional = false)
    @Column(name = "DESCRICAO",nullable = false)
    private String descricao;
    @Basic(optional = false)
    @Column(name = "REFERENCIA",unique = true,nullable = false)
    private String referencia;
    @Basic(optional = false)
    @Column(name = "DISPONIVEL",nullable = false)
    private char disponivel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "produto")
    private List<ItemVenda> itemVendaList;

    public Produto() {
    }

    public Produto(Integer codproduto) {
        this.codproduto = codproduto;
    }

    public Produto(Integer codproduto, String descricao, String referencia, char disponivel) {
        this.codproduto = codproduto;
        this.descricao = descricao;
        this.referencia = referencia;
        this.disponivel = disponivel;
    }

    public Integer getCodproduto() {
        return codproduto;
    }

    public void setCodproduto(Integer codproduto) {
        Integer oldCodproduto = this.codproduto;
        this.codproduto = codproduto;
        changeSupport.firePropertyChange("codproduto", oldCodproduto, codproduto);
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        String oldDescricao = this.descricao;
        this.descricao = descricao;
        changeSupport.firePropertyChange("descricao", oldDescricao, descricao);
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        String oldReferencia = this.referencia;
        this.referencia = referencia;
        changeSupport.firePropertyChange("referencia", oldReferencia, referencia);
    }

    public char getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(char disponivel) {
        char oldDisponivel = this.disponivel;
        this.disponivel = disponivel;
        changeSupport.firePropertyChange("disponivel", oldDisponivel, disponivel);
    }

    @XmlTransient
    public List<ItemVenda> getItemVendaList() {
        return itemVendaList;
    }

    public void setItemVendaList(List<ItemVenda> itemVendaList) {
        this.itemVendaList = itemVendaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codproduto != null ? codproduto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Produto)) {
            return false;
        }
        Produto other = (Produto) object;
        if ((this.codproduto == null && other.codproduto != null) || (this.codproduto != null && !this.codproduto.equals(other.codproduto))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Produto[ codproduto=" + codproduto + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
