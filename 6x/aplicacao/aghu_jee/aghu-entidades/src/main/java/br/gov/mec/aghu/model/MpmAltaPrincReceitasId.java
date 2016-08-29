package br.gov.mec.aghu.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MpmAltaPrincReceitasId generated by hbm2java
 */
@Embeddable
public class MpmAltaPrincReceitasId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3211199556461943883L;
	private Integer asuApaAtdSeq;
	private Integer asuApaSeq;
	private Short asuSeqp;
	private Short seqp;
	

	public MpmAltaPrincReceitasId() {
	}

	public MpmAltaPrincReceitasId(Integer asuApaAtdSeq, Integer asuApaSeq, Short asuSeqp, Short seqp) {
		this.asuApaAtdSeq = asuApaAtdSeq;
		this.asuApaSeq = asuApaSeq;
		this.asuSeqp = asuSeqp;
		this.seqp = seqp;
	}

	@Column(name = "ASU_APA_ATD_SEQ", nullable = false, precision = 9, scale = 0)
	public Integer getAsuApaAtdSeq() {
		return this.asuApaAtdSeq;
	}

	public void setAsuApaAtdSeq(Integer asuApaAtdSeq) {
		this.asuApaAtdSeq = asuApaAtdSeq;
	}

	@Column(name = "ASU_APA_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getAsuApaSeq() {
		return this.asuApaSeq;
	}

	public void setAsuApaSeq(Integer asuApaSeq) {
		this.asuApaSeq = asuApaSeq;
	}

	@Column(name = "ASU_SEQP", nullable = false, precision = 3, scale = 0)
	public Short getAsuSeqp() {
		return this.asuSeqp;
	}

	public void setAsuSeqp(Short asuSeqp) {
		this.asuSeqp = asuSeqp;
	}
	
	@Column(name = "SEQP", nullable = false, precision = 5, scale = 0)
	public Short getSeqp() {
		return seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	
	
	// ##### GeradorEqualsHashCodeMain #####
		@Override
		public int hashCode() {
			HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
			umHashCodeBuilder.append(this.getAsuApaAtdSeq());
			umHashCodeBuilder.append(this.getAsuApaSeq());
			umHashCodeBuilder.append(this.getAsuSeqp());
			umHashCodeBuilder.append(this.getSeqp());
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
			if (!(obj instanceof MpmAltaPrincReceitasId)) {
				return false;
			}
			MpmAltaPrincReceitasId other = (MpmAltaPrincReceitasId) obj;
			EqualsBuilder umEqualsBuilder = new EqualsBuilder();
			umEqualsBuilder.append(this.getAsuApaAtdSeq(), other.getAsuApaAtdSeq());
			umEqualsBuilder.append(this.getAsuApaSeq(), other.getAsuApaSeq());
			umEqualsBuilder.append(this.getAsuSeqp(), other.getAsuSeqp());
			umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
			return umEqualsBuilder.isEquals();
		}
}