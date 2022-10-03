package upeu.edu.pe.pyventas.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.daoImpl.AlumnosDaoIMpl;
import upeu.edu.pe.pyventas.entity.Alumnos;


@Service
public class AlumnosService implements Operaciones<Alumnos>{

	@Autowired
	private AlumnosDaoIMpl daoImpl;

	@Override
	public int create(Alumnos t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Alumnos t, int id) {
		// TODO Auto-generated method stub
		return daoImpl.update(t, id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return daoImpl.delete(id);
	}

	@Override
	public Alumnos read(int id) {
		// TODO Auto-generated method stub
		return daoImpl.read(id);
	}

	@Override
	public List<Alumnos> reaAll() {
		// TODO Auto-generated method stub
		return daoImpl.reaAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}
}
