package com.ajax.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("prueba")
public class AjaxController {
	
	@GetMapping(value="index")
    public String index() {
        return new String("ejemplo");
    }
    

    @GetMapping(value="pruebaAjax",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<String> pruebaAjax() {
        List<String> lista=new ArrayList();
        lista.add("Jose");
        lista.add("Miguel");
        lista.add("Julia");
        lista.add("Rony");
        lista.add("Vanessa");
        return lista;
    }
}