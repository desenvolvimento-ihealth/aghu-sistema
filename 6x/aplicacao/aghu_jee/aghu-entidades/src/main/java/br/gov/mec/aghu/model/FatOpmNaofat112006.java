package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatOpmNaofat112006 generated by hbm2java
 */
@Entity
@Table(name = "FAT_OPM_NAOFAT112006", schema = "AGH")
public class FatOpmNaofat112006 extends BaseEntityId<FatOpmNaofat112006Id> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5639243025574703372L;
	private FatOpmNaofat112006Id id;

	public FatOpmNaofat112006() {
	}

	public FatOpmNaofat112006(FatOpmNaofat112006Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "sigla", column = @Column(name = "SIGLA", length = 3)),
			@AttributeOverride(name = "especialidade", column = @Column(name = "ESPECIALIDADE", length = 45)),
			@AttributeOverride(name = "codTabela", column = @Column(name = "COD_TABELA", precision = 10, scale = 0)),
			@AttributeOverride(name = "descricao", column = @Column(name = "DESCRICAO", length = 100)),
			@AttributeOverride(name = "quantidade", column = @Column(name = "QUANTIDADE", precision = 22, scale = 0)),
			@AttributeOverride(name = "valorApres", column = @Column(name = "VALOR_APRES", precision = 22, scale = 0)) })
	public FatOpmNaofat112006Id getId() {
		return this.id;
	}

	public void setId(FatOpmNaofat112006Id id) {
		this.id = id;
	}

	public enum Fields {

		ID("id");

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
		if (!(obj instanceof FatOpmNaofat112006)) {
			return false;
		}
		FatOpmNaofat112006 other = (FatOpmNaofat112006) obj;
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
