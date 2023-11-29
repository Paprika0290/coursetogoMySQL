# 🗺️ Coursetogo (Refactoring)
지역별 맛집 등의 데이터를 기반으로 만들어진 데이트 및 모임 코스를 추천하는 서비스입니다.<br>
현재 지역은 서울로 한정되어 있으며, 네이버 Map API를 활용한 화면에서 유저가 직접 코스를 제작하고 공유할 수 있습니다.<br>
* 리팩토링 작업이 진행 중입니다.

- - - 

### ⏳ 개발 기간
2023.06.15 - 2023.07.25
2023.09.02 ~ (ing)
- - -
### 📚 기술 스택
#### - Frontend
- HTML / CSS
- Javascript
- JSP
    
#### - Backend
- Java 8
- Spring Boot
- Maven -> Gradle
- MyBatis

#### - Database
- Oracle -> MySQL

#### - API
- Naver 로그인 API
- Naver Maps API
- - -
### 📕 ERD
![]([https://i.imgur.com/xIosxUQ.png](https://private-user-images.githubusercontent.com/59499235/286636018-cd16c60f-23a6-40a6-a17c-3843baff41de.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTEiLCJleHAiOjE3MDEyNjk5MDAsIm5iZiI6MTcwMTI2OTYwMCwicGF0aCI6Ii81OTQ5OTIzNS8yODY2MzYwMTgtY2QxNmM2MGYtMjNhNi00MGE2LWExN2MtMzg0M2JhZmY0MWRlLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFJV05KWUFYNENTVkVINTNBJTJGMjAyMzExMjklMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjMxMTI5VDE0NTMyMFomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTIzMjUzMjU0ZWFiZDIzMTcxMWQxMmQyOTg5ZTBkN2I3NTU0MDZmNjYwZWY1M2FkYTNiNGFiNGMwM2I1NzliMzYmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.NisrwE3dW42U5WOlHuk9g69bWUx-hpxwdIM-FWAvQEY)https://private-user-images.githubusercontent.com/59499235/286636018-cd16c60f-23a6-40a6-a17c-3843baff41de.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTEiLCJleHAiOjE3MDEyNjk5MDAsIm5iZiI6MTcwMTI2OTYwMCwicGF0aCI6Ii81OTQ5OTIzNS8yODY2MzYwMTgtY2QxNmM2MGYtMjNhNi00MGE2LWExN2MtMzg0M2JhZmY0MWRlLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFJV05KWUFYNENTVkVINTNBJTJGMjAyMzExMjklMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjMxMTI5VDE0NTMyMFomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTIzMjUzMjU0ZWFiZDIzMTcxMWQxMmQyOTg5ZTBkN2I3NTU0MDZmNjYwZWY1M2FkYTNiNGFiNGMwM2I1NzliMzYmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.NisrwE3dW42U5WOlHuk9g69bWUx-hpxwdIM-FWAvQEY)
- - -
### 🚀 주요 기능

#### - 유저 기능
- 네이버 로그인 API를 활용한 간편한 회원가입/로그인 기능
- 유저 MyPage 기능 (유저가 작성한 코스, 작성한 리뷰, 북마크한 코스 조회)
- 코스 작성 수, 코스리뷰 작성 수, 장소리뷰 작성 수에 따른 랭킹 기능
  
#### - 코스 기능 / 코스 제작
- 네이버 지도 API를 활용하여 화면 및 기능 구성
- 지역 키워드(ex. 서대문구, 마포구...)로 검색된 장소 정보 결과를 표시
- 유저가 장소를 선택하면, 선택 순서에 따라 코스(장소의 조합)가 생성
- 
#### - 코스 기능 / 코스 조회
- 생성된 코스는 페이징이 적용된 리스트뷰 형식으로 모든 유저가 조회 가능
- 지역 키워드로 코스 검색
- 유저의 검색 기록에 맞춘 코스 추천 기능

#### - 리뷰 기능
- 코스에 대한 리뷰 및 별점 기능
- 장소에 대한 별점 기능

#### - 관리자 기능
- 회원 / 코스 / 장소 / 코스리뷰 / 장소리뷰 관리 기능
- 권한이 부여된 사용자에 한하여 검색, 수정, 삭제 가능
