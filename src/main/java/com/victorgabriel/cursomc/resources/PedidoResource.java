package com.victorgabriel.cursomc.resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.victorgabriel.cursomc.domain.Pedido;
import com.victorgabriel.cursomc.services.PedidoService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value="/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService PedidoService;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) throws ObjectNotFoundException {
		
		Pedido obj= PedidoService.buscar(id);
		
		return ResponseEntity.ok().body(obj);
	}
	
}
