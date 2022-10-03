package upeu.edu.pe.pyventas.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.daoImpl.AlumInicioDaoIMpl;
import upeu.edu.pe.pyventas.entity.AlumInicio;
@Service
public class AlumInicioService implements  Operaciones<AlumInicio>{

	@Autowired
	private AlumInicioDaoIMpl daoImpl;

	@Override
	public int create(AlumInicio t) {
		// TODO Auto-generated method stub
		return daoImpl.create(t);
	}

	@Override
	public int update(AlumInicio t, int id) {
		// TODO Auto-generated method stub
		return daoImpl.update(t, id);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return daoImpl.delete(id);
	}

	@Override
	public AlumInicio read(int id) {
		// TODO Auto-generated method stub
		return daoImpl.read(id);
	}

	@Override
	public List<AlumInicio> reaAll() {
		// TODO Auto-generated method stub
		return daoImpl.reaAll();
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}
 
}
