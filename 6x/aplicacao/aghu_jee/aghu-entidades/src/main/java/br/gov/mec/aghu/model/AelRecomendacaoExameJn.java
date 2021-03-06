package br.gov.mec.aghu.model;

// Generated 28/03/2011 10:51:33 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioAbrangenciaGrupoRecomendacao;
import br.gov.mec.aghu.dominio.DominioResponsavelGrupoRecomendacao;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelRecomendacoesExameJn generated by hbm2java
 */

@Entity
@SequenceGenerator(name = "aelRexjJnSq1", sequenceName = "AGH.AEL_REX_jn_seq", allocationSize = 1)
@Table(name = "AEL_RECOMENDACOES_EXAME_JN", schema = "AGH")
@Immutable
public class AelRecomendacaoExameJn extends BaseJournal {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1181135606101958394L;
	private String emaExaSigla;
	private Integer emaManSeq;
	private Integer seqp;
	private String descricao;
	private DominioResponsavelGrupoRecomendacao responsavel;
	private DominioAbrangenciaGrupoRecomendacao abrangencia;
	private Integer serMatriculaAlterado;
	private Short serVinCodigoAlterado;
	private Boolean indAvisaResp;
	
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelRexjJnSq1")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	public AelRecomendacaoExameJn() {
	}

	public AelRecomendacaoExameJn(String emaExaSigla, Integer emaManSeq, Integer seqp) {
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
		this.seqp = seqp;
	}

	public AelRecomendacaoExameJn(String emaExaSigla, Integer emaManSeq, Integer seqp,
			String descricao, DominioResponsavelGrupoRecomendacao responsavel, DominioAbrangenciaGrupoRecomendacao abrangencia,
			Integer serMatriculaAlterado, Short serVinCodigoAlterado,
			Boolean indAvisaResp) {
		this.emaExaSigla = emaExaSigla;
		this.emaManSeq = emaManSeq;
		this.seqp = seqp;
		this.descricao = descricao;
		this.responsavel = responsavel;
		this.abrangencia = abrangencia;
		this.serMatriculaAlterado = serMatriculaAlterado;
		this.serVinCodigoAlterado = serVinCodigoAlterado;
		this.indAvisaResp = indAvisaResp;
	}

	@Column(name = "EMA_EXA_SIGLA", nullable = false, length = 5)
	@Length(max = 5)
	public String getEmaExaSigla() {
		return this.emaExaSigla;
	}

	public void setEmaExaSigla(String emaExaSigla) {
		this.emaExaSigla = emaExaSigla;
	}

	@Column(name = "EMA_MAN_SEQ", nullable = false)
	public Integer getEmaManSeq() {
		return this.emaManSeq;
	}

	public void setEmaManSeq(Integer emaManSeq) {
		this.emaManSeq = emaManSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Integer getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Integer seqp) {
		this.seqp = seqp;
	}

	@Column(name = "DESCRICAO", length = 2000)
	@Length(max = 2000)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "RESPONSAVEL", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioResponsavelGrupoRecomendacao getResponsavel() {
		return this.responsavel;
	}

	public void setResponsavel(DominioResponsavelGrupoRecomendacao responsavel) {
		this.responsavel = responsavel;
	}

	@Column(name = "ABRANGENCIA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioAbrangenciaGrupoRecomendacao getAbrangencia() {
		return this.abrangencia;
	}

	public void setAbrangencia(DominioAbrangenciaGrupoRecomendacao abrangencia) {
		this.abrangencia = abrangencia;
	}

	@Column(name = "SER_MATRICULA_ALTERADO")
	public Integer getSerMatriculaAlterado() {
		return this.serMatriculaAlterado;
	}

	public void setSerMatriculaAlterado(Integer serMatriculaAlterado) {
		this.serMatriculaAlterado = serMatriculaAlterado;
	}

	@Column(name = "SER_VIN_CODIGO_ALTERADO")
	public Short getSerVinCodigoAlterado() {
		return this.serVinCodigoAlterado;
	}

	public void setSerVinCodigoAlterado(Short serVinCodigoAlterado) {
		this.serVinCodigoAlterado = serVinCodigoAlterado;
	}

	@Column(name = "IND_AVISA_RESP", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndAvisaResp() {
		return this.indAvisaResp;
	}

	public void setIndAvisaResp(Boolean indAvisaResp) {
		this.indAvisaResp = indAvisaResp;
	}

	public enum Fields {

		EMA_EXA_SIGLA("emaExaSigla"),
		EMA_MAN_SEQ("emaManSeq"),
		SEQP("seqp"),
		DESCRICAO("descricao"),
		RESPONSAVEL("responsavel"),
		ABRANGENCIA("abrangencia"),
		SER_MATRICULA_ALTERADO("serMatriculaAlterado"),
		SER_VIN_CODIGO_ALTERADO("serVinCodigoAlterado"),
		IND_AVISA_RESP("indAvisaResp");

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
