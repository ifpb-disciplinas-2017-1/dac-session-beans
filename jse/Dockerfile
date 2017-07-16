FROM payara/micro
MAINTAINER Ricardo Job <sousajob@gmail.com>
ADD target/dac-jse-jar-with-dependencies.jar $PAYARA_PATH/
ENTRYPOINT ["java", "-jar", "dac-jse-jar-with-dependencies.jar"]
