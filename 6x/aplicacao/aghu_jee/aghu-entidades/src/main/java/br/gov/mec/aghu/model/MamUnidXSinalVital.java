package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

/****************
 * TODO: ATENCAO OS CAMPOS mamItemSinalVital e mamSinalUnidGraves devem ser mapeados posteriormente, 
 * nao o foram pois para estoria desenvolvida nao serao necessarios.
 */
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MamUnidXSinalVital generated by hbm2java
 */
@Entity
@Table(name = "MAM_UNID_X_SINAL_VITAIS", schema = "AGH")
public class MamUnidXSinalVital extends BaseEntityId<MamUnidXSinalVitalId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1121761151051999439L;
	private MamUnidXSinalVitalId id;
	private Integer version;
	private MamItemSinalVital mamItemSinalVital;
	private MamUnidAtendem mamUnidAtendem;
	private RapServidores rapServidores;
	private String indObrigatorio;
	private Date criadoEm;
	private String indSituacao;
	private String micNome;
	private Set<MamSinalUnidGrav> mamSinalUnidGraves = new HashSet<MamSinalUnidGrav>(0);

	public MamUnidXSinalVital() {
	}

	public MamUnidXSinalVital(MamUnidXSinalVitalId id, MamItemSinalVital mamItemSinalVital, MamUnidAtendem mamUnidAtendem,
			RapServidores rapServidores, String indObrigatorio, Date criadoEm, String indSituacao) {
		this.id = id;
		this.mamItemSinalVital = mamItemSinalVital;
		this.mamUnidAtendem = mamUnidAtendem;
		this.rapServidores = rapServidores;
		this.indObrigatorio = indObrigatorio;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
	}

	public MamUnidXSinalVital(MamUnidXSinalVitalId id, MamItemSinalVital mamItemSinalVital, MamUnidAtendem mamUnidAtendem,
			RapServidores rapServidores, String indObrigatorio, Date criadoEm, String indSituacao, String micNome,
			Set<MamSinalUnidGrav> mamSinalUnidGraves) {
		this.id = id;
		this.mamItemSinalVital = mamItemSinalVital;
		this.mamUnidAtendem = mamUnidAtendem;
		this.rapServidores = rapServidores;
		this.indObrigatorio = indObrigatorio;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.micNome = micNome;
		this.mamSinalUnidGraves = mamSinalUnidGraves;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "sviSeq", column = @Column(name = "SVI_SEQ", nullable = false)),
			@AttributeOverride(name = "uanUnfSeq", column = @Column(name = "UAN_UNF_SEQ", nullable = false)) })
	public MamUnidXSinalVitalId getId() {
		return this.id;
	}

	public void setId(MamUnidXSinalVitalId id) {
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SVI_SEQ", nullable = false, insertable = false, updatable = false)
	public MamItemSinalVital getMamItemSinalVital() {
		return this.mamItemSinalVital;
	}

	public void setMamItemSinalVital(MamItemSinalVital mamItemSinalVital) {
		this.mamItemSinalVital = mamItemSinalVital;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UAN_UNF_SEQ", nullable = false, insertable = false, updatable = false)
	@NotNull
	public MamUnidAtendem getMamUnidAtendem() {
		return this.mamUnidAtendem;
	}

	public void setMamUnidAtendem(MamUnidAtendem mamUnidAtendem) {
		this.mamUnidAtendem = mamUnidAtendem;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@Column(name = "IND_OBRIGATORIO", nullable = false, length = 1)
	@NotNull
	@Length(max = 1)
	public String getIndObrigatorio() {
		return this.indObrigatorio;
	}

	public void setIndObrigatorio(String indObrigatorio) {
		this.indObrigatorio = indObrigatorio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	@NotNull
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@NotNull
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "MIC_NOME", length = 50)
	@Length(max = 50)
	public String getMicNome() {
		return this.micNome;
	}

	public void setMicNome(String micNome) {
		this.micNome = micNome;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mamUnidXSinalVital")
	public Set<MamSinalUnidGrav> getMamSinalUnidGraves() {
		return this.mamSinalUnidGraves;
	}

	public void setMamSinalUnidGraves(Set<MamSinalUnidGrav> mamSinalUnidGraves) {
		this.mamSinalUnidGraves = mamSinalUnidGraves;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		MAM_ITEM_SINAL_VITAIS("mamItemSinalVital"),
		MAM_UNID_ATENDEM("mamUnidAtendem"),
		RAP_SERVIDORES("rapServidores"),
		IND_OBRIGATORIO("indObrigatorio"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao"),
		MIC_NOME("micNome"),
		MAM_SINAL_UNID_GRAVES("mamSinalUnidGraves");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

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
		if (!(obj instanceof MamUnidXSinalVital)) {
			return false;
		}
		MamUnidXSinalVital other = (MamUnidXSinalVital) obj;
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