package br.gov.mec.aghu.model;

// Generated 13/05/2010 14:47:26 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FatConvGrupoItensProcedId generated by hbm2java
 */
@Embeddable
public class FatConvGrupoItensProcedId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4172161621697715838L;
	private Byte cpgCphCspSeq;
	private Short cpgCphCspCnvCodigo;
	private Short cpgCphPhoSeq;
	private Short cpgGrcSeq;
	private Integer iphSeq;
	private Short iphPhoSeq;
	private Integer phiSeq;

	public FatConvGrupoItensProcedId() {
	}

	public FatConvGrupoItensProcedId(Byte cpgCphCspSeq,
			Short cpgCphCspCnvCodigo, Short cpgCphPhoSeq, Short cpgGrcSeq,
			Integer iphSeq, Short iphPhoSeq, Integer phiSeq) {
		this.cpgCphCspSeq = cpgCphCspSeq;
		this.cpgCphCspCnvCodigo = cpgCphCspCnvCodigo;
		this.cpgCphPhoSeq = cpgCphPhoSeq;
		this.cpgGrcSeq = cpgGrcSeq;
		this.iphSeq = iphSeq;
		this.iphPhoSeq = iphPhoSeq;
		this.phiSeq = phiSeq;
	}

	@Column(name = "CPG_CPH_CSP_SEQ", nullable = false, precision = 2, scale = 0)
	public Byte getCpgCphCspSeq() {
		return this.cpgCphCspSeq;
	}

	public void setCpgCphCspSeq(Byte cpgCphCspSeq) {
		this.cpgCphCspSeq = cpgCphCspSeq;
	}

	@Column(name = "CPG_CPH_CSP_CNV_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getCpgCphCspCnvCodigo() {
		return this.cpgCphCspCnvCodigo;
	}

	public void setCpgCphCspCnvCodigo(Short cpgCphCspCnvCodigo) {
		this.cpgCphCspCnvCodigo = cpgCphCspCnvCodigo;
	}

	@Column(name = "CPG_CPH_PHO_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getCpgCphPhoSeq() {
		return this.cpgCphPhoSeq;
	}

	public void setCpgCphPhoSeq(Short cpgCphPhoSeq) {
		this.cpgCphPhoSeq = cpgCphPhoSeq;
	}

	@Column(name = "CPG_GRC_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getCpgGrcSeq() {
		return this.cpgGrcSeq;
	}

	public void setCpgGrcSeq(Short cpgGrcSeq) {
		this.cpgGrcSeq = cpgGrcSeq;
	}

	@Column(name = "IPH_SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getIphSeq() {
		return this.iphSeq;
	}

	public void setIphSeq(Integer iphSeq) {
		this.iphSeq = iphSeq;
	}

	@Column(name = "IPH_PHO_SEQ", nullable = false, precision = 4, scale = 0)
	public Short getIphPhoSeq() {
		return this.iphPhoSeq;
	}

	public void setIphPhoSeq(Short iphPhoSeq) {
		this.iphPhoSeq = iphPhoSeq;
	}

	@Column(name = "PHI_SEQ", nullable = false, precision = 6, scale = 0)
	public Integer getPhiSeq() {
		return this.phiSeq;
	}

	public void setPhiSeq(Integer phiSeq) {
		this.phiSeq = phiSeq;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof FatConvGrupoItensProcedId)) {
			return false;
		}
		FatConvGrupoItensProcedId castOther = (FatConvGrupoItensProcedId) other;

		return (this.getCpgCphCspSeq() == castOther.getCpgCphCspSeq())
				&& (this.getCpgCphCspCnvCodigo() == castOther
						.getCpgCphCspCnvCodigo())
				&& (this.getCpgCphPhoSeq() == castOther.getCpgCphPhoSeq())
				&& (this.getCpgGrcSeq() == castOther.getCpgGrcSeq())
				&& (this.getIphSeq() == castOther.getIphSeq())
				&& (this.getIphPhoSeq() == castOther.getIphPhoSeq())
				&& (this.getPhiSeq() == castOther.getPhiSeq());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCpgCphCspSeq();
		result = 37 * result + this.getCpgCphCspCnvCodigo();
		result = 37 * result + this.getCpgCphPhoSeq();
		result = 37 * result + this.getCpgGrcSeq();
		result = 37 * result + this.getIphSeq();
		result = 37 * result + this.getIphPhoSeq();
		result = 37 * result + this.getPhiSeq();
		return result;
	}

}
