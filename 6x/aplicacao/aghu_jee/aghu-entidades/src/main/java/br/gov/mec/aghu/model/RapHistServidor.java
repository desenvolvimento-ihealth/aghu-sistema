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
 * RapHistServidor generated by hbm2java
 */
@Entity
@Table(name = "RAP_HIST_SERVIDORES", schema = "AGH")
public class RapHistServidor extends BaseEntityId<RapHistServidorId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1912788932447333407L;
	private RapHistServidorId id;
	private Integer version;
	private RapOcupacaoCargo rapOcupacaoCargo;
	private RapServidores rapServidores;
	private FccCentroCustos fccCentroCustosByCctCodigo;
	private FccCentroCustos fccCentroCustosByCctCodigoDesempenho;
	private FccCentroCustos fccCentroCustosByCctCodigoAtua;
	private Date dthrExecucao;

	public RapHistServidor() {
	}

	public RapHistServidor(RapHistServidorId id, RapServidores rapServidores, Date dthrExecucao) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.dthrExecucao = dthrExecucao;
	}

	public RapHistServidor(RapHistServidorId id, RapOcupacaoCargo rapOcupacaoCargo, RapServidores rapServidores,
			FccCentroCustos fccCentroCustosByCctCodigo, FccCentroCustos fccCentroCustosByCctCodigoDesempenho,
			FccCentroCustos fccCentroCustosByCctCodigoAtua, Date dthrExecucao) {
		this.id = id;
		this.rapOcupacaoCargo = rapOcupacaoCargo;
		this.rapServidores = rapServidores;
		this.fccCentroCustosByCctCodigo = fccCentroCustosByCctCodigo;
		this.fccCentroCustosByCctCodigoDesempenho = fccCentroCustosByCctCodigoDesempenho;
		this.fccCentroCustosByCctCodigoAtua = fccCentroCustosByCctCodigoAtua;
		this.dthrExecucao = dthrExecucao;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA", nullable = false)),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO", nullable = false)),
			@AttributeOverride(name = "dtFechamento", column = @Column(name = "DT_FECHAMENTO", nullable = false, length = 29)) })
	public RapHistServidorId getId() {
		return this.id;
	}

	public void setId(RapHistServidorId id) {
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
	@JoinColumns({ @JoinColumn(name = "OCA_CAR_CODIGO", referencedColumnName = "CAR_CODIGO"),
			@JoinColumn(name = "OCA_CODIGO", referencedColumnName = "CODIGO") })
	public RapOcupacaoCargo getRapOcupacaoCargo() {
		return this.rapOcupacaoCargo;
	}

	public void setRapOcupacaoCargo(RapOcupacaoCargo rapOcupacaoCargo) {
		this.rapOcupacaoCargo = rapOcupacaoCargo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false, insertable = false, updatable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CCT_CODIGO")
	public FccCentroCustos getFccCentroCustosByCctCodigo() {
		return this.fccCentroCustosByCctCodigo;
	}

	public void setFccCentroCustosByCctCodigo(FccCentroCustos fccCentroCustosByCctCodigo) {
		this.fccCentroCustosByCctCodigo = fccCentroCustosByCctCodigo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CCT_CODIGO_DESEMPENHO")
	public FccCentroCustos getFccCentroCustosByCctCodigoDesempenho() {
		return this.fccCentroCustosByCctCodigoDesempenho;
	}

	public void setFccCentroCustosByCctCodigoDesempenho(FccCentroCustos fccCentroCustosByCctCodigoDesempenho) {
		this.fccCentroCustosByCctCodigoDesempenho = fccCentroCustosByCctCodigoDesempenho;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CCT_CODIGO_ATUA")
	public FccCentroCustos getFccCentroCustosByCctCodigoAtua() {
		return this.fccCentroCustosByCctCodigoAtua;
	}

	public void setFccCentroCustosByCctCodigoAtua(FccCentroCustos fccCentroCustosByCctCodigoAtua) {
		this.fccCentroCustosByCctCodigoAtua = fccCentroCustosByCctCodigoAtua;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_EXECUCAO", nullable = false, length = 29)
	public Date getDthrExecucao() {
		return this.dthrExecucao;
	}

	public void setDthrExecucao(Date dthrExecucao) {
		this.dthrExecucao = dthrExecucao;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_OCUPACAO_CARGO("rapOcupacaoCargo"),
		RAP_SERVIDORES("rapServidores"),
		FCC_CENTRO_CUSTOS_BY_CCT_CODIGO("fccCentroCustosByCctCodigo"),
		FCC_CENTRO_CUSTOS_BY_CCT_CODIGO_DESEMPENHO("fccCentroCustosByCctCodigoDesempenho"),
		FCC_CENTRO_CUSTOS_BY_CCT_CODIGO_ATUA("fccCentroCustosByCctCodigoAtua"),
		DTHR_EXECUCAO("dthrExecucao");

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
		if (!(obj instanceof RapHistServidor)) {
			return false;
		}
		RapHistServidor other = (RapHistServidor) obj;
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
