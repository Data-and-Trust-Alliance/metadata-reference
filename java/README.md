# Metadata Reference Library (Java)

Welcome to the Java-specific implementation of the Data and Trust Alliance (D&TA) Data Provenance Standards.

## Description

This project contains code references for the Java implementations of data provenance standards entities.  External applications that import these reference implementations will be able to maintain data structure between different elements of the data provenance standards.

## Getting Started

### Dependencies

The Java implementation officially supports Java-17, although it should be compatible with any Java-8+ baseline.  It is implemented as a Maven project with no other major external dependencies.

### Installing

The Java Data Provenance Standards implementation uses a Maven project structure.  As a result, it can be built using basic Maven commands.  All commands are assumed to occur from the root of the Java implementation (`/java/` from repository base).

To compile the project, use command `mvn compile`.

To package the project into a Java Archive (JAR) file, use command `mvn package`.  As with most Maven projects, the desired JAR file will be generated and found in a generated target directory.

To perform the previous steps and install the JAR file into your local Maven repository, use command `mvn install`.

## Included Files

- AddressLine.java
-- Class to describe a single address entry for a given Organization.
- ConfidentialityClassification.java
-- Class to describe confidentiality classifications entries.
- IntendedDataUse.java
-- Class to describe intended data uses for the provided dataset.
- Method.java
-- Class to describe methods used for generating the dataset.
- PrivacyEnhancingTechnology.java
-- Class to capture privacy-related customizations performed on the dataset prior to distribution.
- UniqueEntity.java
-- Generic class providing uniqueness capabilities.
- Concept.java
-- Class to describe an aggregation pattern of code, system location, and description for various abstract concepts in the Data Provenance Standards.
- DataFormat.java
-- Class to capture details about the data format of the provided dataset.
- Location.java
-- Class to describe geolocation information for processing and storage requirements of the dataset.
- Organization.java
-- Class to describe a single authority entity related to the dataset.
- UniqueConcept.java
-- Class providing uniqueness capabilities to concepts.
