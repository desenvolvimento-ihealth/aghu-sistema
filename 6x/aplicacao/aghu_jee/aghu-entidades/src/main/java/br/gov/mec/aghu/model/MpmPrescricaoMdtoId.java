package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmPrescricaoMdtoId generated by hbm2java
 */
@Embeddable

public class MpmPrescricaoMdtoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3362709621526998295L;
	private Integer atdSeq;
	private Long seq;

	public MpmPrescricaoMdtoId() {
	}

	public MpmPrescricaoMdtoId(Integer atdSeq, Long seq) {
		this.atdSeq = atdSeq;
		this.seq = seq;
	}

	/**
	 * Evitar de usar a referência para a entidade de Atendimentos.
	 * Esta referência ainda foi mantida por questões do legado do 
	 * HC de Porto Alegre (HCPA). Ao invés de referenciar Atendimentos
	 * preterir referenciar a entidade de Prescrição Médica. 
	 * @return Sequencial do atendimento
	 */
	@Deprecated
	@Column(name = "ATD_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getAtdSeq() {
		return this.atdSeq;
	}

	@Deprecated
	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}

	@Column(name = "SEQ", nullable = false, precision = 14, scale = 0)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
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
		if (!(other instanceof MpmPrescricaoMdtoId)) {
			return false;
		}
		MpmPrescricaoMdtoId castOther = (MpmPrescricaoMdtoId) other;

		return (this.getAtdSeq() != null && this.getAtdSeq().equals(castOther.getAtdSeq()))
				&& (this.getSeq() != null && this.getSeq().equals(castOther.getSeq())); 
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (this.getAtdSeq() == null ? 0 : this.getAtdSeq().hashCode());
		result = 37 * result + (this.getSeq() == null ? 0 : this.getSeq().hashCode());
		return result;
	}
}