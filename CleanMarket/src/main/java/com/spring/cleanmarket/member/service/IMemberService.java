package com.spring.cleanmarket.member.service;

import java.util.List;

import com.spring.cleanmarket.member.model.MemberVO;

public interface IMemberService {
	
	//회원가입 기능
	void join(MemberVO member);

	//아이디 중복체크 기능
	int checkId(String memID);

	//회원 탈퇴 기능
	void delete(String memID);

	//회원 정보 조회 기능
	MemberVO selectOne(String memID);

	//회원 정보 전체 조회 기능
	List<MemberVO> selectAll();
	
	//회원정보수정 기능
	void update(MemberVO member);

}
