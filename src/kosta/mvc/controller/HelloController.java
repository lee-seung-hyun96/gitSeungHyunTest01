package kosta.mvc.controller;

public class HelloController {
	public void aa() {
		System.out.println(12345678);
	}
//<<<<<<< HEAD
	public void bb() {
		System.out.println("충돌이 일어나는 코드");
	}
	public void cc() {
		System.out.println("메소드 추가");}
//=======
	public void seunghyun() {
		System.out.println("충돌이 예상됩니다.");
	}
	public void wannaHaveLunch() {
		System.out.println("점심을 먹고 싶어요 !");
//>>>>>>> branch 'master' of https://github.com/lee-seung-hyun96/gitSeungHyunTest01.git
	}
}
