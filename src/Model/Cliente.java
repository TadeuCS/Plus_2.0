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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "cliente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cliente.findAll", query = "SELECT c FROM Cliente c"),
    @NamedQuery(name = "Cliente.findByCodcliente", query = "SELECT c FROM Cliente c WHERE c.codcliente = :codcliente"),
    @NamedQuery(name = "Cliente.findByEmail", query = "SELECT c FROM Cliente c WHERE c.email = :email"),
    @NamedQuery(name = "Cliente.findByContato", query = "SELECT c FROM Cliente c WHERE c.contato = :contato"),
    @NamedQuery(name = "Cliente.findByCpfCnpj", query = "SELECT c FROM Cliente c WHERE c.cpfCnpj = :cpfCnpj"),
    @NamedQuery(name = "Cliente.findByNomeRazao", query = "SELECT c FROM Cliente c WHERE c.nomeRazao = :nomeRazao"),
    @NamedQuery(name = "Cliente.findByInscricao", query = "SELECT c FROM Cliente c WHERE c.inscricao = :inscricao")})
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "CODCLIENTE")
    private Integer codcliente;
    @Basic(optional = false)
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "CONTATO")
    private String contato;
    @Basic(optional = false)
    @Column(name = "CPF_CNPJ")
    private String cpfCnpj;
    @Basic(optional = false)
    @Column(name = "NOME_RAZAO")
    private String nomeRazao;
    @Column(name = "INSCRICAO")
    private String inscricao;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codcliente")
    private List<Locacao> locacaoList;
    @JoinColumn(name = "COD_END_COBRANCA", referencedColumnName = "COD_END_COBRANCA")
    @ManyToOne(optional = false)
    private EndCobranca codEndCobranca;
    @JoinColumn(name = "COD_END_ENTREGA", referencedColumnName = "COD_END_ENTREGA")
    @ManyToOne(optional = false)
    private EndEntrega codEndEntrega;

    public Cliente() {
    }

    public Cliente(Integer codcliente) {
        this.codcliente = codcliente;
    }

    public Cliente(Integer codcliente, String email, String cpfCnpj, String nomeRazao) {
        this.codcliente = codcliente;
        this.email = email;
        this.cpfCnpj = cpfCnpj;
        this.nomeRazao = nomeRazao;
    }

    public Integer getCodcliente() {
        return codcliente;
    }

    public void setCodcliente(Integer codcliente) {
        this.codcliente = codcliente;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getNomeRazao() {
        return nomeRazao;
    }

    public void setNomeRazao(String nomeRazao) {
        this.nomeRazao = nomeRazao;
    }

    public String getInscricao() {
        return inscricao;
    }

    public void setInscricao(String inscricao) {
        this.inscricao = inscricao;
    }

    @XmlTransient
    public List<Locacao> getLocacaoList() {
        return locacaoList;
    }

    public void setLocacaoList(List<Locacao> locacaoList) {
        this.locacaoList = locacaoList;
    }

    public EndCobranca getCodEndCobranca() {
        return codEndCobranca;
    }

    public void setCodEndCobranca(EndCobranca codEndCobranca) {
        this.codEndCobranca = codEndCobranca;
    }

    public EndEntrega getCodEndEntrega() {
        return codEndEntrega;
    }

    public void setCodEndEntrega(EndEntrega codEndEntrega) {
        this.codEndEntrega = codEndEntrega;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codcliente != null ? codcliente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.codcliente == null && other.codcliente != null) || (this.codcliente != null && !this.codcliente.equals(other.codcliente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Cliente[ codcliente=" + codcliente + " ]";
    }
    
}
