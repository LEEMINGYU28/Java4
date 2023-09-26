#클라이언트란?
- 크롬, 엣지, 파폭 등등의 브라우저

#통신 순서
- 클라이언트 > Web Server > Application Server <-> DB Server 

#Java에서의 통신 순서
- Client <-> Web Server(Tomcat) <-> WAS <-> DB Server
- WAS <-> Servlet(컨테이너, 도메인주소(IP))

# JSP, Servlet의 관계
- Servlet = 외부라이브러리 모듈 

- JSP, Java Server Pages

# HTTP 통신의 종류 / RESTFUL API
- GET : 단순 데이터 요청 응답
     - 브라우저
- POST : 우편, 데이터를 보낼 때 사용한다.
     - 데이터를 사용자가 볼 수 없게 가려준다.
     - 로그인
- PUT : 서버에 데이터를 놓다.
     - 데이터를 가려준다.
- PATCH : 서버의 데이터를 수정한다.
    - 데이터를 가려준다.
    - PUT PATCH 차이점 
    - PUT은 모든 데이터를 수정한다. PATCH는 일부 데이터만 수정한다.
- DELETE : 데이터를 삭제
    - GET과 같은 형식으로 데이터를 주고 받는다.
- OPTION : 조건
    - CORS : Cross-Origin Resource Sharing
    - 서로 다른 주소에 데이터를 주고 받는다.
    
  POST : {"action" : "delete", "data"} JSON형태
  
# URL, URI
- URL : 인터넷 주소
     - Uniform Resource Locator
- URI : 통합 자원 식별자
     - Uniform Resource Identifier
- 사용시 사실상 둘다 인터넷 주소

## URL
- https://www.google.co.kr/?hl=ko
     - https:// < 프로토콜
     - www.google.co.kr < 도메인
     - / << 라우터 | 컨텍스트
     - ?hl=ko << 데이터, 쿼리 | 쿼리스트링
- hl = ko
- https://www.google.com/search?q=%EA%B5%AC%EA%B8%80&oq=%EA%B5%AC%EA%B8%80&aqs=chrome..69i57j0i131i433i512l3j46i131i199i433i465i512l2j46i19
 - { q = 구글; oq = 구글 }

# 데이터 전송 방법
- GET 형식에서는 URL에 포함되어 데이터를 보낸다. < 쿼리스트링
- POST 형식에서는 데이터가 URL에 포함되지 않는다. < body : {} << JSON 형식을 많이 사용

# encoded URI

# Encoding VS Decoding
- Encoding > AVI > MP4, MP4 > wmv : 데이터 포멧을 변경한다.
- Decoding : 인코딩을 되돌린다.

- %EA%B5%AC%EA%B8%80 > 구글 : 디코딩
- 구글 > %EA%B5%AC%EA%B8%80 : 인코딩

## 암호화 == 인코딩
- 못알아보게 바꾼다.
     - 단방향 암호화
     
## 복호화 == 디코딩
- 암호화된 암호를 해독해서 읽어낸다.
    - 복호화되는것을 양뱡향 암호화

    
    
    
    