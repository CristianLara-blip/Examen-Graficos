package upeu.edu.pe.pyventas.daoImpl;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.pyventas.dao.Operaciones;
import upeu.edu.pe.pyventas.entity.Producto;

@Component
public class ProductoDaoIMpl implements Operaciones<Producto> {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Producto t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Producto t, int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Producto read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> reaAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("select c.CategoryName as categoria,count(p.CategoryID) as cantidad from products p \r\n"
				+ "inner join categories c\r\n"
				+ "on  p.CategoryID =c.CategoryID\r\n"
				+ "group by p.CategoryID order by 2;", new BeanPropertyRowMapper<Producto>(Producto.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}

