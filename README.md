# coursetogoMySQL
ORACEL DB로 만들어진 coursetogo 프로젝트를 MySQL로 마이그레이션

sql문 (mapper.xml) 수정 일람
1. sysdate로 입력되던 날짜를 NOW()로 변경
2. ctg_user_seq.nextval 등으로 입력되던 값(ORACLE 시퀀스 사용/보통 PK에 사용)을 삭제. MySQL에서는 AUTO_INCREMENT가 적용되어 자동적으로 값이 생성됨.
3. 순위나 상위 N개의 값 등을 출력하기 위해 사용되던 ROWNUM을 LIMIT을 사용해 대체.
![image](https://github.com/Paprika0290/coursetogoMySQL/assets/59499235/44c43add-fd7f-47c3-9640-3c478ca087b3)
![image](https://github.com/Paprika0290/coursetogoMySQL/assets/59499235/f2379a95-54b7-4005-a63d-7a147ad74ce3)
