package br.gov.mec.aghu.model;

// Generated 19/10/2010 14:23:49 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AfaSinonimoMdtosId generated by hbm2java
 */
@Embeddable
public class AfaSinonimoMedicamentoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8531924572075337042L;
	private Integer medMatCodigo;
	private Integer seqp;

	public AfaSinonimoMedicamentoId() {
	}

	public AfaSinonimoMedicamentoId(Integer medMatCodigo, Integer seqp) {
		this.medMatCodigo = medMatCodigo;
		this.seqp = seqp;
	}

	@Column(name = "MED_MAT_CODIGO", nullable = false, precision = 6, scale = 0)
	public Integer getMedMatCodigo() {
		return this.medMatCodigo;
	}

	public void setMedMatCodigo(Integer medMatCodigo) {
		this.medMatCodigo = medMatCodigo;
	}

	@Column(name = "SEQP", nullable = false, precision = 6, scale = 0)
	public Integer getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Integer seqp) {
		this.seqp = seqp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((medMatCodigo == null) ? 0 : medMatCodigo.hashCode());
		result = prime * result + ((seqp == null) ? 0 : seqp.hashCode());
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
		AfaSinonimoMedicamentoId other = (AfaSinonimoMedicamentoId) obj;
		if (medMatCodigo == null) {
			if (other.medMatCodigo != null) {
				return false;
			}
		} else if (!medMatCodigo.equals(other.medMatCodigo)) {
			return false;
		}
		if (seqp == null) {
			if (other.seqp != null) {
				return false;
			}
		} else if (!seqp.equals(other.seqp)) {
			return false;
		}
		return true;
	}

}
