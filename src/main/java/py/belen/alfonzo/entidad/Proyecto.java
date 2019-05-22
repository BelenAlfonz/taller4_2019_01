package py.belen.alfonzo.entidad;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Proyecto {
	
	@Id
	@GeneratedValue
	private int codigo;
	private String descripcion;
	

}
