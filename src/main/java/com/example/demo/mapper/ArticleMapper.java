package com.example.demo.mapper;

import com.example.demo.domain.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ArticleMapper {

    void addArticle(Article article);
    void delArticleById(Integer id);
    Article getArticleById(Integer id);
    void saveArticle(Article article);



}
