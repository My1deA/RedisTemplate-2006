package com.example.demo.mapper;

import com.example.demo.domain.Article;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface AriticleMapper {

    void addArticle(Article article);
    void delArticleById(Integer id);
    Article findArticleById(Integer id);
    void saveArticle(Article article);

}