package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Members {
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "MEMBERCODE_SEQ_GENERATOR")
	@Column(name="mem_code")
	private long memCode;
	
	@Column(name="mem_email")
	private String memEmail;
	
	@Column(name="mem_pw")
	private String memPw;
	
	@Column(name="mem_name")
	private String memName;
	
	@Column(name="mem_nick")
	private String memNick;
	
	@Column(name="mem_reg_date")
	private String memRegDate;
	
	@Column(name="mem_phone")
	private String memPhone;
	
	@Column(name="mem_state")
	private String memState;//char
	
	@Column(name="common_code")
	private String commonCode;
	
	@Column(name="mem_sns_id")
	private String memSnsId;
	
	@Column(name="blog_url")
	private String blogUrl;
	
	@Column(name="github_url")
	private String githubUrl;
	
	@Column(name="mem_point")
	private long memPoint;

	}

