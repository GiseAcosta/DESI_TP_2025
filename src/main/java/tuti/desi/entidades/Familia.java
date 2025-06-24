package tuti.desi.entidades;
import jakarta.persistence.*;
import java.util.List;
import java.util.Date;

@Entity
public class Familia {
  
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int nroFamilia;
    private String nombre;
    private Date fechaRegistro;
    private Boolean Deshabilitado;


    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "nro_familia_fk", referencedColumnName = "nroFamilia")
    private List<Asistido> integrantesFamiliaAsistida;

    
    
  
	public Familia(int nroFamilia, String nombre, Date fechaRegistro, Boolean deshabilitado,
			List<Asistido> integrantesFamiliaAsistida) {
		super();
		this.nroFamilia = nroFamilia;
		this.nombre = nombre;
		this.fechaRegistro = fechaRegistro;
		Deshabilitado = deshabilitado;
		this.integrantesFamiliaAsistida = integrantesFamiliaAsistida;
	}
    
    public int getNroFamilia() {
        return nroFamilia;
    }
    public void setNroFamilia(int nroFamilia) {
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
		return Deshabilitado;
	}
	public void setDeshabilitado(Boolean deshabilitado) {
		Deshabilitado = deshabilitado;
	}
	
	

    

}
