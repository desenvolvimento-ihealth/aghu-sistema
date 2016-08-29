package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;
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
 * FatPerdaItensConta generated by hbm2java
 */
@Entity
@Table(name = "FAT_PERDA_ITENS_CONTA", schema = "AGH")
public class FatPerdaItemConta extends BaseEntityId<FatPerdaItensContaId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6057807057198109897L;
	private FatPerdaItensContaId id;
	private FatContasHospitalares contaHospitalar;
	private String criadoPor;
	private Date criadoEm;
	private Long iphCodTabela;
	private Short quantidadePerdida;
	private Short quantidadeRealizada;
	private BigDecimal valorSh;
	private BigDecimal valorSp;
	private BigDecimal valorSadt;
	private BigDecimal valorProced;
	private BigDecimal valorAnest;
	private Integer pontosAnest;
	private Integer pontosCirur;
	private Integer pontosSadt;
	private String alteradoPor;
	private Date alteradoEm;
	private FatItensProcedHospitalar itemProcedimentoHospitalar;
	private Integer version;

	public FatPerdaItemConta() {
	}

	public FatPerdaItemConta(FatPerdaItensContaId id, FatContasHospitalares contaHospitalar, String criadoPor,
			Date criadoEm) {
		this.id = id;
		this.contaHospitalar = contaHospitalar;
		this.criadoPor = criadoPor;
		this.criadoEm = criadoEm;
	}

	public FatPerdaItemConta(FatPerdaItensContaId id, FatContasHospitalares contaHospitalar, String criadoPor,
			Date criadoEm, Long iphCodTabela, Short quantidadePerdida,
			Short quantidadeRealizada, BigDecimal valorSh, BigDecimal valorSp,
			BigDecimal valorSadt, BigDecimal valorProced,
			BigDecimal valorAnest, Integer pontosAnest, Integer pontosCirur,
			Integer pontosSadt, String alteradoPor, Date alteradoEm,
			FatItensProcedHospitalar itemProcedimentoHospitalar) {
		this.id = id;
		this.contaHospitalar = contaHospitalar;
		this.criadoPor = criadoPor;
		this.criadoEm = criadoEm;
		this.iphCodTabela = iphCodTabela;
		this.quantidadePerdida = quantidadePerdida;
		this.quantidadeRealizada = quantidadeRealizada;
		this.valorSh = valorSh;
		this.valorSp = valorSp;
		this.valorSadt = valorSadt;
		this.valorProced = valorProced;
		this.valorAnest = valorAnest;
		this.pontosAnest = pontosAnest;
		this.pontosCirur = pontosCirur;
		this.pontosSadt = pontosSadt;
		this.alteradoPor = alteradoPor;
		this.alteradoEm = alteradoEm;
		this.itemProcedimentoHospitalar = itemProcedimentoHospitalar;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "cthSeq", column = @Column(name = "CTH_SEQ", nullable = false, precision = 8, scale = 0)) })
	public FatPerdaItensContaId getId() {
		return this.id;
	}

	public void setId(FatPerdaItensContaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CTH_SEQ", nullable = false, insertable = false, updatable = false)
	public FatContasHospitalares getContaHospitalar() {
		return contaHospitalar;
	}

	public void setContaHospitalar(FatContasHospitalares contaHospitalar) {
		this.contaHospitalar = contaHospitalar;
	}

	@Column(name = "CRIADO_POR", nullable = false, length = 30)
	@Length(max = 30)
	public String getCriadoPor() {
		return this.criadoPor;
	}

	public void setCriadoPor(String criadoPor) {
		this.criadoPor = criadoPor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IPH_COD_TABELA", precision = 10, scale = 0)
	public Long getIphCodTabela() {
		return this.iphCodTabela;
	}

	public void setIphCodTabela(Long iphCodTabela) {
		this.iphCodTabela = iphCodTabela;
	}

	@Column(name = "QUANTIDADE_PERDIDA", precision = 4, scale = 0)
	public Short getQuantidadePerdida() {
		return this.quantidadePerdida;
	}

	public void setQuantidadePerdida(Short quantidadePerdida) {
		this.quantidadePerdida = quantidadePerdida;
	}

	@Column(name = "QUANTIDADE_REALIZADA", precision = 4, scale = 0)
	public Short getQuantidadeRealizada() {
		return this.quantidadeRealizada;
	}

	public void setQuantidadeRealizada(Short quantidadeRealizada) {
		this.quantidadeRealizada = quantidadeRealizada;
	}

	@Column(name = "VALOR_SH", precision = 14)
	public BigDecimal getValorSh() {
		return this.valorSh;
	}

	public void setValorSh(BigDecimal valorSh) {
		this.valorSh = valorSh;
	}

	@Column(name = "VALOR_SP", precision = 14)
	public BigDecimal getValorSp() {
		return this.valorSp;
	}

	public void setValorSp(BigDecimal valorSp) {
		this.valorSp = valorSp;
	}

	@Column(name = "VALOR_SADT", precision = 14)
	public BigDecimal getValorSadt() {
		return this.valorSadt;
	}

	public void setValorSadt(BigDecimal valorSadt) {
		this.valorSadt = valorSadt;
	}

	@Column(name = "VALOR_PROCED", precision = 14)
	public BigDecimal getValorProced() {
		return this.valorProced;
	}

	public void setValorProced(BigDecimal valorProced) {
		this.valorProced = valorProced;
	}

	@Column(name = "VALOR_ANEST", precision = 14)
	public BigDecimal getValorAnest() {
		return this.valorAnest;
	}

	public void setValorAnest(BigDecimal valorAnest) {
		this.valorAnest = valorAnest;
	}

	@Column(name = "PONTOS_ANEST", precision = 5, scale = 0)
	public Integer getPontosAnest() {
		return this.pontosAnest;
	}

	public void setPontosAnest(Integer pontosAnest) {
		this.pontosAnest = pontosAnest;
	}

	@Column(name = "PONTOS_CIRUR", precision = 5, scale = 0)
	public Integer getPontosCirur() {
		return this.pontosCirur;
	}

	public void setPontosCirur(Integer pontosCirur) {
		this.pontosCirur = pontosCirur;
	}

	@Column(name = "PONTOS_SADT", precision = 5, scale = 0)
	public Integer getPontosSadt() {
		return this.pontosSadt;
	}

	public void setPontosSadt(Integer pontosSadt) {
		this.pontosSadt = pontosSadt;
	}

	@Column(name = "ALTERADO_POR", length = 30)
	@Length(max = 30)
	public String getAlteradoPor() {
		return this.alteradoPor;
	}

	public void setAlteradoPor(String alteradoPor) {
		this.alteradoPor = alteradoPor;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
		@JoinColumn(name = "IPH_SEQ", referencedColumnName = "SEQ"),
		@JoinColumn(name = "IPH_PHO_SEQ", referencedColumnName = "PHO_SEQ")})
	public FatItensProcedHospitalar getItemProcedimentoHospitalar() {
		return itemProcedimentoHospitalar;
	}

	public void setItemProcedimentoHospitalar(
			FatItensProcedHospitalar itemProcedimentoHospitalar) {
		this.itemProcedimentoHospitalar = itemProcedimentoHospitalar;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		FatPerdaItemConta other = (FatPerdaItemConta) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	
	public enum Fields {
		
		CTH_SEQ("id.cthSeq"),
		SEQP("id.seqp"),
		COD_TABELA("iphCodTabela"),
		ITEM_PROCEDIMENTO_HOSPITALAR("itemProcedimentoHospitalar"),
		QUANTIDADE_PERDIDA("quantidadePerdida"),
		VALOR_SH("valorSh"),
		VALOR_SP("valorSp"),
		VALOR_SADT("valorSadt"),
		VALOR_PROCED("valorProced"),
		VALOR_ANEST("valorAnest")
		;

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