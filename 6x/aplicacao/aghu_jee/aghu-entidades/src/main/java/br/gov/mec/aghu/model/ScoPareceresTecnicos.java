package br.gov.mec.aghu.model;

// Generated 04/01/2012 11:23:42 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * ScoPareceresTecnicos generated by hbm2java
 */
@Entity
@Table(name = "SCO_PARECERES_TECNICOS" , schema = "AGH")
public class ScoPareceresTecnicos extends BaseEntityId<ScoPareceresTecnicosId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3855691201421619365L;
	private ScoPareceresTecnicosId id;
	private Integer version;
	private Date dtGeracao;
	private String descricao;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Set<ScoPareceresMateriais> scoPareceresMateriais = new HashSet<ScoPareceresMateriais>(
			0);

	public ScoPareceresTecnicos() {
	}

	public ScoPareceresTecnicos(ScoPareceresTecnicosId id, Date dtGeracao,
			String descricao, Integer serMatricula, Short serVinCodigo) {
		this.id = id;
		this.dtGeracao = dtGeracao;
		this.descricao = descricao;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	public ScoPareceresTecnicos(ScoPareceresTecnicosId id, Date dtGeracao,
			String descricao, Integer serMatricula, Short serVinCodigo,
			Set<ScoPareceresMateriais> scoPareceresMateriais) {
		this.id = id;
		this.dtGeracao = dtGeracao;
		this.descricao = descricao;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.scoPareceresMateriais = scoPareceresMateriais;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "optCodigo", column = @Column(name = "OPT_CODIGO", nullable = false)),
			@AttributeOverride(name = "nroSubPasta", column = @Column(name = "NRO_SUB_PASTA", nullable = false)),
			@AttributeOverride(name = "mcmCodigo", column = @Column(name = "MCM_CODIGO", nullable = false)) })
	public ScoPareceresTecnicosId getId() {
		return this.id;
	}

	public void setId(ScoPareceresTecnicosId id) {
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
	@Column(name = "DT_GERACAO", nullable = false, length = 29)
	public Date getDtGeracao() {
		return this.dtGeracao;
	}

	public void setDtGeracao(Date dtGeracao) {
		this.dtGeracao = dtGeracao;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 240)
	@Length(max = 240)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "SER_MATRICULA", nullable = false)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "scoPareceresTecnicos")
	public Set<ScoPareceresMateriais> getScoPareceresMateriaises() {
		return this.scoPareceresMateriais;
	}

	public void setScoPareceresMateriaises(
			Set<ScoPareceresMateriais> scoPareceresMateriaises) {
		this.scoPareceresMateriais = scoPareceresMateriaises;
	}
	
	public enum Fields {
		DESCRICAO("descricao"),
		MCM_CODIGO("id.mcmCodigo"),
		NRO_SUB_PASTA("id.nroSubPasta"),
		OPT_CODIGO("id.optCodigo");

		private String field;

		private Fields(String field) {
			this.field = field;
		}

		@Override
		public String toString() {
			return this.field;
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
		if (!(obj instanceof ScoPareceresTecnicos)) {
			return false;
		}
		ScoPareceresTecnicos other = (ScoPareceresTecnicos) obj;
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