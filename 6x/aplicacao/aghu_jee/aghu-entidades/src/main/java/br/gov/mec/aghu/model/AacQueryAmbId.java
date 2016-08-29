package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AacQueryAmbId generated by hbm2java
 */
@Embeddable
public class AacQueryAmbId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5315837004012219830L;
	private Integer pacCodigo;
	private Double qtdCons;
	private Integer version;

	public AacQueryAmbId() {
	}

	public AacQueryAmbId(Integer version) {
		this.version = version;
	}

	public AacQueryAmbId(Integer pacCodigo, Double qtdCons, Integer version) {
		this.pacCodigo = pacCodigo;
		this.qtdCons = qtdCons;
		this.version = version;
	}

	@Column(name = "PAC_CODIGO")
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "QTD_CONS", precision = 17, scale = 17)
	public Double getQtdCons() {
		return this.qtdCons;
	}

	public void setQtdCons(Double qtdCons) {
		this.qtdCons = qtdCons;
	}

	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getPacCodigo());
		umHashCodeBuilder.append(this.getQtdCons());
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
		if (!(obj instanceof AacQueryAmbId)) {
			return false;
		}
		AacQueryAmbId other = (AacQueryAmbId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getPacCodigo(), other.getPacCodigo());
		umEqualsBuilder.append(this.getQtdCons(), other.getQtdCons());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}