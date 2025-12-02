# TTLab UIMA Type System
A collection of all UIMA `TypeSystemDescriptors` for the UIMA pipelines of the Text Technology Lab.

[![license](https://img.shields.io/github/license/texttechnologylab/UIMATypeSystem)]()
<a 
  href="https://github.com/texttechnologylab/UIMATypeSystem/releases/latest"><img 
  alt="GitHub Latest Release"
  src="https://img.shields.io/github/v/release/texttechnologylab/UIMATypeSystem?link=https%3A%2F%2Fgithub.com%2Ftexttechnologylab%2FUIMATypeSystem%2Freleases%2Flatest&label=Release"></a>
<a
  href="https://github.com/texttechnologylab/UIMATypeSystem/packages/2719243"><img
  alt="Package"
  src="https://img.shields.io/github/v/release/texttechnologylab/UIMATypeSystem?label=Package&color=ab7df8"></a>
[![](https://jitpack.io/v/texttechnologylab/UIMATypeSystem.svg)](https://jitpack.io/#texttechnologylab/UIMATypeSystem)

## Use with Maven

### Via [GitHub Packages](https://docs.github.com/en/packages)

Requires Maven to be set-up for [authentication with GitHub Packages](https://docs.github.com/en/packages/working-with-a-github-packages-registry/working-with-the-apache-maven-registry#authenticating-to-github-packages).

```xml
<repositories>
  <repository>
    <id>github</id>
    <url>https://maven.pkg.github.com/texttechnologylab/*</url>
    <snapshots>
      <enabled>true</enabled>
    </snapshots>
  </repository>
</repositories>

<dependencies>
  <dependency>
    <groupId>org.texttechnologylab.annotation</groupId>
    <artifactId>typesystem</artifactId>
    <version>3.0.13</version>
  </dependency>
</dependencies>

<!-- Authentication can also be set-up in your ~/.m2/settings.xml file -->
<servers>
  <server>
    <id>github</id>
    <username>USERNAME</username>
    <password>TOKEN</password>
  </server>
</servers>
```

### Via ![JitPack](https://jitpack.io/)
```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependencies>
 	<dependency>
	   <groupId>com.github.texttechnologylab</groupId>
	   <artifactId>UIMATypeSystem</artifactId>
	   <version>3.0.13</version>
	 </dependency>
</dependencies>
```


# Cite
If you want to use the project please quote this as follows:

G. Abrami, D. Baumartz and A. Mehler, “UIMATypeSystem”, Texttechnology Lab, Goethe-University Frankfurt, 2017.

# BibTeX
```
@techreport{Abrami:Baumartz:Mehler:2017,
  author         = {Abrami, Giuseppe and Baumartz, Daniel and Mehler, Alexander},
  title          = {UIMATypeSystem},
  type           = {Software},
  institution    = {Texttechnology Lab, Goethe-University Frankfurt},
  address        = {Frankfurt},
  year           = {2017}
}
