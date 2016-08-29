package br.gov.mec.aghu.model;

// Generated 28/10/2010 13:06:29 by Hibernate Tools 3.3.0.GA

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


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MpaCadOrdProcedimentos generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mpaCopSq1", sequenceName="AGH.MPA_COP_SQ1", allocationSize = 1)
@Table(name = "MPA_CAD_ORD_PROCEDIMENTOS", schema = "AGH")
public class MpaCadOrdProcedimentos extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1350719624903466695L;
	private Integer seq;
	private Date criadoEm;
	private String infComplementares;
	private Short quantidade;
	private Integer pciSeq;
	private Integer matCodigo;
	private Short ccdCitVpaPtaSeq;
	private Byte ccdCitVpaSeqp;
	private Short ccdCitSeqp;
	private Short ccdSeqp;
	private Short pedSeq;
	private Short camCitVpaPtaSeq;
	private Byte camCitVpaSeqp;
	private Short camCitSeqp;
	private Short camSeqp;
	private RapServidores servidor;

	public MpaCadOrdProcedimentos() {
	}

	public MpaCadOrdProcedimentos(Integer seq, Date criadoEm, RapServidores servidor) {
		this.seq = seq;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}

	public MpaCadOrdProcedimentos(Integer seq, Date criadoEm, String infComplementares, Short quantidade, Integer pciSeq,
			Integer matCodigo, Short ccdCitVpaPtaSeq, Byte ccdCitVpaSeqp, Short ccdCitSeqp, Short ccdSeqp, Short pedSeq,
			Short camCitVpaPtaSeq, Byte camCitVpaSeqp, Short camCitSeqp, Short camSeqp, RapServidores servidor) {
		this.seq = seq;
		this.criadoEm = criadoEm;
		this.infComplementares = infComplementares;
		this.quantidade = quantidade;
		this.pciSeq = pciSeq;
		this.matCodigo = matCodigo;
		this.ccdCitVpaPtaSeq = ccdCitVpaPtaSeq;
		this.ccdCitVpaSeqp = ccdCitVpaSeqp;
		this.ccdCitSeqp = ccdCitSeqp;
		this.ccdSeqp = ccdSeqp;
		this.pedSeq = pedSeq;
		this.camCitVpaPtaSeq = camCitVpaPtaSeq;
		this.camCitVpaSeqp = camCitVpaSeqp;
		this.camCitSeqp = camCitSeqp;
		this.camSeqp = camSeqp;
		this.servidor = servidor;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mpaCopSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "INF_COMPLEMENTARES", length = 240)
	@Length(max = 240)
	public String getInfComplementares() {
		return this.infComplementares;
	}

	public void setInfComplementares(String infComplementares) {
		this.infComplementares = infComplementares;
	}

	@Column(name = "QUANTIDADE", precision = 4, scale = 0)
	public Short getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Short quantidade) {
		this.quantidade = quantidade;
	}

	@Column(name = "PCI_SEQ", precision = 5, scale = 0)
	public Integer getPciSeq() {
		return this.pciSeq;
	}

	public void setPciSeq(Integer pciSeq) {
		this.pciSeq = pciSeq;
	}

	@Column(name = "MAT_CODIGO", precision = 6, scale = 0)
	public Integer getMatCodigo() {
		return this.matCodigo;
	}

	public void setMatCodigo(Integer matCodigo) {
		this.matCodigo = matCodigo;
	}

	@Column(name = "CCD_CIT_VPA_PTA_SEQ", precision = 4, scale = 0)
	public Short getCcdCitVpaPtaSeq() {
		return this.ccdCitVpaPtaSeq;
	}

	public void setCcdCitVpaPtaSeq(Short ccdCitVpaPtaSeq) {
		this.ccdCitVpaPtaSeq = ccdCitVpaPtaSeq;
	}

	@Column(name = "CCD_CIT_VPA_SEQP", precision = 2, scale = 0)
	public Byte getCcdCitVpaSeqp() {
		return this.ccdCitVpaSeqp;
	}

	public void setCcdCitVpaSeqp(Byte ccdCitVpaSeqp) {
		this.ccdCitVpaSeqp = ccdCitVpaSeqp;
	}

	@Column(name = "CCD_CIT_SEQP", precision = 4, scale = 0)
	public Short getCcdCitSeqp() {
		return this.ccdCitSeqp;
	}

	public void setCcdCitSeqp(Short ccdCitSeqp) {
		this.ccdCitSeqp = ccdCitSeqp;
	}

	@Column(name = "CCD_SEQP", precision = 4, scale = 0)
	public Short getCcdSeqp() {
		return this.ccdSeqp;
	}

	public void setCcdSeqp(Short ccdSeqp) {
		this.ccdSeqp = ccdSeqp;
	}

	@Column(name = "PED_SEQ", precision = 4, scale = 0)
	public Short getPedSeq() {
		return this.pedSeq;
	}

	public void setPedSeq(Short pedSeq) {
		this.pedSeq = pedSeq;
	}

	@Column(name = "CAM_CIT_VPA_PTA_SEQ", precision = 4, scale = 0)
	public Short getCamCitVpaPtaSeq() {
		return this.camCitVpaPtaSeq;
	}

	public void setCamCitVpaPtaSeq(Short camCitVpaPtaSeq) {
		this.camCitVpaPtaSeq = camCitVpaPtaSeq;
	}

	@Column(name = "CAM_CIT_VPA_SEQP", precision = 2, scale = 0)
	public Byte getCamCitVpaSeqp() {
		return this.camCitVpaSeqp;
	}

	public void setCamCitVpaSeqp(Byte camCitVpaSeqp) {
		this.camCitVpaSeqp = camCitVpaSeqp;
	}

	@Column(name = "CAM_CIT_SEQP", precision = 4, scale = 0)
	public Short getCamCitSeqp() {
		return this.camCitSeqp;
	}

	public void setCamCitSeqp(Short camCitSeqp) {
		this.camCitSeqp = camCitSeqp;
	}

	@Column(name = "CAM_SEQP", precision = 4, scale = 0)
	public Short getCamSeqp() {
		return this.camSeqp;
	}

	public void setCamSeqp(Short camSeqp) {
		this.camSeqp = camSeqp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	public enum Fields {

		SEQ("seq"),
		CRIADO_EM("criadoEm"),
		INF_COMPLEMENTARES("infComplementares"),
		QUANTIDADE("quantidade"),
		PCI_SEQ("pciSeq"),
		MAT_CODIGO("matCodigo"),
		CCD_CIT_VPA_PTA_SEQ("ccdCitVpaPtaSeq"),
		CCD_CIT_VPA_SEQP("ccdCitVpaSeqp"),
		CCD_CIT_SEQP("ccdCitSeqp"),
		CCD_SEQP("ccdSeqp"),
		PED_SEQ("pedSeq"),
		CAM_CIT_VPA_PTA_SEQ("camCitVpaPtaSeq"),
		CAM_CIT_VPA_SEQP("camCitVpaSeqp"),
		CAM_CIT_SEQP("camCitSeqp"),
		CAM_SEQP("camSeqp"),
		SERVIDOR("servidor");

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
		if (!(obj instanceof MpaCadOrdProcedimentos)) {
			return false;
		}
		MpaCadOrdProcedimentos other = (MpaCadOrdProcedimentos) obj;
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