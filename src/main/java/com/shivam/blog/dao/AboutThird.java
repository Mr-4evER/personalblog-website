package com.shivam.blog.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AboutThird 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aboutthirdid;
	private String aboutthirheading;
	private String aboutthirddescription;
	public int getAboutthirdid() {
		return aboutthirdid;
	}
	public void setAboutthirdid(int aboutthirdid) {
		this.aboutthirdid = aboutthirdid;
	}
	public String getAboutthirheading() {
		return aboutthirheading;
	}
	public void setAboutthirheading(String aboutthirheading) {
		this.aboutthirheading = aboutthirheading;
	}
	public String getAboutthirddescription() {
		return aboutthirddescription;
	}
	public void setAboutthirddescription(String aboutthirddescription) {
		this.aboutthirddescription = aboutthirddescription;
	}
	

}
