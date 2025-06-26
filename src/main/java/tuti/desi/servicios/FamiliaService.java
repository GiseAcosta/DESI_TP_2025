package tuti.desi.servicios;

import java.util.List;

import tuti.desi.entidades.Familia;

public interface FamiliaService {
	
	List<Familia> listarFamilia();
	
	//Mensaje cambio void por string
	void SalvarFamilia(Familia familia);
}
