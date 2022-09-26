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

public class Detalle implements Serializable {

	private static final long serialVersionUID = 1L;

	private int iddetalle;
	private int idlibro;
	private int idprestamo;

	public int getIddetalle() {
		return iddetalle;
	}

	public void setIddetalle(int iddetalle) {
		this.iddetalle = iddetalle;
	}

	public int getIdlibro() {
		return idlibro;
	}

	public void setIdlibro(int idlibro) {
		this.idlibro = idlibro;
	}

	public int getIdprestamo() {
		return idprestamo;
	}

	public void setIdprestamo(int idprestamo) {
		this.idprestamo = idprestamo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
