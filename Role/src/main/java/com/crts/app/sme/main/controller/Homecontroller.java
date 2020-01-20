package com.crts.app.sme.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.Role;
import com.crts.app.sme.main.service.Iservice;
import com.crts.app.sme.main.service.Serviceimpl;

@RestController
public class Homecontroller 
{
	@Autowired
	Iservice hs;

	@RequestMapping("/")
	public Role presave()
	{
		Role r=new Role();
		r.setRoleName("admin");
		r.setRoleStatusCode(1);
		return r;
		
	}
	 @RequestMapping(value = "/post",method = RequestMethod.POST)
	 public void post(@RequestBody Role r)
	 {
		
			 System.out.println(r.getRoleId());
			 System.out.println(r.getRoleName());
			 System.out.println(r.getRoleStatusCode());
		
		      hs.addnewdata(r);
	 }
	 
	 @RequestMapping("/get")
	 public List<Role> get()
	 {
		 
		 List<Role> l=hs.getdata();
		 for(Role r:l)
		 {
			 System.out.println(r.getRoleId());
			 System.out.println(r.getRoleName());
			 System.out.println(r.getRoleStatusCode());
		 }
		return l;
	 }
	 

	
}
