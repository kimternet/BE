# RDBMS와 JDBC를 이용한 데이터 처리 실습
목차
RDBMS 개요
SQL 기초
JDBC
JDBC 실습
Transaction
ORM
1. RDBMS 개요
RDBMS 정의: 관계형 모델 기반 데이터베이스 시스템으로, 데이터를 테이블 형태로 관리합니다.
주요 RDBMS: Oracle, MySQL, PostgreSQL, MariaDB, 클라우드 관리형 DBMS.
MySQL 8 사용: 실습에서는 MySQL 8 버전을 사용합니다.
2. SQL 기초
DML (Data Manipulation Language)
Create (Insert), Read (Select), Update, Delete: 기본 데이터 조작 명령어.
DDL (Data Definition Language)
Create Table, Alter Table, Drop Table: 테이블 구조를 정의하고 변경합니다.
Foreign Key Constraints: ON DELETE, ON UPDATE 등 제약 조건 설정.
3. JDBC
표준 인터페이스: 데이터베이스 독립적 접근을 위한 표준화된 인터페이스.
JDBC와 ODBC: JDBC(Java Database Connectivity)와 ODBC(Open Database Connectivity)의 차이점.
4. JDBC 실습
실습 환경 준비
Schema 및 Table 생성: 실습용 데이터베이스 및 테이블 설정.
MySQL, JDBC 드라이버 설정: 의존성 추가 및 초기 설정.
주요 클래스 및 메소드
DriverManager: MySQL 연결 설정.
Connection: 데이터베이스와의 연결 관리.
Statement 및 PreparedStatement: SQL 명령어 실행.
ResultSet: 쿼리 결과 처리.
CallableStatement: 저장 프로시저 호출.
5. Transaction
Transaction 이해: 격리 수준(Isolation Level)과 커밋(commit)/롤백(rollback) 사용.
Auto Commit 설정: Auto commit false 설정 후 트랜잭션 제어.
SavePoint: 부분 롤백을 위한 복구 시점 지정.
6. ORM (Object-Relational Mapping)
ORM 개념: 객체 지향적 데이터베이스 접근 방식.
JPA와 Spring Data JPA: 엔터티(Entity), 리포지토리(Repository) 등을 활용한 데이터 매핑.
