# xCapella

This is the code used to realize the screencast available here: https://youtu.be/tXd421LMPao


# Installation instructions

You can use a RCP to try the resulting 

## Download GEMOC xCapella RCP

An Eclipse Package containing the GEMOC Studio, Capella Studio, and this xCapella GEMOC language extension is available for download:
 
-  **[GEMOC xCapella RCP 1.1.0](http://gemoc.irisa.fr/pub/studio/gemoc_xcapella_1_1_0/)** contains: 
   [GEMOC Studio 3.2.0](http://gemoc.org/studio_releases/eclipse_package/updatesite/2020/06/16/V3.2.0.html), 
   [Capella Studio 1.3.1](https://github.com/eclipse/capella/releases/tag/v1.3.1), and 
   [xCapella GEMOC language 1.1.0]()

### Requirement:

The current version of the RCP requires **Oracle Java 8**  (using other or newer version of java may disable some features and views of GEMOC) 

## Running examples

The git folder [examples](https://github.com/gemoc/xCapella/tree/master/examples) contains some examples to be imported in the RCP. 
Please refer to their readme for additional instructions.

# Building xCapella GEMOC language

## Installation in your own Eclipse or GEMOC Studio

You can also install the xCapella GEMOC language code in your own eclipse. It requires GEMOC framework and Capella.

Note, GEMOC and Capella versions should be based on a compatible Eclipse base (mainly to ensure Sirius, Xtext, and Xtend versions)  

Currently known (tested) compatible versions are:

| GEMOC         | Capella        | Eclipse       |
| :------------ | :------------- | ------------- |
| 3.2.0         | 1.3.1          | Photon        |


You can either start from a GEMOC studio Eclipse package http://gemoc.org/download.html) and install Capella using its update sites, or start from a Capella product (package) and install GEMOC using its update site
or start from a fresh Eclipse and install both using their update sites.

- List of GEMOC versions (packages and update sites): http://gemoc.org/download.html
- List of Capella version (packages and update sites): https://wiki.eclipse.org/Capella/Release_Notes

## Building GEMOC xCapella RCP

The following command in the root of this repository
```sh
mvn clean package
```
builds xCapella plugins and creates a RCP with GEMOC Studio, Capella and xCapella.

Resulting RCP product is located in `releng/org.eclipse.gemoc.gemoc-xcapella.rcp/target/products`

