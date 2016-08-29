package br.gov.mec.aghu.model;

// Generated 21/09/2010 19:23:57 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntity;

/**
 * AfaTipoUsoMdtos generated by hbm2java
 */

@Entity
@Table(name = "AFA_TIPO_USO_MDTOS", schema = "AGH")
public class AfaTipoUsoMdto implements BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5182046980760161706L;

	private String sigla;

	private AfaGrupoUsoMedicamento grupoUsoMedicamento;

	private RapServidores rapServidores;
	private String descricao;
	private Boolean indAntimicrobiano;
	private Boolean indExigeJustificativa;
	private Boolean indAvaliacao;
	private Boolean indExigeDuracaoSolicitada;
	private Date criadoEm;
	private DominioSituacao indSituacao;
	private Boolean indControlado;
	private Boolean indQuimioterapico;
	private Set<AfaMedicamento> afaMedicamentos = new HashSet<AfaMedicamento>(0);

	

	public AfaTipoUsoMdto() {
	}

	public AfaTipoUsoMdto(String sigla) {
		this.sigla = sigla;
	}

	public AfaTipoUsoMdto(String sigla,
			AfaGrupoUsoMedicamento grupoUsoMedicamento,
			RapServidores rapServidores, String descricao,
			Boolean indAntimicrobiano, Boolean indExigeJustificativa,
			Boolean indAvaliacao, Boolean indExigeDuracaoSolicitada,
			Date criadoEm, DominioSituacao indSituacao, Boolean indControlado,
			Boolean indQuimioterapico) {
		this.sigla = sigla;
		this.grupoUsoMedicamento = grupoUsoMedicamento;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.indAntimicrobiano = indAntimicrobiano;
		this.indExigeJustificativa = indExigeJustificativa;
		this.indAvaliacao = indAvaliacao;
		this.indExigeDuracaoSolicitada = indExigeDuracaoSolicitada;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.indControlado = indControlado;
		this.indQuimioterapico = indQuimioterapico;
	}

	public AfaTipoUsoMdto(String sigla,
			AfaGrupoUsoMedicamento grupoUsoMedicamento,
			RapServidores rapServidores, String descricao,
			Boolean indAntimicrobiano, Boolean indExigeJustificativa,
			Boolean indAvaliacao, Boolean indExigeDuracaoSolicitada,
			Date criadoEm, DominioSituacao indSituacao, Boolean indControlado,
			Boolean indQuimioterapico, Set<AfaMedicamento> afaMedicamentos) {
		this.sigla = sigla;
		this.grupoUsoMedicamento = grupoUsoMedicamento;
		this.rapServidores = rapServidores;
		this.descricao = descricao;
		this.indAntimicrobiano = indAntimicrobiano;
		this.indExigeJustificativa = indExigeJustificativa;
		this.indAvaliacao = indAvaliacao;
		this.indExigeDuracaoSolicitada = indExigeDuracaoSolicitada;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.indControlado = indControlado;
		this.indQuimioterapico = indQuimioterapico;
		this.afaMedicamentos = afaMedicamentos;
	}

	@Id
	@Column(name = "SIGLA", unique = true, nullable = false, length = 2)
	@Length(max = 2)
	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@ManyToOne
	@JoinColumn(name = "GUP_SEQ", nullable = false)
	public AfaGrupoUsoMedicamento getGrupoUsoMedicamento() {
		return grupoUsoMedicamento;
	}

	public void setGrupoUsoMedicamento(
			AfaGrupoUsoMedicamento grupoUsoMedicamento) {
		this.grupoUsoMedicamento = grupoUsoMedicamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return rapServidores;
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

	@Column(name = "IND_ANTIMICROBIANO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndAntimicrobiano() {
		return this.indAntimicrobiano;
	}

	public void setIndAntimicrobiano(Boolean indAntimicrobiano) {
		this.indAntimicrobiano = indAntimicrobiano;
	}

	@Column(name = "IND_EXIGE_JUSTIFICATIVA", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndExigeJustificativa() {
		return this.indExigeJustificativa;
	}

	public void setIndExigeJustificativa(Boolean indExigeJustificativa) {
		this.indExigeJustificativa = indExigeJustificativa;
	}

	@Column(name = "IND_AVALIACAO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndAvaliacao() {
		return this.indAvaliacao;
	}

	public void setIndAvaliacao(Boolean indAvaliacao) {
		this.indAvaliacao = indAvaliacao;
	}

	@Column(name = "IND_EXIGE_DURACAO_SOLICITADA", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndExigeDuracaoSolicitada() {
		return this.indExigeDuracaoSolicitada;
	}

	public void setIndExigeDuracaoSolicitada(Boolean indExigeDuracaoSolicitada) {
		this.indExigeDuracaoSolicitada = indExigeDuracaoSolicitada;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "IND_CONTROLADO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndControlado() {
		return this.indControlado;
	}

	public void setIndControlado(Boolean indControlado) {
		this.indControlado = indControlado;
	}

	@Column(name = "IND_QUIMIOTERAPICO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndQuimioterapico() {
		return this.indQuimioterapico;
	}

	public void setIndQuimioterapico(Boolean indQuimioterapico) {
		this.indQuimioterapico = indQuimioterapico;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "afaTipoUsoMdtos")
	public Set<AfaMedicamento> getAfaMedicamentos() {
		return afaMedicamentos;
	}

	public void setAfaMedicamentos(Set<AfaMedicamento> afaMedicamentos) {
		this.afaMedicamentos = afaMedicamentos;
	}


	/**
	 * FIELDS
	 * 
	 * @author bsoliveira
	 * 
	 */
	public enum Fields {

		SIGLA("sigla"), RAP_SERVIDORES("rapServidores"), DESCRICAO("descricao"), IND_ANTIMICROBIANO(
				"indAntimicrobiano"), IND_EXIGE_JUSTIFICATIVA(
				"indExigeJustificativa"), IND_AVALIACAO("indAvaliacao"), IND_EXIGE_DURACAO_SOLICITADA(
				"indExigeDuracaoSolicitada"), CRIADO_EM("criadoEm"), IND_SITUACAO(
				"indSituacao"), IND_CONTROLADO("indControlado"), IND_QUIMIOTERAPICO(
				"indQuimioterapico"), AFA_MEDICAMENTO("afaMedicamentos"), GRUPO_USO(
				"grupoUsoMedicamento"), GUP_SEQ("grupoUsoMedicamento.seq");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((sigla == null) ? 0 : sigla.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		AfaTipoUsoMdto other = (AfaTipoUsoMdto) obj;
		if (sigla == null) {
			if (other.sigla != null) {
				return false;
			}
		} else if (!sigla.equals(other.sigla)) {
			return false;
		}
		return true;
	}
}