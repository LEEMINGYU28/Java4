# Servlet Context
- Tomcat
  - Web Server
  - Container
- classWeb 컨텍스트가 생성되어 있고 해당 컨텍스트에 접근하는 방법은
Servlet Context를 사용한다.
- 홈페이지 자체를 Container 홈페이지의 세부페이지가 Context 안에 content(콘텐츠) 내용물 자체
- Container > Context > Content

https://naver.com << Container
https://google.com/search?servesarv
 -/ search?servesarv < Context
 
# Router
- URL 상에서 도메인 주소 || IP 주소 뒤에 붙는 경로
- 물리적인 공유기

# DAO
- 데이터베이스 에서만 사용하는 것이 아니다.
- 데이터를 받아올때 사용

# VO
- set을 두지않고 get만 둔다.

# 공공 데이터 API
- 요청을 보낸다 > 인터넷 주소 입력, HTTP 통신 방식으로 요청을 보낸다.
- GET 형식이면 키랑 값으로 주소에 쿼리스트링
- POST 형식이면 키랑 값으로 body에 JSON 형식으로 보낸다.
- 응답은 보통 JSON