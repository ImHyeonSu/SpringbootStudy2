package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Service.registerService;


import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class registerConteroller {
	private registerService Regesterservice;

	@GetMapping("/register")
	public String registerPage() {
		return "register/register";
	}
//	@PostMapping("/register")
//	public String register(Members member){
//		return registerService.registerTodo(member);
//	}

}
