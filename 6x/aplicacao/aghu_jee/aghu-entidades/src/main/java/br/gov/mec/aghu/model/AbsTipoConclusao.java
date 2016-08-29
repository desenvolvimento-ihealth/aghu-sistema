package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityCodigo;

/**
 * AbsTipoConclusao generated by hbm2java
 */
@Entity
@Table(name = "ABS_TIPOS_CONCLUSOES", schema = "AGH")
public class AbsTipoConclusao extends BaseEntityCodigo<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3303345464139614089L;
	private Short codigo;
	private Integer version;
	private AbsMotivoRejeicao absMotivoRejeicao;
	private RapServidores rapServidores;
	private String descricao;
	private String tipoConclusao;
	private String indSituacao;
	private Date criadoEm;
	private Set<AbsConclusaoDoacao> absConclusaoDoacaoes = new HashSet<AbsConclusaoDoacao>(0);

	// FIXME Implementar este relacionamento
//	private Set<AbsExameMetodos> absExameMetodoses = new HashSet<AbsExameMetodos>(0);

	public AbsTipoConclusao() {
	}

	public AbsTipoConclusao(Short codigo, String descricao, String tipoConclusao) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.tipoConclusao = tipoConclusao;
	}

	public AbsTipoConclusao(Short codigo, AbsMotivoRejeicao absMotivoRejeicao, RapServidores rapServidores, String descricao,
			String tipoConclusao, String indSituacao, Date criadoEm, 
//			Set<AbsExameMetodos> absExameMetodoses,
			Set<AbsConclusaoDoacao> absConclusaoDoacaoes) {
		this.codigo = codigo;
		this.absMotivoRejeicao = absMotivoRejeicao;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.tipoConclusao = tipoConclusao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
//		this.absExameMetodoses = absExameMetodoses;
		this.absConclusaoDoacaoes = absConclusaoDoacaoes;
	}

	@Id
	@Column(name = "CODIGO", unique = true, nullable = false)
	public Short getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Short codigo) {
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MRE_SEQ")
	public AbsMotivoRejeicao getAbsMotivoRejeicao() {
		return this.absMotivoRejeicao;
	}

	public void setAbsMotivoRejeicao(AbsMotivoRejeicao absMotivoRejeicao) {
		this.absMotivoRejeicao = absMotivoRejeicao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "TIPO_CONCLUSAO", nullable = false, length = 2)
	@Length(max = 2)
	public String getTipoConclusao() {
		return this.tipoConclusao;
	}

	public void setTipoConclusao(String tipoConclusao) {
		this.tipoConclusao = tipoConclusao;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "absTipoConclusao")
//	public Set<AbsExameMetodos> getAbsExameMetodoses() {
//		return this.absExameMetodoses;
//	}
//
//	public void setAbsExameMetodoses(Set<AbsExameMetodos> absExameMetodoses) {
//		this.absExameMetodoses = absExameMetodoses;
//	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "absTipoConclusao")
	public Set<AbsConclusaoDoacao> getAbsConclusaoDoacaoes() {
		return this.absConclusaoDoacaoes;
	}

	public void setAbsConclusaoDoacaoes(Set<AbsConclusaoDoacao> absConclusaoDoacaoes) {
		this.absConclusaoDoacaoes = absConclusaoDoacaoes;
	}

	public enum Fields {

		CODIGO("codigo"),
		VERSION("version"),
		ABS_MOTIVOS_REJEICOES("absMotivoRejeicao"),
		RAP_SERVIDORES("rapServidores"),
		DESCRICAO("descricao"),
		TIPO_CONCLUSAO("tipoConclusao"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
//		ABS_EXAME_METODOSES("absExameMetodoses"),
		ABS_CONCLUSAO_DOACAOES("absConclusaoDoacaoes");

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
		if (!(obj instanceof AbsTipoConclusao)) {
			return false;
		}
		AbsTipoConclusao other = (AbsTipoConclusao) obj;
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