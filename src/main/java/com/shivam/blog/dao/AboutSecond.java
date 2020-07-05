package com.shivam.blog.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AboutSecond 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aboutsecondid;
	private String aboutsecondheading;
	private String aboutseconddescription;
	public int getAboutsecondid() {
		return aboutsecondid;
	}
	public void setAboutsecondid(int aboutsecondid) {
		this.aboutsecondid = aboutsecondid;
	}
	public String getAboutsecondheading() {
		return aboutsecondheading;
	}
	public void setAboutsecondheading(String aboutsecondheading) {
		this.aboutsecondheading = aboutsecondheading;
	}
	public String getAboutseconddescription() {
		return aboutseconddescription;
	}
	public void setAboutseconddescription(String aboutseconddescription) {
		this.aboutseconddescription = aboutseconddescription;
	}
	

}
