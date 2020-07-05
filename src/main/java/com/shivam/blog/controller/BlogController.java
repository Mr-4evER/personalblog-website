package com.shivam.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shivam.blog.dao.AboutFirst;
import com.shivam.blog.dao.AboutSecond;
import com.shivam.blog.dao.AboutThird;
import com.shivam.blog.dao.Contact;
import com.shivam.blog.dao.Homepage;
import com.shivam.blog.dao.repo.AboutFirstRepo;
import com.shivam.blog.dao.repo.AboutSecondRepo;
import com.shivam.blog.dao.repo.AboutThirdRepo;
import com.shivam.blog.dao.repo.ContactRepo;
import com.shivam.blog.dao.repo.HomepageRepo;

@Controller
public class BlogController 
{	
	@RequestMapping("/home")
	public String home()
	{
		return "index.jsp";
	}
	@RequestMapping("/blog")
	public String blog()
	{
		return "blog.jsp";
	}
	@RequestMapping("/about")
	public String about()
	{
		return "about.jsp";
	}
	@RequestMapping("/contact")
	public String contact()
	{
		return "contact.jsp";
	}
	@RequestMapping("/rdx")
	public String admin()
	{
		return "adminlogin.jsp";
	}
	@RequestMapping("/adminpanel")
	public String adminpanel()
	{
		return "adminpanel.jsp";
	}
	@RequestMapping("/homeandcontactpanel")
	public String homeandcontactpanel()
	{
		return "homeandcontactpanel.jsp";
	}
	@RequestMapping("/articlepanel")
	public String articlepanel()
	{
		return "articlepanel.jsp";
	}
	@RequestMapping("/aboutuspanel")
	public String aboutuspanel()
	{
		return "aboutuspanel.jsp";
	}
	
	@Autowired
	AboutFirstRepo about1repo;
	@RequestMapping("/about1")
	public String about1(AboutFirst about1)
	{
		about1repo.save(about1);
		return "aboutuspanel.jsp";
	}
	@Autowired
	AboutSecondRepo about2repo;
	@RequestMapping("/about2")
	public String about2(AboutSecond about2)
	{
		about2repo.save(about2);
		return "aboutuspanel.jsp";
	}
	@Autowired
	AboutThirdRepo about3repo;
	@RequestMapping("/about3")
	public String about1(AboutThird about3)
	{
		about3repo.save(about3);
		return "aboutuspanel.jsp";
	}
	
	@Autowired
	ContactRepo contactrepo;
	@RequestMapping("/contactdetails")
	public String contactdetails(Contact contact)
	{
		contactrepo.save(contact);
		return "homeandcontactpanel.jsp";
	}
	@Autowired
	HomepageRepo homepagerepo;
	@RequestMapping("/homeopagedetails")
	public String homepagedeatils(Homepage homepage)
	{
		homepagerepo.save(homepage);
		return "homeandcontroller.jsp";
	}


}
