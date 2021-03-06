package br.gov.mec.aghu.model;

// Generated 24/09/2009 17:21:40 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AipCidadesDistritoSanitarioId generated by hbm2java
 */
@Embeddable

public class AipCidadesDistritoSanitarioId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4050319660209102858L;
	private Integer cddCodigo;
	private Short dstCodigo;

	public AipCidadesDistritoSanitarioId() {
	}

	public AipCidadesDistritoSanitarioId(Integer cddCodigo, Short dstCodigo) {
		this.cddCodigo = cddCodigo;
		this.dstCodigo = dstCodigo;
	}

	@Column(name = "CDD_CODIGO", nullable = false, precision = 5, scale = 0)
	public Integer getCddCodigo() {
		return this.cddCodigo;
	}

	public void setCddCodigo(Integer cddCodigo) {
		this.cddCodigo = cddCodigo;
	}

	@Column(name = "DST_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getDstCodigo() {
		return this.dstCodigo;
	}

	public void setDstCodigo(Short dstCodigo) {
		this.dstCodigo = dstCodigo;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AipCidadesDistritoSanitarioId)) {
			return false;
		}
		AipCidadesDistritoSanitarioId castOther = (AipCidadesDistritoSanitarioId) other;

		return (this.getCddCodigo() == castOther.getCddCodigo())
				&& (this.getDstCodigo() == castOther.getDstCodigo());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCddCodigo();
		result = 37 * result + this.getDstCodigo();
		return result;
	}

}
