package br.gov.mec.aghu.model;

// Generated 05/01/2011 20:37:39 by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * CseAcoesConProfissionaisId generated by hbm2java
 */
@Embeddable
public class CseAcoesConProfissionaisId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 414337908327215996L;
	private Short cprCodigo;
	private Short acoSeq;

	public CseAcoesConProfissionaisId() {
	}

	public CseAcoesConProfissionaisId(Short cprCodigo, Short acoSeq) {
		this.cprCodigo = cprCodigo;
		this.acoSeq = acoSeq;
	}

	@Column(name = "CPR_CODIGO", nullable = false, precision = 4, scale = 0)
	public Short getCprCodigo() {
		return this.cprCodigo;
	}

	public void setCprCodigo(Short cprCodigo) {
		this.cprCodigo = cprCodigo;
	}

	@Column(name = "ACO_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getAcoSeq() {
		return this.acoSeq;
	}

	public void setAcoSeq(Short acoSeq) {
		this.acoSeq = acoSeq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof CseAcoesConProfissionaisId)) {
			return false;
		}
		CseAcoesConProfissionaisId castOther = (CseAcoesConProfissionaisId) other;

		return (this.getCprCodigo() == castOther.getCprCodigo())
				&& (this.getAcoSeq() == castOther.getAcoSeq());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCprCodigo();
		result = 37 * result + this.getAcoSeq();
		return result;
	}

}
