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


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RapServUnimedInad generated by hbm2java
 */
@Entity
@Table(name = "RAP_SERV_UNIMED_INAD", schema = "AGH")
public class RapServUnimedInad extends BaseEntityId<RapServUnimedInadId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7844698827063239510L;
	private RapServUnimedInadId id;
	private Integer version;
	private Integer pesCodigo;
	private String indTipo;
	private Date dtFim;
	private String indInadimplente;

	public RapServUnimedInad() {
	}

	public RapServUnimedInad(RapServUnimedInadId id, Integer pesCodigo) {
		this.id = id;
		this.pesCodigo = pesCodigo;
	}

	public RapServUnimedInad(RapServUnimedInadId id, Integer pesCodigo, String indTipo, Date dtFim, String indInadimplente) {
		this.id = id;
		this.pesCodigo = pesCodigo;
		this.indTipo = indTipo;
		this.dtFim = dtFim;
		this.indInadimplente = indInadimplente;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA", nullable = false)),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO", nullable = false)),
			@AttributeOverride(name = "dtInicio", column = @Column(name = "DT_INICIO", nullable = false, length = 29)) })
	public RapServUnimedInadId getId() {
		return this.id;
	}

	public void setId(RapServUnimedInadId id) {
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

	@Column(name = "PES_CODIGO", nullable = false)
	public Integer getPesCodigo() {
		return this.pesCodigo;
	}

	public void setPesCodigo(Integer pesCodigo) {
		this.pesCodigo = pesCodigo;
	}

	@Column(name = "IND_TIPO", length = 1)
	@Length(max = 1)
	public String getIndTipo() {
		return this.indTipo;
	}

	public void setIndTipo(String indTipo) {
		this.indTipo = indTipo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM", length = 29)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	@Column(name = "IND_INADIMPLENTE", length = 1)
	@Length(max = 1)
	public String getIndInadimplente() {
		return this.indInadimplente;
	}

	public void setIndInadimplente(String indInadimplente) {
		this.indInadimplente = indInadimplente;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		PES_CODIGO("pesCodigo"),
		IND_TIPO("indTipo"),
		DT_FIM("dtFim"),
		IND_INADIMPLENTE("indInadimplente");

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
		if (!(obj instanceof RapServUnimedInad)) {
			return false;
		}
		RapServUnimedInad other = (RapServUnimedInad) obj;
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