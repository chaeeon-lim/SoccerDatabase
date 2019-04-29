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


## 2. TODO list.
### 2.1. 테이블 확립
	- 아
	-아?

	
	
	
	
## 3. Release Note
### ver1.0.0


