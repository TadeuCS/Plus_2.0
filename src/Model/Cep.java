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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Tadeu
 */
@Entity
@Table(name = "cep")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cep.findAll", query = "SELECT c FROM Cep c"),
    @NamedQuery(name = "Cep.findByCep", query = "SELECT c FROM Cep c WHERE c.cep = :cep"),
    @NamedQuery(name = "Cep.findByEstado", query = "SELECT c FROM Cep c WHERE c.estado = :estado"),
    @NamedQuery(name = "Cep.findByCidade", query = "SELECT c FROM Cep c WHERE c.cidade = :cidade"),
    @NamedQuery(name = "Cep.findByBairro", query = "SELECT c FROM Cep c WHERE c.bairro = :bairro"),
    @NamedQuery(name = "Cep.findByRua", query = "SELECT c FROM Cep c WHERE c.rua = :rua")})
public class Cep implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CEP")
    private Integer cep;
    @Column(name = "ESTADO")
    private String estado;
    @Basic(optional = false)
    @Column(name = "CIDADE")
    private String cidade;
    @Basic(optional = false)
    @Column(name = "BAIRRO")
    private String bairro;
    @Column(name = "RUA")
    private String rua;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cep")
    private List<Endereco> enderecoList;

    public Cep() {
    }

    public Cep(Integer cep) {
        this.cep = cep;
    }

    public Cep(Integer cep, String cidade, String bairro) {
        this.cep = cep;
        this.cidade = cidade;
        this.bairro = bairro;
    }

    public Integer getCep() {
        return cep;
    }

    public void setCep(Integer cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    @XmlTransient
    public List<Endereco> getEnderecoList() {
        return enderecoList;
    }

    public void setEnderecoList(List<Endereco> enderecoList) {
        this.enderecoList = enderecoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cep != null ? cep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cep)) {
            return false;
        }
        Cep other = (Cep) object;
        if ((this.cep == null && other.cep != null) || (this.cep != null && !this.cep.equals(other.cep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Cep[ cep=" + cep + " ]";
    }
    
}
