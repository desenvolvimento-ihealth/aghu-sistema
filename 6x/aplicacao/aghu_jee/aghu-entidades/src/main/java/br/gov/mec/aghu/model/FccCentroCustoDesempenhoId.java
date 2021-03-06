package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * FccCentroCustoDesempenhoId generated by hbm2java
 */
@Embeddable
public class FccCentroCustoDesempenhoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2364098972701085065L;
	private Integer cctCodigo;
	private Integer cctCodigoTem;

	public FccCentroCustoDesempenhoId() {
	}

	public FccCentroCustoDesempenhoId(Integer cctCodigo, Integer cctCodigoTem) {
		this.cctCodigo = cctCodigo;
		this.cctCodigoTem = cctCodigoTem;
	}

	@Column(name = "CCT_CODIGO", nullable = false)
	public Integer getCctCodigo() {
		return this.cctCodigo;
	}

	public void setCctCodigo(Integer cctCodigo) {
		this.cctCodigo = cctCodigo;
	}

	@Column(name = "CCT_CODIGO_TEM", nullable = false)
	public Integer getCctCodigoTem() {
		return this.cctCodigoTem;
	}

	public void setCctCodigoTem(Integer cctCodigoTem) {
		this.cctCodigoTem = cctCodigoTem;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCctCodigo());
		umHashCodeBuilder.append(this.getCctCodigoTem());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof FccCentroCustoDesempenhoId)) {
			return false;
		}
		FccCentroCustoDesempenhoId other = (FccCentroCustoDesempenhoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCctCodigo(), other.getCctCodigo());
		umEqualsBuilder.append(this.getCctCodigoTem(), other.getCctCodigoTem());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
