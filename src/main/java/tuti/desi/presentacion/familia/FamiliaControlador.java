package tuti.desi.presentacion.familia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import tuti.desi.servicios.FamiliaService;

import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class FamiliaControlador {

	@Autowired
	private FamiliaService servicio;
	
	@GetMapping("/familiaListar")
	public String ListarFamilias(Model modelo) {
		
		modelo.addAttribute("familia", servicio.listarFamilia());
		
		return "familiaListar";

	}
	
}
