package upeu.edu.pe.pyventas.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlumInicio {

	private static final long serialVersionUID = 1L;

	private String nombre;
	private String anyo_inicio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAnyo_inicio() {
		return anyo_inicio;
	}
	public void setAnyo_inicio(String anyo_inicio) {
		this.anyo_inicio = anyo_inicio;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
