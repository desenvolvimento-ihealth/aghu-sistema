package br.gov.mec.aghu.model;
// Generated 22/12/2011 14:16:38 by Hibernate Tools 3.4.0.CR1


import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * VScoItemAfId generated by hbm2java
 */
@Embeddable
public class VScoItemAfId  implements EntityCompositeId {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7463770016175594294L;
	private Integer codigo;
     private String umdCodigo;
     private String nome;
     private String descricao;
     private String max;
     private Integer iafAfnNumero;
     private Short iafNumero;
     private String tipo;
     private Integer pfrLctNumero;
     private Short nroComplemento;
     private String indSituacao;
     private Integer pfrFrnNumero;
     private Integer resultado;

    public VScoItemAfId() {
    }

    public VScoItemAfId(Integer codigo, String umdCodigo, String nome, String descricao, String max, Integer iafAfnNumero, Short iafNumero, String tipo, Integer pfrLctNumero, Short nroComplemento, String indSituacao, Integer pfrFrnNumero, Integer resultado) {
       this.codigo = codigo;
       this.umdCodigo = umdCodigo;
       this.nome = nome;
       this.descricao = descricao;
       this.max = max;
       this.iafAfnNumero = iafAfnNumero;
       this.iafNumero = iafNumero;
       this.tipo = tipo;
       this.pfrLctNumero = pfrLctNumero;
       this.nroComplemento = nroComplemento;
       this.indSituacao = indSituacao;
       this.pfrFrnNumero = pfrFrnNumero;
       this.resultado = resultado;
    }
   


    @Column(name="CODIGO")
    public Integer getCodigo() {
        return this.codigo;
    }
    
    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }


    @Column(name="UMD_CODIGO", length=3)
    @Length(max=3)
    public String getUmdCodigo() {
        return this.umdCodigo;
    }
    
    public void setUmdCodigo(String umdCodigo) {
        this.umdCodigo = umdCodigo;
    }


    @Column(name="NOME")
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }


    @Column(name="DESCRICAO")
    public String getDescricao() {
        return this.descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }


    @Column(name="MAX")
    public String getMax() {
        return this.max;
    }
    
    public void setMax(String max) {
        this.max = max;
    }


    @Column(name="IAF_AFN_NUMERO")
    public Integer getIafAfnNumero() {
        return this.iafAfnNumero;
    }
    
    public void setIafAfnNumero(Integer iafAfnNumero) {
        this.iafAfnNumero = iafAfnNumero;
    }


    @Column(name="IAF_NUMERO")
    public Short getIafNumero() {
        return this.iafNumero;
    }
    
    public void setIafNumero(Short iafNumero) {
        this.iafNumero = iafNumero;
    }


    @Column(name="TIPO", length=1)
    @Length(max=1)
    public String getTipo() {
        return this.tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    @Column(name="PFR_LCT_NUMERO")
    public Integer getPfrLctNumero() {
        return this.pfrLctNumero;
    }
    
    public void setPfrLctNumero(Integer pfrLctNumero) {
        this.pfrLctNumero = pfrLctNumero;
    }


    @Column(name="NRO_COMPLEMENTO")
    public Short getNroComplemento() {
        return this.nroComplemento;
    }
    
    public void setNroComplemento(Short nroComplemento) {
        this.nroComplemento = nroComplemento;
    }


    @Column(name="IND_SITUACAO", length=2)
    @Length(max=2)
    public String getIndSituacao() {
        return this.indSituacao;
    }
    
    public void setIndSituacao(String indSituacao) {
        this.indSituacao = indSituacao;
    }


    @Column(name="PFR_FRN_NUMERO")
    public Integer getPfrFrnNumero() {
        return this.pfrFrnNumero;
    }
    
    public void setPfrFrnNumero(Integer pfrFrnNumero) {
        this.pfrFrnNumero = pfrFrnNumero;
    }


    @Column(name="RESULTADO")
    public Integer getResultado() {
        return this.resultado;
    }
    
    public void setResultado(Integer resultado) {
        this.resultado = resultado;
    }



	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getResultado());
		umHashCodeBuilder.append(this.getIndSituacao());
		umHashCodeBuilder.append(this.getDescricao());
		umHashCodeBuilder.append(this.getTipo());
		umHashCodeBuilder.append(this.getNome());
		umHashCodeBuilder.append(this.getCodigo());
		umHashCodeBuilder.append(this.getUmdCodigo());
		umHashCodeBuilder.append(this.getIafAfnNumero());
		umHashCodeBuilder.append(this.getIafNumero());
		umHashCodeBuilder.append(this.getMax());
		umHashCodeBuilder.append(this.getPfrLctNumero());
		umHashCodeBuilder.append(this.getNroComplemento());
		umHashCodeBuilder.append(this.getPfrFrnNumero());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof VScoItemAfId)) {
			return false;
		}
		VScoItemAfId other = (VScoItemAfId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getResultado(), other.getResultado());
		umEqualsBuilder.append(this.getIndSituacao(), other.getIndSituacao());
		umEqualsBuilder.append(this.getDescricao(), other.getDescricao());
		umEqualsBuilder.append(this.getTipo(), other.getTipo());
		umEqualsBuilder.append(this.getNome(), other.getNome());
		umEqualsBuilder.append(this.getCodigo(), other.getCodigo());
		umEqualsBuilder.append(this.getUmdCodigo(), other.getUmdCodigo());
		umEqualsBuilder.append(this.getIafAfnNumero(), other.getIafAfnNumero());
		umEqualsBuilder.append(this.getIafNumero(), other.getIafNumero());
		umEqualsBuilder.append(this.getMax(), other.getMax());
		umEqualsBuilder.append(this.getPfrLctNumero(), other.getPfrLctNumero());
		umEqualsBuilder.append(this.getNroComplemento(), other.getNroComplemento());
		umEqualsBuilder.append(this.getPfrFrnNumero(), other.getPfrFrnNumero());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}

