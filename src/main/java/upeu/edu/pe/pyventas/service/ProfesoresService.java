package upeu.edu.pe.pyventas.service;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.daoImpl.ProfesoresDaoIMpl;
import upeu.edu.pe.pyventas.entity.Profesores;
@Service

public class ProfesoresService implements  Operaciones<Profesores>{
	
	@Autowired
	private ProfesoresDaoIMpl daoImpl;

	@Override
	public int create(Profesores t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(Profesores t, int id) {
		// TODO Auto-generated method stub
		return daoImpl.update(t, id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return daoImpl.delete(id);
	}

	@Override
	public Profesores read(int id) {
		// TODO Auto-generated method stub
		return daoImpl.read(id);
	}

	@Override
	public List<Profesores> reaAll() {
		// TODO Auto-generated method stub
		return daoImpl.reaAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}
 
}
