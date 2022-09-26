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
public class Prestamo implements Serializable {

	private static final long serialVersionUID = 1L;

	private int idprestamo;
	private int idempleado;
	private int idalumno;
	private String fecha_prestamo_hora;
	private String fecha_devolución;

	public int getIdprestamo() {
		return idprestamo;
	}

	public void setIdprestamo(int idprestamo) {
		this.idprestamo = idprestamo;
	}

	public int getIdempleado() {
		return idempleado;
	}

	public void setIdempleado(int idempleado) {
		this.idempleado = idempleado;
	}

	public int getIdalumno() {
		return idalumno;
	}

	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}

	public String getFecha_prestamo_hora() {
		return fecha_prestamo_hora;
	}

	public void setFecha_prestamo_hora(String fecha_prestamo_hora) {
		this.fecha_prestamo_hora = fecha_prestamo_hora;
	}

	public String getFecha_devolución() {
		return fecha_devolución;
	}

	public void setFecha_devolución(String fecha_devolución) {
		this.fecha_devolución = fecha_devolución;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
