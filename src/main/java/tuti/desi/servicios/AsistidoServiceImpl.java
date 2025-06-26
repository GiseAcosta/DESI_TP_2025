package tuti.desi.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tuti.desi.accesoDatos.AsistidoRepositorio;
import tuti.desi.entidades.Asistido;

@Service
public class AsistidoServiceImpl implements AsistidoService {

	@Autowired
	private AsistidoRepositorio asistidoRepositorio;
	
	@Override
	public String SalvarAsistido (Asistido asistido) {
		Asistido asistidoPersona = asistidoRepositorio.findById(asistido.getDni()).orElse(null);
		if (asistidoPersona == null) {
			asistidoRepositorio.save(asistido);
		}
		else {
			String mensaje ="Existe otra persona con el mismo DNI";
			return mensaje;
		}
		String mensaje ="Se guardo correctamente";
		return mensaje;
		
	}
}
