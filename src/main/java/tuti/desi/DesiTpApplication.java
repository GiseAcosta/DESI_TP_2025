package tuti.desi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tuti.desi.accesoDatos.FamiliaRepositorio;
import tuti.desi.entidades.Familia;

@SpringBootApplication
public class DesiTpApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DesiTpApplication.class, args);
	}

	@Autowired
	private FamiliaRepositorio repositorio;
	
	@Override
	public void run(String... args) throws Exception {
		/*
		Familia familia1 = new Familia(0,"perez",null,true,null);
		repositorio.save(familia1);
		
		Familia familia2 = new Familia(1,"lopez",null,true,null);
		repositorio.save(familia2);
		
		Familia familia3 = new Familia(2, "acosta",null, false, null);
		repositorio.save(familia3);
	*/
	}
	
	

	
}
