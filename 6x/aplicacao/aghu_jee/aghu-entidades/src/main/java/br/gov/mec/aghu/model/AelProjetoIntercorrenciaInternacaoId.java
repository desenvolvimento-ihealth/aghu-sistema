package br.gov.mec.aghu.model;

// Generated 22/06/2010 18:06:02 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelProjetoIntercInternacsId generated by hbm2java
 */
@Embeddable

public class AelProjetoIntercorrenciaInternacaoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6368855645178396135L;
	private Integer ppjPjqSeq;
	private Integer ppjPacCodigo;
	private Short seqp;

	public AelProjetoIntercorrenciaInternacaoId() {
	}

	public AelProjetoIntercorrenciaInternacaoId(Integer ppjPjqSeq, Integer ppjPacCodigo,
			Short seqp) {
		this.ppjPjqSeq = ppjPjqSeq;
		this.ppjPacCodigo = ppjPacCodigo;
		this.seqp = seqp;
	}

	@Column(name = "PPJ_PJQ_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getPpjPjqSeq() {
		return this.ppjPjqSeq;
	}

	public void setPpjPjqSeq(Integer ppjPjqSeq) {
		this.ppjPjqSeq = ppjPjqSeq;
	}

	@Column(name = "PPJ_PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getPpjPacCodigo() {
		return this.ppjPacCodigo;
	}

	public void setPpjPacCodigo(Integer ppjPacCodigo) {
		this.ppjPacCodigo = ppjPacCodigo;
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
		if (!(other instanceof AelProjetoIntercorrenciaInternacaoId)) {
			return false;
		}
		AelProjetoIntercorrenciaInternacaoId castOther = (AelProjetoIntercorrenciaInternacaoId) other;

		return (this.getPpjPjqSeq() == castOther.getPpjPjqSeq())
				&& (this.getPpjPacCodigo() == castOther.getPpjPacCodigo())
				&& (this.getSeqp() == castOther.getSeqp());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getPpjPjqSeq();
		result = 37 * result + this.getPpjPacCodigo();
		result = 37 * result + this.getSeqp();
		return result;
	}

}
