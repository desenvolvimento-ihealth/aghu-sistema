package br.gov.mec.aghu.model;

// Generated 10/08/2010 17:33:16 by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MptPrescricaoPacienteId generated by hbm2java
 */
@Embeddable

public class MptPrescricaoPacienteId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1410294102245730304L;
	private Integer atdSeq;
	private Integer seq;

	public MptPrescricaoPacienteId() {
	}

	public MptPrescricaoPacienteId(Integer atdSeq, Integer seq) {
		this.atdSeq = atdSeq;
		this.seq = seq;
	}

	@Column(name = "ATD_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getAtdSeq() {
		return this.atdSeq;
	}

	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}

	@Column(name = "SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof MptPrescricaoPacienteId)) {
			return false;
		}
		MptPrescricaoPacienteId castOther = (MptPrescricaoPacienteId) other;

		return (this.getAtdSeq() == castOther.getAtdSeq())
				&& (this.getSeq() == castOther.getSeq());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getAtdSeq();
		result = 37 * result + this.getSeq();
		return result;
	}

}
