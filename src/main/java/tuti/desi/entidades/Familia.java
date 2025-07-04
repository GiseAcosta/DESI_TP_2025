package tuti.desi.entidades;
import jakarta.persistence.*;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Date;

//GAcosta - Representa mi tabla Familia en la BD 
@Entity
public class Familia {
  
  	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer nroFamilia;
   
    private String nombre;
    
    private Date fechaRegistro;
    
    private Boolean deshabilitado = false;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "nro_familia_fk", referencedColumnName = "nroFamilia")
    private List<Asistido> integrantesFamiliaAsistida;

	public int getNroFamilia() {
        return nroFamilia;
    }
    public void setNroFamilia(Integer nroFamilia) {
        this.nroFamilia = nroFamilia;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Date getFechaRegistro() {
        return fechaRegistro;
    }
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
	public Boolean getDeshabilitado() {
		return deshabilitado;
	}
	public void setDeshabilitado(Boolean estaDeshabilitad) {
		deshabilitado = estaDeshabilitad;
	}
	
	public String getFechaRegistroToString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(fechaRegistro);
	}
	public List<Asistido> getIntegrantesFamiliaAsistida() {
		return integrantesFamiliaAsistida;
	}
	public void setIntegrantesFamiliaAsistida(List<Asistido> integrantesFamiliaAsistida) {
		this.integrantesFamiliaAsistida = integrantesFamiliaAsistida;
	}

    

}
