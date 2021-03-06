package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AbsIntervaloBolsaId generated by hbm2java
 */
@Embeddable
public class AbsIntervaloBolsaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4015333411896119343L;
	private Short bsaCodigo;
	private Date criadoEm;

	public AbsIntervaloBolsaId() {
	}

	public AbsIntervaloBolsaId(Short bsaCodigo, Date criadoEm) {
		this.bsaCodigo = bsaCodigo;
		this.criadoEm = criadoEm;
	}

	@Column(name = "BSA_CODIGO", nullable = false)
	public Short getBsaCodigo() {
		return this.bsaCodigo;
	}

	public void setBsaCodigo(Short bsaCodigo) {
		this.bsaCodigo = bsaCodigo;
	}

	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCriadoEm());
		umHashCodeBuilder.append(this.getBsaCodigo());
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
		if (!(obj instanceof AbsIntervaloBolsaId)) {
			return false;
		}
		AbsIntervaloBolsaId other = (AbsIntervaloBolsaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCriadoEm(), other.getCriadoEm());
		umEqualsBuilder.append(this.getBsaCodigo(), other.getBsaCodigo());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
