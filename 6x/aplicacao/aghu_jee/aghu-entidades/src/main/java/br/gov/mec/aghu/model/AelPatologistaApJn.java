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


import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelPatologistaApJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelLupJnSeq", sequenceName="AGH.AEL_LUP_JN_SEQ", allocationSize = 1)
@Table(name = "AEL_PATOLOGISTA_APS_JN", schema = "AGH")
@Immutable
public class AelPatologistaApJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -6223266817138443473L;

	private Integer seq;
	private Short ordemMedicoLaudo;
	private Date criadoEm;
	private AelExameAp aelExameAps;
	private RapServidores servidor;

	public AelPatologistaApJn() {
	}

	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelLupJnSeq")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "ORDEM_MEDICO_LAUDO")
	public Short getOrdemMedicoLaudo() {
		return this.ordemMedicoLaudo;
	}

	public void setOrdemMedicoLaudo(Short ordemMedicoLaudo) {
		this.ordemMedicoLaudo = ordemMedicoLaudo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable=false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable=false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LUX_SEQ", nullable = false)
	public AelExameAp getAelExameAps() {
		return this.aelExameAps;
	}

	public void setAelExameAps(AelExameAp aelExameAps) {
		this.aelExameAps = aelExameAps;
	}

	public enum Fields {
		SEQ("seq"),
		ORDEM_MEDICO_LAUDO("ordemMedicoLaudo"),
		CRIADO_EM("criadoEm"),
		LUX_SEQ("aelExameAps.seq"),
		SER_MATRICULA("servidor.id.matricula"),
		SER_VIN_CODIGO("servidor.id.vinCodigo");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

}