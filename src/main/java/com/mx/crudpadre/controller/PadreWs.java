package com.mx.crudpadre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.crudpadre.dominio.Padre;
import com.mx.crudpadre.serv.PadreServ;

@RestController
@RequestMapping("api/Padre")
public class PadreWs {
	
	@Autowired
	PadreServ padreServ;
	
	// http://localhost:7080/api/Padre/listar
	 @GetMapping("lista")
	 public List<Padre> lista(){
		 var lista = padreServ.listar();
		 return lista;
	 }
	 
	 @PostMapping("buscar")
	 public Padre buscar(@RequestBody Padre padre) {
		 padre = padreServ.buscar(padre);
		 return padre;
	 }
	 
	 @PostMapping("guardar")
	 public void guardar(@RequestBody Padre padre) {
		 padreServ.guardar(padre);		 
	 }
	 
	 @PostMapping("editar")
	 public void editar(@RequestBody Padre padre) {
		 padreServ.editar(padre);		 
	 }
	 
	 @PostMapping("eliminar")
	 public void eliminar(@RequestBody Padre padre) {
		 padreServ.eliminar(padre);		 
	 }
}
