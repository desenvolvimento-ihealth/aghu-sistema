package br.gov.mec.aghu.model;

// Generated 22/03/2011 09:37:20 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AacRefCodesId generated by hbm2java
 */
@Embeddable
public class AacRefCodesId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5320282853864935473L;
	private String rvDomain;
	private String rvLowValue;

	public AacRefCodesId() {
	}

	public AacRefCodesId(String rvDomain, String rvLowValue) {
		this.rvDomain = rvDomain;
		this.rvLowValue = rvLowValue;
	}

	@Column(name = "RV_DOMAIN", nullable = false, length = 100)
	@Length(max = 100)
	public String getRvDomain() {
		return this.rvDomain;
	}

	public void setRvDomain(String rvDomain) {
		this.rvDomain = rvDomain;
	}

	@Column(name = "RV_LOW_VALUE", nullable = false, length = 240)
	@Length(max = 240)
	public String getRvLowValue() {
		return this.rvLowValue;
	}

	public void setRvLowValue(String rvLowValue) {
		this.rvLowValue = rvLowValue;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AacRefCodesId)) {
			return false;
		}
		AacRefCodesId castOther = (AacRefCodesId) other;

		return ((this.getRvDomain() == castOther.getRvDomain()) || (this
				.getRvDomain() != null
				&& castOther.getRvDomain() != null && this.getRvDomain()
				.equals(castOther.getRvDomain())))
				&& ((this.getRvLowValue() == castOther.getRvLowValue()) || (this
						.getRvLowValue() != null
						&& castOther.getRvLowValue() != null && this
						.getRvLowValue().equals(castOther.getRvLowValue())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getRvDomain() == null ? 0 : this.getRvDomain().hashCode());
		result = 37
				* result
				+ (getRvLowValue() == null ? 0 : this.getRvLowValue()
						.hashCode());
		return result;
	}

}