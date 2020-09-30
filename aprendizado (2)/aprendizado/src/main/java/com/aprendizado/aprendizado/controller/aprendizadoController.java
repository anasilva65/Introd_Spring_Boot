package com.aprendizado.aprendizado.controller;

import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController; 

@RestController 
@RequestMapping("/aprendizado")

public class aprendizadoController {
	
	  @GetMapping 
	  public String segundaAplicacao() 
	  { 
		  return "Objetivos: aprender softs skills e hards skills"; 
	  } 
}