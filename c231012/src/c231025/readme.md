# VPN ?

- Virtual Private Network
- 우리 컴퓨터 -> VPN 서버 -> 다른 웹페이지 요청
-> VPN이 받고 -> 우리 컴퓨터

# Proxy
- 반대로 다른 곳에서 우리한테 보내준 걸 다른 웹페이지,
내부적으로 다른 port로 요청을 보내 처리하는 것

# AWS
- 프로젝트가 크지 않다, 무겁지 않다 -> 1대
- Java:80(http), Node.js:8081,
React:3000, GoLang:8082 -> https:443
- 443/java => Java,
  443/node => Node.js,
  443/react => react,
  443/go => GoLang
- 외부 <-> apache:443 / java <-> java:80 << proxy 
  | reverse proxy => .conf
- Cross Origin Resources Sharing