package com.project.couriers.controller;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import  com.project.couriers.model.PaymentModel;
import  com.project.couriers.service.PaymentServicesInt;

@RestController
@RequestMapping(value="payment")
public class PaymentController
{
	@Autowired
	private PaymentServicesInt PaymentServicesInt;
	
	@RequestMapping(method=RequestMethod.GET)
	public String index()
	{
		return "paymentindex";
	}
	@RequestMapping(value="/success",method=RequestMethod.GET)
	public String success(ModelMap mm,HttpServletRequest request)
	{
		//PaymentServicesInt ps;
		mm.put("result", ps.findPayment(request));
		return "pay";
	}
	

    @Override
    public int update(PaymentModel payment) throws ClassNotFoundException, SQLException {
        throw new UnsupportedOperationException();
    }
}
