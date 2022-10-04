package upeu.edu.pe.pyventas.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.entity.Pais;

@Component
public class PaisDaoIMpl implements Operaciones<Pais> {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Pais t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Pais t, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Pais read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pais> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select o.ShipCountry Orden,count(c.CustomerID) as Cantidad from orders o  \r\n"
				+ "inner join customers c\r\n"
				+ "on  o.CustomerID =c.CustomerID\r\n"
				+ "group by c.Country order by 2;", new BeanPropertyRowMapper<Pais>(Pais.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
