package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * UsuTr064asaId generated by hbm2java
 */
@Embeddable
public class UsuTr064asaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7210258415907743464L;
	private Short usuNumemp;
	private Short usuTipcol;
	private Integer usuNumcad;
	private Date usuDatasa;
	private Integer usuHorasa;
	private Integer usuHorter;
	private Short usuCodsit;
	private Short usuEmpaut;
	private Short usuTclaut;
	private Integer usuCadaut;
	private Integer usuCodusu;
	private Short usuStaacc;
	private String usuSitrel;
	private String usuJnUsu;
	private String usuJnOper;
	private Date usuJnData;

	public UsuTr064asaId() {
	}

	public UsuTr064asaId(Short usuNumemp, Short usuTipcol, Integer usuNumcad, Date usuDatasa, Integer usuHorasa, Integer usuHorter,
			Short usuCodsit, Short usuEmpaut, Short usuTclaut, Integer usuCadaut, Integer usuCodusu, Short usuStaacc,
			String usuSitrel, String usuJnUsu, String usuJnOper, Date usuJnData) {
		this.usuNumemp = usuNumemp;
		this.usuTipcol = usuTipcol;
		this.usuNumcad = usuNumcad;
		this.usuDatasa = usuDatasa;
		this.usuHorasa = usuHorasa;
		this.usuHorter = usuHorter;
		this.usuCodsit = usuCodsit;
		this.usuEmpaut = usuEmpaut;
		this.usuTclaut = usuTclaut;
		this.usuCadaut = usuCadaut;
		this.usuCodusu = usuCodusu;
		this.usuStaacc = usuStaacc;
		this.usuSitrel = usuSitrel;
		this.usuJnUsu = usuJnUsu;
		this.usuJnOper = usuJnOper;
		this.usuJnData = usuJnData;
	}

	@Column(name = "USU_NUMEMP")
	public Short getUsuNumemp() {
		return this.usuNumemp;
	}

	public void setUsuNumemp(Short usuNumemp) {
		this.usuNumemp = usuNumemp;
	}

	@Column(name = "USU_TIPCOL")
	public Short getUsuTipcol() {
		return this.usuTipcol;
	}

	public void setUsuTipcol(Short usuTipcol) {
		this.usuTipcol = usuTipcol;
	}

	@Column(name = "USU_NUMCAD")
	public Integer getUsuNumcad() {
		return this.usuNumcad;
	}

	public void setUsuNumcad(Integer usuNumcad) {
		this.usuNumcad = usuNumcad;
	}

	@Column(name = "USU_DATASA", length = 29)
	public Date getUsuDatasa() {
		return this.usuDatasa;
	}

	public void setUsuDatasa(Date usuDatasa) {
		this.usuDatasa = usuDatasa;
	}

	@Column(name = "USU_HORASA")
	public Integer getUsuHorasa() {
		return this.usuHorasa;
	}

	public void setUsuHorasa(Integer usuHorasa) {
		this.usuHorasa = usuHorasa;
	}

	@Column(name = "USU_HORTER")
	public Integer getUsuHorter() {
		return this.usuHorter;
	}

	public void setUsuHorter(Integer usuHorter) {
		this.usuHorter = usuHorter;
	}

	@Column(name = "USU_CODSIT")
	public Short getUsuCodsit() {
		return this.usuCodsit;
	}

	public void setUsuCodsit(Short usuCodsit) {
		this.usuCodsit = usuCodsit;
	}

	@Column(name = "USU_EMPAUT")
	public Short getUsuEmpaut() {
		return this.usuEmpaut;
	}

	public void setUsuEmpaut(Short usuEmpaut) {
		this.usuEmpaut = usuEmpaut;
	}

	@Column(name = "USU_TCLAUT")
	public Short getUsuTclaut() {
		return this.usuTclaut;
	}

	public void setUsuTclaut(Short usuTclaut) {
		this.usuTclaut = usuTclaut;
	}

	@Column(name = "USU_CADAUT")
	public Integer getUsuCadaut() {
		return this.usuCadaut;
	}

	public void setUsuCadaut(Integer usuCadaut) {
		this.usuCadaut = usuCadaut;
	}

	@Column(name = "USU_CODUSU")
	public Integer getUsuCodusu() {
		return this.usuCodusu;
	}

	public void setUsuCodusu(Integer usuCodusu) {
		this.usuCodusu = usuCodusu;
	}

	@Column(name = "USU_STAACC")
	public Short getUsuStaacc() {
		return this.usuStaacc;
	}

	public void setUsuStaacc(Short usuStaacc) {
		this.usuStaacc = usuStaacc;
	}

	@Column(name = "USU_SITREL", length = 2)
	@Length(max = 2)
	public String getUsuSitrel() {
		return this.usuSitrel;
	}

	public void setUsuSitrel(String usuSitrel) {
		this.usuSitrel = usuSitrel;
	}

	@Column(name = "USU_JN_USU", length = 30)
	@Length(max = 30)
	public String getUsuJnUsu() {
		return this.usuJnUsu;
	}

	public void setUsuJnUsu(String usuJnUsu) {
		this.usuJnUsu = usuJnUsu;
	}

	@Column(name = "USU_JN_OPER", length = 3)
	@Length(max = 3)
	public String getUsuJnOper() {
		return this.usuJnOper;
	}

	public void setUsuJnOper(String usuJnOper) {
		this.usuJnOper = usuJnOper;
	}

	@Column(name = "USU_JN_DATA", length = 29)
	public Date getUsuJnData() {
		return this.usuJnData;
	}

	public void setUsuJnData(Date usuJnData) {
		this.usuJnData = usuJnData;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getUsuNumemp());
		umHashCodeBuilder.append(this.getUsuTipcol());
		umHashCodeBuilder.append(this.getUsuNumcad());
		umHashCodeBuilder.append(this.getUsuStaacc());
		umHashCodeBuilder.append(this.getUsuJnUsu());
		umHashCodeBuilder.append(this.getUsuJnOper());
		umHashCodeBuilder.append(this.getUsuJnData());
		umHashCodeBuilder.append(this.getUsuHorter());
		umHashCodeBuilder.append(this.getUsuDatasa());
		umHashCodeBuilder.append(this.getUsuHorasa());
		umHashCodeBuilder.append(this.getUsuCodsit());
		umHashCodeBuilder.append(this.getUsuEmpaut());
		umHashCodeBuilder.append(this.getUsuTclaut());
		umHashCodeBuilder.append(this.getUsuCadaut());
		umHashCodeBuilder.append(this.getUsuCodusu());
		umHashCodeBuilder.append(this.getUsuSitrel());
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
		if (!(obj instanceof UsuTr064asaId)) {
			return false;
		}
		UsuTr064asaId other = (UsuTr064asaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getUsuNumemp(), other.getUsuNumemp());
		umEqualsBuilder.append(this.getUsuTipcol(), other.getUsuTipcol());
		umEqualsBuilder.append(this.getUsuNumcad(), other.getUsuNumcad());
		umEqualsBuilder.append(this.getUsuStaacc(), other.getUsuStaacc());
		umEqualsBuilder.append(this.getUsuJnUsu(), other.getUsuJnUsu());
		umEqualsBuilder.append(this.getUsuJnOper(), other.getUsuJnOper());
		umEqualsBuilder.append(this.getUsuJnData(), other.getUsuJnData());
		umEqualsBuilder.append(this.getUsuHorter(), other.getUsuHorter());
		umEqualsBuilder.append(this.getUsuDatasa(), other.getUsuDatasa());
		umEqualsBuilder.append(this.getUsuHorasa(), other.getUsuHorasa());
		umEqualsBuilder.append(this.getUsuCodsit(), other.getUsuCodsit());
		umEqualsBuilder.append(this.getUsuEmpaut(), other.getUsuEmpaut());
		umEqualsBuilder.append(this.getUsuTclaut(), other.getUsuTclaut());
		umEqualsBuilder.append(this.getUsuCadaut(), other.getUsuCadaut());
		umEqualsBuilder.append(this.getUsuCodusu(), other.getUsuCodusu());
		umEqualsBuilder.append(this.getUsuSitrel(), other.getUsuSitrel());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
