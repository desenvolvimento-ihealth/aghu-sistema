package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamExameUnidGrav generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamEugSq1", sequenceName="AGH.MAM_EUG_SQ1", allocationSize = 1)
@Table(name = "MAM_EXAME_UNID_GRAVS", schema = "AGH")
public class MamExameUnidGrav extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2411618993861845695L;
	private Integer seq;
	private Integer version;
	private RapServidores rapServidores;
	private MamGravidade mamGravidade;
	private MamUnidXExame mamUnidXExame;
	private Long valor;
	private Short tipoComparacao;
	private String indSituacao;
	private Date criadoEm;
	private String micNome;

	public MamExameUnidGrav() {
	}

	public MamExameUnidGrav(Integer seq, RapServidores rapServidores, MamGravidade mamGravidade, MamUnidXExame mamUnidXExame,
			Long valor, Short tipoComparacao, String indSituacao, Date criadoEm) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.mamGravidade = mamGravidade;
		this.mamUnidXExame = mamUnidXExame;
		this.valor = valor;
		this.tipoComparacao = tipoComparacao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	public MamExameUnidGrav(Integer seq, RapServidores rapServidores, MamGravidade mamGravidade, MamUnidXExame mamUnidXExame,
			Long valor, Short tipoComparacao, String indSituacao, Date criadoEm, String micNome) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.mamGravidade = mamGravidade;
		this.mamUnidXExame = mamUnidXExame;
		this.valor = valor;
		this.tipoComparacao = tipoComparacao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.micNome = micNome;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamEugSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GRV_SEQ", nullable = false)
	public MamGravidade getMamGravidade() {
		return this.mamGravidade;
	}

	public void setMamGravidade(MamGravidade mamGravidade) {
		this.mamGravidade = mamGravidade;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "UXE_EMS_SEQ", referencedColumnName = "EMS_SEQ", nullable = false),
			@JoinColumn(name = "UXE_UAN_UNF_SEQ", referencedColumnName = "UAN_UNF_SEQ", nullable = false) })
	public MamUnidXExame getMamUnidXExame() {
		return this.mamUnidXExame;
	}

	public void setMamUnidXExame(MamUnidXExame mamUnidXExame) {
		this.mamUnidXExame = mamUnidXExame;
	}

	@Column(name = "VALOR", nullable = false)
	public Long getValor() {
		return this.valor;
	}

	public void setValor(Long valor) {
		this.valor = valor;
	}

	@Column(name = "TIPO_COMPARACAO", nullable = false)
	public Short getTipoComparacao() {
		return this.tipoComparacao;
	}

	public void setTipoComparacao(Short tipoComparacao) {
		this.tipoComparacao = tipoComparacao;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "MIC_NOME", length = 50)
	@Length(max = 50)
	public String getMicNome() {
		return this.micNome;
	}

	public void setMicNome(String micNome) {
		this.micNome = micNome;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		MAM_GRAVIDADES("mamGravidade"),
		MAM_UNID_X_EXAMES("mamUnidXExame"),
		VALOR("valor"),
		TIPO_COMPARACAO("tipoComparacao"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		MIC_NOME("micNome");

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
		if (!(obj instanceof MamExameUnidGrav)) {
			return false;
		}
		MamExameUnidGrav other = (MamExameUnidGrav) obj;
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