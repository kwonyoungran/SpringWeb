package com.haenandong.webservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.haenandong.webservice.service.PostsService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class WebController {
	
	private PostsService postsService;

	//Handlebars
	@GetMapping("/")
	public String main(Model model) {
		model.addAttribute("posts", postsService.findAllDesc());
		return "main";
	}
	
	//jsp
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/gangwha_home")
	public String gangwha_home() {
		return "gangwha_home";
	}
	
	//naberlogin test
	@GetMapping("/naverlogin")
	public String naverlogin() {
		return "naverlogin/naverlogin";
	}
	
}
