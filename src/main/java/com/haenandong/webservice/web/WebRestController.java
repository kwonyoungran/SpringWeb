package com.haenandong.webservice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.haenandong.webservice.dto.posts.PostsSaveRequestDto;
import com.haenandong.webservice.service.PostsService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class WebRestController {
	
	//기존소스
//	private PostsRepository postsRepository;
	private PostsService postsService;

	@GetMapping("/hello")
	public String hello() {
		return "HelloWorld";
	}
	
	//기존소스
//	@PostMapping("/posts")
//	public void savePosts(@RequestBody PostsSaveRequestDto dto) {
//		postsRepository.save(dto.toEntity());
//	}
	
	@PostMapping("/posts")
	public Long savePosts(@RequestBody PostsSaveRequestDto dto) {
		return postsService.save(dto);
	}
	
}
