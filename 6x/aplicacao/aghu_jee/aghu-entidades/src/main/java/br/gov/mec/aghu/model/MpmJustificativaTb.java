package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

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
import javax.persistence.Version;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioAvaliacao;
import br.gov.mec.aghu.dominio.DominioReacaoMantoux;
import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmJustificativaTb generated by hbm2java
 */
@Entity
@Table(name = "MPM_JUSTIFICATIVA_TBS", schema = "AGH")
public class MpmJustificativaTb extends BaseEntityId<MpmJustificativaTbId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5449218632950627324L;
	private MpmJustificativaTbId id;
	private Integer version;
	private Date dtFimTratAnt;
	private Date dtInicioTratAnt;
	private RapServidores servidor;
	private RapServidores servidorAvaliada;
	private RapServidores servidorValida;
	private DominioSituacao indSituacao;
	private DominioAvaliacao indAvaliacao;
	private DominioReacaoMantoux indReacaoMantoux;
	private Boolean indHistPrevTratamento;
	private Boolean indLiberacao;
	private Boolean indTesteTerapeutico;
	private Boolean indUsoRegularDrogas;
	private String outroLocalTrat;
	private String justifUsoEsqAlternativo;
	private String descEsquemaTb;
	private Integer resultReacaoMantoux;
	private MpmLocalRealizacaoTratTb mpmLocalRealizacaoTratTb;
	private MpmTipoEsquemaTb mpmTipoEsquemaTb;
	private Date criadoEm;

	public MpmJustificativaTb() {
	}

	public enum Fields {
		ID("id"),
		PME_SEQ("id.pmeSeq"),
		PME_ATD_SEQ("id.pmeAtdSeq"),
		VERSION("version"),
		DATA_FIM_TRAT_ANT("dtFimTratAnt"),
		DATA_INICIO_TRAT_ANT("dtInicioTratAnt"),
		SERVIDOR("servidor"),
		SERVIDOR_AVALIADA("servidorAvaliada"),
		SERVIDOR_VALIDA("servidorValida"),
		IND_SITUACAO("indSituacao"),
		IND_AVALIACAO("indAvaliacao"),
		IND_REACAO_MANTOUX("indReacaoMantoux"),
		IND_HIST_PREV_TRATAMENTO("indHistPrevTratamento"),
		IND_LIBERACAO("indLiberacao"),
		IND_TESTE_TERAPEUTICO("indTesteTerapeutico"),
		IND_USO_REGULAR_DROGAS("indUsoRegularDrogas"),
		OUTRO_LOCAL_TRAT("outroLocalTrat"),
		JUSTIF_USO_ESQ_ALTERNATIVO("justifUsoEsqAlternativo"),
		DESC_ESQUEMA_TB("descEsquemaTb"),
		RESULT_REACAO_MANTOUX("resultReacaoMantoux"),
		MPM_LOCAL_REALIZACAO_TRAT_TB("mpmLocalRealizacaoTratTb"),
		MPM_TIPO_ESQUEMA_TB("mpmTipoEsquemaTb"),
		CRIADO_EM("criadoEm");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "pmeAtdSeq", column = @Column(name = "PME_ATD_SEQ", nullable = false)),
			@AttributeOverride(name = "pmeSeq", column = @Column(name = "PME_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public MpmJustificativaTbId getId() {
		return this.id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public void setId(MpmJustificativaTbId id) {
		this.id = id;
	}

	@Column(name = "DT_FIM_TRAT_ANT")
	public Date getDtFimTratAnt() {
		return dtFimTratAnt;
	}

	public void setDtFimTratAnt(Date dtFimTratAnt) {
		this.dtFimTratAnt = dtFimTratAnt;
	}

	@Column(name = "DT_INICIO_TRAT_ANT")
	public Date getDtInicioTratAnt() {
		return dtInicioTratAnt;
	}

	public void setDtInicioTratAnt(Date dtInicioTratAnt) {
		this.dtInicioTratAnt = dtInicioTratAnt;
	}

	@Column(name = "IND_SITUACAO")
	public DominioSituacao getIndSituacao() {
		return indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "IND_AVALIACAO")
	public DominioAvaliacao getIndAvaliacao() {
		return indAvaliacao;
	}

	public void setIndAvaliacao(DominioAvaliacao indAvaliacao) {
		this.indAvaliacao = indAvaliacao;
	}

	@Column(name = "IND_REACAO_MANTOUX")
	public DominioReacaoMantoux getIndReacaoMantoux() {
		return indReacaoMantoux;
	}

	public void setIndReacaoMantoux(DominioReacaoMantoux indReacaoMantoux) {
		this.indReacaoMantoux = indReacaoMantoux;
	}

	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	@Column(name = "IND_HIST_PREV_TRATAMENTO")
	public Boolean getIndHistPrevTratamento() {
		return indHistPrevTratamento;
	}

	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public void setIndHistPrevTratamento(Boolean indHistPrevTratamento) {
		this.indHistPrevTratamento = indHistPrevTratamento;
	}

	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	@Column(name = "IND_LIBERACAO")
	public Boolean getIndLiberacao() {
		return indLiberacao;
	}

	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public void setIndLiberacao(Boolean indLiberacao) {
		this.indLiberacao = indLiberacao;
	}

	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	@Column(name = "IND_TESTE_TERAPEUTICO")
	public Boolean getIndTesteTerapeutico() {
		return indTesteTerapeutico;
	}

	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public void setIndTesteTerapeutico(Boolean indTesteTerapeutico) {
		this.indTesteTerapeutico = indTesteTerapeutico;
	}

	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	@Column(name = "IND_USO_REGULAR_DROGAS")
	public Boolean getIndUsoRegularDrogas() {
		return indUsoRegularDrogas;
	}

	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public void setIndUsoRegularDrogas(Boolean indUsoRegularDrogas) {
		this.indUsoRegularDrogas = indUsoRegularDrogas;
	}

	/**
	 * @return the servidor
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	/**
	 * @return the servidor
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_AVALIADA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_AVALIADA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorAvaliada() {
		return this.servidorAvaliada;
	}

	public void setServidorAvaliada(RapServidores servidorAvaliada) {
		this.servidorAvaliada = servidorAvaliada;
	}

	/**
	 * @return the servidor
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_VALIDA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_VALIDA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorValida() {
		return this.servidorValida;
	}

	public void setServidorValida(RapServidores servidorValida) {
		this.servidorAvaliada = servidorValida;
	}

	@Column(name = "OUTRO_LOCAL_TRAT", nullable = false, length = 60)
	@Length(max = 60, message = "O local possui mais de 60 caracteres.")
	public String getOutroLocalTrat() {
		return this.outroLocalTrat;
	}

	public void setOutroLocalTrat(String outroLocalTrat) {
		this.outroLocalTrat = outroLocalTrat;
	}

	@Column(name = "JUSTIF_USO_ESQ_ALTERNATIVO", nullable = false, length = 240)
	@Length(max = 240, message = "A justificativa possui mais de 240 caracteres.")
	public String getJustifUsoEsqAlternativo() {
		return this.justifUsoEsqAlternativo;
	}

	public void setJustifUsoEsqAlternativo(String justifUsoEsqAlternativo) {
		this.justifUsoEsqAlternativo = justifUsoEsqAlternativo;
	}

	@Column(name = "DESC_ESQUEMA_TB", nullable = false, length = 240)
	@Length(max = 240, message = "O esquema possui mais de 240 caracteres.")
	public String getDescEsquemaTb() {
		return this.descEsquemaTb;
	}

	public void setDescEsquemaTb(String descEsquemaTb) {
		this.descEsquemaTb = descEsquemaTb;
	}

	@Column(name = "RESULT_REACAO_MANTOUX", precision = 4, scale = 0)
	public Integer getResultReacaoMantoux() {
		return this.resultReacaoMantoux;
	}

	public void setResultReacaoMantoux(Integer resultReacaoMantoux) {
		this.resultReacaoMantoux = resultReacaoMantoux;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LRT_SEQ", nullable = false)
	public MpmLocalRealizacaoTratTb getMpmLocalRealizacaoTratTb() {
		return this.mpmLocalRealizacaoTratTb;
	}

	public void setMpmLocalRealizacaoTratTb(
			MpmLocalRealizacaoTratTb mpmLocalRealizacaoTratTb) {
		this.mpmLocalRealizacaoTratTb = mpmLocalRealizacaoTratTb;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TET_SEQ", nullable = false)
	public MpmTipoEsquemaTb getMpmTipoEsquemaTb() {
		return this.mpmTipoEsquemaTb;
	}

	public void setMpmTipoEsquemaTb(MpmTipoEsquemaTb mpmTipoEsquemaTb) {
		this.mpmTipoEsquemaTb = mpmTipoEsquemaTb;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
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
		if (!(obj instanceof MpmJustificativaTb)) {
			return false;
		}
		MpmJustificativaTb other = (MpmJustificativaTb) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}

}