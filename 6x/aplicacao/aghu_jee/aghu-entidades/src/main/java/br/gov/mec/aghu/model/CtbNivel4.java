package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * CtbNivel4 generated by hbm2java
 */
@Entity
@Table(name = "CTB_NIVEL_4", schema = "AGH")
public class CtbNivel4 extends BaseEntityId<CtbNivel4Id> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8100964768383358022L;
	private CtbNivel4Id id;
	private Integer version;
	private CtbNaturezaPlano ctbNaturezaPlano;
	private CtbGrupoNaturezaPlano ctbGrupoNaturezaPlano;
	private RapServidores rapServidores;
	private CtbNivel3 ctbNivel3;
	private String descricao;
	private Date criadoEm;
	private Date allteradoEm;
	private Short ideSeq;
	private Set<CtbNivel5> ctbNivel5s = new HashSet<CtbNivel5>(0);

	public CtbNivel4() {
	}

	public CtbNivel4(CtbNivel4Id id, RapServidores rapServidores, CtbNivel3 ctbNivel3, String descricao, Date criadoEm, Short ideSeq) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.ctbNivel3 = ctbNivel3;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.ideSeq = ideSeq;
	}

	public CtbNivel4(CtbNivel4Id id, CtbNaturezaPlano ctbNaturezaPlano, CtbGrupoNaturezaPlano ctbGrupoNaturezaPlano,
			RapServidores rapServidores, CtbNivel3 ctbNivel3, String descricao, Date criadoEm, Date allteradoEm, Short ideSeq,
			Set<CtbNivel5> ctbNivel5s) {
		this.id = id;
		this.ctbNaturezaPlano = ctbNaturezaPlano;
		this.ctbGrupoNaturezaPlano = ctbGrupoNaturezaPlano;
		this.rapServidores = rapServidores;
		this.ctbNivel3 = ctbNivel3;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.allteradoEm = allteradoEm;
		this.ideSeq = ideSeq;
		this.ctbNivel5s = ctbNivel5s;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)),
			@AttributeOverride(name = "nv3Seqp", column = @Column(name = "NV3_SEQP", nullable = false)),
			@AttributeOverride(name = "nv3Nv2Seqp", column = @Column(name = "NV3_NV2_SEQP", nullable = false)),
			@AttributeOverride(name = "nv3Nv2Nv1Seq", column = @Column(name = "NV3_NV2_NV1_SEQ", nullable = false)) })
	public CtbNivel4Id getId() {
		return this.id;
	}

	public void setId(CtbNivel4Id id) {
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "NTP_GNP_TAB_CODIGO", referencedColumnName = "GNP_TAB_CODIGO"),
			@JoinColumn(name = "NTP_GNP_CODIGO", referencedColumnName = "GNP_CODIGO"),
			@JoinColumn(name = "NTP_CODIGO", referencedColumnName = "CODIGO") })
	public CtbNaturezaPlano getCtbNaturezaPlano() {
		return this.ctbNaturezaPlano;
	}

	public void setCtbNaturezaPlano(CtbNaturezaPlano ctbNaturezaPlano) {
		this.ctbNaturezaPlano = ctbNaturezaPlano;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "GNP_TAB_CODIGO", referencedColumnName = "TAB_CODIGO"),
			@JoinColumn(name = "GNP_CODIGO", referencedColumnName = "CODIGO") })
	public CtbGrupoNaturezaPlano getCtbGrupoNaturezaPlano() {
		return this.ctbGrupoNaturezaPlano;
	}

	public void setCtbGrupoNaturezaPlano(CtbGrupoNaturezaPlano ctbGrupoNaturezaPlano) {
		this.ctbGrupoNaturezaPlano = ctbGrupoNaturezaPlano;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "NV3_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NV3_NV2_SEQP", referencedColumnName = "NV2_SEQP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "NV3_NV2_NV1_SEQ", referencedColumnName = "NV2_NV1_SEQ", nullable = false, insertable = false, updatable = false) })
	public CtbNivel3 getCtbNivel3() {
		return this.ctbNivel3;
	}

	public void setCtbNivel3(CtbNivel3 ctbNivel3) {
		this.ctbNivel3 = ctbNivel3;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 240)
	@Length(max = 240)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALLTERADO_EM", length = 29)
	public Date getAllteradoEm() {
		return this.allteradoEm;
	}

	public void setAllteradoEm(Date allteradoEm) {
		this.allteradoEm = allteradoEm;
	}

	@Column(name = "IDE_SEQ", nullable = false)
	public Short getIdeSeq() {
		return this.ideSeq;
	}

	public void setIdeSeq(Short ideSeq) {
		this.ideSeq = ideSeq;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ctbNivel4")
	public Set<CtbNivel5> getCtbNivel5s() {
		return this.ctbNivel5s;
	}

	public void setCtbNivel5s(Set<CtbNivel5> ctbNivel5s) {
		this.ctbNivel5s = ctbNivel5s;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		CTB_NATUREZA_PLANOS("ctbNaturezaPlano"),
		CTB_GRUPO_NATUREZA_PLANOS("ctbGrupoNaturezaPlano"),
		RAP_SERVIDORES("rapServidores"),
		CTB_NIVEL3("ctbNivel3"),
		DESCRICAO("descricao"),
		CRIADO_EM("criadoEm"),
		ALLTERADO_EM("allteradoEm"),
		IDE_SEQ("ideSeq"),
		CTB_NIVEL5S("ctbNivel5s");

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
		if (!(obj instanceof CtbNivel4)) {
			return false;
		}
		CtbNivel4 other = (CtbNivel4) obj;
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
