#FROM payara/micro
#COPY target/dac-session.war dac-session.war
#CMD ["java", "-jar", "payara-micro.jar", "--deploy", "dac-session.war"]

FROM payara/server-full
ENV DOMAIN domain1
ENV LIB /opt/payara41/glassfish/domains/${DOMAIN}/lib/
ENV DEPLOY ${PAYARA_PATH}/glassfish/domains/${DOMAIN}/autodeploy/
ADD web/target/dac-session/WEB-INF/lib/ ${LIB}
ENTRYPOINT $PAYARA_PATH/bin/asadmin start-domain --verbose ${DOMAIN}
ADD web/target/dac-session.war  ${DEPLOY}
ADD core/target/core.war  ${DEPLOY}

