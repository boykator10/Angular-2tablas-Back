package com.mx.crudpadre.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.crudpadre.dominio.Hijo;
import com.mx.crudpadre.serv.HijoServ;



@RestController
@RequestMapping("api/Hijo")
public class HijoWs {
	
	@Autowired
	HijoServ hijoServ;
	
	// http://localhost:7080/api/Hijo/listar
	@GetMapping("listar")
	 public List<Hijo> listar(){
		 var listar = hijoServ.listar();
		 return listar;
	 }
	 
	 @PostMapping("buscar")
	 public Hijo buscar(@RequestBody Hijo hijo) {
		 hijo = hijoServ.buscar(hijo);
		 return hijo;
	 }
	 
	 @PostMapping("guardar")
	 public void guardar(@RequestBody Hijo hijo) {
		 hijoServ.guardar(hijo);		 
	 }
	 
	 @PostMapping("editar")
	 public void editar(@RequestBody Hijo hijo) {
		 hijoServ.editar(hijo);		 
	 }
	 
	 @PostMapping("eliminar")
	 public void eliminar(@RequestBody Hijo hijo) {
		 hijoServ.eliminar(hijo);		 
	 }
	
	

}
