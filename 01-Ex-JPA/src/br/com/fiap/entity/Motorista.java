package br.com.fiap.entity;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="T_MOTORISTA")
public class Motorista {

	@Id
	@Column(name="nr_carteira")
	private int numeroCarteira;
	
	@Column(name="nm_motorista",nullable=false,length=150)
	private String motorista;
	
	@Temporal(TemporalType.DATE)
	@Column(name="dt_nascimento")
	private Calendar nascimento;
	
	@Lob
	@Column(name="fl_carteira")
	private Byte[] documentoCarteira;
	
	
	@Column(name="ds_genero")
	@Enumerated(EnumType.STRING)
	private Genero genero;


	public int getNumeroCarteira() {
		return numeroCarteira;
	}


	public void setNumeroCarteira(int numeroCarteira) {
		this.numeroCarteira = numeroCarteira;
	}


	public String getMotorista() {
		return motorista;
	}


	public void setMotorista(String motorista) {
		this.motorista = motorista;
	}


	public Calendar getNascimento() {
		return nascimento;
	}


	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}


	public Byte[] getDocumentoCarteira() {
		return documentoCarteira;
	}


	public void setDocumentoCarteira(Byte[] documentoCarteira) {
		this.documentoCarteira = documentoCarteira;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	public Motorista(int numeroCarteira, String motorista, Calendar nascimento, Byte[] documentoCarteira,
			Genero genero) {
		super();
		this.numeroCarteira = numeroCarteira;
		this.motorista = motorista;
		this.nascimento = nascimento;
		this.documentoCarteira = documentoCarteira;
		this.genero = genero;
	}


	public Motorista(String motorista, Calendar nascimento, Byte[] documentoCarteira, Genero genero) {
		super();
		this.motorista = motorista;
		this.nascimento = nascimento;
		this.documentoCarteira = documentoCarteira;
		this.genero = genero;
	}


	public Motorista() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}






