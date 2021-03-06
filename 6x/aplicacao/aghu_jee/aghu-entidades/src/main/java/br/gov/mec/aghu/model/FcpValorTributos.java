package br.gov.mec.aghu.model;

// Generated 05/11/2011 15:09:03 by Hibernate Tools 3.4.0.CR1

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


import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FcpValorTributos generated by hbm2java
 */
@Entity
@Table(name = "FCP_VALOR_TRIBUTOS", schema = "AGH")
public class FcpValorTributos extends BaseEntityId<FcpValorTributosId> implements java.io.Serializable {	/**
	 * 
	 */
	private static final long serialVersionUID = 4798935159511695626L;
private FcpValorTributosId id;
	private Integer version;
	private Integer friCodigo;
	private Double valor;
	private Date criadoEm;
	private Date alteradoEm;
	private RapServidores rapServidores;
	private Boolean indLiberado;
	private String codDeducao;
	private FcpRetencaoAliquota retencaoAliquota;
	private SceNotaRecebimento notaRecebimento;
	
	public enum Fields {
		NOTA_RECEBIMENTO("notaRecebimento"),
		ID("id"),
		FAR_IMPOSTO("id.farImposto"),
		VALOR("valor"),
		INS_NRS_SEQ("id.inrNrsSeq"),
		TTL_SEQ("id.ttlSeq"),
		RETENCAO_ALIQUOTA("retencaoAliquota");
		
		private String field;

		private Fields(String field) {
			this.field = field;
		}

		@Override
		public String toString() {
			return this.field;
		}
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "inrNrsSeq", column = @Column(name = "INR_NRS_SEQ", nullable = false)),
			@AttributeOverride(name = "inrIafAfnNumero", column = @Column(name = "INR_IAF_AFN_NUMERO", nullable = false)),
			@AttributeOverride(name = "inrIafNumero", column = @Column(name = "INR_IAF_NUMERO", nullable = false)),
			@AttributeOverride(name = "farFriCodigo", column = @Column(name = "FAR_FRI_CODIGO", nullable = false)),
			@AttributeOverride(name = "farImposto", column = @Column(name = "FAR_IMPOSTO", nullable = false, length = 10)),
			@AttributeOverride(name = "farNumero", column = @Column(name = "FAR_NUMERO", nullable = false)),
			@AttributeOverride(name = "farDtInicioValidade", column = @Column(name = "FAR_DT_INICIO_VALIDADE", nullable = false, length = 29)),
			@AttributeOverride(name = "ttlSeq", column = @Column(name = "TTL_SEQ", nullable = false)) })
	public FcpValorTributosId getId() {
		return this.id;
	}

	public void setId(FcpValorTributosId id) {
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

	@Column(name = "FRI_CODIGO", nullable = false)
	public Integer getFriCodigo() {
		return this.friCodigo;
	}

	public void setFriCodigo(Integer friCodigo) {
		this.friCodigo = friCodigo;
	}

	@Column(name = "VALOR", nullable = false, precision = 17, scale = 17)
	public Double getValor() {
		return this.valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
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
	@Column(name = "ALTERADO_EM", nullable = false, length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@ManyToOne
	@JoinColumns({
			@JoinColumn(name="SER_MATRICULA", referencedColumnName="MATRICULA"),
			@JoinColumn(name="SER_VIN_CODIGO", referencedColumnName="VIN_CODIGO")
			})
	public RapServidores getRapServidores() {
		return rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}
	
	

	@Column(name = "IND_LIBERADO", length = 1)
	@Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndLiberado() {
		return this.indLiberado;
	}

	public void setIndLiberado(Boolean indLiberado) {
		this.indLiberado = indLiberado;
	}

	@Column(name = "COD_DEDUCAO", length = 4)
	@Length(max = 4)
	public String getCodDeducao() {
		return this.codDeducao;
	}

	public void setCodDeducao(String codDeducao) {
		this.codDeducao = codDeducao;
	}
	
	@ManyToOne
	@JoinColumns({
			@JoinColumn(name="FAR_FRI_CODIGO", referencedColumnName="FRI_CODIGO", insertable=false, updatable=false),
			@JoinColumn(name="FAR_IMPOSTO", referencedColumnName="IMPOSTO", insertable=false, updatable=false),
			@JoinColumn(name="FAR_NUMERO", referencedColumnName="NUMERO", insertable=false, updatable=false),
			@JoinColumn(name="FAR_DT_INICIO_VALIDADE", referencedColumnName="DT_INICIO_VALIDADE", insertable=false, updatable=false)
			})
	public FcpRetencaoAliquota getRetencaoAliquota() {
		return retencaoAliquota;
	}

	public void setRetencaoAliquota(FcpRetencaoAliquota retencaoAliquota) {
		this.retencaoAliquota = retencaoAliquota;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="INR_NRS_SEQ", insertable=false, updatable=false)
	public SceNotaRecebimento getNotaRecebimento() {
		return notaRecebimento;
	}

	public void setNotaRecebimento(SceNotaRecebimento notaRecebimento) {
		this.notaRecebimento = notaRecebimento;
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
		if (!(obj instanceof FcpValorTributos)) {
			return false;
		}
		FcpValorTributos other = (FcpValorTributos) obj;
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
