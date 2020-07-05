package com.shivam.blog.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.blog.dao.Contact;

public interface ContactRepo extends JpaRepository<Contact, Integer> 
{

}
