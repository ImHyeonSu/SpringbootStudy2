package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Service.RegisterService;
import com.example.demo.entity.Members;

import org.springframework.stereotype.Controller;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class RegisterConteroller {

	private final RegisterService registerService;

	@GetMapping("/register")
	public String registerPage() {
		return "register/register";
	}

	@PostMapping("/register")
	public String register(Members member){
		return registerService.registerTodo(member);
	}

	@GetMapping("/emailCheck")
	@ResponseBody
	public String memberEmailCheckPost(@RequestParam("memberEmail")String memberemail)throws Exception{
		int result = registerService.emailCheck(memberemail);
		
		if(result == 0) {
			return "fail";
		}else {
			return "success";
		}
	}
	@GetMapping("/nicknameCheck")
	@ResponseBody
	public String memberNicknameCheckPost(@RequestParam("memberNickname")String membernickname)throws Exception{
		int result = registerService.nicknameCheck(membernickname);
		
		if(result == 0) {
			return "fail";
		}else {
			return "success";
		}
	}
	
}
