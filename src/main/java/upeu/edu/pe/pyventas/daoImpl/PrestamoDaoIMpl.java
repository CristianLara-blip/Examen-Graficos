package upeu.edu.pe.pyventas.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.entity.Prestamo;

@Component
public class PrestamoDaoIMpl implements Operaciones<Prestamo>{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Prestamo t) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("INSERT INTO prestamo (idempleado, idalumno, fecha_prestamo_hora, fecha_devolución) VALUES(?,?,?,?)",
				new Object[] {t.getIdempleado(), t.getIdalumno(), t.getFecha_prestamo_hora(), t.getFecha_devolución()});
	}

	@Override
	public int update(Prestamo t, int id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("UPDATE prestamo SET idempleado=?, idalumno=?, fecha_prestamo_hora=?, fecha_devolución=? where idprestamo=?;"
				, new Object[] {id, t.getIdempleado(),t.getIdalumno(),t.getFecha_prestamo_hora(),t.getFecha_devolución()});
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		String SQL = "DELETE FROM prestamo WHERE idprestamo=?";
		return jdbcTemplate.update(SQL, id);
	}

	@Override
	public Prestamo read(int id) {
		// TODO Auto-generated method stub
		try {
			Prestamo prest = jdbcTemplate.queryForObject("SELECT * FROM prestamo WHERE idprestamo=?",
					BeanPropertyRowMapper.newInstance(Prestamo.class), id);
			return prest;
		} catch (IncorrectResultSizeDataAccessException e) {
			return null;
		}

	}

	@Override
	public List<Prestamo> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM prestamo", BeanPropertyRowMapper.newInstance(Prestamo.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}
}
