package br.gov.mec.aghu.model;

// Generated 09/03/2010 15:35:59 by Hibernate Tools 3.3.0.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VAipSolicitantes generated by hbm2java
 * 
 * @author Ricardo Costa
 */
@Entity
@Table(name = "V_AIP_SOLICITANTES", schema = "AGH")
@Immutable
public class VAipSolicitantes extends BaseEntityId<VAipSolicitantesId> implements java.io.Serializable {

	/**
	 * serialVersionUID.
	 */
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8810893664189524596L;
	/**
	 * id.
	 */
	private VAipSolicitantesId id;

	/**
	 * Construtor.
	 */
	public VAipSolicitantes() {
	}

	/**
	 * Construtor.
	 * 
	 * @param id
	 */
	public VAipSolicitantes(VAipSolicitantesId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "seq", column = @Column(name = "SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "descricao", column = @Column(name = "DESCRICAO", length = 67)),
			@AttributeOverride(name = "separacaoPrevia", column = @Column(name = "SEPARACAO_PREVIA", nullable = false, length = 1)),
			@AttributeOverride(name = "volumesManuseados", column = @Column(name = "VOLUMES_MANUSEADOS", nullable = false, length = 1)),
			@AttributeOverride(name = "indSituacao", column = @Column(name = "IND_SITUACAO", nullable = false, length = 1)),
			@AttributeOverride(name = "unfSeq", column = @Column(name = "UNF_SEQ", precision = 4, scale = 0)),
			@AttributeOverride(name = "oevSeq", column = @Column(name = "OEV_SEQ", precision = 2, scale = 0)),
			@AttributeOverride(name = "fmvSeq", column = @Column(name = "FMV_SEQ", precision = 4, scale = 0)),
			@AttributeOverride(name = "mensagemSamis", column = @Column(name = "MENSAGEM_SAMIS", nullable = false, length = 1)) })
	public VAipSolicitantesId getId() {
		return this.id;
	}

	public void setId(VAipSolicitantesId id) {
		this.id = id;
	}

	public enum Fields {

		SEQ("id.seq"), DESCRICAO("id.descricao"), UNF_SEQ("id.unfSeq");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
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
		if (!(obj instanceof VAipSolicitantes)) {
			return false;
		}
		VAipSolicitantes other = (VAipSolicitantes) obj;
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
