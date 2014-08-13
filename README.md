There are basically two options:

JPA and JAXB annotations on the same classes (see Hyperjaxb3 or DataNucleus)
Or you keep them separated and write code to map one onto another
I personally do not see much added value in the cross-model mapping code.
 Usage of factories also does not seem too innovative, it is just a question 
 of programming technique which you use to map one onto another.
JPA and JAXB in the same entities

Read DataNucleus convert JPA to JAXB entities
This can definitely be done. I actually find the prospect of maintaining code to copy between the models more problematic.

EclipseLink is a great choice for this application as it contains both a JPA (EclipseLink is the RI and open sourced from TopLink), and a JAXB implementation.

EclipeLink JAXB (MOXy) also contains a number of extensions for mapping JPA entities to XML:

XPath base mappings
Mapping bi-directional relationships (using @XmlInvereseReference)
Handling composite key relationships
Handling embedded key classes
Handling java.sql.* types
For more information see:

http://wiki.eclipse.org/EclipseLink/Examples/MOXy/JPA

http://quartz-scheduler.org/overview/quick-start

we could delete easily a stock
but we will find difficulties to delete a market
http://www.mkyong.com/java/how-to-run-a-task-periodically-in-java/
 
http://javarevisited.blogspot.ie/2013/02/what-is-timer-and-timertask-in-java-example-tutorial.html
<<<<<<< HEAD
StocksApp
=========

StandAlone app that will be writing diffrent stock prices on DB
=======
StocksApp
=========

StandAlone app that will be writing diffrent stock prices on DB
>>>>>>> branch 'master' of https://github.com/vcanocepeda/StocksApp.git

<?xml version="1.0" encoding="UTF-8" ?>
<persistence xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
xsi:schemaLocation="http://java.sun.com/xml/ns/persistence http://java.sun.com/xml/ns/persistence/persistence_2_0.xsd"
version="2.0" xmlns="http://java.sun.com/xml/ns/persistence">
<persistence-unit name="persistenceUnit" transaction-type="RESOURCE_LOCAL">
<!-- shouldn't be valid for java SE per specification, but it works for EclipseLink ... -->
<exclude-unlisted-classes>false</exclude-unlisted-classes>
<properties>
 
<property name="javax.persistence.jdbc.driver" value="org.apache.derby.jdbc.EmbeddedDriver" />
<property name="javax.persistence.jdbc.url" value="jdbc:derby:simpleDb;create=true" />
<property name="javax.persistence.jdbc.user" value="EclipseJPAExample" />
<property name="javax.persistence.jdbc.password" value="EclipseJPAExample" />
<!-- EclipseLink should create the database schema automatically -->
<property name="eclipselink.ddl-generation" value="create-tables" />
<property name="eclipselink.ddl-generation.output-mode" value="database" />

<property name="eclipselink.logging.level" value="SEVERE"/>               
</properties>

</persistence-unit>

</persistence>
