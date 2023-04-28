package com.mx.crudpadre.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.crudpadre.dao.PadreDao;
import com.mx.crudpadre.dominio.Padre;
@Service
public class PadreServImpl implements PadreServ {

	@Autowired
	PadreDao papaDao;

	@Override
	public void guardar(Padre padre) {
		papaDao.save(padre);

	}

	@Override
	public void editar(Padre padre) {
		papaDao.save(padre);

	}

	@Override
	public void eliminar(Padre padre) {
		papaDao.delete(padre);

	}

	@Override
	public Padre buscar(Padre padre) {
		return papaDao.findById(padre.getIdPadre()).orElse(null);
	}

	@Override
	public List<Padre> listar() {
		return (List<Padre>) papaDao.findAll();		 
	}

}
