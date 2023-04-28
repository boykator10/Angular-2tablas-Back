package com.mx.crudpadre.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="HIJO")
@Data
@NoArgsConstructor
public class Hijo {
	@Id 
	@Column
	int idHijo;
	
	@Column
	String nombre;
	
	@Column
	String app;
	
	@Column
	int edad;
	
	@Column
	String hobbie;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="PADRE_ID")
	Padre padre;

}
