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
 * AelProjetoProtocolo generated by hbm2java
 */
@Entity
@Table(name = "AEL_PROJETO_PROTOCOLOS", schema = "AGH")
public class AelProjetoProtocolo extends BaseEntityId<AelProjetoProtocoloId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4346729624655225269L;
	private AelProjetoProtocoloId id;
	private Integer version;
	private RapServidores rapServidores;
	private AelProjetoPesquisas aelProjetoPesquisas;
	private String nome;
	private Date dtInicio;
	private Date dtFim;
	private Date criadoEm;
	private Short qtdFichasPaciente;
	private Set<AelProjetoProtQuesito> aelProjetoProtQuesitoes = new HashSet<AelProjetoProtQuesito>(0);
	
	// FIXME Implementar este relacionamento
//	private Set<AelDataRespostaProtocolos> aelDataRespostaProtocoloses = new HashSet<AelDataRespostaProtocolos>(0);

	public AelProjetoProtocolo() {
	}

	public AelProjetoProtocolo(AelProjetoProtocoloId id, RapServidores rapServidores, AelProjetoPesquisas aelProjetoPesquisas,
			String nome, Date dtInicio, Date criadoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.aelProjetoPesquisas = aelProjetoPesquisas;
		this.nome = nome;
		this.dtInicio = dtInicio;
		this.criadoEm = criadoEm;
	}

	public AelProjetoProtocolo(AelProjetoProtocoloId id, RapServidores rapServidores, AelProjetoPesquisas aelProjetoPesquisas,
			String nome, Date dtInicio, Date dtFim, Date criadoEm, Short qtdFichasPaciente,
//			Set<AelDataRespostaProtocolos> aelDataRespostaProtocoloses, 
			Set<AelProjetoProtQuesito> aelProjetoProtQuesitoes) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.aelProjetoPesquisas = aelProjetoPesquisas;
		this.nome = nome;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.criadoEm = criadoEm;
		this.qtdFichasPaciente = qtdFichasPaciente;
//		this.aelDataRespostaProtocoloses = aelDataRespostaProtocoloses;
		this.aelProjetoProtQuesitoes = aelProjetoProtQuesitoes;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "pjqSeq", column = @Column(name = "PJQ_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public AelProjetoProtocoloId getId() {
		return this.id;
	}

	public void setId(AelProjetoProtocoloId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PJQ_SEQ", nullable = false, insertable = false, updatable = false)
	public AelProjetoPesquisas getAelProjetoPesquisas() {
		return this.aelProjetoPesquisas;
	}

	public void setAelProjetoPesquisas(AelProjetoPesquisas aelProjetoPesquisas) {
		this.aelProjetoPesquisas = aelProjetoPesquisas;
	}

	@Column(name = "NOME", nullable = false, length = 120)
	@Length(max = 120)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO", nullable = false, length = 29)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM", length = 29)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "QTD_FICHAS_PACIENTE")
	public Short getQtdFichasPaciente() {
		return this.qtdFichasPaciente;
	}

	public void setQtdFichasPaciente(Short qtdFichasPaciente) {
		this.qtdFichasPaciente = qtdFichasPaciente;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aelProjetoProtocolo")
//	public Set<AelDataRespostaProtocolos> getAelDataRespostaProtocoloses() {
//		return this.aelDataRespostaProtocoloses;
//	}
//
//	public void setAelDataRespostaProtocoloses(Set<AelDataRespostaProtocolos> aelDataRespostaProtocoloses) {
//		this.aelDataRespostaProtocoloses = aelDataRespostaProtocoloses;
//	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "aelProjetoProtocolo")
	public Set<AelProjetoProtQuesito> getAelProjetoProtQuesitoes() {
		return this.aelProjetoProtQuesitoes;
	}

	public void setAelProjetoProtQuesitoes(Set<AelProjetoProtQuesito> aelProjetoProtQuesitoes) {
		this.aelProjetoProtQuesitoes = aelProjetoProtQuesitoes;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		AEL_PROJETO_PESQUISAS("aelProjetoPesquisas"),
		NOME("nome"),
		DT_INICIO("dtInicio"),
		DT_FIM("dtFim"),
		CRIADO_EM("criadoEm"),
		QTD_FICHAS_PACIENTE("qtdFichasPaciente"),
//		AEL_DATA_RESPOSTA_PROTOCOLOSES("aelDataRespostaProtocoloses"),
		AEL_PROJETO_PROT_QUESITOES("aelProjetoProtQuesitoes");

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
		if (!(obj instanceof AelProjetoProtocolo)) {
			return false;
		}
		AelProjetoProtocolo other = (AelProjetoProtocolo) obj;
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
