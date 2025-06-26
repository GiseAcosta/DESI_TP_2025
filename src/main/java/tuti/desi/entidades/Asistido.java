package tuti.desi.entidades;
import java.util.Date;
import jakarta.persistence.*;  

@Entity
public class Asistido  extends Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Atributo id autoincremental
    private Integer id;
    
    @Column(name = "fecha_registro")
    private Date fechaRegistro;
    
    @ManyToOne
    @JoinColumn(name = "familia_id") 
    private Familia familia;

    @OneToOne
    @JoinColumn(name = "persona_id")
    private Persona persona;
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

   

}
