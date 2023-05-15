package com.klef.jfsd.springboot.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Admin;
import com.klef.jfsd.springboot.model.Customer;
import com.klef.jfsd.springboot.model.Partner;
import com.klef.jfsd.springboot.model.Vehicle;
//import com.klef.jfsd.springboot.model.Product;
//import com.klef.jfsd.springboot.model.Seller;
import com.klef.jfsd.springboot.service.AdminService;
import com.klef.jfsd.springboot.service.CustomerService;
import com.klef.jfsd.springboot.service.PartnerService;
import com.klef.jfsd.springboot.service.VehicleService;

@Controller
public class ClientController 
{
	@Autowired
	private AdminService adminService;
	@Autowired
	private CustomerService customerService;
	@Autowired
	private VehicleService vehicleService;
	@Autowired
	private PartnerService partnerService;
	
	@GetMapping("/index_")
	public String mainhomedemo()
	{
		return "index";
	}
		@GetMapping("/adminlogin")
	public ModelAndView adminlogindemo()
	{
		ModelAndView mv =new ModelAndView("adminlogin");
		return mv;
	}
		
	
	@GetMapping("/login")
	public ModelAndView logindemo()
	{
		ModelAndView mv =new ModelAndView("login");
		return mv;
	}
	
	@GetMapping("/vehicle")
	public ModelAndView vehicledemo()
	{
		ModelAndView mv =new ModelAndView("vehicle");
		return mv;
	}
	
	@GetMapping("/partnerlogin")
	public ModelAndView partnerdemo()
	{
		ModelAndView mv =new ModelAndView("partnerlogin");
		return mv;
	}
//	
//	@GetMapping("/viewallcustomers")
//	public ModelAndView viewallcustomerdemo1()
//	{
//		ModelAndView mv =new ModelAndView("viewallcustomers");
//		List<Customer> customerlist=adminService.viewallcustomers();
//		mv.addObject("customerlist", customerlist);
//		return mv;
//	}
	//---------------------------------------------------------------------------------------------------------------------------
	@GetMapping("/signup")
	public ModelAndView signupdemo()
	{
		ModelAndView mv =new ModelAndView("signup", "customer",new Customer());
		return mv;
	}
	
	@GetMapping("/vehiclereg")
	public ModelAndView vehicleregdemo()
	{
		ModelAndView mv =new ModelAndView("vehicle", "vehicle",new Vehicle());
		return mv;
	}
	
	@GetMapping("/partnersignup")
	public ModelAndView partnerregdemo()
	{
		ModelAndView mv =new ModelAndView("partnersignup", "partner",new Partner());
		return mv;
	}
	
	@GetMapping("/adminhome")
	public ModelAndView adminhomedemo()
	{
		ModelAndView mv =new ModelAndView("adminhome");
		return mv;
	}
	
	
	
	
	@PostMapping("/checkadminlogin")
	public ModelAndView checkadminlogindemo(HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView();
		
		String auname=request.getParameter("auname");
		String apwd =request.getParameter("apwd");
		
	Admin admin = adminService.checkadminlogin(auname, apwd);
	
	if(admin!=null)
	{
		mv.setViewName("adminhome");
	}
	else
	{
		mv.setViewName("adminlogin");
		mv.addObject("msg","Login failed");
	}
		return mv;
	}
	
	//-------------------------------------------------------------------------------------------------
	
	@PostMapping("/checkcustomerlogin")
	public ModelAndView checkcustomerlogindemo(HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView();
		
		String cuname=request.getParameter("cuname");
		String cpwd =request.getParameter("cpwd");
	
		Customer customer = customerService.checkcustomerlogin(cuname, cpwd);
	
	if(customer!=null)
	{
		mv.setViewName("logindex");
	}
	else
	{
		mv.setViewName("login");
		mv.addObject("msg","Login failed");
	}
		return mv;
	}
	
	@PostMapping("/checkpartnerlogin")
	public ModelAndView checkpartnerlogindemo(HttpServletRequest request)
	{
		ModelAndView mv=new ModelAndView();
		
		String cuname=request.getParameter("cuname");
		String cpwd =request.getParameter("cpwd");
	
		Partner partner = partnerService.checkpartnerlogin(cuname, cpwd);
	
	if(partner!=null)
	{
		mv.setViewName("car");
	}
	else
	{
		mv.setViewName("partnerlogin");
		mv.addObject("msg","Login failed");
	}
		return mv;
	}

	
	@PostMapping("/addcustomer")
	public ModelAndView addcustomerdemo(@ModelAttribute("customer") Customer customer )
	{
		customerService.addcustomer(customer);
		
		ModelAndView mv =new ModelAndView();
		mv.setViewName("signup");
		mv.addObject("msg", "customer registered successfully" );
		return mv;
	}
	
	@PostMapping("/addpartner")
	public ModelAndView addpartnerdemo(@ModelAttribute("partner") Partner partner)
	{
		partnerService.addpartner(partner);
		
		ModelAndView mv =new ModelAndView();
		mv.setViewName("partnersignup");
		mv.addObject("msg", "Partner registered successfully" );
		return mv;
	}
	
	
	@PostMapping("/addvehicle")
	public ModelAndView addvehicledemo(@ModelAttribute("vehicle") Vehicle vehicle )
	{
		vehicleService.addvehicle(vehicle);
		
		ModelAndView mv =new ModelAndView();
		mv.setViewName("vehicle");
		mv.addObject("msg", "Vehicle added successfully" );
		return mv;
	}
	
	
	@GetMapping("/viewallcustomers")
	public ModelAndView viewallcustomerdemo()
	{
		ModelAndView mv =new ModelAndView("viewallcustomers");
		List<Customer> customerlist=adminService.viewallcustomers();
		mv.addObject("customerlist", customerlist);
		return mv;
	}
	
	
	@GetMapping("/deletecustomer")
	public String deletecustomerdemo(@RequestParam("id")int cid)
	{
		adminService.deletecustomer(cid);
		return "redirect:viewallcustomers";
	}
	//--------------------------------------------------------------------------------------------------------------
	
	@GetMapping("service")
	public ModelAndView services()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("services");
		return mv;
	}
	@GetMapping("cars_")
	public ModelAndView cars()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("car");
		return mv;      
	}
	
	@GetMapping("contact_")
	public ModelAndView contact()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("contact");
		return mv;      
	}
	
	@GetMapping("about_")
	public ModelAndView about()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("about");
		return mv;      
	}
	
	@GetMapping("blog_")
	public ModelAndView blog()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("blog");
		return mv;      
	}
	
	@GetMapping("carin")
	public ModelAndView carsingle()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("carsingle");
		return mv;      
	}
	
	@GetMapping("blogin")
	public ModelAndView blogsingle()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("blogsingle");
		return mv;      
	}
	
	@GetMapping("new")
	public ModelAndView logindex()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("logindex");
		return mv;      
	}
	
	@GetMapping("contnew")
	public ModelAndView contactnew()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("contactnew");
		return mv;      
	}
	
	@GetMapping("abnew")
	public ModelAndView aboutnew()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("aboutnew");
		return mv;      
	}
		
//	@GetMapping("/vehicle")
//	public ModelAndView vehicle()
//	{
//		ModelAndView mv = new ModelAndView();
//        mv.setViewName("vehicle");
//		return mv;
//	}

}
