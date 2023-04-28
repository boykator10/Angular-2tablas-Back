package com.mx.crudpadre.serv;

import java.util.List;

import com.mx.crudpadre.dominio.Hijo;

public interface HijoServ {
	
	public void guardar(Hijo hijo);

	public void editar(Hijo hijo);

	public void eliminar(Hijo hijo);

	public Hijo buscar(Hijo hijo);

	public List<Hijo> listar();

}
