package com.project.couriers.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import com.project.couriers.model.ShippingModel;
import com.project.couriers.service.ShippingServicesInt;

@RestController
@RequestMapping(value="shipping")
public class ShipmentController
{
	@Autowired
	private ShippingServicesInt ShippingServicesInt;
	
	@RequestMapping(method=RequestMethod.GET)
	public String ship()
	{
		return "ship";
	}
	@RequestMapping(value="/shipping",method=RequestMethod.GET)
	public String success(ModelMap mm,HttpServletRequest request)
	{
		mm.put("result", ps.getShipping(shipping));
		return "shipping";
	}
	

    @Override
    public int findShipment(ShippingModel shipping) {
        throw new  DataNotFoundException();
    }
    public String save(){
		logger.debug("shipping()");
		model.addAttribute("shipping",ShippingServicesInt.findShipment());
		return "shipmentdetails";
	} 
	
    public String delete(){
		logger.debug("customerdetails()");
		model.addAttribute("customers",ShippingServicesInt.findShipment());
		return "shippingdetails";
	} 
	
}
