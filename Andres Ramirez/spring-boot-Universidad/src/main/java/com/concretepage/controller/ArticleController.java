package com.concretepage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.util.UriComponentsBuilder;

import com.concretepage.entity.Article;
import com.concretepage.entity.PruebaRespuesta;
import com.concretepage.service.IArticleService;

@Controller
@RequestMapping("user")
public class ArticleController {

    @Autowired
    private IArticleService articleService;

    @GetMapping("article/{id}")
    public ResponseEntity<Article> getArticleById(@PathVariable("id") Integer id) {
        Article article = articleService.getArticleById(id);
        return new ResponseEntity<Article>(article, HttpStatus.OK);
    }

    @GetMapping("articles")
    public ResponseEntity<List<Article>> getAllArticles() {
        List<Article> list = articleService.getAllArticles();
        return new ResponseEntity<List<Article>>(list, HttpStatus.OK);
    }

    @PostMapping("article")
    public ResponseEntity<PruebaRespuesta> addArticle(@RequestBody Article article, UriComponentsBuilder builder) {
        System.out.println(article.getArticleId());
        System.out.println(article.getTitle());
        System.out.println(article.getCategory());
        //Mensaje exitoso
        PruebaRespuesta pruebaRespuestaExitosa = new PruebaRespuesta();
        pruebaRespuestaExitosa.setRespuesta("El registro se realizo exitosamente");
        //Mensaje de error
        PruebaRespuesta pruebaRespuestaError = new PruebaRespuesta();
        pruebaRespuestaError.setRespuesta("Error al crear registro");
        boolean flag = articleService.addArticle(article);
        if (flag == true) {
            return new ResponseEntity<PruebaRespuesta>(pruebaRespuestaExitosa, HttpStatus.CREATED);
        }
        return new ResponseEntity<PruebaRespuesta>(pruebaRespuestaError, HttpStatus.CONFLICT);
    }

    @PutMapping("article")
    public ResponseEntity<Article> updateArticle(@RequestBody Article article) {
        //Mensaje exitoso
        PruebaRespuesta pruebaRespuestaExitosa = new PruebaRespuesta();
        pruebaRespuestaExitosa.setRespuesta("Actualización exitosa");
        //Mensaje de error
        PruebaRespuesta pruebaRespuestaError = new PruebaRespuesta();
        pruebaRespuestaError.setRespuesta("Error al actualizar");
        articleService.updateArticle(article);
            return new ResponseEntity<Article>(article, HttpStatus.OK);
    }

    @DeleteMapping("article/{id}")
    public ResponseEntity<Void> deleteArticle(@PathVariable("id") Integer id) {
        articleService.deleteArticle(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
