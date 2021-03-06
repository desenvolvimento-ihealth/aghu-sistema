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


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RapConsultorCcusto generated by hbm2java
 */
@Entity
@Table(name = "RAP_CONSULTOR_CCUSTOS", schema = "AGH")
public class RapConsultorCcusto extends BaseEntityId<RapConsultorCcustoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5515558493241742296L;
	private RapConsultorCcustoId id;
	private Integer version;
	private RapServidores rapServidoresByRapCocSerFk3;
	private RapServidores rapServidoresByRapCocSerFk1;
	private FccCentroCustos fccCentroCustos;
	private RapServidores rapServidoresByRapCocSerFk2;
	private String indElementar;
	private Date dtInicio;
	private Date dtFim;
	private Date criadoEm;
	private Date alteradoEm;

	public RapConsultorCcusto() {
	}

	public RapConsultorCcusto(RapConsultorCcustoId id, RapServidores rapServidoresByRapCocSerFk1, FccCentroCustos fccCentroCustos,
			RapServidores rapServidoresByRapCocSerFk2, Date dtInicio, Date criadoEm) {
		this.id = id;
		this.rapServidoresByRapCocSerFk1 = rapServidoresByRapCocSerFk1;
		this.fccCentroCustos = fccCentroCustos;
		this.rapServidoresByRapCocSerFk2 = rapServidoresByRapCocSerFk2;
		this.dtInicio = dtInicio;
		this.criadoEm = criadoEm;
	}

	public RapConsultorCcusto(RapConsultorCcustoId id, RapServidores rapServidoresByRapCocSerFk3,
			RapServidores rapServidoresByRapCocSerFk1, FccCentroCustos fccCentroCustos, RapServidores rapServidoresByRapCocSerFk2,
			String indElementar, Date dtInicio, Date dtFim, Date criadoEm, Date alteradoEm) {
		this.id = id;
		this.rapServidoresByRapCocSerFk3 = rapServidoresByRapCocSerFk3;
		this.rapServidoresByRapCocSerFk1 = rapServidoresByRapCocSerFk1;
		this.fccCentroCustos = fccCentroCustos;
		this.rapServidoresByRapCocSerFk2 = rapServidoresByRapCocSerFk2;
		this.indElementar = indElementar;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA", nullable = false)),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public RapConsultorCcustoId getId() {
		return this.id;
	}

	public void setId(RapConsultorCcustoId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidoresByRapCocSerFk3() {
		return this.rapServidoresByRapCocSerFk3;
	}

	public void setRapServidoresByRapCocSerFk3(RapServidores rapServidoresByRapCocSerFk3) {
		this.rapServidoresByRapCocSerFk3 = rapServidoresByRapCocSerFk3;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false, insertable = false, updatable = false) })
	public RapServidores getRapServidoresByRapCocSerFk1() {
		return this.rapServidoresByRapCocSerFk1;
	}

	public void setRapServidoresByRapCocSerFk1(RapServidores rapServidoresByRapCocSerFk1) {
		this.rapServidoresByRapCocSerFk1 = rapServidoresByRapCocSerFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CCT_CODIGO", nullable = false)
	public FccCentroCustos getFccCentroCustos() {
		return this.fccCentroCustos;
	}

	public void setFccCentroCustos(FccCentroCustos fccCentroCustos) {
		this.fccCentroCustos = fccCentroCustos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA_CRIADO", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO_CRIADO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidoresByRapCocSerFk2() {
		return this.rapServidoresByRapCocSerFk2;
	}

	public void setRapServidoresByRapCocSerFk2(RapServidores rapServidoresByRapCocSerFk2) {
		this.rapServidoresByRapCocSerFk2 = rapServidoresByRapCocSerFk2;
	}

	@Column(name = "IND_ELEMENTAR", length = 1)
	@Length(max = 1)
	public String getIndElementar() {
		return this.indElementar;
	}

	public void setIndElementar(String indElementar) {
		this.indElementar = indElementar;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO", nullable = false, length = 29)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM", length = 29)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES_BY_RAP_COC_SER_FK3("rapServidoresByRapCocSerFk3"),
		RAP_SERVIDORES_BY_RAP_COC_SER_FK1("rapServidoresByRapCocSerFk1"),
		FCC_CENTRO_CUSTOS("fccCentroCustos"),
		RAP_SERVIDORES_BY_RAP_COC_SER_FK2("rapServidoresByRapCocSerFk2"),
		IND_ELEMENTAR("indElementar"),
		DT_INICIO("dtInicio"),
		DT_FIM("dtFim"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm");

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
		if (!(obj instanceof RapConsultorCcusto)) {
			return false;
		}
		RapConsultorCcusto other = (RapConsultorCcusto) obj;
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
