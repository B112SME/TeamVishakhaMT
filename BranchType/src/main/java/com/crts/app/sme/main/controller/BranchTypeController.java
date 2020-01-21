package com.crts.app.sme.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crts.app.sme.main.model.BranchType;
import com.crts.app.sme.main.service.BranchTypeServiceI;

@RestController
public class BranchTypeController 
{
	@Autowired
	BranchTypeServiceI hs;

	/*@RequestMapping("/")
	public BranchType preSave()
	{
		BranchType b=new BranchType();
		b.setBranchType("A");
		b.setBranchTypeCode(1);
		b.setStatus("Active");
		return b;	
	}*/
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public BranchType saveBranchType(@RequestBody BranchType branchType)
	{
		hs.saveBranchType(branchType);
		return branchType;
		
	}
	
	@RequestMapping("/get")
	public Iterable<BranchType> getBranchType(Model model)
	{
		Iterable<BranchType> branchType=hs.getBranchType();
		model.addAttribute("data", branchType);
		return branchType;
		
	}

}
