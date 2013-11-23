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
@Table(name = "end_entrega")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EndEntrega.findAll", query = "SELECT e FROM EndEntrega e"),
    @NamedQuery(name = "EndEntrega.findByCodEndEntrega", query = "SELECT e FROM EndEntrega e WHERE e.codEndEntrega = :codEndEntrega")})
public class EndEntrega implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_END_ENTREGA")
    private Integer codEndEntrega;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codEndEntrega")
    private List<Cliente> clienteList;
    @JoinColumn(name = "COD_END_ENTREGA", referencedColumnName = "CODEND", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Endereco endereco;

    public EndEntrega() {
    }

    public EndEntrega(Integer codEndEntrega) {
        this.codEndEntrega = codEndEntrega;
    }

    public Integer getCodEndEntrega() {
        return codEndEntrega;
    }

    public void setCodEndEntrega(Integer codEndEntrega) {
        this.codEndEntrega = codEndEntrega;
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
        hash += (codEndEntrega != null ? codEndEntrega.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EndEntrega)) {
            return false;
        }
        EndEntrega other = (EndEntrega) object;
        if ((this.codEndEntrega == null && other.codEndEntrega != null) || (this.codEndEntrega != null && !this.codEndEntrega.equals(other.codEndEntrega))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.EndEntrega[ codEndEntrega=" + codEndEntrega + " ]";
    }
    
}
