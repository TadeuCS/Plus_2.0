/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "locacao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Locacao.findAll", query = "SELECT l FROM Locacao l"),
    @NamedQuery(name = "Locacao.findByCodlocacao", query = "SELECT l FROM Locacao l WHERE l.codlocacao = :codlocacao"),
    @NamedQuery(name = "Locacao.findByDataloc", query = "SELECT l FROM Locacao l WHERE l.dataloc = :dataloc"),
    @NamedQuery(name = "Locacao.findByDatadev", query = "SELECT l FROM Locacao l WHERE l.datadev = :datadev"),
    @NamedQuery(name = "Locacao.findByObservacao", query = "SELECT l FROM Locacao l WHERE l.observacao = :observacao")})
public class Locacao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODLOCACAO")
    private Integer codlocacao;
    @Basic(optional = false)
    @Column(name = "DATALOC")
    @Temporal(TemporalType.DATE)
    private Date dataloc;
    @Column(name = "DATADEV")
    @Temporal(TemporalType.DATE)
    private Date datadev;
    @Column(name = "OBSERVACAO")
    private String observacao;
    @JoinColumn(name = "CODCLIENTE", referencedColumnName = "CODCLIENTE")
    @ManyToOne(optional = false)
    private Cliente codcliente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "locacao")
    private List<ItemVenda> itemVendaList;

    public Locacao() {
    }

    public Locacao(Integer codlocacao) {
        this.codlocacao = codlocacao;
    }

    public Locacao(Integer codlocacao, Date dataloc) {
        this.codlocacao = codlocacao;
        this.dataloc = dataloc;
    }

    public Integer getCodlocacao() {
        return codlocacao;
    }

    public void setCodlocacao(Integer codlocacao) {
        this.codlocacao = codlocacao;
    }

    public Date getDataloc() {
        return dataloc;
    }

    public void setDataloc(Date dataloc) {
        this.dataloc = dataloc;
    }

    public Date getDatadev() {
        return datadev;
    }

    public void setDatadev(Date datadev) {
        this.datadev = datadev;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Cliente getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Cliente codcliente) {
        this.codcliente = codcliente;
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
        hash += (codlocacao != null ? codlocacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Locacao)) {
            return false;
        }
        Locacao other = (Locacao) object;
        if ((this.codlocacao == null && other.codlocacao != null) || (this.codlocacao != null && !this.codlocacao.equals(other.codlocacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Locacao[ codlocacao=" + codlocacao + " ]";
    }
    
}
