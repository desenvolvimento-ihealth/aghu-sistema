package br.gov.mec.aghu.model;

// Generated 18/03/2010 16:55:22 by Hibernate Tools 3.3.0.GA

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
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * VAacSiglaUnfSala generated by hbm2java.
 * 
 * Está VIEW só possui código ANSI SQL.
 * 
 * @author Ricardo Costa
 * 
 */
@Entity
@Table(name = "V_AAC_SIGLA_UNF_SALA", schema = "AGH")
@Immutable
public class VAacSiglaUnfSala extends BaseEntityId<VAacSiglaUnfSalaId> implements java.io.Serializable {

	private static final long serialVersionUID = -2135789512985401183L;

	private VAacSiglaUnfSalaId id;

	private String sigla;
	private String descricao;
	private String indSitUndFunc;
	private DominioSituacao indSitSala;
	private String indExcluido;
	private AghUnidadesFuncionais unidadeFuncional;

	public VAacSiglaUnfSala() {
	}

	public VAacSiglaUnfSala(VAacSiglaUnfSalaId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "unfSeq", column = @Column(name = "UNF_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "sala", column = @Column(name = "SALA", nullable = false, precision = 2, scale = 0)) })
	public VAacSiglaUnfSalaId getId() {
		return this.id;
	}

	public void setId(VAacSiglaUnfSalaId id) {
		this.id = id;
	}

	@Column(name = "SIGLA", length = 10)
	@Length(max = 10)
	public String getSigla() {
		return this.sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SIT_UND_FUNC", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSitUndFunc() {
		return this.indSitUndFunc;
	}

	public void setIndSitUndFunc(String indSitUndFunc) {
		this.indSitUndFunc = indSitUndFunc;
	}

	@Column(name = "IND_SIT_SALA", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSitSala() {
		return this.indSitSala;
	}

	public void setIndSitSala(DominioSituacao indSitSala) {
		this.indSitSala = indSitSala;
	}

	@Column(name = "IND_EXCLUIDO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndExcluido() {
		return this.indExcluido;
	}

	public void setIndExcluido(String indExcluido) {
		this.indExcluido = indExcluido;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "UNF_SEQ", referencedColumnName = "SEQ", nullable = false,insertable=false, updatable=false) })
	public AghUnidadesFuncionais getUnidadeFuncional() {
		return unidadeFuncional;
	}

	public void setUnidadeFuncional(AghUnidadesFuncionais unidadeFuncional) {
		this.unidadeFuncional = unidadeFuncional;
	}
	
	public enum Fields {
		SALA	("id.sala"),
		UNF_SEQ	("id.unfSeq"),
		SIGLA	("sigla"),
		DESCRICAO ("descricao"),
		SIT_UND_FUNC("indSitUndFunc"),
		SIT_SALA("indSitSala"),
		UNIDADE_FUNCIONAL("unidadeFuncional");
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
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
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (!(obj instanceof VAacSiglaUnfSala)){
			return false;
		}
		VAacSiglaUnfSala other = (VAacSiglaUnfSala) obj;
		if (id == null) {
			if (other.id != null){
				return false;
			}
		} else if (!id.getSala().equals(other.id.getSala()) || !id.getUnfSeq().equals(other.id.getUnfSeq())){
			return false;
		}
		return true;
	}
}