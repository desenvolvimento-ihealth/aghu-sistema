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
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * PdtInstrDesc generated by hbm2java
 */
@Entity
@Table(name = "PDT_INSTR_DESCS", schema = "AGH")
public class PdtInstrDesc extends BaseEntityId<PdtInstrDescId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2499811511104574507L;
	private PdtInstrDescId id;
	private Integer version;
	private PdtInstrumental pdtInstrumental;
	private PdtDescricao pdtDescricao;
	private RapServidores rapServidores;
	private Date criadoEm;

	public PdtInstrDesc() {
	}

	public PdtInstrDesc(PdtInstrDescId id, PdtInstrumental pdtInstrumental, PdtDescricao pdtDescricao,
			RapServidores rapServidores, Date criadoEm) {
		this.id = id;
		this.pdtInstrumental = pdtInstrumental;
		this.pdtDescricao = pdtDescricao;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "ddtSeq", column = @Column(name = "DDT_SEQ", nullable = false)),
			@AttributeOverride(name = "pinSeq", column = @Column(name = "PIN_SEQ", nullable = false)) })
	public PdtInstrDescId getId() {
		return this.id;
	}

	public void setId(PdtInstrDescId id) {
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
	@JoinColumn(name = "PIN_SEQ", nullable = false, insertable = false, updatable = false)
	public PdtInstrumental getPdtInstrumental() {
		return this.pdtInstrumental;
	}

	public void setPdtInstrumental(PdtInstrumental pdtInstrumental) {
		this.pdtInstrumental = pdtInstrumental;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DDT_SEQ", nullable = false, insertable = false, updatable = false)
	public PdtDescricao getPdtDescricao() {
		return this.pdtDescricao;
	}

	public void setPdtDescricao(PdtDescricao pdtDescricao) {
		this.pdtDescricao = pdtDescricao;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		ID("id"),
		DDT_SEQ("id.ddtSeq"),
		PIN_SEQ("id.pinSeq"),
		VERSION("version"),
		PDT_INSTRUMENTAIS("pdtInstrumental"),
		PDT_DESCRICAO("pdtDescricao"),
		RAP_SERVIDORES("rapServidores"),
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
		if (!(obj instanceof PdtInstrDesc)) {
			return false;
		}
		PdtInstrDesc other = (PdtInstrDesc) obj;
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
