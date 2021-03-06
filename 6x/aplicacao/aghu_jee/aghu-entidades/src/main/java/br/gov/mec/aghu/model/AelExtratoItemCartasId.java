package br.gov.mec.aghu.model;

// Generated 11/05/2011 14:05:35 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelExtratoItemCartasId generated by hbm2java
 */
@Embeddable
public class AelExtratoItemCartasId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7776951252200722174L;
	private Integer iteIseSoeSeq;
	private Short iteIseSeqp;
	private Short iteSeqp;
	private Short seqp;
	
	public AelExtratoItemCartasId() {
	}

	public AelExtratoItemCartasId(Integer iteIseSoeSeq, Short iteIseSeqp,
			Short iteSeqp, Short seqp) {
		this.iteIseSoeSeq = iteIseSoeSeq;
		this.iteIseSeqp = iteIseSeqp;
		this.iteSeqp = iteSeqp;
		this.seqp = seqp;
	}

	@Column(name = "ITE_ISE_SOE_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getIteIseSoeSeq() {
		return this.iteIseSoeSeq;
	}

	public void setIteIseSoeSeq(Integer iteIseSoeSeq) {
		this.iteIseSoeSeq = iteIseSoeSeq;
	}

	@Column(name = "ITE_ISE_SEQP", nullable = false, precision = 3, scale = 0)
	public Short getIteIseSeqp() {
		return this.iteIseSeqp;
	}

	public void setIteIseSeqp(Short iteIseSeqp) {
		this.iteIseSeqp = iteIseSeqp;
	}

	@Column(name = "ITE_SEQP", nullable = false, precision = 3, scale = 0)
	public Short getIteSeqp() {
		return this.iteSeqp;
	}

	public void setIteSeqp(Short iteSeqp) {
		this.iteSeqp = iteSeqp;
	}

	@Column(name = "SEQP", nullable = false, precision = 3, scale = 0)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
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
		if (!(other instanceof AelExtratoItemCartasId)) {
			return false;
		}
		AelExtratoItemCartasId castOther = (AelExtratoItemCartasId) other;

		return (this.getIteIseSoeSeq() == castOther.getIteIseSoeSeq())
				&& (this.getIteIseSeqp() == castOther.getIteIseSeqp())
				&& (this.getIteSeqp() == castOther.getIteSeqp())
				&& (this.getSeqp() == castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getIteIseSoeSeq();
		result = 37 * result + this.getIteIseSeqp();
		result = 37 * result + this.getIteSeqp();
		result = 37 * result + this.getSeqp();
		return result;
	}

}
