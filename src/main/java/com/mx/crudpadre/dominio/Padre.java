package com.mx.crudpadre.dominio;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PADRE")
@Data
@NoArgsConstructor
public class Padre {
	
	@Id
	@Column
	int idPadre;
	
	@Column
	String nombre;
	
	@Column
	String app;
	
	@Column
	String apm;
	
	@Column
	int edad;
	
	@Column
	String trabajo;
	
	@OneToMany(mappedBy = "padre", cascade = CascadeType.ALL)
	@JsonIgnore  
	List<Hijo> lista = new ArrayList<Hijo>();
	
	/* ANOTACIONES MAS USADAS DE LOMBOK
	 * @Getter: Genera los getters de los campos de una clase.
	 * 
	 * @Setter: Genera los seeters de los campos de una clase.
	 * 
	 * @EqualsAndHashCode: Genera metodos equals y hashCode de una clase
	 * 
	 * @ToString: Genera el metodo toString de una clase
	 * 
	 * @NoArgsConstructor: Genera un constructor sin argumnetos en la clase
	 * 
	 * @RequiredArgsConstructor: Genera un constructor con los campos 
	 * obligatorios de la clase.
	 * 
	 * @AllArgsConstructor: Genera un constructor con todos los campos 
	 * de la clase.
	 * 
	 * @Slf4j: inyecta un logger en una clase
	 * 
	 * esta es una anotacion com puesta donde va a englobar:
	 * @Data: La combinacion de las siguientes anotaciones
	 * @Getter, @Setter, @EqualsAndHashCode, @ToString, 
	 * @RequiredArgsConstructor
	 *   
	 */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
