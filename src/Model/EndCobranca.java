/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "end_cobranca")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EndCobranca.findAll", query = "SELECT e FROM EndCobranca e"),
    @NamedQuery(name = "EndCobranca.findByCodEndCobranca", query = "SELECT e FROM EndCobranca e WHERE e.codEndCobranca = :codEndCobranca")})
public class EndCobranca implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_END_COBRANCA")
    private Integer codEndCobranca;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codEndCobranca")
    private List<Cliente> clienteList;
    @JoinColumn(name = "COD_END_COBRANCA", referencedColumnName = "CODEND", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Endereco endereco;

    public EndCobranca() {
    }

    public EndCobranca(Integer codEndCobranca) {
        this.codEndCobranca = codEndCobranca;
    }

    public Integer getCodEndCobranca() {
        return codEndCobranca;
    }

    public void setCodEndCobranca(Integer codEndCobranca) {
        this.codEndCobranca = codEndCobranca;
    }

    @XmlTransient
    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEndCobranca != null ? codEndCobranca.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EndCobranca)) {
            return false;
        }
        EndCobranca other = (EndCobranca) object;
        if ((this.codEndCobranca == null && other.codEndCobranca != null) || (this.codEndCobranca != null && !this.codEndCobranca.equals(other.codEndCobranca))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.EndCobranca[ codEndCobranca=" + codEndCobranca + " ]";
    }
    
}
