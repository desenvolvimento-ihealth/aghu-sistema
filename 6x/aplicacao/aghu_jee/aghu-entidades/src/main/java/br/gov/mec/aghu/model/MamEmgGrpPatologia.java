package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamEmgGrpPatologia generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamEplSq1", sequenceName="AGH.MAM_EPL_SQ1", allocationSize = 1)
@Table(name = "MAM_EMG_GRP_PATOLOGIAS", schema = "AGH")
public class MamEmgGrpPatologia extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7998457010751767395L;
	private Short seq;
	private Integer version;
	private RapServidores rapServidores;
	private String descricao;
	private String sigla;
	private Date criadoEm;
	private String indSituacao;
	private Set<MamDestinoGrpPatologia> mamDestinoGrpPatologiaes = new HashSet<MamDestinoGrpPatologia>(0);
	private Set<MamUnidQuestGrpPatol> mamUnidQuestGrpPatoles = new HashSet<MamUnidQuestGrpPatol>(0);
	private Set<MamEmgDestXGrpPatol> mamEmgDestXGrpPatoles = new HashSet<MamEmgDestXGrpPatol>(0);

	public MamEmgGrpPatologia() {
	}

	public MamEmgGrpPatologia(Short seq, RapServidores rapServidores, String descricao, String sigla, Date criadoEm) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.sigla = sigla;
		this.criadoEm = criadoEm;
	}

	public MamEmgGrpPatologia(Short seq, RapServidores rapServidores, String descricao, String sigla, Date criadoEm,
			String indSituacao, Set<MamDestinoGrpPatologia> mamDestinoGrpPatologiaes,
			Set<MamUnidQuestGrpPatol> mamUnidQuestGrpPatoles, Set<MamEmgDestXGrpPatol> mamEmgDestXGrpPatoles) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.sigla = sigla;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.mamDestinoGrpPatologiaes = mamDestinoGrpPatologiaes;
		this.mamUnidQuestGrpPatoles = mamUnidQuestGrpPatoles;
		this.mamEmgDestXGrpPatoles = mamEmgDestXGrpPatoles;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamEplSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 120)
	@Length(max = 120)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "SIGLA", nullable = false, length = 20)
	@Length(max = 20)
	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mamEmgGrpPatologia")
	public Set<MamDestinoGrpPatologia> getMamDestinoGrpPatologiaes() {
		return this.mamDestinoGrpPatologiaes;
	}

	public void setMamDestinoGrpPatologiaes(Set<MamDestinoGrpPatologia> mamDestinoGrpPatologiaes) {
		this.mamDestinoGrpPatologiaes = mamDestinoGrpPatologiaes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mamEmgGrpPatologia")
	public Set<MamUnidQuestGrpPatol> getMamUnidQuestGrpPatoles() {
		return this.mamUnidQuestGrpPatoles;
	}

	public void setMamUnidQuestGrpPatoles(Set<MamUnidQuestGrpPatol> mamUnidQuestGrpPatoles) {
		this.mamUnidQuestGrpPatoles = mamUnidQuestGrpPatoles;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mamEmgGrpPatologia")
	public Set<MamEmgDestXGrpPatol> getMamEmgDestXGrpPatoles() {
		return this.mamEmgDestXGrpPatoles;
	}

	public void setMamEmgDestXGrpPatoles(Set<MamEmgDestXGrpPatol> mamEmgDestXGrpPatoles) {
		this.mamEmgDestXGrpPatoles = mamEmgDestXGrpPatoles;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		DESCRICAO("descricao"),
		SIGLA("sigla"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao"),
		MAM_DESTINO_GRP_PATOLOGIAES("mamDestinoGrpPatologiaes"),
		MAM_UNID_QUEST_GRP_PATOLES("mamUnidQuestGrpPatoles"),
		MAM_EMG_DEST_X_GRP_PATOLES("mamEmgDestXGrpPatoles");

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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof MamEmgGrpPatologia)) {
			return false;
		}
		MamEmgGrpPatologia other = (MamEmgGrpPatologia) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
