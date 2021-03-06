package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatExclusaoCriticasBkpId generated by hbm2java
 */
@Embeddable
public class FatExclusaoCriticaBkpId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2379724967025215822L;
	private Byte codigo;
	private String cbo;
	private String qtd;
	private String idMaior;
	private String idMenor;
	private String permMenor;

	public FatExclusaoCriticaBkpId() {
	}

	public FatExclusaoCriticaBkpId(Byte codigo) {
		this.codigo = codigo;
	}

	public FatExclusaoCriticaBkpId(Byte codigo, String cbo, String qtd,
			String idMaior, String idMenor, String permMenor) {
		this.codigo = codigo;
		this.cbo = cbo;
		this.qtd = qtd;
		this.idMaior = idMaior;
		this.idMenor = idMenor;
		this.permMenor = permMenor;
	}

	@Column(name = "CODIGO", nullable = false, precision = 2, scale = 0)
	public Byte getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Byte codigo) {
		this.codigo = codigo;
	}

	@Column(name = "CBO", length = 1)
	@Length(max = 1)
	public String getCbo() {
		return this.cbo;
	}

	public void setCbo(String cbo) {
		this.cbo = cbo;
	}

	@Column(name = "QTD", length = 1)
	@Length(max = 1)
	public String getQtd() {
		return this.qtd;
	}

	public void setQtd(String qtd) {
		this.qtd = qtd;
	}

	@Column(name = "ID_MAIOR", length = 1)
	@Length(max = 1)
	public String getIdMaior() {
		return this.idMaior;
	}

	public void setIdMaior(String idMaior) {
		this.idMaior = idMaior;
	}

	@Column(name = "ID_MENOR", length = 1)
	@Length(max = 1)
	public String getIdMenor() {
		return this.idMenor;
	}

	public void setIdMenor(String idMenor) {
		this.idMenor = idMenor;
	}

	@Column(name = "PERM_MENOR", length = 1)
	@Length(max = 1)
	public String getPermMenor() {
		return this.permMenor;
	}

	public void setPermMenor(String permMenor) {
		this.permMenor = permMenor;
	}
	


 	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCodigo());
		umHashCodeBuilder.append(this.getCbo());
		umHashCodeBuilder.append(this.getQtd());
		umHashCodeBuilder.append(this.getIdMaior());
		umHashCodeBuilder.append(this.getIdMenor());
		umHashCodeBuilder.append(this.getPermMenor());
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
		if (!(obj instanceof FatExclusaoCriticaBkpId)) {
			return false;
		}
		FatExclusaoCriticaBkpId other = (FatExclusaoCriticaBkpId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCodigo(), other.getCodigo());
		umEqualsBuilder.append(this.getCbo(), other.getCbo());
		umEqualsBuilder.append(this.getQtd(), other.getQtd());
		umEqualsBuilder.append(this.getIdMaior(), other.getIdMaior());
		umEqualsBuilder.append(this.getIdMenor(), other.getIdMenor());
		umEqualsBuilder.append(this.getPermMenor(), other.getPermMenor());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
