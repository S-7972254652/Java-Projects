package org.websparrow.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.websparrow.model.User;

public class UserDaoImpl implements UserDao {

	private JdbcTemplate jdbcTemplate;

	public UserDaoImpl(DataSource dataSoruce) {
		jdbcTemplate = new JdbcTemplate(dataSoruce);
	}

	public int registerUser(User user) {
		
		String sql = "INSERT INTO USER_DATA VALUES(?,?,?,?)";

		try {
			
			int counter = jdbcTemplate.update(sql, new Object[] { user.getUserId(),user.getFname(),user.getEmail(), user.getPassword(),user.getMobile() });

			return counter;

		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}

	public String loginUser(User user) {
		
		String sql = "SELECT USER_ID FROM USER_DATA WHERE Fname=? AND PASSWORD=?";
		
		try {

			String userId = jdbcTemplate.queryForObject(sql, new Object[] {
					user.getFname(), user.getPassword() }, String.class);

			return userId;
			
		} catch (Exception e) {
			return null;
		}
	}
}