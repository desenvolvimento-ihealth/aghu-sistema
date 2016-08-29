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
 * CseControleExpiracaoRmId generated by hbm2java
 */
@Embeddable
public class CseControleExpiracaoRmId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2271208582814272768L;
	private String usrId;
	private Date dtAvisoExpiracao;
	private Date dtEnvioEmail;
	private Date dtMensagemAgh;
	private Integer version;

	public CseControleExpiracaoRmId() {
	}

	public CseControleExpiracaoRmId(String usrId, Date dtAvisoExpiracao, Integer version) {
		this.usrId = usrId;
		this.dtAvisoExpiracao = dtAvisoExpiracao;
		this.version = version;
	}

	public CseControleExpiracaoRmId(String usrId, Date dtAvisoExpiracao, Date dtEnvioEmail, Date dtMensagemAgh, Integer version) {
		this.usrId = usrId;
		this.dtAvisoExpiracao = dtAvisoExpiracao;
		this.dtEnvioEmail = dtEnvioEmail;
		this.dtMensagemAgh = dtMensagemAgh;
		this.version = version;
	}

	@Column(name = "USR_ID", nullable = false, length = 30)
	@Length(max = 30)
	public String getUsrId() {
		return this.usrId;
	}

	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}

	@Column(name = "DT_AVISO_EXPIRACAO", nullable = false, length = 29)
	public Date getDtAvisoExpiracao() {
		return this.dtAvisoExpiracao;
	}

	public void setDtAvisoExpiracao(Date dtAvisoExpiracao) {
		this.dtAvisoExpiracao = dtAvisoExpiracao;
	}

	@Column(name = "DT_ENVIO_EMAIL", length = 29)
	public Date getDtEnvioEmail() {
		return this.dtEnvioEmail;
	}

	public void setDtEnvioEmail(Date dtEnvioEmail) {
		this.dtEnvioEmail = dtEnvioEmail;
	}

	@Column(name = "DT_MENSAGEM_AGH", length = 29)
	public Date getDtMensagemAgh() {
		return this.dtMensagemAgh;
	}

	public void setDtMensagemAgh(Date dtMensagemAgh) {
		this.dtMensagemAgh = dtMensagemAgh;
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
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getUsrId());
		umHashCodeBuilder.append(this.getDtAvisoExpiracao());
		umHashCodeBuilder.append(this.getDtEnvioEmail());
		umHashCodeBuilder.append(this.getDtMensagemAgh());
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
		if (!(obj instanceof CseControleExpiracaoRmId)) {
			return false;
		}
		CseControleExpiracaoRmId other = (CseControleExpiracaoRmId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getUsrId(), other.getUsrId());
		umEqualsBuilder.append(this.getDtAvisoExpiracao(), other.getDtAvisoExpiracao());
		umEqualsBuilder.append(this.getDtEnvioEmail(), other.getDtEnvioEmail());
		umEqualsBuilder.append(this.getDtMensagemAgh(), other.getDtMensagemAgh());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}