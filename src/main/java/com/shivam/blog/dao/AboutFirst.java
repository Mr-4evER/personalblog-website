package com.shivam.blog.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AboutFirst 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aboutfirstid;
	private String aboutfirstheading;
	private String aboutfirstdescription;
	public int getAboutfirstid() {
		return aboutfirstid;
	}
	public void setAboutfirstid(int aboutfirstid) {
		this.aboutfirstid = aboutfirstid;
	}
	public String getAboutfirstheading() {
		return aboutfirstheading;
	}
	public void setAboutfirstheading(String aboutfirstheading) {
		this.aboutfirstheading = aboutfirstheading;
	}
	public String getAboutfirstdescription() {
		return aboutfirstdescription;
	}
	public void setAboutfirstdescription(String aboutfirstdescription) {
		this.aboutfirstdescription = aboutfirstdescription;
	}
	

}
