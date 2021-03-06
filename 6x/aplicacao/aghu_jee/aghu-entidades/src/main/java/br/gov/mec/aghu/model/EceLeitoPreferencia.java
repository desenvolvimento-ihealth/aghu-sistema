package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * EceLeitoPreferencia generated by hbm2java
 */
@Entity
@Table(name = "ECE_LEITO_PREFERENCIAS", schema = "AGH")
public class EceLeitoPreferencia extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2844447780706978712L;
	private Integer seq;
	private Integer version;
	private RapServidores rapServidores;
	private AinLeitos ainLeitos;
	private EcePreferenciaServidor ecePreferenciaServidor;
	private Date criadoEm;

	public EceLeitoPreferencia() {
	}

	public EceLeitoPreferencia(Integer seq, RapServidores rapServidores, AinLeitos ainLeitos,
			EcePreferenciaServidor ecePreferenciaServidor, Date criadoEm) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.ainLeitos = ainLeitos;
		this.ecePreferenciaServidor = ecePreferenciaServidor;
		this.criadoEm = criadoEm;
	}

	@Id
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
	@JoinColumn(name = "LTO_LTO_ID", nullable = false)
	public AinLeitos getAinLeitos() {
		return this.ainLeitos;
	}

	public void setAinLeitos(AinLeitos ainLeitos) {
		this.ainLeitos = ainLeitos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PRX_SEQ", nullable = false)
	public EcePreferenciaServidor getEcePreferenciaServidor() {
		return this.ecePreferenciaServidor;
	}

	public void setEcePreferenciaServidor(EcePreferenciaServidor ecePreferenciaServidor) {
		this.ecePreferenciaServidor = ecePreferenciaServidor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		AIN_LEITOS("ainLeitos"),
		ECE_PREFERENCIA_SERVIDORES("ecePreferenciaServidor"),
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
		if (!(obj instanceof EceLeitoPreferencia)) {
			return false;
		}
		EceLeitoPreferencia other = (EceLeitoPreferencia) obj;
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
