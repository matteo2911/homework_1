package it.uniroma3.siw.model;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;


@Entity
@NamedQuery(name = "findAllCorso", query = "SELECT c FROM Corso")

public class Corso {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(nullable =false)
	private String nome;
	
	@Column(nullable = false)
	private int durataMesi;
	
	@Column (nullable = false)
	private LocalDate dataInizio;
	
	@ManyToOne
	private Allievo allievo;
	
	
	public Corso(){
		
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDurataMesi() {
		return durataMesi;
	}
	public void setDurataMesi(int durataMesi) {
		this.durataMesi = durataMesi;
	}
	public LocalDate getDataInizio() {
		return dataInizio;
	}
	public void setDataInizio(LocalDate dataInizio) {
		this.dataInizio = dataInizio;
	}
	
}
