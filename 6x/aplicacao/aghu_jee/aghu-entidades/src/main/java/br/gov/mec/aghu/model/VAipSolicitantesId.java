package br.gov.mec.aghu.model;

// Generated 09/03/2010 15:35:59 by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * VAipSolicitantesId generated by hbm2java
 * 
 * @author Ricardo Costa
 */
@Embeddable
public class VAipSolicitantesId implements EntityCompositeId {

	/**
	 * serialVersionUID.
	 */
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1461959316942212261L;

	/**
	 * seq.
	 */
	private Short seq;

	/**
	 * descricao.
	 */
	private String descricao;

	/**
	 * separacaoPrevia.
	 */
	private String separacaoPrevia;

	/**
	 * volumesManuseados.
	 */
	private String volumesManuseados;

	/**
	 * indSituacao.
	 */
	private String indSituacao;

	/**
	 * unfSeq.
	 */
	private Short unfSeq;

	/**
	 * oevSeq.
	 */
	private Byte oevSeq;

	/**
	 * fmvSeq.
	 */
	private Short fmvSeq;

	/**
	 * mensagemSamis.
	 */
	private String mensagemSamis;

	/**
	 * Construtor.
	 */
	public VAipSolicitantesId() {
	}

	/**
	 * Construtor.
	 * 
	 * @param seq
	 * @param separacaoPrevia
	 * @param volumesManuseados
	 * @param indSituacao
	 * @param mensagemSamis
	 */
	public VAipSolicitantesId(Short seq, String separacaoPrevia,
			String volumesManuseados, String indSituacao, String mensagemSamis) {
		this.separacaoPrevia = separacaoPrevia;
		this.volumesManuseados = volumesManuseados;
		this.indSituacao = indSituacao;
		this.mensagemSamis = mensagemSamis;
	}

	/**
	 * Construtor.
	 * 
	 * @param seq
	 * @param descricao
	 * @param separacaoPrevia
	 * @param volumesManuseados
	 * @param indSituacao
	 * @param unfSeq
	 * @param oevSeq
	 * @param fmvSeq
	 * @param mensagemSamis
	 */
	public VAipSolicitantesId(Short seq, String descricao,
			String separacaoPrevia, String volumesManuseados,
			String indSituacao, Short unfSeq, Byte oevSeq, Short fmvSeq,
			String mensagemSamis) {
		this.descricao = descricao;
		this.separacaoPrevia = separacaoPrevia;
		this.volumesManuseados = volumesManuseados;
		this.indSituacao = indSituacao;
		this.unfSeq = unfSeq;
		this.oevSeq = oevSeq;
		this.fmvSeq = fmvSeq;
		this.mensagemSamis = mensagemSamis;
	}

	@Column(name = "SEQ", precision = 4, scale = 0)
	public Short getSeq() {
		return seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
	}

	@Column(name = "DESCRICAO", length = 67)
	@Length(max = 67)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "SEPARACAO_PREVIA", nullable = false, length = 1)
	@Length(max = 1)
	public String getSeparacaoPrevia() {
		return this.separacaoPrevia;
	}

	public void setSeparacaoPrevia(String separacaoPrevia) {
		this.separacaoPrevia = separacaoPrevia;
	}

	@Column(name = "VOLUMES_MANUSEADOS", nullable = false, length = 1)
	@Length(max = 1)
	public String getVolumesManuseados() {
		return this.volumesManuseados;
	}

	public void setVolumesManuseados(String volumesManuseados) {
		this.volumesManuseados = volumesManuseados;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "UNF_SEQ", precision = 4, scale = 0)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "OEV_SEQ", precision = 2, scale = 0)
	public Byte getOevSeq() {
		return this.oevSeq;
	}

	public void setOevSeq(Byte oevSeq) {
		this.oevSeq = oevSeq;
	}

	@Column(name = "FMV_SEQ", precision = 4, scale = 0)
	public Short getFmvSeq() {
		return this.fmvSeq;
	}

	public void setFmvSeq(Short fmvSeq) {
		this.fmvSeq = fmvSeq;
	}

	@Column(name = "MENSAGEM_SAMIS", nullable = false, length = 1)
	@Length(max = 1)
	public String getMensagemSamis() {
		return this.mensagemSamis;
	}

	public void setMensagemSamis(String mensagemSamis) {
		this.mensagemSamis = mensagemSamis;
	}
	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getIndSituacao());
		umHashCodeBuilder.append(this.getDescricao());
		umHashCodeBuilder.append(this.getSeq());
		umHashCodeBuilder.append(this.getUnfSeq());
		umHashCodeBuilder.append(this.getSeparacaoPrevia());
		umHashCodeBuilder.append(this.getVolumesManuseados());
		umHashCodeBuilder.append(this.getOevSeq());
		umHashCodeBuilder.append(this.getFmvSeq());
		umHashCodeBuilder.append(this.getMensagemSamis());
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
		if (!(obj instanceof VAipSolicitantesId)) {
			return false;
		}
		VAipSolicitantesId other = (VAipSolicitantesId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getIndSituacao(), other.getIndSituacao());
		umEqualsBuilder.append(this.getDescricao(), other.getDescricao());
		umEqualsBuilder.append(this.getSeq(), other.getSeq());
		umEqualsBuilder.append(this.getUnfSeq(), other.getUnfSeq());
		umEqualsBuilder.append(this.getSeparacaoPrevia(), other.getSeparacaoPrevia());
		umEqualsBuilder.append(this.getVolumesManuseados(), other.getVolumesManuseados());
		umEqualsBuilder.append(this.getOevSeq(), other.getOevSeq());
		umEqualsBuilder.append(this.getFmvSeq(), other.getFmvSeq());
		umEqualsBuilder.append(this.getMensagemSamis(), other.getMensagemSamis());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}