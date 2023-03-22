package com.example.demo.Service;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Members;
import com.example.demo.repository.MemberRepository;

import lombok.RequiredArgsConstructor;


@Service
@Transactional
@RequiredArgsConstructor
public class RegisterService {
	
	SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	Date time = new Date();
	String localTime = format.format(time);
	
	private final MemberRepository memberRepository;
	
	
	public String registerTodo(Members member) {
		member.setMemRegDate(localTime);
		member.setCommonCode("00003");
		member.setMemState("0");
		member.setMemPoint(0);
		return "redirect:/register";
		
	}
	
	
}
