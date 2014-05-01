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
