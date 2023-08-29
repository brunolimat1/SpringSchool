package br.com.springschool.domain;

import jakarta.persistence.*;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcurso;
	@Column(nullable = false)
	private String titulocurso;
	@Column(nullable = false)
	private String descricao;
	@Column(nullable = false)
	private String cargahoraria;
	@OneToOne
	@JoinColumn(name = "idarea")
	private Area area;
	@OneToOne
	@JoinColumn(name = "idunidade")
	private Unidade unidade;

	public Curso() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Curso(Integer idcurso, String titulocurso, String descricao, String cargahoraria, Area area,
			Unidade unidade) {
		super();
		this.idcurso = idcurso;
		this.titulocurso = titulocurso;
		this.descricao = descricao;
		this.cargahoraria = cargahoraria;
		this.area = area;
		this.unidade = unidade;
	}

	public Integer getIdcurso() {
		return idcurso;
	}

	public void setIdcurso(Integer idcurso) {
		this.idcurso = idcurso;
	}

	public String getTitulocurso() {
		return titulocurso;
	}

	public void setTitulocurso(String titulocurso) {
		this.titulocurso = titulocurso;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCargahoraria() {
		return cargahoraria;
	}

	public void setCargahoraria(String cargahoraria) {
		this.cargahoraria = cargahoraria;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public Unidade getUnidade() {
		return unidade;
	}

	public void setUnidade(Unidade unidade) {
		this.unidade = unidade;
	}

}
