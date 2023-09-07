package c230907;

public class Main {
	public static void main(String[]args) {
		//error > 문제 발생 시 해당 문제를 다른 방식으로 처리한다.
		//예외처리 - 인덱스 버퍼 없을때 , 로그인 할떄 없는 아이디, 비밀번호 틀림
		//if 입력을 뭘 받았는가 > 제대로 입력이 안되면 "다시 입력해라"
		//﻿Exception > 컴파일, 런타임을 진행하면서 에러가 발생했다 또는 발생할 확률이 있다.

		//ClassNotFoundException,RuntimeException
		//>Exception,Error > Throwable 코드자체가 실행이 안됏을때의 오류
		//RuntimeException > (실행환경을 얘기한다.)코드를 실행하는 도중에 에러가 났다.
		//ArrayIndexOutOfBoundsException> 범위 밖에 있다.
		//NullPointerException
		try {
			ExceptionTest.test();
		}
		catch(Exception e)	{
			e.printStackTrace();
		}
		
		try {
			throw new Exception("예외처리 중");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
