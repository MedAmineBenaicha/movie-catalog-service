package io.mebapps.controller;

import io.mebapps.entity.CatalogItem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/catalog")
public class MovieCatalogController {

    @GetMapping("/xxx")
    public String test(){

        System.out.println("A method has been executed");
        return "test page";
    }

    @GetMapping("/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") String userId){

        System.out.println("A method has been executed" + userId);

        // A dummy data api instead of using Database
        return Collections.singletonList(
                new CatalogItem("The dark knight","A batman's movie",5)
        );
    }
}
