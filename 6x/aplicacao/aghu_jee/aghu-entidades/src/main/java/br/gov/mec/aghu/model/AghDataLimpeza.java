package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AghDataLimpeza generated by hbm2java
 */
@Entity
@Table(name = "AGH_DATAS_LIMPEZAS", schema = "AGH")
public class AghDataLimpeza extends BaseEntityId<AghDataLimpezaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5517503792304386795L;
	private AghDataLimpezaId id;
	private Integer version;
	private Date dtFinal;
	private Integer processados;

	public AghDataLimpeza() {
	}

	public AghDataLimpeza(AghDataLimpezaId id) {
		this.id = id;
	}

	public AghDataLimpeza(AghDataLimpezaId id, Date dtFinal, Integer processados) {
		this.id = id;
		this.dtFinal = dtFinal;
		this.processados = processados;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "mesAnoRef", column = @Column(name = "MES_ANO_REF", nullable = false, length = 6)),
			@AttributeOverride(name = "dtInicial", column = @Column(name = "DT_INICIAL", nullable = false, length = 29)),
			@AttributeOverride(name = "sistema", column = @Column(name = "SISTEMA", nullable = false, length = 3)) })
	public AghDataLimpezaId getId() {
		return this.id;
	}

	public void setId(AghDataLimpezaId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FINAL", length = 29)
	public Date getDtFinal() {
		return this.dtFinal;
	}

	public void setDtFinal(Date dtFinal) {
		this.dtFinal = dtFinal;
	}

	@Column(name = "PROCESSADOS")
	public Integer getProcessados() {
		return this.processados;
	}

	public void setProcessados(Integer processados) {
		this.processados = processados;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		DT_FINAL("dtFinal"),
		PROCESSADOS("processados");

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
		if (!(obj instanceof AghDataLimpeza)) {
			return false;
		}
		AghDataLimpeza other = (AghDataLimpeza) obj;
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
