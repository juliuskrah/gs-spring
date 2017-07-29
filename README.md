[ ![Codeship Status for juliuskrah/gs-spring](https://app.codeship.com/projects/e569e470-5611-0135-36a0-7646c47fdefc/status?branch=hk2)](https://app.codeship.com/projects/235856)
# Getting Started with JSR 330 (HK2)
This is the source code for [Getting started with Spring and Dependency Injection](http://juliuskrah.com/blog/2016/12/10/introduction-to-spring-and-dependency-injection-jsr-330/) Guide.

## Running the sample
clone the project: `git clone https://github.com/juliuskrah/gs-spring.git`

```bash
git checkout hk2
```

Run `main` method

```bash
mvnw clean compile exec:java -Dexec.mainClass="com.juliuskrah.gs.Application"   # Windows
./mvnw clean compile exec:java -Dexec.mainClass="com.juliuskrah.gs.Application" # Linux, MacOS
```
