/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.control.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author LEONARDO
 */
@Entity
@Table(name = "material")

public class Materiais implements Serializable {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Column(name = "cod_material", unique=true, nullable=false)
    private String codMaterial;
    
    @Column(name = "data_material")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataMaterial;
    
    @Column(name = "descricao")
    private String descricao;
    
    @Column(name = "cod_barras")
    private String codBarras;
    
    @Column(name = "qtd_estoque")
    private Integer qtdEstoque;
    
    @Column(name = "qtd_minima")
    private Integer qtdMinima;
    
    @Column(name = "valor")
    private Double valor;
    
    @Column(name = "fornecedor")
    private String fornecedor;
    
    @Column(name = "grupo")
    private String grupo;
    
    @Column(name = "vencimento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vencimento;
    //@OneToMany(mappedBy = "codProduto")
    //private List<Safx08> safx08List;

    public Materiais() {
    }

    public Materiais(String codMaterial) {
        this.codMaterial = codMaterial;
    }

    public String getCodMaterial() {
        return codMaterial;
    }

    public void setCodMaterial(String codMaterial) {
        this.codMaterial = codMaterial;
    }

    public Date getDataMaterial() {
        return dataMaterial;
    }

    public void setDataMaterial(Date dataMaterial) {
        this.dataMaterial = dataMaterial;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

   
    
    /*public List<Safx08> getSafx08List() {
        return safx08List;
    }

    public void setSafx08List(List<Safx08> safx08List) {
        this.safx08List = safx08List;
    }*/

    public String getCodBarras() {
		return codBarras;
	}

	public void setCodBarras(String codBarras) {
		this.codBarras = codBarras;
	}

	public Integer getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}

	public Integer getQtdMinima() {
		return qtdMinima;
	}

	public void setQtdMinima(Integer qtdMinima) {
		this.qtdMinima = qtdMinima;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}

	public Date getVencimento() {
		return vencimento;
	}

	public void setVencimento(Date vencimento) {
		this.vencimento = vencimento;
	}

	@Override
    public int hashCode() {
        int hash = 0;
        hash += (codMaterial != null ? codMaterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Materiais)) {
            return false;
        }
        Materiais other = (Materiais) object;
        if ((this.codMaterial == null && other.codMaterial != null) || (this.codMaterial != null && !this.codMaterial.equals(other.codMaterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "safx.Materiais[ codMaterial=" + codMaterial + " ]";
    }
    
}
