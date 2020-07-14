package com.project.couriers.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;

import com.project.couriers.model.ShippingModel;

public class ShippingDaoImpl implements Shippingdao {

	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) throws DataAccessException {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	@Override
	public void save(ShippingModel ShippingModel) {

		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		String sql = "INSERT INTO SHIPPING(SHIPPINGID,USERID,USERNAME,ORDERID,PHONENO,EMAIL,ADDRESS ) "
				+ "VALUES ( :shippingid, :userid, :username, :orderid, :phoneno ,:email, :address)";
		namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource("id", id));
	}
	@Override
	public List<Order> findShipment() {

		String sql = "SELECT * FROM shipping";
		List<Order> result = namedParameterJdbcTemplate.query(sql, new OrderMapper());

		return result;

	}
	@Override
	public void delete(Integer id) {

		String sql = "DELETE FROM SHIPPING WHERE id= :shippingid";
		namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource("id", id));

	}
}
