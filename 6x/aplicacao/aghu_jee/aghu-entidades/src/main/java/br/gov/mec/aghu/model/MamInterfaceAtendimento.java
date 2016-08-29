package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MamInterfaceAtendimento generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamIttSq1", sequenceName="AGH.MAM_ITT_SQ1", allocationSize = 1)
@Table(name = "MAM_INTERFACE_ATENDIMENTOS", schema = "AGH")
public class MamInterfaceAtendimento extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1727618108013297349L;
	private Integer seq;
	private Integer version;
	private String nomeAai;
	private Integer prontuario;
	private String nome;
	private Date criadoEm;
	private Integer atdSeq;
	private Integer conNumero;
	private Integer serMatricula;
	private Short serVinCodigo;
	private String micNome;

	public MamInterfaceAtendimento() {
	}

	public MamInterfaceAtendimento(Integer seq, String nomeAai, Date criadoEm) {
		this.seq = seq;
		this.nomeAai = nomeAai;
		this.criadoEm = criadoEm;
	}

	public MamInterfaceAtendimento(Integer seq, String nomeAai, Integer prontuario, String nome, Date criadoEm, Integer atdSeq,
			Integer conNumero, Integer serMatricula, Short serVinCodigo, String micNome) {
		this.seq = seq;
		this.nomeAai = nomeAai;
		this.prontuario = prontuario;
		this.nome = nome;
		this.criadoEm = criadoEm;
		this.atdSeq = atdSeq;
		this.conNumero = conNumero;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.micNome = micNome;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamIttSq1")
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

	@Column(name = "NOME_AAI", nullable = false, length = 20)
	@Length(max = 20)
	public String getNomeAai() {
		return this.nomeAai;
	}

	public void setNomeAai(String nomeAai) {
		this.nomeAai = nomeAai;
	}

	@Column(name = "PRONTUARIO")
	public Integer getProntuario() {
		return this.prontuario;
	}

	public void setProntuario(Integer prontuario) {
		this.prontuario = prontuario;
	}

	@Column(name = "NOME", length = 50)
	@Length(max = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "ATD_SEQ")
	public Integer getAtdSeq() {
		return this.atdSeq;
	}

	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}

	@Column(name = "CON_NUMERO")
	public Integer getConNumero() {
		return this.conNumero;
	}

	public void setConNumero(Integer conNumero) {
		this.conNumero = conNumero;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
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
		NOME_AAI("nomeAai"),
		PRONTUARIO("prontuario"),
		NOME("nome"),
		CRIADO_EM("criadoEm"),
		ATD_SEQ("atdSeq"),
		CON_NUMERO("conNumero"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
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
		if (!(obj instanceof MamInterfaceAtendimento)) {
			return false;
		}
		MamInterfaceAtendimento other = (MamInterfaceAtendimento) obj;
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