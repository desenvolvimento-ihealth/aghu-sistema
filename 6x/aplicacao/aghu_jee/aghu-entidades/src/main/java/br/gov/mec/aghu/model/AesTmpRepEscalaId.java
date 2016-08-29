package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AesTmpRepEscalaId generated by hbm2java
 */
@Embeddable
public class AesTmpRepEscalaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6848103566390000855L;
	private Double sessao;
	private String usuario;
	private Integer areCodigo;
	private Integer cctCodigo;
	private String tgtCodigo;
	private Short strCodigo;
	private String cargo;
	private String nome;
	private Short folgas;
	private Integer matricula;
	private Short entrTurno01;
	private Short identificador;
	private String c00;
	private String c01;
	private String c02;
	private String c03;
	private String c04;
	private String c05;
	private String c06;
	private String c07;
	private String c08;
	private String c09;
	private String c10;
	private String c11;
	private String c12;
	private String c13;
	private String c14;
	private String c15;
	private String c16;
	private String c17;
	private String c18;
	private String c19;
	private String c20;
	private String c21;
	private String c22;
	private String c23;
	private String c24;
	private String c25;
	private String c26;
	private String c27;
	private String c28;
	private String c29;
	private String c30;
	private String ocaCarCodigo;
	private Integer version;

	public AesTmpRepEscalaId() {
	}

	public AesTmpRepEscalaId(Double sessao, String usuario, Integer areCodigo, String cargo, String nome, Short folgas, Integer matricula,
			Short entrTurno01, Short identificador, Integer version) {
		this.sessao = sessao;
		this.usuario = usuario;
		this.areCodigo = areCodigo;
		this.cargo = cargo;
		this.nome = nome;
		this.folgas = folgas;
		this.matricula = matricula;
		this.entrTurno01 = entrTurno01;
		this.identificador = identificador;
		this.version = version;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public AesTmpRepEscalaId(Double sessao, String usuario, Integer areCodigo, Integer cctCodigo, String tgtCodigo, Short strCodigo,
			String cargo, String nome, Short folgas, Integer matricula, Short entrTurno01, Short identificador, String c00, String c01,
			String c02, String c03, String c04, String c05, String c06, String c07, String c08, String c09, String c10, String c11,
			String c12, String c13, String c14, String c15, String c16, String c17, String c18, String c19, String c20, String c21,
			String c22, String c23, String c24, String c25, String c26, String c27, String c28, String c29, String c30,
			String ocaCarCodigo, Integer version) {
		this.sessao = sessao;
		this.usuario = usuario;
		this.areCodigo = areCodigo;
		this.cctCodigo = cctCodigo;
		this.tgtCodigo = tgtCodigo;
		this.strCodigo = strCodigo;
		this.cargo = cargo;
		this.nome = nome;
		this.folgas = folgas;
		this.matricula = matricula;
		this.entrTurno01 = entrTurno01;
		this.identificador = identificador;
		this.c00 = c00;
		this.c01 = c01;
		this.c02 = c02;
		this.c03 = c03;
		this.c04 = c04;
		this.c05 = c05;
		this.c06 = c06;
		this.c07 = c07;
		this.c08 = c08;
		this.c09 = c09;
		this.c10 = c10;
		this.c11 = c11;
		this.c12 = c12;
		this.c13 = c13;
		this.c14 = c14;
		this.c15 = c15;
		this.c16 = c16;
		this.c17 = c17;
		this.c18 = c18;
		this.c19 = c19;
		this.c20 = c20;
		this.c21 = c21;
		this.c22 = c22;
		this.c23 = c23;
		this.c24 = c24;
		this.c25 = c25;
		this.c26 = c26;
		this.c27 = c27;
		this.c28 = c28;
		this.c29 = c29;
		this.c30 = c30;
		this.ocaCarCodigo = ocaCarCodigo;
		this.version = version;
	}

	@Column(name = "SESSAO", nullable = false, precision = 17, scale = 17)
	public Double getSessao() {
		return this.sessao;
	}

	public void setSessao(Double sessao) {
		this.sessao = sessao;
	}

	@Column(name = "USUARIO", nullable = false, length = 30)
	@Length(max = 30)
	public String getUsuario() {
		return this.usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	@Column(name = "ARE_CODIGO", nullable = false)
	public Integer getAreCodigo() {
		return this.areCodigo;
	}

	public void setAreCodigo(Integer areCodigo) {
		this.areCodigo = areCodigo;
	}

	@Column(name = "CCT_CODIGO")
	public Integer getCctCodigo() {
		return this.cctCodigo;
	}

	public void setCctCodigo(Integer cctCodigo) {
		this.cctCodigo = cctCodigo;
	}

	@Column(name = "TGT_CODIGO", length = 5)
	@Length(max = 5)
	public String getTgtCodigo() {
		return this.tgtCodigo;
	}

	public void setTgtCodigo(String tgtCodigo) {
		this.tgtCodigo = tgtCodigo;
	}

	@Column(name = "STR_CODIGO")
	public Short getStrCodigo() {
		return this.strCodigo;
	}

	public void setStrCodigo(Short strCodigo) {
		this.strCodigo = strCodigo;
	}

	@Column(name = "CARGO", nullable = false, length = 45)
	@Length(max = 45)
	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Column(name = "NOME", nullable = false, length = 50)
	@Length(max = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "FOLGAS", nullable = false)
	public Short getFolgas() {
		return this.folgas;
	}

	public void setFolgas(Short folgas) {
		this.folgas = folgas;
	}

	@Column(name = "MATRICULA", nullable = false)
	public Integer getMatricula() {
		return this.matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Column(name = "ENTR_TURNO_01", nullable = false)
	public Short getEntrTurno01() {
		return this.entrTurno01;
	}

	public void setEntrTurno01(Short entrTurno01) {
		this.entrTurno01 = entrTurno01;
	}

	@Column(name = "IDENTIFICADOR", nullable = false)
	public Short getIdentificador() {
		return this.identificador;
	}

	public void setIdentificador(Short identificador) {
		this.identificador = identificador;
	}

	@Column(name = "C00", length = 3)
	@Length(max = 3)
	public String getC00() {
		return this.c00;
	}

	public void setC00(String c00) {
		this.c00 = c00;
	}

	@Column(name = "C01", length = 3)
	@Length(max = 3)
	public String getC01() {
		return this.c01;
	}

	public void setC01(String c01) {
		this.c01 = c01;
	}

	@Column(name = "C02", length = 3)
	@Length(max = 3)
	public String getC02() {
		return this.c02;
	}

	public void setC02(String c02) {
		this.c02 = c02;
	}

	@Column(name = "C03", length = 3)
	@Length(max = 3)
	public String getC03() {
		return this.c03;
	}

	public void setC03(String c03) {
		this.c03 = c03;
	}

	@Column(name = "C04", length = 3)
	@Length(max = 3)
	public String getC04() {
		return this.c04;
	}

	public void setC04(String c04) {
		this.c04 = c04;
	}

	@Column(name = "C05", length = 3)
	@Length(max = 3)
	public String getC05() {
		return this.c05;
	}

	public void setC05(String c05) {
		this.c05 = c05;
	}

	@Column(name = "C06", length = 3)
	@Length(max = 3)
	public String getC06() {
		return this.c06;
	}

	public void setC06(String c06) {
		this.c06 = c06;
	}

	@Column(name = "C07", length = 3)
	@Length(max = 3)
	public String getC07() {
		return this.c07;
	}

	public void setC07(String c07) {
		this.c07 = c07;
	}

	@Column(name = "C08", length = 3)
	@Length(max = 3)
	public String getC08() {
		return this.c08;
	}

	public void setC08(String c08) {
		this.c08 = c08;
	}

	@Column(name = "C09", length = 3)
	@Length(max = 3)
	public String getC09() {
		return this.c09;
	}

	public void setC09(String c09) {
		this.c09 = c09;
	}

	@Column(name = "C10", length = 3)
	@Length(max = 3)
	public String getC10() {
		return this.c10;
	}

	public void setC10(String c10) {
		this.c10 = c10;
	}

	@Column(name = "C11", length = 3)
	@Length(max = 3)
	public String getC11() {
		return this.c11;
	}

	public void setC11(String c11) {
		this.c11 = c11;
	}

	@Column(name = "C12", length = 3)
	@Length(max = 3)
	public String getC12() {
		return this.c12;
	}

	public void setC12(String c12) {
		this.c12 = c12;
	}

	@Column(name = "C13", length = 3)
	@Length(max = 3)
	public String getC13() {
		return this.c13;
	}

	public void setC13(String c13) {
		this.c13 = c13;
	}

	@Column(name = "C14", length = 3)
	@Length(max = 3)
	public String getC14() {
		return this.c14;
	}

	public void setC14(String c14) {
		this.c14 = c14;
	}

	@Column(name = "C15", length = 3)
	@Length(max = 3)
	public String getC15() {
		return this.c15;
	}

	public void setC15(String c15) {
		this.c15 = c15;
	}

	@Column(name = "C16", length = 3)
	@Length(max = 3)
	public String getC16() {
		return this.c16;
	}

	public void setC16(String c16) {
		this.c16 = c16;
	}

	@Column(name = "C17", length = 3)
	@Length(max = 3)
	public String getC17() {
		return this.c17;
	}

	public void setC17(String c17) {
		this.c17 = c17;
	}

	@Column(name = "C18", length = 3)
	@Length(max = 3)
	public String getC18() {
		return this.c18;
	}

	public void setC18(String c18) {
		this.c18 = c18;
	}

	@Column(name = "C19", length = 3)
	@Length(max = 3)
	public String getC19() {
		return this.c19;
	}

	public void setC19(String c19) {
		this.c19 = c19;
	}

	@Column(name = "C20", length = 3)
	@Length(max = 3)
	public String getC20() {
		return this.c20;
	}

	public void setC20(String c20) {
		this.c20 = c20;
	}

	@Column(name = "C21", length = 3)
	@Length(max = 3)
	public String getC21() {
		return this.c21;
	}

	public void setC21(String c21) {
		this.c21 = c21;
	}

	@Column(name = "C22", length = 3)
	@Length(max = 3)
	public String getC22() {
		return this.c22;
	}

	public void setC22(String c22) {
		this.c22 = c22;
	}

	@Column(name = "C23", length = 3)
	@Length(max = 3)
	public String getC23() {
		return this.c23;
	}

	public void setC23(String c23) {
		this.c23 = c23;
	}

	@Column(name = "C24", length = 3)
	@Length(max = 3)
	public String getC24() {
		return this.c24;
	}

	public void setC24(String c24) {
		this.c24 = c24;
	}

	@Column(name = "C25", length = 3)
	@Length(max = 3)
	public String getC25() {
		return this.c25;
	}

	public void setC25(String c25) {
		this.c25 = c25;
	}

	@Column(name = "C26", length = 3)
	@Length(max = 3)
	public String getC26() {
		return this.c26;
	}

	public void setC26(String c26) {
		this.c26 = c26;
	}

	@Column(name = "C27", length = 3)
	@Length(max = 3)
	public String getC27() {
		return this.c27;
	}

	public void setC27(String c27) {
		this.c27 = c27;
	}

	@Column(name = "C28", length = 3)
	@Length(max = 3)
	public String getC28() {
		return this.c28;
	}

	public void setC28(String c28) {
		this.c28 = c28;
	}

	@Column(name = "C29", length = 3)
	@Length(max = 3)
	public String getC29() {
		return this.c29;
	}

	public void setC29(String c29) {
		this.c29 = c29;
	}

	@Column(name = "C30", length = 3)
	@Length(max = 3)
	public String getC30() {
		return this.c30;
	}

	public void setC30(String c30) {
		this.c30 = c30;
	}

	@Column(name = "OCA_CAR_CODIGO", length = 10)
	@Length(max = 10)
	public String getOcaCarCodigo() {
		return this.ocaCarCodigo;
	}

	public void setOcaCarCodigo(String ocaCarCodigo) {
		this.ocaCarCodigo = ocaCarCodigo;
	}

	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getCargo());
		umHashCodeBuilder.append(this.getNome());
		umHashCodeBuilder.append(this.getMatricula());
		umHashCodeBuilder.append(this.getCctCodigo());
		umHashCodeBuilder.append(this.getUsuario());
		umHashCodeBuilder.append(this.getAreCodigo());
		umHashCodeBuilder.append(this.getTgtCodigo());
		umHashCodeBuilder.append(this.getSessao());
		umHashCodeBuilder.append(this.getStrCodigo());
		umHashCodeBuilder.append(this.getFolgas());
		umHashCodeBuilder.append(this.getEntrTurno01());
		umHashCodeBuilder.append(this.getIdentificador());
		umHashCodeBuilder.append(this.getC00());
		umHashCodeBuilder.append(this.getC01());
		umHashCodeBuilder.append(this.getC02());
		umHashCodeBuilder.append(this.getC03());
		umHashCodeBuilder.append(this.getC04());
		umHashCodeBuilder.append(this.getC05());
		umHashCodeBuilder.append(this.getC06());
		umHashCodeBuilder.append(this.getC07());
		umHashCodeBuilder.append(this.getC08());
		umHashCodeBuilder.append(this.getC09());
		umHashCodeBuilder.append(this.getC10());
		umHashCodeBuilder.append(this.getC11());
		umHashCodeBuilder.append(this.getC12());
		umHashCodeBuilder.append(this.getC13());
		umHashCodeBuilder.append(this.getC14());
		umHashCodeBuilder.append(this.getC15());
		umHashCodeBuilder.append(this.getC16());
		umHashCodeBuilder.append(this.getC17());
		umHashCodeBuilder.append(this.getC18());
		umHashCodeBuilder.append(this.getC19());
		umHashCodeBuilder.append(this.getC20());
		umHashCodeBuilder.append(this.getC21());
		umHashCodeBuilder.append(this.getC22());
		umHashCodeBuilder.append(this.getC23());
		umHashCodeBuilder.append(this.getC24());
		umHashCodeBuilder.append(this.getC25());
		umHashCodeBuilder.append(this.getC26());
		umHashCodeBuilder.append(this.getC27());
		umHashCodeBuilder.append(this.getC28());
		umHashCodeBuilder.append(this.getC29());
		umHashCodeBuilder.append(this.getC30());
		umHashCodeBuilder.append(this.getOcaCarCodigo());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof AesTmpRepEscalaId)) {
			return false;
		}
		AesTmpRepEscalaId other = (AesTmpRepEscalaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getCargo(), other.getCargo());
		umEqualsBuilder.append(this.getNome(), other.getNome());
		umEqualsBuilder.append(this.getMatricula(), other.getMatricula());
		umEqualsBuilder.append(this.getCctCodigo(), other.getCctCodigo());
		umEqualsBuilder.append(this.getUsuario(), other.getUsuario());
		umEqualsBuilder.append(this.getAreCodigo(), other.getAreCodigo());
		umEqualsBuilder.append(this.getTgtCodigo(), other.getTgtCodigo());
		umEqualsBuilder.append(this.getSessao(), other.getSessao());
		umEqualsBuilder.append(this.getStrCodigo(), other.getStrCodigo());
		umEqualsBuilder.append(this.getFolgas(), other.getFolgas());
		umEqualsBuilder.append(this.getEntrTurno01(), other.getEntrTurno01());
		umEqualsBuilder.append(this.getIdentificador(), other.getIdentificador());
		umEqualsBuilder.append(this.getC00(), other.getC00());
		umEqualsBuilder.append(this.getC01(), other.getC01());
		umEqualsBuilder.append(this.getC02(), other.getC02());
		umEqualsBuilder.append(this.getC03(), other.getC03());
		umEqualsBuilder.append(this.getC04(), other.getC04());
		umEqualsBuilder.append(this.getC05(), other.getC05());
		umEqualsBuilder.append(this.getC06(), other.getC06());
		umEqualsBuilder.append(this.getC07(), other.getC07());
		umEqualsBuilder.append(this.getC08(), other.getC08());
		umEqualsBuilder.append(this.getC09(), other.getC09());
		umEqualsBuilder.append(this.getC10(), other.getC10());
		umEqualsBuilder.append(this.getC11(), other.getC11());
		umEqualsBuilder.append(this.getC12(), other.getC12());
		umEqualsBuilder.append(this.getC13(), other.getC13());
		umEqualsBuilder.append(this.getC14(), other.getC14());
		umEqualsBuilder.append(this.getC15(), other.getC15());
		umEqualsBuilder.append(this.getC16(), other.getC16());
		umEqualsBuilder.append(this.getC17(), other.getC17());
		umEqualsBuilder.append(this.getC18(), other.getC18());
		umEqualsBuilder.append(this.getC19(), other.getC19());
		umEqualsBuilder.append(this.getC20(), other.getC20());
		umEqualsBuilder.append(this.getC21(), other.getC21());
		umEqualsBuilder.append(this.getC22(), other.getC22());
		umEqualsBuilder.append(this.getC23(), other.getC23());
		umEqualsBuilder.append(this.getC24(), other.getC24());
		umEqualsBuilder.append(this.getC25(), other.getC25());
		umEqualsBuilder.append(this.getC26(), other.getC26());
		umEqualsBuilder.append(this.getC27(), other.getC27());
		umEqualsBuilder.append(this.getC28(), other.getC28());
		umEqualsBuilder.append(this.getC29(), other.getC29());
		umEqualsBuilder.append(this.getC30(), other.getC30());
		umEqualsBuilder.append(this.getOcaCarCodigo(), other.getOcaCarCodigo());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}