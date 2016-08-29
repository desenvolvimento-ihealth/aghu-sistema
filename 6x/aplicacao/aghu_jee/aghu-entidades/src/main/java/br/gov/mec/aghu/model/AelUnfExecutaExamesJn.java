package br.gov.mec.aghu.model;

// Generated 25/03/2011 14:32:53 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioApAnterior;
import br.gov.mec.aghu.dominio.DominioSimNao;
import br.gov.mec.aghu.dominio.DominioSimNaoRestritoAreaExecutora;
import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.dominio.DominioUnidTempo;
import br.gov.mec.aghu.dominio.DominioUnidTempoComMinuto;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelUnfExecutaExamesJn generated by hbm2java
 */
@SuppressWarnings({"PMD.AghuUsoIndevidoDaEnumDominioSimNaoEntity"})
@Entity
@SequenceGenerator(name = "aelUfejJnSq1", sequenceName = "AGH.AEL_UFE_jn_seq", allocationSize = 1)
@Table(name = "AEL_UNF_EXECUTA_EXAMES_JN", schema = "AGH")
@Immutable
public class AelUnfExecutaExamesJn extends BaseJournal {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1200713138228533178L;
	
	private String emaExaSigla;
	private Integer emaManSeq;
	private Short unfSeq;
	
	private Byte tempoRealizacaoExame;
	private DominioUnidTempoComMinuto unidadeMedidaTempoRealizaca;
	private Boolean indExecutaEmPlantao;
	private Boolean indLiberaResultAutom;
	private Boolean indExigeInfoClin;
	private DominioSimNaoRestritoAreaExecutora indAgendamPrevioInt;
	private DominioSimNaoRestritoAreaExecutora indAgendamPrevioNaoInt;
	private Boolean indAvisaSolicitante;
	private Boolean indImprimeFicha;
	private Boolean indImpNomeExameLaudo;
	private Boolean indMonitorPendencia;
	private Boolean indNroFrascoFornec;
	private DominioSimNao indLaudoUnico;
	private DominioApAnterior indNumApAnterior;
	private Boolean indImpDuasEtiq;
	private Boolean indPermVerLaudoExecutando;
	private Boolean indDesativaTemp;
	private DominioSituacao indSituacao;
	private Date tempoMedioOcupSala;
	private String motivoDesativacao;
	private Integer serMatriculaAlterado;
	private Short serVinCodigoAlterado;
	
	private Date dthrReativaTemp;
	private AghUnidadesFuncionais unfSeqComparece;
	
	private Short tempoAposLiberacao;
	private DominioUnidTempo unidTempoAposLib;
	
	private Short tempoLibRotinaIg;
	private DominioUnidTempo unidTempLibRotIg;
	private Short tempoLibUrgenteIg;
	private DominioUnidTempo unidTempLibUrgIg;


	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelUfejJnSq1")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
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

	@Column(name = "UNF_SEQ", nullable = false)
	public Short getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Short unfSeq) {
		this.unfSeq = unfSeq;
	}

	@Column(name = "TEMPO_REALIZACAO_EXAME", nullable = false, precision = 2, scale = 0)
	public Byte getTempoRealizacaoExame() {
		return this.tempoRealizacaoExame;
	}

	public void setTempoRealizacaoExame(Byte tempoRealizacaoExame) {
		this.tempoRealizacaoExame = tempoRealizacaoExame;
	}

	@Column(name = "UNIDADE_MEDIDA_TEMPO_REALIZACA", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioUnidTempoComMinuto getUnidadeMedidaTempoRealizaca() {
		return this.unidadeMedidaTempoRealizaca;
	}

	public void setUnidadeMedidaTempoRealizaca(
			DominioUnidTempoComMinuto unidadeMedidaTempoRealizaca) {
		this.unidadeMedidaTempoRealizaca = unidadeMedidaTempoRealizaca;
	}

	@Column(name = "IND_EXECUTA_EM_PLANTAO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndExecutaEmPlantao() {
		return this.indExecutaEmPlantao;
	}

	public void setIndExecutaEmPlantao(Boolean indExecutaEmPlantao) {
		this.indExecutaEmPlantao = indExecutaEmPlantao;
	}

	@Column(name = "IND_LIBERA_RESULT_AUTOM", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndLiberaResultAutom() {
		return this.indLiberaResultAutom;
	}

	public void setIndLiberaResultAutom(Boolean indLiberaResultAutom) {
		this.indLiberaResultAutom = indLiberaResultAutom;
	}

	@Column(name = "IND_EXIGE_INFO_CLIN", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndExigeInfoClin() {
		return this.indExigeInfoClin;
	}

	public void setIndExigeInfoClin(Boolean indExigeInfoClin) {
		this.indExigeInfoClin = indExigeInfoClin;
	}

	@Column(name = "IND_AGENDAM_PREVIO_INT", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNaoRestritoAreaExecutora getIndAgendamPrevioInt() {
		return this.indAgendamPrevioInt;
	}

	public void setIndAgendamPrevioInt(DominioSimNaoRestritoAreaExecutora indAgendamPrevioInt) {
		this.indAgendamPrevioInt = indAgendamPrevioInt;
	}

	@Column(name = "IND_AGENDAM_PREVIO_NAO_INT", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNaoRestritoAreaExecutora getIndAgendamPrevioNaoInt() {
		return this.indAgendamPrevioNaoInt;
	}

	public void setIndAgendamPrevioNaoInt(DominioSimNaoRestritoAreaExecutora indAgendamPrevioNaoInt) {
		this.indAgendamPrevioNaoInt = indAgendamPrevioNaoInt;
	}

	@Column(name = "IND_AVISA_SOLICITANTE", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndAvisaSolicitante() {
		return this.indAvisaSolicitante;
	}

	public void setIndAvisaSolicitante(Boolean indAvisaSolicitante) {
		this.indAvisaSolicitante = indAvisaSolicitante;
	}

	@Column(name = "IND_IMPRIME_FICHA", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndImprimeFicha() {
		return this.indImprimeFicha;
	}

	public void setIndImprimeFicha(Boolean indImprimeFicha) {
		this.indImprimeFicha = indImprimeFicha;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "TEMPO_MEDIO_OCUP_SALA", length = 7)
	public Date getTempoMedioOcupSala() {
		return this.tempoMedioOcupSala;
	}

	public void setTempoMedioOcupSala(Date tempoMedioOcupSala) {
		this.tempoMedioOcupSala = tempoMedioOcupSala;
	}

	@Column(name = "MOTIVO_DESATIVACAO", length = 60)
	@Length(max = 60)
	public String getMotivoDesativacao() {
		return this.motivoDesativacao;
	}

	public void setMotivoDesativacao(String motivoDesativacao) {
		this.motivoDesativacao = motivoDesativacao;
	}

	@Column(name = "SER_MATRICULA_ALTERADO", precision = 7, scale = 0)
	public Integer getSerMatriculaAlterado() {
		return this.serMatriculaAlterado;
	}

	public void setSerMatriculaAlterado(Integer serMatriculaAlterado) {
		this.serMatriculaAlterado = serMatriculaAlterado;
	}

	@Column(name = "SER_VIN_CODIGO_ALTERADO", precision = 3, scale = 0)
	public Short getSerVinCodigoAlterado() {
		return this.serVinCodigoAlterado;
	}

	public void setSerVinCodigoAlterado(Short serVinCodigoAlterado) {
		this.serVinCodigoAlterado = serVinCodigoAlterado;
	}

	@Column(name = "IND_PERM_VER_LAUDO_EXECUTANDO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndPermVerLaudoExecutando() {
		return this.indPermVerLaudoExecutando;
	}

	public void setIndPermVerLaudoExecutando(Boolean indPermVerLaudoExecutando) {
		this.indPermVerLaudoExecutando = indPermVerLaudoExecutando;
	}

	@Column(name = "IND_DESATIVA_TEMP", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndDesativaTemp() {
		return this.indDesativaTemp;
	}

	public void setIndDesativaTemp(Boolean indDesativaTemp) {
		this.indDesativaTemp = indDesativaTemp;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_REATIVA_TEMP", length = 7)
	public Date getDthrReativaTemp() {
		return this.dthrReativaTemp;
	}

	public void setDthrReativaTemp(Date dthrReativaTemp) {
		this.dthrReativaTemp = dthrReativaTemp;
	}

	@ManyToOne
	@JoinColumn(name = "UNF_SEQ_COMPARECE")
	public AghUnidadesFuncionais getUnfSeqComparece() {
		return this.unfSeqComparece;
	}

	public void setUnfSeqComparece(AghUnidadesFuncionais unfSeqComparece) {
		this.unfSeqComparece = unfSeqComparece;
	}

	@Column(name = "IND_IMP_NOME_EXAME_LAUDO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndImpNomeExameLaudo() {
		return this.indImpNomeExameLaudo;
	}

	public void setIndImpNomeExameLaudo(Boolean indImpNomeExameLaudo) {
		this.indImpNomeExameLaudo = indImpNomeExameLaudo;
	}

	@Column(name = "IND_MONITOR_PENDENCIA", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndMonitorPendencia() {
		return this.indMonitorPendencia;
	}

	public void setIndMonitorPendencia(Boolean indMonitorPendencia) {
		this.indMonitorPendencia = indMonitorPendencia;
	}

	@Column(name = "IND_NRO_FRASCO_FORNEC", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndNroFrascoFornec() {
		return this.indNroFrascoFornec;
	}

	public void setIndNroFrascoFornec(Boolean indNroFrascoFornec) {
		this.indNroFrascoFornec = indNroFrascoFornec;
	}

	@Column(name = "TEMPO_APOS_LIBERACAO", precision = 3, scale = 0)
	public Short getTempoAposLiberacao() {
		return this.tempoAposLiberacao;
	}

	public void setTempoAposLiberacao(Short tempoAposLiberacao) {
		this.tempoAposLiberacao = tempoAposLiberacao;
	}

	@Column(name = "UNID_TEMPO_APOS_LIB", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioUnidTempo getUnidTempoAposLib() {
		return this.unidTempoAposLib;
	}

	public void setUnidTempoAposLib(DominioUnidTempo unidTempoAposLib) {
		this.unidTempoAposLib = unidTempoAposLib;
	}

	@Column(name = "IND_LAUDO_UNICO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSimNao getIndLaudoUnico() {
		return this.indLaudoUnico;
	}

	public void setIndLaudoUnico(DominioSimNao indLaudoUnico) {
		this.indLaudoUnico = indLaudoUnico;
	}

	@Column(name = "IND_NUM_AP_ANTERIOR", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioApAnterior getIndNumApAnterior() {
		return this.indNumApAnterior;
	}

	public void setIndNumApAnterior(DominioApAnterior indNumApAnterior) {
		this.indNumApAnterior = indNumApAnterior;
	}

	@Column(name = "IND_IMP_DUAS_ETIQ", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndImpDuasEtiq() {
		return this.indImpDuasEtiq;
	}

	public void setIndImpDuasEtiq(Boolean indImpDuasEtiq) {
		this.indImpDuasEtiq = indImpDuasEtiq;
	}

	@Column(name = "TEMPO_LIB_ROTINA_IG", precision = 3, scale = 0)
	public Short getTempoLibRotinaIg() {
		return this.tempoLibRotinaIg;
	}

	public void setTempoLibRotinaIg(Short tempoLibRotinaIg) {
		this.tempoLibRotinaIg = tempoLibRotinaIg;
	}

	@Column(name = "UNID_TEMP_LIB_ROT_IG", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioUnidTempo getUnidTempLibRotIg() {
		return this.unidTempLibRotIg;
	}

	public void setUnidTempLibRotIg(DominioUnidTempo unidTempLibRotIg) {
		this.unidTempLibRotIg = unidTempLibRotIg;
	}

	@Column(name = "TEMPO_LIB_URGENTE_IG", precision = 3, scale = 0)
	public Short getTempoLibUrgenteIg() {
		return this.tempoLibUrgenteIg;
	}

	public void setTempoLibUrgenteIg(Short tempoLibUrgenteIg) {
		this.tempoLibUrgenteIg = tempoLibUrgenteIg;
	}

	@Column(name = "UNID_TEMP_LIB_URG_IG", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioUnidTempo getUnidTempLibUrgIg() {
		return this.unidTempLibUrgIg;
	}

	public void setUnidTempLibUrgIg(DominioUnidTempo unidTempLibUrgIg) {
		this.unidTempLibUrgIg = unidTempLibUrgIg;
	}

	public enum Fields {

		EMA_EXA_SIGLA("emaExaSigla"),
		EMA_MAN_SEQ("emaManSeq"),
		UNF_SEQ("unfSeq"),
		TEMPO_REALIZACAO_EXAME("tempoRealizacaoExame"),
		UNIDADE_MEDIDA_TEMPO_REALIZACA("unidadeMedidaTempoRealizaca"),
		IND_EXECUTA_EM_PLANTAO("indExecutaEmPlantao"),
		IND_LIBERA_RESULT_AUTOM("indLiberaResultAutom"),
		IND_EXIGE_INFO_CLIN("indExigeInfoClin"),
		IND_AGENDAM_PREVIO_INT("indAgendamPrevioInt"),
		IND_AGENDAM_PREVIO_NAO_INT("indAgendamPrevioNaoInt"),
		IND_AVISA_SOLICITANTE("indAvisaSolicitante"),
		IND_IMPRIME_FICHA("indImprimeFicha"),
		IND_IMP_NOME_EXAME_LAUDO("indImpNomeExameLaudo"),
		IND_MONITOR_PENDENCIA("indMonitorPendencia"),
		IND_NRO_FRASCO_FORNEC("indNroFrascoFornec"),
		IND_LAUDO_UNICO("indLaudoUnico"),
		IND_NUM_AP_ANTERIOR("indNumApAnterior"),
		IND_IMP_DUAS_ETIQ("indImpDuasEtiq"),
		IND_PERM_VER_LAUDO_EXECUTANDO("indPermVerLaudoExecutando"),
		IND_DESATIVA_TEMP("indDesativaTemp"),
		IND_SITUACAO("indSituacao"),
		TEMPO_MEDIO_OCUP_SALA("tempoMedioOcupSala"),
		MOTIVO_DESATIVACAO("motivoDesativacao"),
		SER_MATRICULA_ALTERADO("serMatriculaAlterado"),
		SER_VIN_CODIGO_ALTERADO("serVinCodigoAlterado"),
		DTHR_REATIVA_TEMP("dthrReativaTemp"),
		UNF_SEQ_COMPARECE("unfSeqComparece"),
		TEMPO_APOS_LIBERACAO("tempoAposLiberacao"),
		UNID_TEMPO_APOS_LIB("unidTempoAposLib"),
		TEMPO_LIB_ROTINA_IG("tempoLibRotinaIg"),
		UNID_TEMP_LIB_ROT_IG("unidTempLibRotIg"),
		TEMPO_LIB_URGENTE_IG("tempoLibUrgenteIg"),
		UNID_TEMP_LIB_URG_IG("unidTempLibUrgIg");

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