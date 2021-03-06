package br.gov.mec.aghu.model;

// Generated 11/08/2009 16:20:48 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioIndConcluidaSolicitacaoConsultoria;
import br.gov.mec.aghu.dominio.DominioIndPendenteItemPrescricao;
import br.gov.mec.aghu.dominio.DominioOrigemSolicitacaoConsultoria;
import br.gov.mec.aghu.dominio.DominioSimNao;
import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.dominio.DominioTipoSolicitacaoConsultoria;
import br.gov.mec.aghu.core.exception.BaseRuntimeException;

/**
 * MpmSolicitacaoConsultoria generated by hbm2java
 */
@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})
@Entity
@Table(name = "MPM_SOLICITACAO_CONSULTORIAS", schema = "AGH")
@AssociationOverrides({
	@AssociationOverride(name = "servidorValidaMovimentacao", joinColumns = {
			@JoinColumn(name = "SER_MATRICULA_VALIDA_DESATIVA"),
			@JoinColumn(name = "SER_VIN_CODIGO_VALIDA_DESATIVA") }),
	@AssociationOverride(name = "servidorMovimentado", joinColumns = {
			@JoinColumn(name = "SER_MATRICULA_DESATIVADA"),
			@JoinColumn(name = "SER_VIN_CODIGO_DESATIVADA") })
})
@AttributeOverrides( {
		@AttributeOverride(name = "dthrValida", column = @Column(name = "DTHR_INC_VALIDA")),
		@AttributeOverride(name = "dthrValidaMovimentacao", column = @Column(name = "DTHR_ALT_VALIDA")),
		@AttributeOverride(name = "dthrFim", column = @Column(name = "DTHR_DESATIVACAO")) })
public class MpmSolicitacaoConsultoria extends ItemPrescricaoMedica<MpmSolicitacaoConsultoriaId> implements
		Comparable<MpmSolicitacaoConsultoria> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 215336599399999578L;
	public static final String FIELD_TIPO_CONSULTORIA = "Consultoria";
	public static final String FIELD_TIPO_OUTROS = "Avaliação Pré-Cirúrgica";
	public static final String FIELD_INDICADOR_URGENTE_SIM = "URGENTE em";
	public static final String FIELD_INDICADOR_URGENTE_NAO = "em";

	/**
	 * Chave primária (composta) do banco de dados.
	 */
	private MpmSolicitacaoConsultoriaId id;

	/**
	 * Especialidade relacionada a solicitação de consultoria.
	 */
	private AghEspecialidades especialidade;

	/**
	 * Servidor responsável pela criação desta solicitação de consultoria.
	 */
	private RapServidores servidorCriacao;

	/**
	 * 
	 */
	private RapServidores servidorConsultaVerificacao;

	/**
	 * 
	 */
	private RapServidores servidorRespostaVerificacao;

	/**
	 * Tipo de solicitação de consultoria.
	 */
	private DominioTipoSolicitacaoConsultoria tipo;
	/**
	 * Indica se a solicitação de consultoria é urgente.
	 */
	private DominioSimNao indUrgencia;
	/**
	 * Indica o motivo da solicitação de consultoria.
	 */
	private String motivo;
	/**
	 * Momento em que a solicitação foi efetuada.
	 */
	private Date dthrSolicitada;
	/**
	 * Se a solicitação foi impressa.
	 */
	private DominioSimNao indImpressao;
	/**
	 * Situação da solicitação (Se ativa ou inativa).
	 */
	private DominioSituacao indSituacao;

	/**
	 * 
	 */
	private Date dthrPrimeiraConsulta;
	/**
	 * Momento em que a solicitação foi respondida.
	 */
	private Date dthrResposta;
	/**
	 * 
	 */
	private Date dthrConhecimentoResposta;

	/**
	 * Solicitação de consultoria original. Esse campo é usado quando um usuário
	 * tenta alterar uma solicitação já validada. Neste caso, uma nova
	 * solicitação é criada com os campos alterados, referenciando (através
	 * deste campo) a solicitação anterior.
	 */
	private MpmSolicitacaoConsultoria solicitacaoConsultoriaOriginal;

	/**
	 * Indica o estado da solicitação de consultoria relativamente a sua
	 * conclusão. TODO: diagrama de estados (?)
	 */
	private DominioIndConcluidaSolicitacaoConsultoria indConcluida;
	/**
	 * Indica a origem da solicitação de consultoria.
	 */
	private DominioOrigemSolicitacaoConsultoria origem;
	
	private Set<MpmSolicitacaoConsultoria> solicitacaoConsultorias = new HashSet<MpmSolicitacaoConsultoria>(0);

	public MpmSolicitacaoConsultoria() {
		this.setIndPendente(DominioIndPendenteItemPrescricao.P);
		this.setOrigem(DominioOrigemSolicitacaoConsultoria.M);
		this.setCriadoEm(new Date());
		this.setIndConcluida(DominioIndConcluidaSolicitacaoConsultoria.N);
	}

	public MpmSolicitacaoConsultoria(MpmSolicitacaoConsultoriaId id,
			AghEspecialidades especialidade,
			DominioIndPendenteItemPrescricao indPendente,
			DominioTipoSolicitacaoConsultoria tipo, DominioSimNao indUrgencia,
			String motivo, Date dthrSolicitada, DominioSimNao indImpressao,
			DominioSituacao indSituacao, Date criadoEm,
			DominioIndConcluidaSolicitacaoConsultoria indConcluida,
			RapServidores servidorCriacao) {
		this.id = id;
		this.especialidade = especialidade;
		this.servidorCriacao = servidorCriacao;
		this.indPendente = indPendente;
		this.tipo = tipo;
		this.indUrgencia = indUrgencia;
		this.motivo = motivo;
		this.dthrSolicitada = dthrSolicitada;
		this.indImpressao = indImpressao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.indConcluida = indConcluida;
	}

	public MpmSolicitacaoConsultoria(MpmSolicitacaoConsultoriaId id,
			AghEspecialidades especialidade, RapServidores servidorCriacao,
			RapServidores servidorMovimentado,
			RapServidores servidorConsultaVerificacao,
			RapServidores servidorRespostaVerificacao,
			DominioIndPendenteItemPrescricao indPendente,
			DominioTipoSolicitacaoConsultoria tipo, DominioSimNao indUrgencia,
			String motivo, Date dthrSolicitada, DominioSimNao indImpressao,
			DominioSituacao indSituacao, Date criadoEm, Date dthrFim,
			Date dthrPrimeiraConsulta, Date dthrResposta,
			Date dthrConhecimentoResposta, Date alteradoEm,
			RapServidores servidorValidacao,
			RapServidores servidorValidacaoDesativacao,
			DominioIndConcluidaSolicitacaoConsultoria indConcluida,
			DominioOrigemSolicitacaoConsultoria origem,
			MpmSolicitacaoConsultoria solicitacaoOriginal) {
		this.id = id;
		this.especialidade = especialidade;
		this.servidorCriacao = servidorCriacao;
		this.servidorMovimentado = servidorMovimentado;
		this.servidorConsultaVerificacao = servidorConsultaVerificacao;
		this.servidorRespostaVerificacao = servidorRespostaVerificacao;

		this.indPendente = indPendente;
		this.tipo = tipo;
		this.indUrgencia = indUrgencia;
		this.motivo = motivo;
		this.dthrSolicitada = dthrSolicitada;
		this.indImpressao = indImpressao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.dthrFim = dthrFim;
		this.dthrPrimeiraConsulta = dthrPrimeiraConsulta;
		this.dthrResposta = dthrResposta;
		this.dthrConhecimentoResposta = dthrConhecimentoResposta;
		this.alteradoEm = alteradoEm;
		this.servidorValidacao = servidorValidacao;
		this.servidorValidaMovimentacao = servidorValidacaoDesativacao;
		this.indConcluida = indConcluida;
		this.origem = origem;
		this.solicitacaoConsultoriaOriginal = solicitacaoOriginal;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "atdSeq", column = @Column(name = "ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "seq", column = @Column(name = "SEQ", nullable = false, precision = 8, scale = 0)) })
	public MpmSolicitacaoConsultoriaId getId() {
		return this.id;
	}

	public void setId(MpmSolicitacaoConsultoriaId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ESP_SEQ", nullable = false)
	public AghEspecialidades getEspecialidade() {
		return this.especialidade;
	}

	public void setEspecialidade(AghEspecialidades especialidade) {
		this.especialidade = especialidade;
	}

	@Column(name = "TIPO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoSolicitacaoConsultoria getTipo() {
		return this.tipo;
	}

	public void setTipo(DominioTipoSolicitacaoConsultoria tipo) {
		this.tipo = tipo;
	}

	@Column(name = "IND_URGENCIA", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndUrgencia() {
		return this.indUrgencia;
	}

	public void setIndUrgencia(DominioSimNao indUrgencia) {
		this.indUrgencia = indUrgencia;
	}

	/**
	 * Campo sintético criado para mapear diretamente este dominio booleano em
	 * um componente selectOneCheckBox
	 * 
	 * @author jvaranda
	 * @return
	 */
	@Transient
	public boolean isUrgente() {
		if (getIndUrgencia() != null) {
			return getIndUrgencia().isSim();
		} else {
			return Boolean.FALSE;
		}
	}

	public void setUrgente(boolean valor) {
		setIndUrgencia(DominioSimNao.getInstance(valor));
	}

	@Column(name = "MOTIVO", nullable = false, length = 2000)
	@Length(max = 2000)
	public String getMotivo() {
		return this.motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_SOLICITADA", nullable = false)
	public Date getDthrSolicitada() {
		return this.dthrSolicitada;
	}

	public void setDthrSolicitada(Date dthrSolicitada) {
		this.dthrSolicitada = dthrSolicitada;
	}

	@Column(name = "IND_IMPRESSAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndImpressao() {
		return this.indImpressao;
	}

	public void setIndImpressao(DominioSimNao indImpressao) {
		this.indImpressao = indImpressao;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_PRIMEIRA_CONSULTA")
	public Date getDthrPrimeiraConsulta() {
		return this.dthrPrimeiraConsulta;
	}

	public void setDthrPrimeiraConsulta(Date dthrPrimeiraConsulta) {
		this.dthrPrimeiraConsulta = dthrPrimeiraConsulta;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_RESPOSTA")
	public Date getDthrResposta() {
		return this.dthrResposta;
	}

	public void setDthrResposta(Date dthrResposta) {
		this.dthrResposta = dthrResposta;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_CONHECIMENTO_RESPOSTA")
	public Date getDthrConhecimentoResposta() {
		return this.dthrConhecimentoResposta;
	}

	public void setDthrConhecimentoResposta(Date dthrConhecimentoResposta) {
		this.dthrConhecimentoResposta = dthrConhecimentoResposta;
	}

	@Column(name = "IND_CONCLUIDA", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioIndConcluidaSolicitacaoConsultoria getIndConcluida() {
		return this.indConcluida;
	}

	public void setIndConcluida(
			DominioIndConcluidaSolicitacaoConsultoria indConcluida) {
		this.indConcluida = indConcluida;
	}

	@Column(name = "ORIGEM", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioOrigemSolicitacaoConsultoria getOrigem() {
		return this.origem;
	}

	public void setOrigem(DominioOrigemSolicitacaoConsultoria origem) {
		this.origem = origem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( { @JoinColumn(name = "SCN_ATD_SEQ"),
			@JoinColumn(name = "SCN_SEQ") })
	public MpmSolicitacaoConsultoria getSolicitacaoConsultoriaOriginal() {
		return solicitacaoConsultoriaOriginal;
	}

	public void setSolicitacaoConsultoriaOriginal(
			MpmSolicitacaoConsultoria solicitacaoConsultoriaOriginal) {
		this.solicitacaoConsultoriaOriginal = solicitacaoConsultoriaOriginal;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( { @JoinColumn(name = "SER_MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", nullable = false) })
	public RapServidores getServidorCriacao() {
		return servidorCriacao;
	}

	public void setServidorCriacao(RapServidores servidorCriacao) {
		this.servidorCriacao = servidorCriacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( { @JoinColumn(name = "SER_MATRICULA_CONSULT_VERIF"),
			@JoinColumn(name = "SER_VIN_CODIGO_CONSULT_VERIF") })
	public RapServidores getServidorConsultaVerificacao() {
		return servidorConsultaVerificacao;
	}

	public void setServidorConsultaVerificacao(
			RapServidores servidorConsultaVerificacao) {
		this.servidorConsultaVerificacao = servidorConsultaVerificacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( { @JoinColumn(name = "SER_MATRICULA_RESPOSTA_VERIF"),
			@JoinColumn(name = "SER_VIN_CODIGO_RESPOSTA_VERIF") })
	public RapServidores getServidorRespostaVerificacao() {
		return servidorRespostaVerificacao;
	}

	public void setServidorRespostaVerificacao(
			RapServidores servidorRespostaVerificacao) {
		this.servidorRespostaVerificacao = servidorRespostaVerificacao;
	}

	/**
	 * Formato:<br>
	 * <i>[FIELD_TIPO_CONSULTORIA | FIELD_TIPO_OUTROS]
	 * [FIELD_INDICADOR_URGENTE_SIM | FIELD_INDICADOR_URGENTE_NAO]
	 * [agh_especialidades.nome_especialidade]</i><br>
	 * onde:<br>
	 * FIELD_TIPO_CONSULTORIA = "Consultoria";<br>
	 * FIELD_TIPO_OUTROS = "Avaliação Pré-Cirúrgica";<br>
	 * FIELD_INDICADOR_URGENTE_SIM = "URGENTE em";<br>
	 * FIELD_INDICADOR_URGENTE_NAO = "em";<br>
	 * 
	 * Regra: if c.tipo = 'C' then v_sintaxe_consultoria := 'Consultoria '; else
	 * v_sintaxe_consultoria:= 'Avaliação Pré-Cirúrgica '; end if; if
	 * c.ind_urgencia = 'S' then v_sintaxe_consultoria := v_sintaxe_consultoria
	 * || 'URGENTE em '; else v_sintaxe_consultoria := v_sintaxe_consultoria ||
	 * 'em '; end if; v_sintaxe_consultoria := v_sintaxe_consultoria ||
	 * c.nome_especialidade || ';';
	 */
	@Override
	@Transient
	public String getDescricaoFormatada() {
		StringBuffer descricao = new StringBuffer();
		if (DominioTipoSolicitacaoConsultoria.C == this.getTipo()) {
			descricao.append(FIELD_TIPO_CONSULTORIA);
		} else {
			descricao.append(FIELD_TIPO_OUTROS);
		}
		if (this.isUrgente()) {
			descricao.append(' ').append(FIELD_INDICADOR_URGENTE_SIM);
		} else {
			descricao.append(' ').append(FIELD_INDICADOR_URGENTE_NAO);
		}
		descricao.append(' ').append(this.getEspecialidade().getNomeEspecialidade());
		return descricao.toString().trim();
	}

	public enum Fields {
		
		ID("id"),		
		ESP_SEQ("especialidade.seq"), SITUACAO("indSituacao"), PENDENCIA(
				"indPendente"), DTHRSOLICITADA("dthrSolicitada"), DTHR_FIM(
				"dthrFim"), PME_ATD_SEQ("prescricaoMedica.id.atdSeq"), PME_SEQ(
				"prescricaoMedica.id.seq"), ORIGEM("origem"), SEQ("id.seq"), ESPECIALIDADE(
				"especialidade"), ATD_SEQ("id.atdSeq"), DTHRRESPOSTA("dthrResposta"), 
				CRIADO_EM("criadoEm"), ALTERADO_EM("alteradoEm"),
				PRESCRICAO_MEDICA_ID("prescricaoMedica.id"),
				SOLICITACAO_CONSULTORIA_ORIGINAL("solicitacaoConsultoriaOriginal"),
				SOLICITACAO_CONSULTORIA_ORIGINAL_SEQ("solicitacaoConsultoriaOriginal.id.seq"),
				SOLICITACAO_CONSULTORIA_ORIGINAL_ATD_SEQ("solicitacaoConsultoriaOriginal.id.atdSeq"),
				SERVIDOR_VALIDACAO("servidorValidacao"),
				MOTIVO("motivo"), TIPO("tipo"), IND_URGENCIA("indUrgencia"), ATENDIMENTO("prescricaoMedica.atendimento"),
				PRESCRICAO_MEDICA("prescricaoMedica"), DTHR_CONHECIMENTO_RESPOSTA("dthrConhecimentoResposta"),
				IND_CONCLUIDA("indConcluida"), DTHR_PRIM_CONSULTA("dthrPrimeiraConsulta"), DTHR_RESPOSTA("dthrResposta") ;

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}

	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validarSolicitacaoConsultoria() {
		if (this.getIndPendente() == DominioIndPendenteItemPrescricao.P
				&& this.getIndImpressao() != DominioSimNao.N) {
			throw new BaseRuntimeException();
		}

		if (this.getDthrFim() != null
				&& this.getDthrFim().before(this.getDthrSolicitada())) {
			throw new BaseRuntimeException();
		}

		if (this.getDthrPrimeiraConsulta() != null
				&& this.getDthrPrimeiraConsulta().before(this.getCriadoEm())) {
			throw new BaseRuntimeException();
		}

		if (this.getDthrPrimeiraConsulta() != null
				&& this.getDthrResposta() != null
				&& this.getDthrResposta()
						.before(this.getDthrPrimeiraConsulta())) {
			throw new BaseRuntimeException();
		}

		if (this.getDthrConhecimentoResposta() != null
				&& this.getDthrResposta() != null
				&& this.getDthrConhecimentoResposta().before(
						this.getDthrPrimeiraConsulta())) {
			throw new BaseRuntimeException();
		}
	}
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "solicitacaoConsultoriaOriginal")
	public Set<MpmSolicitacaoConsultoria> getSolicitacaoConsultorias() {
		return solicitacaoConsultorias;
	}

	public void setSolicitacaoConsultorias(
			Set<MpmSolicitacaoConsultoria> solicitacaoConsultorias) {
		this.solicitacaoConsultorias = solicitacaoConsultorias;
	}

	@Override
	@Transient
	public ItemPrescricaoMedica getAnterior() {
		return this.getSolicitacaoConsultoriaOriginal();
	}

	@Override
	@Transient
	public boolean possuiFilhos() {
		return this.getSolicitacaoConsultorias().size() > 0;
	}

	@Override
	public int compareTo(MpmSolicitacaoConsultoria o) {

		return this.getEspecialidade().getNomeEspecialidade().compareTo(
				o.getEspecialidade().getNomeEspecialidade());
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
		if (!(obj instanceof MpmSolicitacaoConsultoria)) {
			return false;
		}
		MpmSolicitacaoConsultoria other = (MpmSolicitacaoConsultoria) obj;
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