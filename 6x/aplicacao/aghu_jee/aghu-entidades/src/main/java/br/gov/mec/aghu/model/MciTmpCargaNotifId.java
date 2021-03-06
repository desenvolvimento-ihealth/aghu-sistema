package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MciTmpCargaNotifId generated by hbm2java
 */
@Embeddable
public class MciTmpCargaNotifId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4185870847379212375L;
	private Date data;
	private Integer prontuario;
	private Short porSeq;
	private Date dtInicioNotif;
	private Date dtFimNotif;
	private Short qtDiasNotifTot;
	private Short unfSeq;
	private Short qtDiasNotif;
	private Integer intSeq;
	private Integer version;

	public MciTmpCargaNotifId() {
	}

	public MciTmpCargaNotifId(Date data, Integer prontuario, Short porSeq, Date dtInicioNotif, Short qtDiasNotifTot, Integer intSeq,
			Integer version) {
		this.data = data;
		this.prontuario = prontuario;
		this.porSeq = porSeq;
		this.dtInicioNotif = dtInicioNotif;
		this.qtDiasNotifTot = qtDiasNotifTot;
		this.intSeq = intSeq;
		this.version = version;
	}

	public MciTmpCargaNotifId(Date data, Integer prontuario, Short porSeq, Date dtInicioNotif, Date dtFimNotif, Short qtDiasNotifTot,
			Short unfSeq, Short qtDiasNotif, Integer intSeq, Integer version) {
		this.data = data;
		this.prontuario = prontuario;
		this.porSeq = porSeq;
		this.dtInicioNotif = dtInicioNotif;
		this.dtFimNotif = dtFimNotif;
		this.qtDiasNotifTot = qtDiasNotifTot;
		this.unfSeq = unfSeq;
		this.qtDiasNotif = qtDiasNotif;
		this.intSeq = intSeq;
		this.version = version;
	}

	@Column(name = "DATA", nullable = false, length = 29)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name = "PRONTUARIO", nullable = false)
	public Integer getProntuario() {
		return this.prontuario;
	}

	public void setProntuario(Integer prontuario) {
		this.prontuario = prontuario;
	}

	@Column(name = "POR_SEQ", nullable = false)
	public Short getPorSeq() {
		return this.porSeq;
	}

	public void setPorSeq(Short porSeq) {
		this.porSeq = porSeq;
	}

	@Column(name = "DT_INICIO_NOTIF", nullable = false, length = 29)
	public Date getDtInicioNotif() {
		return this.dtInicioNotif;
	}

	public void setDtInicioNotif(Date dtInicioNotif) {
		this.dtInicioNotif = dtInicioNotif;
	}

	@Column(name = "DT_FIM_NOTIF", length = 29)
	public Date getDtFimNotif() {
		return this.dtFimNotif;
	}

	public void setDtFimNotif(Date dtFimNotif) {
		this.dtFimNotif = dtFimNotif;
	}

	@Column(name = "QT_DIAS_NOTIF_TOT", nullable = false)
	public Short getQtDiasNotifTot() {
		return this.qtDiasNotifTot;
	}

	public void setQtDiasNotifTot(Short qtDiasNotifTot) {
		this.qtDiasNotifTot = qtDiasNotifTot;
	}

	@Column(name = "UNF_SEQ")
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "QT_DIAS_NOTIF")
	public Short getQtDiasNotif() {
		return this.qtDiasNotif;
	}

	public void setQtDiasNotif(Short qtDiasNotif) {
		this.qtDiasNotif = qtDiasNotif;
	}

	@Column(name = "INT_SEQ", nullable = false)
	public Integer getIntSeq() {
		return this.intSeq;
	}

	public void setIntSeq(Integer intSeq) {
		this.intSeq = intSeq;
	}

	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getProntuario());
		umHashCodeBuilder.append(this.getData());
		umHashCodeBuilder.append(this.getUnfSeq());
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getPorSeq());
		umHashCodeBuilder.append(this.getDtInicioNotif());
		umHashCodeBuilder.append(this.getDtFimNotif());
		umHashCodeBuilder.append(this.getQtDiasNotifTot());
		umHashCodeBuilder.append(this.getQtDiasNotif());
		umHashCodeBuilder.append(this.getIntSeq());
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
		if (!(obj instanceof MciTmpCargaNotifId)) {
			return false;
		}
		MciTmpCargaNotifId other = (MciTmpCargaNotifId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getProntuario(), other.getProntuario());
		umEqualsBuilder.append(this.getData(), other.getData());
		umEqualsBuilder.append(this.getUnfSeq(), other.getUnfSeq());
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getPorSeq(), other.getPorSeq());
		umEqualsBuilder.append(this.getDtInicioNotif(), other.getDtInicioNotif());
		umEqualsBuilder.append(this.getDtFimNotif(), other.getDtFimNotif());
		umEqualsBuilder.append(this.getQtDiasNotifTot(), other.getQtDiasNotifTot());
		umEqualsBuilder.append(this.getQtDiasNotif(), other.getQtDiasNotif());
		umEqualsBuilder.append(this.getIntSeq(), other.getIntSeq());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
