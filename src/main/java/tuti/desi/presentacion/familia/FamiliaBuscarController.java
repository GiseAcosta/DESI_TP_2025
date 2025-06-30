package tuti.desi.presentacion.familia;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import tuti.desi.servicios.FamiliaService;

@Controller
@RequestMapping("/familia/buscar")
public class FamiliaBuscarController {
	
	@Autowired
	private FamiliaService servicio;
	
	@GetMapping
	public String mostrarFamilia(Model modelo) {
		
		modelo.addAttribute("familias", servicio.listarFamilia());
        return "familia/listar";
	}
}

