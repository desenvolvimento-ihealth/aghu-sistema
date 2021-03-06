package br.gov.mec.aghu.model;

// Generated 31/05/2011 14:56:51 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioOrigemAtendimento;
import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AelTiposAmoExameConvId generated by hbm2java
 */

@Embeddable
public class AelTipoAmoExameConvId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6474299730000747390L;
	private String taeEmaExaSigla;
	private Integer taeEmaManSeq;
	private Integer taeManSeq;
	private DominioOrigemAtendimento taeOrigemAtendimento;
	private Short cspSeq;
	private Short cspCnvCodigo;

	public AelTipoAmoExameConvId() {
	}

	public AelTipoAmoExameConvId(String taeEmaExaSigla, Integer taeEmaManSeq,
			Integer taeManSeq, DominioOrigemAtendimento taeOrigemAtendimento, Short cspSeq,
			Short cspCnvCodigo) {
		this.taeEmaExaSigla = taeEmaExaSigla;
		this.taeEmaManSeq = taeEmaManSeq;
		this.taeManSeq = taeManSeq;
		this.taeOrigemAtendimento = taeOrigemAtendimento;
		this.cspSeq = cspSeq;
		this.cspCnvCodigo = cspCnvCodigo;
	}

	@Column(name = "TAE_EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getTaeEmaExaSigla() {
		return this.taeEmaExaSigla;
	}

	public void setTaeEmaExaSigla(String taeEmaExaSigla) {
		this.taeEmaExaSigla = taeEmaExaSigla;
	}

	@Column(name = "TAE_EMA_MAN_SEQ", nullable = false)
	public Integer getTaeEmaManSeq() {
		return this.taeEmaManSeq;
	}

	public void setTaeEmaManSeq(Integer taeEmaManSeq) {
		this.taeEmaManSeq = taeEmaManSeq;
	}

	@Column(name = "TAE_MAN_SEQ", nullable = false)
	public Integer getTaeManSeq() {
		return this.taeManSeq;
	}

	public void setTaeManSeq(Integer taeManSeq) {
		this.taeManSeq = taeManSeq;
	}

	@Column(name = "TAE_ORIGEM_ATENDIMENTO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioOrigemAtendimento getTaeOrigemAtendimento() {
		return this.taeOrigemAtendimento;
	}

	public void setTaeOrigemAtendimento(DominioOrigemAtendimento taeOrigemAtendimento) {
		this.taeOrigemAtendimento = taeOrigemAtendimento;
	}

	@Column(name = "CSP_SEQ", nullable = false)
	public Short getCspSeq() {
		return this.cspSeq;
	}

	public void setCspSeq(Short cspSeq) {
		this.cspSeq = cspSeq;
	}

	@Column(name = "CSP_CNV_CODIGO", nullable = false)
	public Short getCspCnvCodigo() {
		return this.cspCnvCodigo;
	}

	public void setCspCnvCodigo(Short cspCnvCodigo) {
		this.cspCnvCodigo = cspCnvCodigo;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AelTipoAmoExameConvId)) {
			return false;
		}
		AelTipoAmoExameConvId castOther = (AelTipoAmoExameConvId) other;

		return ((this.getTaeEmaExaSigla() == castOther.getTaeEmaExaSigla()) || (this
				.getTaeEmaExaSigla() != null
				&& castOther.getTaeEmaExaSigla() != null && this
				.getTaeEmaExaSigla().equals(castOther.getTaeEmaExaSigla())))
				&& (this.getTaeEmaManSeq() == castOther.getTaeEmaManSeq())
				&& (this.getTaeManSeq() == castOther.getTaeManSeq())
				&& ((this.getTaeOrigemAtendimento() == castOther
						.getTaeOrigemAtendimento()) || (this
						.getTaeOrigemAtendimento() != null
						&& castOther.getTaeOrigemAtendimento() != null && this
						.getTaeOrigemAtendimento().equals(
								castOther.getTaeOrigemAtendimento())))
				&& (this.getCspSeq() == castOther.getCspSeq())
				&& (this.getCspCnvCodigo() == castOther.getCspCnvCodigo());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getTaeEmaExaSigla() == null ? 0 : this.getTaeEmaExaSigla()
						.hashCode());
		result = 37 * result + this.getTaeEmaManSeq();
		result = 37 * result + this.getTaeManSeq();
		result = 37
				* result
				+ (getTaeOrigemAtendimento() == null ? 0 : this
						.getTaeOrigemAtendimento().hashCode());
		result = 37 * result + this.getCspSeq();
		result = 37 * result + this.getCspCnvCodigo();
		return result;
	}

}
