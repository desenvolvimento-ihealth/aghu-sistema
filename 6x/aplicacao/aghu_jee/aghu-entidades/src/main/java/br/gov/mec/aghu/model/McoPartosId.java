package br.gov.mec.aghu.model;

// Generated 08/02/2010 17:25:25 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * McoPartosId generated by hbm2java
 */
@Embeddable
public class McoPartosId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7402333502388750087L;
	private Integer pacCodigo;
	private Short seqp;

	public McoPartosId() {
	}

	public McoPartosId(Integer pacCodigo, Short seqp) {
		this.pacCodigo = pacCodigo;
		this.seqp = seqp;
	}

	@Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "SEQP", nullable = false, precision = 3, scale = 0)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof McoPartosId)) {
			return false;
		}
		McoPartosId castOther = (McoPartosId) other;

		return this.getPacCodigo() != null && this.getPacCodigo().equals(castOther.getPacCodigo()) &&
				this.getSeqp() != null && this.getSeqp().equals(castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (this.getPacCodigo() == null ? 0 : this.getPacCodigo().hashCode());
		result = 37 * result + (this.getSeqp() == null ? 0 : this.getSeqp().hashCode());
		return result;
	}

}