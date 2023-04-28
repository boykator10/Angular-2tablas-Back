package com.mx.crudpadre.serv;

import java.util.List;

import com.mx.crudpadre.dominio.Padre;

public interface PadreServ {
	public void guardar(Padre padre);

	public void editar(Padre padre);

	public void eliminar(Padre padre);

	public Padre buscar(Padre padre);

	public List<Padre> listar();

}
