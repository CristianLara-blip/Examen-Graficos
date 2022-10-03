package upeu.edu.pe.pyventas.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.entity.AlumInicio;

@Component
public class AlumInicioDaoIMpl implements Operaciones<AlumInicio> {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(AlumInicio t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(AlumInicio t, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public AlumInicio read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AlumInicio> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select p.nombre, c.anyo_inicio from alumno_se_matricula_asignatura asma \r\n"
				+ "inner join persona p  \r\n"
				+ "on asma.id_alumno=  p.id  \r\n"
				+ "inner join curso_escolar c  \r\n"
				+ "on  asma.id_curso_escolar= c.id;", new BeanPropertyRowMapper<AlumInicio>(AlumInicio.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
