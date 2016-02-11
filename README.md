# Basic JPA/Hibernate Configuration Template
This template shows how to get started with a JPA/Hibernate project.  

+ test/java/resources/META-INF/persistence.xml illustrates a basic persistence unit config
+ test/java/resources/sql/create-schema.sql creates a table of Address records
+ test/java/robojeff/AddressTest is the unit test for the Address class
+ test/java/robojeff/AddressIT is the integration test that verifies persistence of an Address object into an in-memory H2 database