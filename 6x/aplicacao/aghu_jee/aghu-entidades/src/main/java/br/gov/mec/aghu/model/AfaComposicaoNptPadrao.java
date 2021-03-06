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

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AfaComposicaoNptPadrao generated by hbm2java
 */
@Entity
@Table(name = "AFA_COMPOSICAO_NPT_PADROES", schema = "AGH")
public class AfaComposicaoNptPadrao extends BaseEntityId<AfaComposicaoNptPadraoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1139684574614721735L;
	private AfaComposicaoNptPadraoId id;
	private Integer version;
	private AfaTipoComposicoes afaTipoComposicoes;
	private AfaFormulaNptPadrao afaFormulaNptPadrao;
	private RapServidores rapServidores;
	private AfaTipoVelocAdministracoes afaTipoVelocAdministracoes;
	private Short velocidadeAdministracao;
	private Date criadoEm;
	private Date alteradoEm;
	private Set<AfaItemNptPadrao> afaItemNptPadraoes = new HashSet<AfaItemNptPadrao>(0);

	public AfaComposicaoNptPadrao() {
	}

	public AfaComposicaoNptPadrao(AfaComposicaoNptPadraoId id, AfaTipoComposicoes afaTipoComposicoes,
			AfaFormulaNptPadrao afaFormulaNptPadrao, RapServidores rapServidores, Date criadoEm) {
		this.id = id;
		this.afaTipoComposicoes = afaTipoComposicoes;
		this.afaFormulaNptPadrao = afaFormulaNptPadrao;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
	}

	public AfaComposicaoNptPadrao(AfaComposicaoNptPadraoId id, AfaTipoComposicoes afaTipoComposicoes,
			AfaFormulaNptPadrao afaFormulaNptPadrao, RapServidores rapServidores,
			AfaTipoVelocAdministracoes afaTipoVelocAdministracoes, Short velocidadeAdministracao, Date criadoEm, Date alteradoEm,
			Set<AfaItemNptPadrao> afaItemNptPadraoes) {
		this.id = id;
		this.afaTipoComposicoes = afaTipoComposicoes;
		this.afaFormulaNptPadrao = afaFormulaNptPadrao;
		this.rapServidores = rapServidores;
		this.afaTipoVelocAdministracoes = afaTipoVelocAdministracoes;
		this.velocidadeAdministracao = velocidadeAdministracao;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.afaItemNptPadraoes = afaItemNptPadraoes;
	}

	@EmbeddedId
	@AttributeOverrides({ 
			@AttributeOverride(name = "fnpSeq", column = @Column(name = "FNP_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public AfaComposicaoNptPadraoId getId() {
		return this.id;
	}

	public void setId(AfaComposicaoNptPadraoId id) {
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
	@JoinColumn(name = "TIC_SEQ", nullable = false)
	public AfaTipoComposicoes getAfaTipoComposicoes() {
		return this.afaTipoComposicoes;
	}

	public void setAfaTipoComposicoes(AfaTipoComposicoes afaTipoComposicoes) {
		this.afaTipoComposicoes = afaTipoComposicoes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FNP_SEQ", nullable = false, insertable = false, updatable = false)
	public AfaFormulaNptPadrao getAfaFormulaNptPadrao() {
		return this.afaFormulaNptPadrao;
	}

	public void setAfaFormulaNptPadrao(AfaFormulaNptPadrao afaFormulaNptPadrao) {
		this.afaFormulaNptPadrao = afaFormulaNptPadrao;
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
	@JoinColumn(name = "TVA_SEQ")
	public AfaTipoVelocAdministracoes getAfaTipoVelocAdministracoes() {
		return this.afaTipoVelocAdministracoes;
	}

	public void setAfaTipoVelocAdministracoes(AfaTipoVelocAdministracoes afaTipoVelocAdministracoes) {
		this.afaTipoVelocAdministracoes = afaTipoVelocAdministracoes;
	}

	@Column(name = "VELOCIDADE_ADMINISTRACAO")
	public Short getVelocidadeAdministracao() {
		return this.velocidadeAdministracao;
	}

	public void setVelocidadeAdministracao(Short velocidadeAdministracao) {
		this.velocidadeAdministracao = velocidadeAdministracao;
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
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "afaComposicaoNptPadrao")
	public Set<AfaItemNptPadrao> getAfaItemNptPadraoes() {
		return this.afaItemNptPadraoes;
	}

	public void setAfaItemNptPadraoes(Set<AfaItemNptPadrao> afaItemNptPadraoes) {
		this.afaItemNptPadraoes = afaItemNptPadraoes;
	}

	public enum Fields {

		ID("id"),
		ID_FNP_SEQ("id.fnpSeq"),
		ID_SEQ_P("id.seqp"),
		VERSION("version"),
		AFA_TIPO_COMPOSICOES("afaTipoComposicoes"),
		AFA_FORMULA_NPT_PADROES("afaFormulaNptPadrao"),
		RAP_SERVIDORES("rapServidores"),
		AFA_TIPO_VELOC_ADMINISTRACOES("afaTipoVelocAdministracoes"),
		VELOCIDADE_ADMINISTRACAO("velocidadeAdministracao"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		AFA_ITEM_NPT_PADRAOES("afaItemNptPadraoes"),
		TIC_SEQ("afaTipoComposicoes.seq");



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
		if (!(obj instanceof AfaComposicaoNptPadrao)) {
			return false;
		}
		AfaComposicaoNptPadrao other = (AfaComposicaoNptPadrao) obj;
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
