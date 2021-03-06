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
 * AelNotaAdicionalAp generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelLudSq1", sequenceName="AGH.AEL_LUD_SQ1", allocationSize = 1)
@Table(name = "AEL_NOTA_ADICIONAL_APS", schema = "AGH")
public class AelNotaAdicionalAp extends BaseEntitySeq<Long> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4035688265684402696L;
	private Long seq;
	private Integer version;
	private AelExameAp aelExameAp;
	private RapServidores rapServidores;
	private String notas;
	private Date criadoEm;

	public AelNotaAdicionalAp() {
	}

	public AelNotaAdicionalAp(Long seq, AelExameAp aelExameAp, RapServidores rapServidores, String notas, Date criadoEm) {
		this.seq = seq;
		this.aelExameAp = aelExameAp;
		this.rapServidores = rapServidores;
		this.notas = notas;
		this.criadoEm = criadoEm;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelLudSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
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
	@JoinColumn(name = "LUX_SEQ", nullable = false)
	public AelExameAp getAelExameAp() {
		return this.aelExameAp;
	}

	public void setAelExameAp(AelExameAp aelExameAp) {
		this.aelExameAp = aelExameAp;
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

	@Column(name = "NOTAS", nullable = false, length = 4000)
	@Length(max = 4000)
	public String getNotas() {
		return this.notas;
	}

	public void setNotas(String notas) {
		this.notas = notas;
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
		AEL_EXAME_APS("aelExameAp"),
		RAP_SERVIDORES("rapServidores"),
		NOTAS("notas"),
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
		if (!(obj instanceof AelNotaAdicionalAp)) {
			return false;
		}
		AelNotaAdicionalAp other = (AelNotaAdicionalAp) obj;
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
