# 네트워크란?
- 연결망
- 통신자체를 네트워크라 말할 수 있다.
- 서버끼리의 연결

# 서버란?
- 외부에서 접근 가능한 컴퓨터

# 포트란?
- 외부에서 접근할 수 있도록, 내 컴퓨터에 
  들어올 수 있도록 열어두는 문

## 대표적인 포트 * = 중요 
- SSH : 22 * << 배포때 사용
- HTTP : 80포트 * < 웹 프로토콜
- HTTPS : 443 *  < 인증된 웹 프로토콜
- Oracle : 1521
- mySQL : 3306

# 도메인이란?
- 최하위.하위.상위.최상위(com|org|net|kr 등등)

# HTTP	
- hyperText Transfer Protocol
- 브라우저에서 통신하는 규칙

## HTTPS
- HTTP + Secure
- 인증된 HTTP 통신
- SSL 인증 방식을 사용한다.
  - Let`s sEncrypyto | certbot 
  - AWS에서는 호스팅 영역이 있을 시 자동 인증 지원(유료)

# HTML
- HyperText Markup Langauge
- 웹페이지의 출력 담당, 구조만 있을 뿐 플로우는 없다.


```
<html>
	<head>
		<title>HTML이란?</title>
	</head>
	<body>
		<div>
		dd
		<div>
	<body>
</html>			
```
# CSS
- CasCading Style Sheets
- 웹페이지의 모양을 담당한다.

# Javascript
- 웹페이지의 로직을 담당한다.
- Java와 이름만 연관있다. 이름빼면 연관성 x
- Java = Oracle에서 만듦 Javascript = Mozila에서 만듦 
- 예전이름 Mocha > Javascript 인기 얻으려고 바꿨다.


```html
<html>
	<head>
		<title>제목</title>
		<script>
			javascript입력
		</script>
		<script src="자바스크립트 파일의 주소"></script>
		<style>
			CSS 내용 입력
		</style>
		<link href="CSS 파일 주소"rel="stylesheet"/>		
	</head>
	<body>
		<div>
			내용
		<div>
</html>		
```
- <link href="CSS 파일 주소"rel="stylesheet"/>   뒤에붙는 '/' 는 내용이없으니 바로 닫으라는 뜻.				

# Java에서의 web Server Open?
- Tomcat을 사용한다.
  - port : 8888
  - admin / admin

# Server
## Web Server
- web을 주는 서버

## Application Server
- Data를 주는 서버
- 백엔드

## DB Server
- Oracle

## Web Application Server
- WAS

# Tomcat
- Apache를 기반으로 돌아가는 서버 프로그램
- PHP로 되어있다.
- WAS

## Apache
- Web Server
- PHP를 사용해서 WAS 처럼 사용할 수 있다.

# Javascript
- Javascripwebapps 파일t는 인터프리터 언어, 세성에서 가장 빠른
프로그래밍 언어 (C보다는 느릴 수 있음)
- OS 상에서 사용하는 것이 아닌 브라우저 상에서 사용하는 것을
기본을 하고 있다.
- Node.js < OS에서 Javascript를 실행할 수 있게 해준다.
- Node.js 기반으로 React 라이브러리를 사용할 수 있다.
- React 라이브러리는 View만을 위한 Javascript 라이브러리
- 이외에도 Vue.js, Angular.js라는 프레임워크가 있다.
  - Angular.js는 죽었다.
  - React VS Vue.js 두개를 많이 쓴다.
- 위 내용은 전부 순수 FrontEnd(Web Server)쪽 기술이다.
- Node.js를 사용한 백엔드 가능

# OSI 7계층 | TCP&IP 5계층
- 7층(5층) HTTP, Web Socket
  - 한번 요청보내면 요청받고 끝
  - Client의 요청이 있을 때만 Server가 응답하여 처리를 하는 방식
- 6층(4층) socket
  - 소켓을 통해 서버-클라이언트간 데이터를 주고받는 양방향 연결 지향성 통신
- 5층(4층) TCP | UDP 
- 4층 IP통신 
