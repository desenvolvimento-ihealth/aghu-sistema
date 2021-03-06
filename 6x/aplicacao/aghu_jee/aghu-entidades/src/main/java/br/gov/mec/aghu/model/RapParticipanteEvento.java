package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RapParticipanteEvento generated by hbm2java
 */
@Entity
@Table(name = "RAP_PARTICIPANTES_EVENTO", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = { "evt_seq",
		"ser_vin_codigo", "ser_matricula" }))
public class RapParticipanteEvento extends BaseEntityId<RapParticipanteEventoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1304654544319878351L;
	private RapParticipanteEventoId id;
	private Integer version;
	private RapServidores rapServidoresByRapPevSerFk2;
	private RapServidores rapServidoresByRapPevSerFk4;
	private RapServidores rapServidoresByRapPevSerFk1;
	private RapServidores rapServidoresByRapPevSerFk3;
	private RapProgramacaoEvento rapProgramacaoEvento;
	private String nomeParticipante;
	private String indParticipacao;
	private String indRealizacao;
	private Date criadoEm;
	private Date autorizadoEm;
	private Date confirmadoEm;

	public RapParticipanteEvento() {
	}

	public RapParticipanteEvento(RapParticipanteEventoId id, RapServidores rapServidoresByRapPevSerFk2,
			RapServidores rapServidoresByRapPevSerFk1, RapProgramacaoEvento rapProgramacaoEvento, Date criadoEm) {
		this.id = id;
		this.rapServidoresByRapPevSerFk2 = rapServidoresByRapPevSerFk2;
		this.rapServidoresByRapPevSerFk1 = rapServidoresByRapPevSerFk1;
		this.rapProgramacaoEvento = rapProgramacaoEvento;
		this.criadoEm = criadoEm;
	}

	public RapParticipanteEvento(RapParticipanteEventoId id, RapServidores rapServidoresByRapPevSerFk2,
			RapServidores rapServidoresByRapPevSerFk4, RapServidores rapServidoresByRapPevSerFk1,
			RapServidores rapServidoresByRapPevSerFk3, RapProgramacaoEvento rapProgramacaoEvento, String nomeParticipante,
			String indParticipacao, String indRealizacao, Date criadoEm, Date autorizadoEm, Date confirmadoEm) {
		this.id = id;
		this.rapServidoresByRapPevSerFk2 = rapServidoresByRapPevSerFk2;
		this.rapServidoresByRapPevSerFk4 = rapServidoresByRapPevSerFk4;
		this.rapServidoresByRapPevSerFk1 = rapServidoresByRapPevSerFk1;
		this.rapServidoresByRapPevSerFk3 = rapServidoresByRapPevSerFk3;
		this.rapProgramacaoEvento = rapProgramacaoEvento;
		this.nomeParticipante = nomeParticipante;
		this.indParticipacao = indParticipacao;
		this.indRealizacao = indRealizacao;
		this.criadoEm = criadoEm;
		this.autorizadoEm = autorizadoEm;
		this.confirmadoEm = confirmadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "evtSeq", column = @Column(name = "EVT_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public RapParticipanteEventoId getId() {
		return this.id;
	}

	public void setId(RapParticipanteEventoId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_CRIADO_POR", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO_CRIADO_POR", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByRapPevSerFk2() {
		return this.rapServidoresByRapPevSerFk2;
	}

	public void setRapServidoresByRapPevSerFk2(RapServidores rapServidoresByRapPevSerFk2) {
		this.rapServidoresByRapPevSerFk2 = rapServidoresByRapPevSerFk2;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_CONF_POR", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_CONF_POR", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByRapPevSerFk4() {
		return this.rapServidoresByRapPevSerFk4;
	}

	public void setRapServidoresByRapPevSerFk4(RapServidores rapServidoresByRapPevSerFk4) {
		this.rapServidoresByRapPevSerFk4 = rapServidoresByRapPevSerFk4;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByRapPevSerFk1() {
		return this.rapServidoresByRapPevSerFk1;
	}

	public void setRapServidoresByRapPevSerFk1(RapServidores rapServidoresByRapPevSerFk1) {
		this.rapServidoresByRapPevSerFk1 = rapServidoresByRapPevSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_AUTZ_POR", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_AUTZ_POR", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByRapPevSerFk3() {
		return this.rapServidoresByRapPevSerFk3;
	}

	public void setRapServidoresByRapPevSerFk3(RapServidores rapServidoresByRapPevSerFk3) {
		this.rapServidoresByRapPevSerFk3 = rapServidoresByRapPevSerFk3;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EVT_SEQ", nullable = false, insertable = false, updatable = false)
	public RapProgramacaoEvento getRapProgramacaoEvento() {
		return this.rapProgramacaoEvento;
	}

	public void setRapProgramacaoEvento(RapProgramacaoEvento rapProgramacaoEvento) {
		this.rapProgramacaoEvento = rapProgramacaoEvento;
	}

	@Column(name = "NOME_PARTICIPANTE", length = 60)
	@Length(max = 60)
	public String getNomeParticipante() {
		return this.nomeParticipante;
	}

	public void setNomeParticipante(String nomeParticipante) {
		this.nomeParticipante = nomeParticipante;
	}

	@Column(name = "IND_PARTICIPACAO", length = 1)
	@Length(max = 1)
	public String getIndParticipacao() {
		return this.indParticipacao;
	}

	public void setIndParticipacao(String indParticipacao) {
		this.indParticipacao = indParticipacao;
	}

	@Column(name = "IND_REALIZACAO", length = 1)
	@Length(max = 1)
	public String getIndRealizacao() {
		return this.indRealizacao;
	}

	public void setIndRealizacao(String indRealizacao) {
		this.indRealizacao = indRealizacao;
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
	@Column(name = "AUTORIZADO_EM", length = 29)
	public Date getAutorizadoEm() {
		return this.autorizadoEm;
	}

	public void setAutorizadoEm(Date autorizadoEm) {
		this.autorizadoEm = autorizadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CONFIRMADO_EM", length = 29)
	public Date getConfirmadoEm() {
		return this.confirmadoEm;
	}

	public void setConfirmadoEm(Date confirmadoEm) {
		this.confirmadoEm = confirmadoEm;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES_BY_RAP_PEV_SER_FK2("rapServidoresByRapPevSerFk2"),
		RAP_SERVIDORES_BY_RAP_PEV_SER_FK4("rapServidoresByRapPevSerFk4"),
		RAP_SERVIDORES_BY_RAP_PEV_SER_FK1("rapServidoresByRapPevSerFk1"),
		RAP_SERVIDORES_BY_RAP_PEV_SER_FK3("rapServidoresByRapPevSerFk3"),
		RAP_PROGRAMACAO_EVENTOS("rapProgramacaoEvento"),
		NOME_PARTICIPANTE("nomeParticipante"),
		IND_PARTICIPACAO("indParticipacao"),
		IND_REALIZACAO("indRealizacao"),
		CRIADO_EM("criadoEm"),
		AUTORIZADO_EM("autorizadoEm"),
		CONFIRMADO_EM("confirmadoEm");

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
		if (!(obj instanceof RapParticipanteEvento)) {
			return false;
		}
		RapParticipanteEvento other = (RapParticipanteEvento) obj;
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
