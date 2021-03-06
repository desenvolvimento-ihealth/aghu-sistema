package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AinQueryGppg06256 generated by hbm2java
 */
@Entity
@Table(name = "AIN_QUERY_GPPG06256", schema = "AGH")
public class AinQueryGppg06256 extends BaseEntityId<AinQueryGppg06256Id> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 107449670334663775L;
	private AinQueryGppg06256Id id;

	public AinQueryGppg06256() {
	}

	public AinQueryGppg06256(AinQueryGppg06256Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "pacCodigo", column = @Column(name = "PAC_CODIGO")),
			@AttributeOverride(name = "atdSeq", column = @Column(name = "ATD_SEQ")),
			@AttributeOverride(name = "intSeq", column = @Column(name = "INT_SEQ")),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public AinQueryGppg06256Id getId() {
		return this.id;
	}

	public void setId(AinQueryGppg06256Id id) {
		this.id = id;
	}

	public enum Fields {

		ID("id");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
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
		if (!(obj instanceof AinQueryGppg06256)) {
			return false;
		}
		AinQueryGppg06256 other = (AinQueryGppg06256) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
