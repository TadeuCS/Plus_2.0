/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "endereco")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Endereco.findAll", query = "SELECT e FROM Endereco e"),
    @NamedQuery(name = "Endereco.findByCodend", query = "SELECT e FROM Endereco e WHERE e.codend = :codend"),
    @NamedQuery(name = "Endereco.findByNumero", query = "SELECT e FROM Endereco e WHERE e.numero = :numero"),
    @NamedQuery(name = "Endereco.findByComplemento", query = "SELECT e FROM Endereco e WHERE e.complemento = :complemento")})
public class Endereco implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODEND")
    private Integer codend;
    @Basic(optional = false)
    @Column(name = "NUMERO")
    private int numero;
    @Column(name = "COMPLEMENTO")
    private String complemento;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "endereco")
    private EndEntrega endEntrega;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "endereco")
    private EndCobranca endCobranca;
    @JoinColumn(name = "CEP", referencedColumnName = "CEP")
    @ManyToOne(optional = false)
    private Cep cep;

    public Endereco() {
    }

    public Endereco(Integer codend) {
        this.codend = codend;
    }

    public Endereco(Integer codend, int numero) {
        this.codend = codend;
        this.numero = numero;
    }

    public Integer getCodend() {
        return codend;
    }

    public void setCodend(Integer codend) {
        this.codend = codend;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public EndEntrega getEndEntrega() {
        return endEntrega;
    }

    public void setEndEntrega(EndEntrega endEntrega) {
        this.endEntrega = endEntrega;
    }

    public EndCobranca getEndCobranca() {
        return endCobranca;
    }

    public void setEndCobranca(EndCobranca endCobranca) {
        this.endCobranca = endCobranca;
    }

    public Cep getCep() {
        return cep;
    }

    public void setCep(Cep cep) {
        this.cep = cep;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codend != null ? codend.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Endereco)) {
            return false;
        }
        Endereco other = (Endereco) object;
        if ((this.codend == null && other.codend != null) || (this.codend != null && !this.codend.equals(other.codend))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Endereco[ codend=" + codend + " ]";
    }
    
}
