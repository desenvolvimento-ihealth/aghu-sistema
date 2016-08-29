package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmVersaoProtAssistenciaisId generated by hbm2java
 */
@Embeddable
public class MpmVersaoProtAssistenciaisId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6474672367561102637L;
	private Short ptaSeq;
	private Byte seqp;

	public MpmVersaoProtAssistenciaisId() {
	}

	public MpmVersaoProtAssistenciaisId(Short ptaSeq, Byte seqp) {
		this.ptaSeq = ptaSeq;
		this.seqp = seqp;
	}

	@Column(name = "PTA_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getPtaSeq() {
		return this.ptaSeq;
	}

	public void setPtaSeq(Short ptaSeq) {
		this.ptaSeq = ptaSeq;
	}

	@Column(name = "SEQP", nullable = false, precision = 2, scale = 0)
	public Byte getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Byte seqp) {
		this.seqp = seqp;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof MpmVersaoProtAssistenciaisId)) {
			return false;
		}
		MpmVersaoProtAssistenciaisId castOther = (MpmVersaoProtAssistenciaisId) other;

		return (this.getPtaSeq() == castOther.getPtaSeq())
				&& (this.getSeqp() == castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPtaSeq();
		result = 37 * result + this.getSeqp();
		return result;
	}

}