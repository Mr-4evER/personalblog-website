package com.shivam.blog.dao.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shivam.blog.dao.ArticleTable;

public interface ArticleTableRepo extends JpaRepository<ArticleTable, Integer>
{

}
