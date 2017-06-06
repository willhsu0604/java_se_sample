package com.will.ch_19;

import java.util.List;

public class MemberDAOTest_19_1 {

	public static void main(String[] args) {
		MemberDAO memberDAO = new MemberDAOImpl();
		List<MemberVO> list = memberDAO.listAll();
		for(MemberVO memberVO: list) {
			System.out.println(memberVO.toString());
		}
		
		MemberVO memberVO = new MemberVO(7, "Tom", "0966777888");
		int num =  memberDAO.add(memberVO);
		if(num > 0) {
			System.out.println("MemberVO with id [" + memberVO.getId() + "] is added");
			memberVO = memberDAO.get(memberVO.getId());
			System.out.println(memberVO.toString());
			
			memberVO.setUsername("Tom Wang");
			num = memberDAO.update(memberVO);
			if(num > 0) {
				System.out.println("MemberVO with id [" + memberVO.getId() + "] is updated");
				memberVO = memberDAO.get(memberVO.getId());
				System.out.println(memberVO.toString());
				
				num = memberDAO.delete(memberVO.getId());
				if(num > 0) {
					System.out.println("MemberVO with id [" + memberVO.getId() + "] is deleted");
				}
			}
			
		}
	}

}
