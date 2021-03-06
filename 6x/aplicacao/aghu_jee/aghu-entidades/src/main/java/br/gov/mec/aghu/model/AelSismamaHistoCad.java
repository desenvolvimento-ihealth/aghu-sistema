package br.gov.mec.aghu.model;

// Generated 17/03/2011 17:54:10 by Hibernate Tools 3.2.5.Beta

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityCodigo;

/**
 * AelSismamaHistoCad generated by hbm2java
 */
@Entity
@Table(name = "AEL_SISMAMA_HISTO_CAD", schema = "AGH")
public class AelSismamaHistoCad extends BaseEntityCodigo<String> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8354789698132998257L;
	private String codigo;
	private Integer version;
	private String sdmNome;
	private String tipo;
	private Short ordemXml;
	private Set<AelSismamaHistoRes> aelSismamaHistoReses = new HashSet<AelSismamaHistoRes>(
			0);

	public AelSismamaHistoCad() {
	}

	public AelSismamaHistoCad(String codigo, String tipo) {
		this.codigo = codigo;
		this.tipo = tipo;
	}

	public AelSismamaHistoCad(String codigo, String sdmNome, String tipo,
			Short ordemXml, Set<AelSismamaHistoRes> aelSismamaHistoReses) {
		this.codigo = codigo;
		this.sdmNome = sdmNome;
		this.tipo = tipo;
		this.ordemXml = ordemXml;
		this.aelSismamaHistoReses = aelSismamaHistoReses;
	}

	@Id
	@Column(name = "CODIGO", unique = true, nullable = false, length = 60)
	@Length(max = 60)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "SDM_NOME", length = 20)
	@Length(max = 20)
	public String getSdmNome() {
		return this.sdmNome;
	}

	public void setSdmNome(String sdmNome) {
		this.sdmNome = sdmNome;
	}

	@Column(name = "TIPO", nullable = false, length = 5)
	@Length(max = 5)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "ORDEM_XML")
	public Short getOrdemXml() {
		return this.ordemXml;
	}

	public void setOrdemXml(Short ordemXml) {
		this.ordemXml = ordemXml;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sismamaHistoCad")
	public Set<AelSismamaHistoRes> getAelSismamaHistoReses() {
		return this.aelSismamaHistoReses;
	}

	public void setAelSismamaHistoReses(
			Set<AelSismamaHistoRes> aelSismamaHistoReses) {
		this.aelSismamaHistoReses = aelSismamaHistoReses;
	}

	public enum Fields {

		CODIGO("codigo"),
		SDM_NOME("sdmNome"),
		TIPO("tipo"),
		ORDEM_XML("ordemXml"),
		AEL_SISMAMA_HISTO_RESES("aelSismamaHistoReses");

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
		result = prime * result + ((getCodigo() == null) ? 0 : getCodigo().hashCode());
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
		if (!(obj instanceof AelSismamaHistoCad)) {
			return false;
		}
		AelSismamaHistoCad other = (AelSismamaHistoCad) obj;
		if (getCodigo() == null) {
			if (other.getCodigo() != null) {
				return false;
			}
		} else if (!getCodigo().equals(other.getCodigo())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
