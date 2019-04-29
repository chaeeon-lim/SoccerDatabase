# SoccerDatabase
SoccerDatabase Project Program from Database Systems Class in Handong Global University

## 1. 컴파일 방법 2가지 </br>
### 1.1. IDE 빌드 </br>
Eclipse Oxygen.3 에서 빌드 성공하였음.</br>
아래는 Eclipse Oxygen.3에서 빌드 할 때 내용임.
Repository 폴더 전체를 프로젝트로 설정한 뒤 빌드를 실행하면 결과를 볼 수 있음. </br>
테스트를 위한 main 클래스는 com.soccerdb.oldschool.main 패키지 내의 MainClass.java 로 테스트를 할 수 있음.
	
#### Eclipse의 임의의 workspace에서,
	1. 마우스 우클릭을 하여 Import를 누른다.
	2. General -> Projects from Folder or Archive 를 선택
	3. 오른쪽 상단에 Directory를 누른 뒤 Clone한 Repository를 찾는다. 
	4. java 폴더보다 상위 폴더인 SoccerDatabase 폴더가 선택됬는지 확인한다.
	5. 해당 Repository에서 확인을 누른다.
	6. Finish를 누른다.
	7. 추가된 프로젝트에서 다시 오른쪽 버튼을 클릭한다. (mybatis와 mysql 라이브러리를 추가해야한다.)
	8. Build Path 에서 Configure Build Path 를 선택
	9. 박스 안에 Classpath를 선택한 뒤 오른쪽에 Add JARs를 누른다.
	10. 프로젝트 폴더에서 SoccerDatabase/java/libs 로 이동하면 mybatis-3.5.1.jar와 mysql-connector-java-8.0.15.jar를 선택한다.
	11. 박스의 Classpath의 서브트리로 jar 파일들이 추가되었는지 확인한다.
	12. Apply and Close를 누른다.
	
	
	마지막으로 Build 를 시행한다.
	
	

### 1.2. CLI 빌드
현재 CLI로 빌드하는 방법은 아직 정리되지 않음.

<hr/>

## 2. TODO list.
### 2.1. 테이블 확립 (프로그램에 등록된 Entity)
현재 스키마에 등록된 테이블 중 SoccerDatabase의 서비스를 처리하는 프로그램에서 등록된 테이블은 다음과 같다.
__(굵은 글씨로 들여쓰기 된 요소가 처리된 것임)__

- Appears
- Clubs
- Contracts
- Fieldplayers
- Games
- Keepers
- Mathces
	- __Players__
- Seasons

### 2.2. 맵퍼 확립 (프로그램에 등록된 Mapper)
현재 프로그램에 등록된 Entity 중 Mapper와 연결된 Entity는 다음과 같다.

- Appears
- Clubs
- Contracts
- Fieldplayers
- Games
- Keepers
- Mathces
	- __Players__
- Seasons
	
### 2.2.1 맵퍼 개선하기
맵퍼 파일을 개선함으로써 추가적인 메소드를 발생시키지 않고 기능을 늘릴 방법 모색

syntax:  동적 SQL에 대한 참조(http://www.mybatis.org/mybatis-3/ko/dynamic-sql.html)

### 2.3. DAO 처리 확립 (프로그램에 등록된 Impl<Entity>DAO)
현재 프로그램에 등록된 Entity 중 DAO를 실행하는 모듈(Impl<Entity>DAO)가 구성된 Entity는 다음과 같다.
	
- Appears
- Clubs
- Contracts
- Fieldplayers
- Games
- Keepers
- Mathces
	- __Players__
- Seasons
	
### 2.4. View 구성

### 2.5. 시나리오 처리

### 2.6. View 연결

