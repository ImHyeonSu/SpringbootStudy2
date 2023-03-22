package com.example.demo.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Members;

@Repository
public interface MemberRepository extends JpaRepository<Members, Long> {
	Optional<Members> findByMemEmailAndMemPw(@Param("mem_email")String memEmail,@Param("mem_pw")String memPw);
	
	List<Members>findBymemEmail(String mememail);
	List<Members>findBymemNick(String memnick);
	
}
