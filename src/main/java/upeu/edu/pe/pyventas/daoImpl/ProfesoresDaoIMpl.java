package upeu.edu.pe.pyventas.daoImpl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.entity.Profesores;

@Component
public class ProfesoresDaoIMpl  implements Operaciones<Profesores>{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Profesores t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Profesores t, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Profesores read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Profesores> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select p.id_profesor, p2.nombre, d.nombre as\"departamento\"from profesor p\r\n"
				+ "inner join persona p2  \r\n"
				+ "on p.id_profesor= p2.id \r\n"
				+ "inner join departamento d \r\n"
				+ "on p.id_departamento= d.id ;", new BeanPropertyRowMapper<Profesores>(Profesores.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
