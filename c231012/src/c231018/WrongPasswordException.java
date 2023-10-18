package c231018;

public class WrongPasswordException extends Exception {
   WrongPasswordException(String message){
      super(message);
   }
   // 사용처
   // 1. Bean 2. Servlet
   // 동기 블락 / 비동기 논블락
   // fetch 보내놓고 기다린다.
   // axios 타임아웃이 있음 시간내로 응답이 오지 않으면 실패했다라고 처리 함.
   // 비동기를 동기형식으로 바꿔줄 수 도있다.
   // 
}