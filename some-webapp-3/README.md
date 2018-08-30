http://localhost:8080/some-webapp-3/
http://localhost:8080/some-webapp-3/test

cas 2 :
    User Dependencies - These are dependencies that are added through jboss-deployment-structure.xml or through the Dependencies: manifest entry.

org.apache.commons.beanutils n'est pas une dépendence implicite.
Cf la liste https://docs.jboss.org/author/display/WFLY10/Implicit+module+dependencies+for+deployments

 > v2 avec maven manifest

modules\system\layers\base\org\apache\commons\beanutils\main

autres cas :
    Local Resource - Class files packaged up inside the deployment itself, e.g. class files from WEB-INF/classes or WEB-INF/lib of a war.
    Inter deployment dependencies - These are dependencies on other deployments in an ear deployment. This can include classes in an ear's lib directory, or classes defined in other ejb jars. 

https://docs.jboss.org/author/display/WFLY10/Class+Loading+in+WildFly
