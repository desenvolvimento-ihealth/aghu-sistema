package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.annotations.Formula;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityCodigo;

/**
 * ScoDescricaoTecnicaPadrao generated by hbm2java
 */
@Entity
@SequenceGenerator(name="scoDtpSq1", sequenceName="AGH.SCO_DTP_SQ1", allocationSize = 1)
@Table(name = "SCO_DESCRICOES_TECNICAS_PADRAO", schema = "AGH")
public class ScoDescricaoTecnicaPadrao extends BaseEntityCodigo<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5829920571978090020L;
	private Short codigo;
	private Integer version;
	private String titulo;
	private String descricao1;
	private String descricao2;
	private Boolean indLiberado;
	private Set<ScoMaterialDescTecnica> listaMateriais;
	private String descricao;
	private Set<ScoAnexoDescricaoTecnica> listaAnexo;

	public ScoDescricaoTecnicaPadrao() {
	}

	public ScoDescricaoTecnicaPadrao(Short codigo, String titulo, String descricao1) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.descricao1 = descricao1;
	}

	public ScoDescricaoTecnicaPadrao(Short codigo, String titulo, String descricao1, String descricao2) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.descricao1 = descricao1;
		this.descricao2 = descricao2;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "scoDtpSq1")
	@Column(name = "CODIGO", unique = true, nullable = false)
	public Short getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Short codigo) {
		this.codigo = codigo;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "TITULO", nullable = false, length = 60)
	@Length(max = 60)
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Column(name = "DESCRICAO_1", nullable = false, length = 2000)
	@Length(max = 2000)
	public String getDescricao1() {
		return this.descricao1;
	}

	public void setDescricao1(String descricao1) {
		this.descricao1 = descricao1;
	}

	@Column(name = "DESCRICAO_2", length = 2000)
	@Length(max = 2000)
	public String getDescricao2() {
		return this.descricao2;
	}

	public void setDescricao2(String descricao2) {
		this.descricao2 = descricao2;
	}
	
	@Column(name = "IND_LIBERADO", length = 1, nullable = false)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndLiberado() {
		return indLiberado;
	}
	
	public void setIndLiberado(Boolean indLiberado) {
		this.indLiberado = indLiberado;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "descricao", cascade = CascadeType.REMOVE)
	public Set<ScoMaterialDescTecnica> getListaMateriais() {
		return listaMateriais;
	}
	
	public void setListaMateriais(Set<ScoMaterialDescTecnica> listaMateriais) {
		this.listaMateriais = listaMateriais;
	}
	
	@Formula(value = "descricao_1 || descricao_2")
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "descricaoTecnica")
	public Set<ScoAnexoDescricaoTecnica> getListaAnexo() {
		return listaAnexo;
	}
	
	public void setListaAnexo(Set<ScoAnexoDescricaoTecnica> listaAnexo) {
		this.listaAnexo = listaAnexo;
	}

	public enum Fields {

		CODIGO("codigo"),
		VERSION("version"),
		TITULO("titulo"),
		DESCRICAO1("descricao1"),
		DESCRICAO2("descricao2"), 
		IND_LIBERADO("indLiberado"), 
		LISTA_MATERIAIS("listaMateriais"),
		LISTA_ANEXO("listaAnexo"),
		DESCRICAO("descricao");

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
		result = prime * result + ((getCodigo() == null) ? 0 : getCodigo().hashCode());
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
		if (!(obj instanceof ScoDescricaoTecnicaPadrao)) {
			return false;
		}
		ScoDescricaoTecnicaPadrao other = (ScoDescricaoTecnicaPadrao) obj;
		if (getCodigo() == null) {
			if (other.getCodigo() != null) {
				return false;
			}
		} else if (!getCodigo().equals(other.getCodigo())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}