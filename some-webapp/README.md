http://localhost:8080/some-webapp/
http://localhost:8080/some-webapp/test

cas 1 :
WildFly automatically adds the module dependency to your deployment
"System Dependencies - These are dependencies that are added to the module automatically by the container, including the Java EE api's."
> scope provided

implicit !
https://docs.jboss.org/author/display/WFLY10/Implicit+module+dependencies+for+deployments
> org.slf4j est implicite

autres cas :
  
    User Dependencies - These are dependencies that are added through jboss-deployment-structure.xml or through the Dependencies: manifest entry.
    Local Resource - Class files packaged up inside the deployment itself, e.g. class files from WEB-INF/classes or WEB-INF/lib of a war.
    Inter deployment dependencies - These are dependencies on other deployments in an ear deployment. This can include classes in an ear's lib directory, or classes defined in other ejb jars. 

https://docs.jboss.org/author/display/WFLY10/Class+Loading+in+WildFly
wildfly\modules\system\layers\base\org\slf4j\main
https://developer.jboss.org/thread/248963
https://developer.jboss.org/thread/274097
> pas besoin de jboss-deployment-structure.xml