package tuti.desi.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuti.desi.accesoDatos.FamiliaRepositorio;
import tuti.desi.entidades.Familia;

@Service
public class FamiliaServiceImpl implements FamiliaService{

	@Autowired
	private FamiliaRepositorio familiaRepositorio;
	
	@Override
	public List<Familia> listarFamilia() {
		// TODO Auto-generated method stub
		return familiaRepositorio.findAll();
	}

	@Override
	public void SalvarFamilia(Familia familia) {
		familiaRepositorio.save(familia);
	}
}
