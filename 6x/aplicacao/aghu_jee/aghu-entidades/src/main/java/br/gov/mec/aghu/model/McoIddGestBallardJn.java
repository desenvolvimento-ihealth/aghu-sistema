package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * McoIddGestBallardJn generated by hbm2java
 */
@Entity
@Table(name = "MCO_IDD_GEST_BALLARDS_JN", schema = "AGH")
@Immutable
public class McoIddGestBallardJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = -4850696851847778785L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Short postura;
	private Short flexaoPunho;
	private Short flexaoBraco;
	private Short anguloPopliteo;
	private Short sinalDoXale;
	private Short calcanharOrelha;
	private Short pele;
	private Short lanugo;
	private Short superficiePlantar;
	private Short seio;
	private Short olhoOrelha;
	private Short genitaisMasculinos;
	private Short genitaisFemininos;
	private Date criadoEm;
	private Short escoreBallard;
	private Short igSemanas;
	private String igTexto;
	private Integer pacCodigo;
	private Integer serMatricula;
	private Short serVinCodigo;

	public McoIddGestBallardJn() {
	}

	public McoIddGestBallardJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer pacCodigo, Integer serMatricula,
			Short serVinCodigo) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.pacCodigo = pacCodigo;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	public McoIddGestBallardJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Short postura, Short flexaoPunho,
			Short flexaoBraco, Short anguloPopliteo, Short sinalDoXale, Short calcanharOrelha, Short pele, Short lanugo,
			Short superficiePlantar, Short seio, Short olhoOrelha, Short genitaisMasculinos, Short genitaisFemininos, Date criadoEm,
			Short escoreBallard, Short igSemanas, String igTexto, Integer pacCodigo, Integer serMatricula, Short serVinCodigo) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.postura = postura;
		this.flexaoPunho = flexaoPunho;
		this.flexaoBraco = flexaoBraco;
		this.anguloPopliteo = anguloPopliteo;
		this.sinalDoXale = sinalDoXale;
		this.calcanharOrelha = calcanharOrelha;
		this.pele = pele;
		this.lanugo = lanugo;
		this.superficiePlantar = superficiePlantar;
		this.seio = seio;
		this.olhoOrelha = olhoOrelha;
		this.genitaisMasculinos = genitaisMasculinos;
		this.genitaisFemininos = genitaisFemininos;
		this.criadoEm = criadoEm;
		this.escoreBallard = escoreBallard;
		this.igSemanas = igSemanas;
		this.igTexto = igTexto;
		this.pacCodigo = pacCodigo;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}
	// ATUALIZADOR JOURNALS - ID
	
/* ATUALIZADOR JOURNALS - Get / Set	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	public Long getSeqJn() {
		return this.seqJn;
	}

	public void setSeqJn(Long seqJn) {
		this.seqJn = seqJn;
	}

	@Column(name = "JN_USER", nullable = false, length = 30)
	@Length(max = 30)
	public String getJnUser() {
		return this.jnUser;
	}

	public void setJnUser(String jnUser) {
		this.jnUser = jnUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JN_DATE_TIME", nullable = false, length = 29)
	public Date getJnDateTime() {
		return this.jnDateTime;
	}

	public void setJnDateTime(Date jnDateTime) {
		this.jnDateTime = jnDateTime;
	}

	@Column(name = "JN_OPERATION", nullable = false, length = 3)
	@Length(max = 3)
	public String getJnOperation() {
		return this.jnOperation;
	}

	public void setJnOperation(String jnOperation) {
		this.jnOperation = jnOperation;
	}*/

	@Column(name = "POSTURA")
	public Short getPostura() {
		return this.postura;
	}

	public void setPostura(Short postura) {
		this.postura = postura;
	}

	@Column(name = "FLEXAO_PUNHO")
	public Short getFlexaoPunho() {
		return this.flexaoPunho;
	}

	public void setFlexaoPunho(Short flexaoPunho) {
		this.flexaoPunho = flexaoPunho;
	}

	@Column(name = "FLEXAO_BRACO")
	public Short getFlexaoBraco() {
		return this.flexaoBraco;
	}

	public void setFlexaoBraco(Short flexaoBraco) {
		this.flexaoBraco = flexaoBraco;
	}

	@Column(name = "ANGULO_POPLITEO")
	public Short getAnguloPopliteo() {
		return this.anguloPopliteo;
	}

	public void setAnguloPopliteo(Short anguloPopliteo) {
		this.anguloPopliteo = anguloPopliteo;
	}

	@Column(name = "SINAL_DO_XALE")
	public Short getSinalDoXale() {
		return this.sinalDoXale;
	}

	public void setSinalDoXale(Short sinalDoXale) {
		this.sinalDoXale = sinalDoXale;
	}

	@Column(name = "CALCANHAR_ORELHA")
	public Short getCalcanharOrelha() {
		return this.calcanharOrelha;
	}

	public void setCalcanharOrelha(Short calcanharOrelha) {
		this.calcanharOrelha = calcanharOrelha;
	}

	@Column(name = "PELE")
	public Short getPele() {
		return this.pele;
	}

	public void setPele(Short pele) {
		this.pele = pele;
	}

	@Column(name = "LANUGO")
	public Short getLanugo() {
		return this.lanugo;
	}

	public void setLanugo(Short lanugo) {
		this.lanugo = lanugo;
	}

	@Column(name = "SUPERFICIE_PLANTAR")
	public Short getSuperficiePlantar() {
		return this.superficiePlantar;
	}

	public void setSuperficiePlantar(Short superficiePlantar) {
		this.superficiePlantar = superficiePlantar;
	}

	@Column(name = "SEIO")
	public Short getSeio() {
		return this.seio;
	}

	public void setSeio(Short seio) {
		this.seio = seio;
	}

	@Column(name = "OLHO_ORELHA")
	public Short getOlhoOrelha() {
		return this.olhoOrelha;
	}

	public void setOlhoOrelha(Short olhoOrelha) {
		this.olhoOrelha = olhoOrelha;
	}

	@Column(name = "GENITAIS_MASCULINOS")
	public Short getGenitaisMasculinos() {
		return this.genitaisMasculinos;
	}

	public void setGenitaisMasculinos(Short genitaisMasculinos) {
		this.genitaisMasculinos = genitaisMasculinos;
	}

	@Column(name = "GENITAIS_FEMININOS")
	public Short getGenitaisFemininos() {
		return this.genitaisFemininos;
	}

	public void setGenitaisFemininos(Short genitaisFemininos) {
		this.genitaisFemininos = genitaisFemininos;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "ESCORE_BALLARD")
	public Short getEscoreBallard() {
		return this.escoreBallard;
	}

	public void setEscoreBallard(Short escoreBallard) {
		this.escoreBallard = escoreBallard;
	}

	@Column(name = "IG_SEMANAS")
	public Short getIgSemanas() {
		return this.igSemanas;
	}

	public void setIgSemanas(Short igSemanas) {
		this.igSemanas = igSemanas;
	}

	@Column(name = "IG_TEXTO", length = 60)
	@Length(max = 60)
	public String getIgTexto() {
		return this.igTexto;
	}

	public void setIgTexto(String igTexto) {
		this.igTexto = igTexto;
	}

	@Column(name = "PAC_CODIGO", nullable = false)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "SER_MATRICULA", nullable = false)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		POSTURA("postura"),
		FLEXAO_PUNHO("flexaoPunho"),
		FLEXAO_BRACO("flexaoBraco"),
		ANGULO_POPLITEO("anguloPopliteo"),
		SINAL_DO_XALE("sinalDoXale"),
		CALCANHAR_ORELHA("calcanharOrelha"),
		PELE("pele"),
		LANUGO("lanugo"),
		SUPERFICIE_PLANTAR("superficiePlantar"),
		SEIO("seio"),
		OLHO_ORELHA("olhoOrelha"),
		GENITAIS_MASCULINOS("genitaisMasculinos"),
		GENITAIS_FEMININOS("genitaisFemininos"),
		CRIADO_EM("criadoEm"),
		ESCORE_BALLARD("escoreBallard"),
		IG_SEMANAS("igSemanas"),
		IG_TEXTO("igTexto"),
		PAC_CODIGO("pacCodigo"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}

}