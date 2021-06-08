package com.sample.controller;


import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.sample.dao.PolicyDao;
import com.sample.entity.Policy;

@Controller
public class MyController {
	@Autowired
	private PolicyDao dao;
	
	@RequestMapping("/")
	public String home(Model m) {
		
		return "index";
		
	}
	@RequestMapping("/policyform")
	 public String showForm(Model m){    
       m.addAttribute("command", new Policy());  
       return "policyform";   
   } 
	
	@RequestMapping(value="/save",method = RequestMethod.POST)    
    public String save(@ModelAttribute("updatePolicy") Policy p){    
        dao.createPolicy(p);
        return "redirect:/viewform";//will redirect to viewemp request mapping    
    } 
	@RequestMapping("/viewform")    
    public String viewpolicy(Model m){    
        List<Policy> list=dao.getPolicy();    
        m.addAttribute("list",list);  
        return "viewform";    
    } 
	
	@RequestMapping(value="/deletePolicy/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable int id){    
        dao.deletePolicy(id);    
        return "redirect:/viewform";    
    }
	@RequestMapping(value="/editPolicy/{id}")    
    public String edit(@PathVariable("id") int id, Model m){    
        Policy p=dao.getPolicy(id);    
        m.addAttribute("command",p);  
        return "policyedit";    
    } 
	 @RequestMapping(value="/editsave",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("updatePolicy") Policy p){    
	        dao.createPolicy(p);   
	        return "redirect:/viewform";    
	    } 
	

}
