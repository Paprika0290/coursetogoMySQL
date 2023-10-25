# coursetogoMySQL
배포를 시도하던 차, ORACLE CLOUD 사용이 어려워져 ORACEL DB로 만들어진 coursetogo 프로젝트를 MySQL로 마이그레이션하게 되었습니다.
<BR><BR><BR>
<H3>◆ sql문 (mapper.xml) 수정 일람</H3>
1. sysdate로 입력되던 날짜를 NOW()로 변경 <BR><BR>
2. ctg_user_seq.nextval 등으로 입력되던 값(ORACLE 시퀀스 사용/보통 PK에 사용)을 삭제. MySQL에서는 AUTO_INCREMENT가 적용되어 자동적으로 값이 생성됨. 
 <BR><BR>
3. 순위나 상위 N개의 값 등을 출력하기 위해 사용되던 ROWNUM을 LIMIT을 사용해 대체.<BR> <BR> 
 <B> < ORACLE SQL > </B><BR>
  
![image](https://github.com/Paprika0290/coursetogoMySQL/assets/59499235/44c43add-fd7f-47c3-9640-3c478ca087b3)<br> <BR><B> < MYSQL SQL > </B><BR>

![image](https://github.com/Paprika0290/coursetogoMySQL/assets/59499235/f2379a95-54b7-4005-a63d-7a147ad74ce3)<br> 
 <BR>
4. <choose><when><otherwise> 태그를 이용해 만든 ORACLE SQL구문에서 이 구문들을 일반 AND,OR 논리연산자로 대체<BR><BR>
5. REGEXP_LIKE 함수를 REFEXP 연산자로 변경<BR><BR>
6. ORACLE SQL구문을 짤 때 필요했으나 MYSQL SQL로 변경하며 불필요해진 <![CDATA[]]> 섹션 제거<BR><BR>

7. 페이지네이션을 구현할 때 사용했던 구문 일부 변경
![image](https://github.com/Paprika0290/coursetogoMySQL/assets/59499235/865c9d4a-b8fa-44cd-a8df-01c6ab33c691) <br>
- ORACLE SQL에서는 WHERE r BETWEEN {시작행} AND {마지막행}으로 페이지네이션을 구현하였으나
- MYSQL SQL에서는 LIMIT {행의 수} OFFSET {시작행}-1 로 변경되었으므로 코드를 수정.<BR><BR>

8. Oracle : LIKE '%' || #{keyword} || '%' -> MySQL : LIKE CONCAT('%', #{keyword}, '%'))
