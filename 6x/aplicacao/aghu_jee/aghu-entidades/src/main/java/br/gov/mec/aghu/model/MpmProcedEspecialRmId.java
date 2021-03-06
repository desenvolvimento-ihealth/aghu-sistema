package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmProcedEspecialRmId generated by hbm2java
 */
@Embeddable
public class MpmProcedEspecialRmId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2397388378098854011L;
	private Short pedSeq;
	private Integer matCodigo;

	public MpmProcedEspecialRmId() {
	}

	public MpmProcedEspecialRmId(Short pedSeq, Integer matCodigo) {
		this.pedSeq = pedSeq;
		this.matCodigo = matCodigo;
	}

	@Column(name = "PED_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getPedSeq() {
		return this.pedSeq;
	}

	public void setPedSeq(Short pedSeq) {
		this.pedSeq = pedSeq;
	}

	@Column(name = "MAT_CODIGO", nullable = false, precision = 6, scale = 0)
	public Integer getMatCodigo() {
		return this.matCodigo;
	}

	public void setMatCodigo(Integer matCodigo) {
		this.matCodigo = matCodigo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((matCodigo == null) ? 0 : matCodigo.hashCode());
		result = prime * result + ((pedSeq == null) ? 0 : pedSeq.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		MpmProcedEspecialRmId other = (MpmProcedEspecialRmId) obj;
		if (matCodigo == null) {
			if (other.matCodigo != null) {
				return false;
			}
		} else if (!matCodigo.equals(other.matCodigo)) {
			return false;
		}
		if (pedSeq == null) {
			if (other.pedSeq != null) {
				return false;
			}
		} else if (!pedSeq.equals(other.pedSeq)) {
			return false;
		}
		return true;
	}

}
