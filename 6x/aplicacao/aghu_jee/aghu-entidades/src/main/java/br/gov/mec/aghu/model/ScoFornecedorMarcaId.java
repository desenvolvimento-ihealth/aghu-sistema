package br.gov.mec.aghu.model;

// Generated Mar 21, 2011 1:47:23 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * ScoFornecedoresMarcaId generated by hbm2java
 */
@Embeddable
public class ScoFornecedorMarcaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5199061087878889230L;
	
	private Integer frnNumero;
	private Integer mcmCodigo;

	public ScoFornecedorMarcaId() {
	}

	public ScoFornecedorMarcaId(Integer frnNumero, Integer mcmCodigo) {
		this.frnNumero = frnNumero;
		this.mcmCodigo = mcmCodigo;
	}

	@Column(name = "FRN_NUMERO", nullable = false, precision = 5, scale = 0)
	public Integer getFrnNumero() {
		return this.frnNumero;
	}

	public void setFrnNumero(Integer frnNumero) {
		this.frnNumero = frnNumero;
	}

	@Column(name = "MCM_CODIGO", nullable = false, precision = 6, scale = 0)
	public Integer getMcmCodigo() {
		return this.mcmCodigo;
	}

	public void setMcmCodigo(Integer mcmCodigo) {
		this.mcmCodigo = mcmCodigo;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof ScoFornecedorMarcaId)) {
			return false;
		}
		ScoFornecedorMarcaId castOther = (ScoFornecedorMarcaId) other;

		return (this.getFrnNumero() == castOther.getFrnNumero())
				&& (this.getMcmCodigo() == castOther.getMcmCodigo());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getFrnNumero();
		result = 37 * result + this.getMcmCodigo();
		return result;
	}

}
