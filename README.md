# SoccerDatabase

#####SoccerDatabase Project Program from Database Systems Class in Handong Global University

This document instruct how to run this program.
There is 3 things you need to implement it.
	
**These things must be done below this sentence.**

* Download this program<br/>
* Download database configuration file in the program<br/>
(in case of network protection, config file is in the other drive)<br/>
* Make a build environment for this program (if you use IDE) <br/><br/>

## 1. Download this program

The easiest way to download this program is clone this repository.

If you see this this docs, then you can access the [**repository**][repository link]

## 2. Download configuration file

To connect our database system through this program, configuration file is needed to connect. 

The file is stored in the other drive for some security and protection reasons. 

If you have permissions to connect our database program (who are related to our team) then download the configure file [**here**][config download link]

If you just want to template files for the configuration file we can give our skeleton file at [**here**][config skeleton download link]

## 3. How to run this

We provide 2 ways for build and run this program.

One is with IDE (Eclipse IDE), the other is CLI (with Ant Build)

### 3.1. Build and Run with IDE

We have tested this program on the Eclipse (both Eclipse IDE and Eclipse Oxygen .3)

If you are trying to implement this program in the other IDE, we can not support it.

#### In a workspace of your Eclipse IDE,

>**Please follow below instruction carefully.**
>
>- Right click the workspace and press 'Import' button<br/><br/>
>- General -> Projects from Folder or Archive<br/><br/>
>- Click 'Directory' on the upper right side.<br/><br/>
>- Find the project folder where you cloned this repository.<br/><br/>
>- Make sure the folder that 'SoccerDatabase' folder is selected.<br/><br/>
>- Click Confirm(or Apply)<br/><br/>
>- Click Finish, then you can find out that the repository is uploaded on your workspace<br/><br/>
>- Right click again the workspace to import external library<br/><br/>
>- Build Path >-> Configure Build Path<br/><br/>
>- Click 'Library' tab on the upper side.<br/><br/>
>- Click 'Classpath' in the box, then click 'Add JARs' on the right side<br/><br/>
>- In the box, the external libraries are 'SoccerDatabase/java/libs'<br/><br/>
>- Click the both libraries 'mysql-connector-java-8.0.15.jar' and 'mybatis-3.5.1.jar'<br/><br/>
>- Check that those libraries are uploaded as subtrees of 'Classpath'<br/><br/>
>- Click 'Apply and Close'<br/><br/>
>- Then You are ready to run this program. 


### 3.2. Build and Run in CLI (with Ant Builder)

This is more easy way to build this program if you have Ant Builder
If you don't have Ant Builder, you can download it from [**here**][ant builder link]

>- In the project folder (In the 'SoccerDatabase' folder where build.xml file is)
	Command "ant MainClass"
>- Then you can see the program is running.

### 4. Programming Constraints

Detail constaints are written in [**Google docs**][program constraint docs link]

### 5. Contributers
[![](https://sourcerer.io/fame/PASTANERD/PASTANERD/SoccerDatabase/images/0)](https://sourcerer.io/fame/PASTANERD/PASTANERD/SoccerDatabase/links/0)[![](https://sourcerer.io/fame/PASTANERD/PASTANERD/SoccerDatabase/images/1)](https://sourcerer.io/fame/PASTANERD/PASTANERD/SoccerDatabase/links/1)[![](https://sourcerer.io/fame/PASTANERD/PASTANERD/SoccerDatabase/images/2)](https://sourcerer.io/fame/PASTANERD/PASTANERD/SoccerDatabase/links/2)[![](https://sourcerer.io/fame/PASTANERD/PASTANERD/SoccerDatabase/images/3)](https://sourcerer.io/fame/PASTANERD/PASTANERD/SoccerDatabase/links/3)[![](https://sourcerer.io/fame/PASTANERD/PASTANERD/SoccerDatabase/images/4)](https://sourcerer.io/fame/PASTANERD/PASTANERD/SoccerDatabase/links/4)[![](https://sourcerer.io/fame/PASTANERD/PASTANERD/SoccerDatabase/images/5)](https://sourcerer.io/fame/PASTANERD/PASTANERD/SoccerDatabase/links/5)[![](https://sourcerer.io/fame/PASTANERD/PASTANERD/SoccerDatabase/images/6)](https://sourcerer.io/fame/PASTANERD/PASTANERD/SoccerDatabase/links/6)[![](https://sourcerer.io/fame/PASTANERD/PASTANERD/SoccerDatabase/images/7)](https://sourcerer.io/fame/PASTANERD/PASTANERD/SoccerDatabase/links/7)


[ant builder link]: https://ant.apache.org/bindownload.cgi 

[repository link]: https://github.com/PASTANERD/SoccerDatabase/tree/master

[config download link]: https://drive.google.com/file/d/1_G0mdALdjm8qDZjlgntfRH0KpwwEcHdz/view?usp=sharing

[config skeleton download link]: https://drive.google.com/

[program constraint docs link]: https://docs.google.com/document/d/1VqkifS9XHX4TQ1pVQHQ47sGiYxZ_lW4N7iegZr8GboM/edit?usp=sharing

<!-- To setting this contributer check this site. https://sourcerer.io/settings#hof -->