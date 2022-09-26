package upeu.edu.pe.pyventas.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.entity.Empleado;


@Component
public class EmpleadoDaoIMpl implements Operaciones<Empleado> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Empleado t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO (usuario, clave, estado) VALUES(?,?,?)";
		return jdbcTemplate.update(SQL, t.getUsuario(), t.getClave(), t.getEstado());
	}

	@Override
	public int update(Empleado t, int id) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO (usuario, clave, estado) VALUES(?,?,?)";
		return jdbcTemplate.update(SQL, t.getUsuario(), t.getClave(), t.getEstado());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM producto WHERE idempleado=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Empleado read(int id) {
		// TODO Auto-generated method stub
		try {
			Empleado emp = jdbcTemplate.queryForObject("SELECT * FROM empleado WHERE idempleado=?",
					BeanPropertyRowMapper.newInstance(Empleado.class), id);
			return emp;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}

	}

	@Override
	public List<Empleado> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM empleado", BeanPropertyRowMapper.newInstance(Empleado.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

}
