package br.com.springschool.domain;

import jakarta.persistence.*;

@Entity
public class Area {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idarea;
	@Column(nullable = false)
	private String tituloarea;

	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Area(Integer idarea, String tituloarea) {
		super();
		this.idarea = idarea;
		this.tituloarea = tituloarea;
	}

	public Integer getIdarea() {
		return idarea;
	}

	public void setIdarea(Integer idarea) {
		this.idarea = idarea;
	}

	public String getTituloarea() {
		return tituloarea;
	}

	public void setTituloarea(String tituloarea) {
		this.tituloarea = tituloarea;
	}

}
