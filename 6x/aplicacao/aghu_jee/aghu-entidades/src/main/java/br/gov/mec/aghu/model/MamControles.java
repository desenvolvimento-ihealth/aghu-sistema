package br.gov.mec.aghu.model;

// Generated 05/04/2011 11:18:40 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.Iterator;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;
import br.gov.mec.aghu.dominio.DominioSituacaoControle;

/**
 * MamControles generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mamCtlSq1", sequenceName="AGH.MAM_CTL_SQ1", allocationSize = 1)

@Table(name = "MAM_CONTROLES", schema = "AGH")
public class MamControles extends BaseEntitySeq<Long> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7125564383553414080L;
	private Long seq;
	private Date criadoEm;
	private Date dthrMovimento;
	private DominioSituacaoControle situacao;
	private AacConsultas consulta;
	private AipPacientes paciente;
	private RapServidores servidor;
	private RapServidores servidorValida;
	private RapServidores servidorAtualiza;
	private RapServidores servidorReponsavel;
	private String micNome;
	private MamSituacaoAtendimentos situacaoAtendimento;
	private String supervisor;
	private Set<MamExtratoControles> extratoControles;
	private String microDoAtendimento;
	private Byte salaAtendimento;
	private Integer version;
	
	private Date dthrChegada;
	private Date dtHrInicio;
	private Date dtHrFim;

	private AghMicrocomputador microcomputador;

	// Atributo criado para join na pesquisa de consultas pendentes.
	private Set<MamExtratoControles> extratoControles2;
	
	public MamControles() {
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mamCtlSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 14, scale = 0)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_MOVIMENTO", length = 7)
	public Date getDthrMovimento() {
		return this.dthrMovimento;
	}

	public void setDthrMovimento(Date dthrMovimento) {
		this.dthrMovimento = dthrMovimento;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoControle getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacaoControle situacao) {
		this.situacao = situacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CON_NUMERO")
	public AacConsultas getConsulta() {
		return consulta;
	}

	public void setConsulta(AacConsultas consulta) {
		this.consulta = consulta;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAC_CODIGO", nullable = false)
	public AipPacientes getPaciente() {
		return this.paciente;
	}

	public void setPaciente(AipPacientes paciente) {
		this.paciente = paciente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_VALIDA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_VALIDA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorValida() {
		return this.servidorValida;
	}
	
	public void setServidorValida(RapServidores servidorValida) {
		this.servidorValida = servidorValida;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_ATUALIZA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ATUALIZA", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorAtualiza() {
		return this.servidorAtualiza;
	}
	
	public void setServidorAtualiza(RapServidores servidorAtualiza) {
		this.servidorAtualiza = servidorAtualiza;
	}

	@Column(name = "MIC_NOME", length = 50)
	public String getMicNome() {
		return this.micNome;
	}

	public void setMicNome(String micNome) {
		this.micNome = micNome;
	}

	@Column(name = "SUPERVISOR", length = 120)
	public String getSupervisor() {
		return this.supervisor;
	}

	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}

	@OneToMany(mappedBy="controle")
	@OrderBy("dthrMovimento DESC")
	public Set<MamExtratoControles> getExtratoControles() {
		return extratoControles;
	}

	public void setExtratoControles(Set<MamExtratoControles> extratoControles) {
		this.extratoControles = extratoControles;
	}
	
	public enum Fields {
		SEQ("seq"),
		CONSULTA("consulta"),
		CON_NUMERO("consulta.numero"),
		SITUACAO_ATENDIMENTOS("situacaoAtendimento"),
		SITUACAO_ATENDIMENTOS_SEQ("situacaoAtendimento.seq"),
		IND_SITUACAO("situacao"),
		EXTRATO_CONTROLES("extratoControles"),
		EXTRATO_CONTROLES_2("extratoControles2"),
		SERVIDOR_RESPONSAVEL("servidorReponsavel"),
		SERVIDOR_ATUALIZA("servidorAtualiza"),
		DTHR_MOVIMENTO("dthrMovimento"),
		MICROCOMPUTADOR("microcomputador"),
		MIC_NOME("micNome");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_RESPONSAVEL", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO_RESPONSAVEL", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidorReponsavel() {
		return servidorReponsavel;
	}

	public void setServidorReponsavel(RapServidores servidorReponsavel) {
		this.servidorReponsavel = servidorReponsavel;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SAT_SEQ")	
	public MamSituacaoAtendimentos getSituacaoAtendimento() {
		return situacaoAtendimento;
	}

	public void setSituacaoAtendimento(MamSituacaoAtendimentos situacaoAtendimento) {
		this.situacaoAtendimento = situacaoAtendimento;
	}

	@Transient
	public Date getDthrChegada(){
		if (dthrChegada==null){
			if (situacaoAtendimento.getAgendado()){
				dthrChegada=null;
			}else{
				Iterator<MamExtratoControles> iter = getExtratoControles().iterator(); 
				while (iter.hasNext()){
					MamExtratoControles e = iter.next(); 
					if (e.getSituacaoAtendimento().getAguardando()){
						dthrChegada=e.getDthrMovimento();
						break;
					}
				}
			}	
		}	
		return dthrChegada;
	}

	@Transient
	public Date getDtHrInicio(){
		if (dtHrInicio==null){
			if (situacaoAtendimento.getAgendado() || situacaoAtendimento.getAguardando()){
				dtHrInicio=null;
			}else{
				Iterator<MamExtratoControles> iter = getExtratoControles().iterator(); 
				while (iter.hasNext()){
					MamExtratoControles e = iter.next(); 
					if (e.getSituacaoAtendimento().getPacAtend()){
						dtHrInicio=e.getDthrMovimento();
						break;
					}
				}
			}	
		}	
		return dtHrInicio;
	}
	
	
	@Transient
	public Date getDtHrFim(){
		if (dtHrFim==null){
			if (!situacaoAtendimento.getAtendConcluido() && !situacaoAtendimento.getAtendReaberto()){
				dtHrFim=null;
			}else{
				Iterator<MamExtratoControles> iter = getExtratoControles().iterator(); 
				while (iter.hasNext()){
					MamExtratoControles e = iter.next(); 
					if (e.getSituacaoAtendimento().getAtendConcluido()){
						dtHrFim=e.getDthrMovimento();
					}
				}
			}	
		}	
		return dtHrFim;
	}	
	
	
	
	public void setDthrChegada(Date dthrChegada) {
		this.dthrChegada = dthrChegada;
	}


	@Transient
	public String getMicroDoAtendimento() {
		if (microDoAtendimento==null){
			Iterator<MamExtratoControles> iter = getExtratoControles().iterator(); 
			while (iter.hasNext()){
				MamExtratoControles e = iter.next(); 
				if (e.getSituacaoAtendimento().getPacAtend()){
					microDoAtendimento=e.getMicNome();
					break;
				}
			}
		}			
		return microDoAtendimento;
	}

	public void setMicroDoAtendimento(String microDoAtendimento) {
		this.microDoAtendimento = microDoAtendimento;
	}

	@Transient
	public Byte getSalaAtendimento() {
		return salaAtendimento;
	}

	public void setSalaAtendimento(Byte salaAtendimento) {
		this.salaAtendimento = salaAtendimento;
	}

	public void setDtHrFim(Date dtHrFim) {
		this.dtHrFim = dtHrFim;
	}

	public void setDtHrInicio(Date dtHrInicio) {
		this.dtHrInicio = dtHrInicio;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MIC_NOME", insertable = false, updatable = false)
	public AghMicrocomputador getMicrocomputador() {
		return microcomputador;
	}

	public void setMicrocomputador(AghMicrocomputador microcomputador) {
		this.microcomputador = microcomputador;
	}

	@OneToMany(mappedBy="controle", fetch = FetchType.LAZY)
	public Set<MamExtratoControles> getExtratoControles2() {
		return extratoControles2;
	}

	public void setExtratoControles2(Set<MamExtratoControles> extratoControles2) {
		this.extratoControles2 = extratoControles2;
	}

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof MamControles)) {
			return false;
		}
		MamControles other = (MamControles) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}