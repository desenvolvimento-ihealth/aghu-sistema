package br.gov.mec.aghu.model;

// Generated 28/03/2012 15:17:44 by Hibernate Tools 3.4.0.CR1

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


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MbcFichaFluidoPerdidos generated by hbm2java
 */
@Entity
@Table(name = "MBC_FICHA_FLUIDO_PERDIDOS", schema = "AGH")
public class MbcFichaFluidoPerdido extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2890672396369189809L;
	private Integer seq;
	private Integer version;
	private MbcFichaAnestesias mbcFichaAnestesias;
	private MbcFluidoPerdido mbcFluidosPerdidos;
	private Date criadoEm;
	private String observacao;
	private RapServidores servidor;
	private Integer volumeTotal;

	public MbcFichaFluidoPerdido() {
	}

	public MbcFichaFluidoPerdido(Integer seq,
			MbcFichaAnestesias mbcFichaAnestesias,
			MbcFluidoPerdido mbcFluidosPerdidos, Date criadoEm,
			RapServidores servidor) {
		this.seq = seq;
		this.mbcFichaAnestesias = mbcFichaAnestesias;
		this.mbcFluidosPerdidos = mbcFluidosPerdidos;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}

	public MbcFichaFluidoPerdido(Integer seq,
			MbcFichaAnestesias mbcFichaAnestesias,
			MbcFluidoPerdido mbcFluidosPerdidos, Date criadoEm,
			String observacao, RapServidores servidor,
			Integer volumeTotal) {
		this.seq = seq;
		this.mbcFichaAnestesias = mbcFichaAnestesias;
		this.mbcFluidosPerdidos = mbcFluidosPerdidos;
		this.criadoEm = criadoEm;
		this.observacao = observacao;
		this.volumeTotal = volumeTotal;
		this.servidor = servidor;
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
	@JoinColumn(name = "FIC_SEQ", nullable = false)
	public MbcFichaAnestesias getMbcFichaAnestesias() {
		return this.mbcFichaAnestesias;
	}

	public void setMbcFichaAnestesias(MbcFichaAnestesias mbcFichaAnestesias) {
		this.mbcFichaAnestesias = mbcFichaAnestesias;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FDD_SEQ", nullable = false)
	public MbcFluidoPerdido getMbcFluidosPerdidos() {
		return this.mbcFluidosPerdidos;
	}

	public void setMbcFluidosPerdidos(MbcFluidoPerdido mbcFluidosPerdidos) {
		this.mbcFluidosPerdidos = mbcFluidosPerdidos;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "OBSERVACAO", length = 45)
	@Length(max = 45)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "VOLUME_TOTAL")
	public Integer getVolumeTotal() {
		return this.volumeTotal;
	}

	public void setVolumeTotal(Integer volumeTotal) {
		this.volumeTotal = volumeTotal;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO")})
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	public enum Fields {
		SEQ("seq"),
		FICHA_ANESTESIA("mbcFichaAnestesias"),
		FLUIDO_PERDIDO("mbcFluidosPerdidos"),
		CRIADO_EM("criadoEm"),
		OBSERVACAO("observacao"),
		SERVIDOR("servidor"),
		VOLUME_TOTAL("volumeTotal"),
		SEQ_FICHA_ANESTESIA("mbcFichaAnestesias.seq");

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
		if (!(obj instanceof MbcFichaFluidoPerdido)) {
			return false;
		}
		MbcFichaFluidoPerdido other = (MbcFichaFluidoPerdido) obj;
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
