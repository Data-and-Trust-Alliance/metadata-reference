# Metadata Reference Library (Python)

Welcome to the Python-specific implementation of the Data and Trust Alliance (D&TA) Data Provenance Standards.

## Description

This project contains code references for the Python implementations of data provenance standards entities.  External applications that import these reference implementations will be able to maintain data structure between different elements of the data provenance standards.

## Getting Started

### Dependencies

The Python implementation officially supports Python 3, although it should be compatible with Python 2 as well.  It is implemented as a single module with no significant external dependencies.

### Installing

The Python Data Provenance Standards implementation captures all Python classes in a single file.  For now, copying the file `metadata_reference.py` directly into your desired Python project is the preferred means of distribution (with the intent of future distribution via package managers such as `conda-forge`).

## Included Files

- metadata_reference.py
-- Code file capturing all relevant classes in the Data Provenance Standards.
