package upeu.edu.pe.pyventas.service;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.daoImpl.AlumnosDaoIMpl;
import upeu.edu.pe.pyventas.daoImpl.EstudiantesDaoIMpl;
import upeu.edu.pe.pyventas.entity.Alumnos;
import upeu.edu.pe.pyventas.entity.Estudiantes;


@Service
public class EstudiantesService implements Operaciones<Estudiantes> {
	
	@Autowired
	private EstudiantesDaoIMpl daoImpl;

	@Override
	public int create(Estudiantes t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Estudiantes t, int id) {
		// TODO Auto-generated method stub
		return daoImpl.update(t, id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return daoImpl.delete(id);
	}

	@Override
	public Estudiantes read(int id) {
		// TODO Auto-generated method stub
		return daoImpl.read(id);
	}

	@Override
	public List<Estudiantes> reaAll() {
		// TODO Auto-generated method stub
		return daoImpl.reaAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}
}
