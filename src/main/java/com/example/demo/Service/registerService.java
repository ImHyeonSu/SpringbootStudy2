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
		//telephoneHipenX(member);
		memberRepository.save(member);
		return "redirect:/register";
	}
	
	public String telephoneHipenX(Members member) {
		String telephone = member.getMemPhone();
		telephone = telephone.replaceAll("-","");
		member.setMemPhone(telephone);
		return telephone;
	}
	
	
}

package com.example.demo.Service;

import java.util.Date;


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
		member.setCommonCode("00003"); //　更新必要
		member.setMemState("0"); // 更新必要
		member.setMemPoint(0);
		telephoneHipenX(member);
		memberRepository.save(member);
		return "redirect:/register";
	}
	
	public String telephoneHipenX(Members member) {
		String telephone = member.getMemPhone();
		telephone = telephone.replaceAll("-","");
		member.setMemPhone(telephone);
		return telephone;
	}
	
	public int emailCheck(String memberemail) {
		int result = 0;
		List<Members> memberList = memberRepository.findBymemEmail(memberemail);
		if (memberList.isEmpty()) {
			result = 1;
			return result;
		}else {
			result = 0;
			return result;
		}
	}
	public int nicknameCheck(String membernickname) {
		int result = 0;
		List<Members> memberList = memberRepository.findBymemNick(membernickname);
		if (memberList.isEmpty()) {
			result = 1;
			return result;
		}else {
			result = 0;
			return result;
		}
	}
	
}
