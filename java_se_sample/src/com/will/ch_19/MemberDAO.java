package com.will.ch_19;

import java.util.List;

public interface MemberDAO {
	
	List<MemberVO> listAll();
	
	MemberVO get(int id);
	
	int add(MemberVO memberVO);
	
	int update(MemberVO memberVO);
	
	int delete(int id);
}
