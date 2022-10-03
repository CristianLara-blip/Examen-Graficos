package upeu.edu.pe.pyventas.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.entity.Alumnos;


@Component
public class AlumnosDaoIMpl implements Operaciones<Alumnos> {
	@Autowired
	private JdbcTemplate jdbcTemplate;


	@Override
	public int create(Alumnos t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Alumnos t, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Alumnos read(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Alumnos> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select p.nombre, p.sexo, a.nombre as \"curso\" ,g.nombre as \"grado\" from alumno_se_matricula_asignatura asma \r\n"
				+ "inner join persona p  \r\n"
				+ "on asma.id_alumno=  p.id  \r\n"
				+ "inner join asignatura a  \r\n"
				+ "on  asma.id_asignatura= a.id\r\n"
				+ "inner join grado g  \r\n"
				+ "on  a.id_grado  = g.id;", new BeanPropertyRowMapper<Alumnos>(Alumnos.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
