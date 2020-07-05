package com.shivam.blog.dao;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Homepage 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int homepageid;
	private String homepageheading;
	private String homepagequote;
	@Lob
	private byte[] homepageimage;

	public byte[] getHomepageimage() {
		return homepageimage;
	}
	public void setHomepageimage(byte[] homepageimage) {
		this.homepageimage = homepageimage;
	}
	public int getHomepageid() {
		return homepageid;
	}
	public void setHomepageid(int homepageid) {
		this.homepageid = homepageid;
	}
	public String getHomepageheading() {
		return homepageheading;
	}
	public void setHomepageheading(String homepageheading) {
		this.homepageheading = homepageheading;
	}
	public String getHomepagequote() {
		return homepagequote;
	}
	public void setHomepagequote(String homepagequote) {
		this.homepagequote = homepagequote;
	}


}
