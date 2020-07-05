package com.shivam.blog.dao;

import java.sql.Blob;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ArticleTable 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int aid;
	private String aheading;
	private Blob aimage;
	private String acontent;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAheading() {
		return aheading;
	}
	public void setAheading(String aheading) {
		this.aheading = aheading;
	}
	public Blob getAimage() {
		return aimage;
	}
	public void setAimage(Blob aimage) {
		this.aimage = aimage;
	}
	public String getAcontent() {
		return acontent;
	}

	
	

}
