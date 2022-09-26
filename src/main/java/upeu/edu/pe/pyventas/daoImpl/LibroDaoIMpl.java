package upeu.edu.pe.pyventas.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.entity.Libro;


@Component
public class LibroDaoIMpl implements Operaciones<Libro>{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Libro t) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO (nombre, autor, editorial) VALUES(?,?,?)";
		return jdbcTemplate.update(SQL, t.getNombre(), t.getAutor(), t.getEditorial());
	}

	@Override
	public int update(Libro t, int id) {
		// TODO Auto-generated method stub
		String SQL = "INSERT INTO (nombre, autor, editorial) VALUES(?,?,?)";
		return jdbcTemplate.update(SQL, t.getNombre(), t.getAutor(), t.getEditorial());
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM libro WHERE idlibro=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Libro read(int id) {
		// TODO Auto-generated method stub
		try {
			Libro lib = jdbcTemplate.queryForObject("SELECT * FROM libro WHERE idlibro=?",
					BeanPropertyRowMapper.newInstance(Libro.class), id);
			return lib;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}

	}
	@Override
	public List<Libro> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM libro", BeanPropertyRowMapper.newInstance(Libro.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}
}
