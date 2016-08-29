package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * McoBolsaRotaJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mcoBolsaJn", sequenceName="AGH.mco_bsr_jn_seq", allocationSize = 1)
@Table(name = "MCO_BOLSA_ROTAS_JN", schema = "AGH")
@Immutable
public class McoBolsaRotasJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = 5074996267873173192L;
	private Date dthrRompimento;
	private String formaRuptura;
	private Boolean indAmnioscopia;
	private String liquidoAmniotico;
	private Boolean indOdorFetido;
	private Date criadoEm;
	private Short gsoSeqp;
	private Integer gsoPacCodigo;
	private Integer serMatricula;
	private Short serVinCodigo;

	public McoBolsaRotasJn() {
	}

	public McoBolsaRotasJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Short gsoSeqp, Integer gsoPacCodigo) {
		this.gsoSeqp = gsoSeqp;
		this.gsoPacCodigo = gsoPacCodigo;
	}

	public McoBolsaRotasJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Date dthrRompimento, String formaRuptura,
			Boolean indAmnioscopia, String liquidoAmniotico, Boolean indOdorFetido, Date criadoEm, Short gsoSeqp, Integer gsoPacCodigo,
			Integer serMatricula, Short serVinCodigo) {
		this.dthrRompimento = dthrRompimento;
		this.formaRuptura = formaRuptura;
		this.indAmnioscopia = indAmnioscopia;
		this.liquidoAmniotico = liquidoAmniotico;
		this.indOdorFetido = indOdorFetido;
		this.criadoEm = criadoEm;
		this.gsoSeqp = gsoSeqp;
		this.gsoPacCodigo = gsoPacCodigo;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mcoBolsaJn")
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@NotNull
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_ROMPIMENTO", length = 29)
	public Date getDthrRompimento() {
		return this.dthrRompimento;
	}

	public void setDthrRompimento(Date dthrRompimento) {
		this.dthrRompimento = dthrRompimento;
	}

	@Column(name = "FORMA_RUPTURA", length = 15)
	@Length(max = 15)
	public String getFormaRuptura() {
		return this.formaRuptura;
	}

	public void setFormaRuptura(String formaRuptura) {
		this.formaRuptura = formaRuptura;
	}

	@Column(name = "IND_AMNIOSCOPIA")
	@Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndAmnioscopia() {
		return this.indAmnioscopia;
	}

	public void setIndAmnioscopia(Boolean indAmnioscopia) {
		this.indAmnioscopia = indAmnioscopia;
	}

	@Column(name = "LIQUIDO_AMNIOTICO", length = 2)
	@Length(max = 2)
	public String getLiquidoAmniotico() {
		return this.liquidoAmniotico;
	}

	public void setLiquidoAmniotico(String liquidoAmniotico) {
		this.liquidoAmniotico = liquidoAmniotico;
	}

	@Column(name = "IND_ODOR_FETIDO", length = 1)
	@Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndOdorFetido() {
		return this.indOdorFetido;
	}

	public void setIndOdorFetido(Boolean indOdorFetido) {
		this.indOdorFetido = indOdorFetido;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "GSO_SEQP", nullable = false)
	public Short getGsoSeqp() {
		return this.gsoSeqp;
	}

	public void setGsoSeqp(Short gsoSeqp) {
		this.gsoSeqp = gsoSeqp;
	}

	@Column(name = "GSO_PAC_CODIGO", nullable = false)
	public Integer getGsoPacCodigo() {
		return this.gsoPacCodigo;
	}

	public void setGsoPacCodigo(Integer gsoPacCodigo) {
		this.gsoPacCodigo = gsoPacCodigo;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	public enum Fields {
 
		DTHR_ROMPIMENTO("dthrRompimento"),
		FORMA_RUPTURA("formaRuptura"),
		IND_AMNIOSCOPIA("indAmnioscopia"),
		LIQUIDO_AMNIOTICO("liquidoAmniotico"),
		IND_ODOR_FETIDO("indOdorFetido"),
		CRIADO_EM("criadoEm"),
		GSO_SEQP("gsoSeqp"),
		GSO_PAC_CODIGO("gsoPacCodigo"),
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