package upeu.edu.pe.pyventas.daoImpl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.entity.Estudiantes;

@Component
public class EstudiantesDaoIMpl implements Operaciones<Estudiantes> {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Estudiantes t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Estudiantes t, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Estudiantes read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Estudiantes> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select p.nombre, p.telefono from alumno_se_matricula_asignatura asma \r\n"
				+ "inner join persona p  \r\n"
				+ "on asma.id_alumno=  p.id;", new BeanPropertyRowMapper<Estudiantes>(Estudiantes.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

