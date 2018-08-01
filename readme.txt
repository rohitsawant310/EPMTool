Step to run Project

1. Install Mysql Database as below

	1.	mysqld --install-manual --skip-grant-tables
	2.	net start mysql
	3.	mysql -u root -p root
	
	CREATE USER 'toolAdmin'@'localhost'
	IDENTIFIED WITH mysql_native_password BY 'toolAdmin';

2.Run createTables.sql queries
3.Add apache tomcat server
4.do run as server
5.visit below url
	http://localhost:8080/EPM/login
	http://localhost:8080/EPM/newUser


http://www.mkyong.com/spring-security/spring-security-form-login-using-database/

Below is Going to change....


** Security Module

1.Authentication - Access to Tool.
	-Using Spring Security
	-Tables
		-User -> UserName , Password etc. 
		-UserDetails -> Extra User Info
	
2.Authorization - User profile level available functionality access.
 	-Using Spring Security
 	-Tables
 		-Access_Roles -> RoleName , AccessGroup, Enabled
 		-Mapping_AccessRoles -> AccessRoleId, AccessRoleParentId, Enabled
 		-Access_Group -> GroupName, Enabled
 		-Access_Page -> PageName, Enabled,Details
 		-Mapping_AccessGroupPage -> GroupId, PageId,Enabled
 		
 		
 		
Read :> 
	*How Spring Securty works- https://www.javacodegeeks.com/2013/11/spring-security-behind-the-scenes.html 