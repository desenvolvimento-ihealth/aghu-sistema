package br.gov.mec.aghu.model;

// Generated 26/06/2010 18:11:31 by Hibernate Tools 3.3.0.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import org.hibernate.annotations.Immutable;
import org.hibernate.annotations.Parameter;

import br.gov.mec.aghu.constante.ConstanteAghCaractUnidFuncionais;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AghCaractUnidFuncionaisJn generated by hbm2java
 */
@Entity
@Table(name = "AGH_CARACT_UNID_FUNCIONAIS_JN", schema = "AGH")
@SequenceGenerator(name = "aghCunJnSeq", sequenceName = "AGH.AGH_CUN_JN_SEQ", allocationSize = 1)

@Immutable
public class AghCaractUnidFuncionaisJn extends BaseJournal implements
		java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6721948665966251818L;
	private Integer unfSeq;
	private ConstanteAghCaractUnidFuncionais caracteristica;
	private Integer serMatricula;
	private Short serVinCodigo;

	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aghCunJnSeq")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "UNF_SEQ", nullable = false, precision = 4, scale = 0)
	public Integer getUnfSeq() {
		return this.unfSeq;
	}

	public void setUnfSeq(Integer unfSeq) {
		this.unfSeq = unfSeq;
	}

	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.model.jpa.DominioStringUserType", parameters = @Parameter(name = "enumClassName", value = "br.gov.mec.aghu.core.constante.ConstanteAghCaractUnidFuncionais"))
	@Column(name = "CARACTERISTICA", nullable = false, length = 30)
	public ConstanteAghCaractUnidFuncionais getCaracteristica() {
		return this.caracteristica;
	}

	public void setCaracteristica(
			ConstanteAghCaractUnidFuncionais caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Column(name = "SER_MATRICULA", precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	public enum Fields {

		UNF_SEQ("unfSeq"),
		CARACTERISTICA("caracteristica"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo");

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