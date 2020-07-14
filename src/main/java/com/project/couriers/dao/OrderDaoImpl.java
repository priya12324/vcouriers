package com.project.couriers.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.project.couriers.model.Order;

@Repository
public class OrderDaoImpl implements Orderdao {

	NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) throws DataAccessException {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	@Override
	public Order findById(Integer id) {

		Map<String, Object> params = new HashMap<String, Object>();
		params.put("ORDER_ID", id);

		String sql = "SELECT * FROM orders WHERE ORDER_ID=:id";

		Order result = null;
		try {
			result = namedParameterJdbcTemplate.queryForObject(sql, params, new OrderMapper());
		} catch (EmptyResultDataAccessException e) {
			// do nothing, return null
		}

		/*
		 * User result = namedParameterJdbcTemplate.queryForObject( sql, params,
		 * new BeanPropertyRowMapper<User>());
		 */

		return result;

	}

	@Override
	public List<Order> findAll() {

		String sql = "SELECT * FROM orders";
		List<Order> result = namedParameterJdbcTemplate.query(sql, new OrderMapper());

		return result;

	}

	@Override
	public void save(Order order) {

		KeyHolder keyHolder = new GeneratedKeyHolder();
		
		String sql = "INSERT INTO ORDERS(ORDER_ID, , PLACED_DATE, SHIPPED_DATE, DELIVERY_DATE) "
				+ "VALUES ( :id, :placeddate, :shippeddate, :delivrydate)";

		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(order), keyHolder);
		order.setId(keyHolder.getKey().intValue());
		
	}

	@Override
	public void update(Order order) {

		String sql = "UPDATE ORDERS SET ORDER_ID=:id, PLACED_DATE=:placeddate, SHIPPED_DATE=:shippeddate, " + "DELIVERY_DATE=:deliverydate WHERE ORDER_ID=:id";

		namedParameterJdbcTemplate.update(sql, getSqlParameterByModel(order));

	}

	@Override
	public void delete(Integer id) {

		String sql = "DELETE FROM ORDERS WHERE ORDER_ID= :id";
		namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource("ORDER_ID", id));

	}

	private SqlParameterSource getSqlParameterByModel(Order order)) {

		// Unable to handle List<String> or Array
		// BeanPropertySqlParameterSource

		MapSqlParameterSource paramSource = new MapSqlParameterSource();
		paramSource.addValue("id", user.getId());
		paramSource.addValue("placeddate", order.getPlaceddate());
		paramSource.addValue("shippeddate", order.geShippeddate());
		paramSource.addValue("deliverydate", order.getDeliverydate());
	

		return paramSource;
	}


	

}

