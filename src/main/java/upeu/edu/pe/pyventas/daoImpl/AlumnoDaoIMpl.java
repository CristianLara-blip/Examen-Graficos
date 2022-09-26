package upeu.edu.pe.pyventas.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.entity.Alumno;


@Component
public class AlumnoDaoIMpl implements Operaciones<Alumno> {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Alumno t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO (código, nombre, apellidos) VALUES(?,?,?)";
		return jdbcTemplate.update(SQL, t.getCódigo(), t.getNombre(), t.getApellidos());
	}

	@Override
	public int update(Alumno t, int id) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO (código, nombre, apellidos) VALUES(?,?,?)";
		return jdbcTemplate.update(SQL, t.getCódigo(), t.getNombre(), t.getApellidos());
	}


	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM alumno WHERE idalumno=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Alumno read(int id) {
		// TODO Auto-generated method stub
		try {
			Alumno alum = jdbcTemplate.queryForObject("SELECT * FROM alumno WHERE idalumno=?",
					BeanPropertyRowMapper.newInstance(Alumno.class), id);
			return alum;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}

	}

	@Override
	public List<Alumno> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM alumno", BeanPropertyRowMapper.newInstance(Alumno.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
