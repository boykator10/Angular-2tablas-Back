package com.mx.crudpadre.serv;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.crudpadre.dao.HijoDao;
import com.mx.crudpadre.dominio.Hijo;

@Service
public class HijoServImpl implements HijoServ {
	
	@Autowired
	HijoDao hijoDao;

	@Override
	public void guardar(Hijo hijo) {
		hijoDao.save(hijo);
		
	}

	@Override
	public void editar(Hijo hijo) {
		hijoDao.save(hijo);
		
	}

	@Override
	public void eliminar(Hijo hijo) {
		hijoDao.delete(hijo);
		
	}

	@Override
	public Hijo buscar(Hijo hijo) {
		return hijoDao.findById(hijo.getIdHijo()).orElse(null);
	}

	@Override
	public List<Hijo> listar() {
		return (List<Hijo>) hijoDao.findAll();	
	}

}
