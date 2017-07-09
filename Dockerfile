FROM payara/micro
COPY target/dac-jsf-aulas.war dac-jsf-aulas.war
CMD ["java", "-jar", "payara-micro.jar", "--deploy", "dac-jsf-aulas.war"]

#FROM payara/server-web
#ENV DOMAIN domain1
#ENV LIB /opt/payara41/glassfish/domains/${DOMAIN}/lib/
#ENV DEPLOY ${PAYARA_PATH}/glassfish/domains/${DOMAIN}/autodeploy/
#ADD target/dac-session/WEB-INF/lib/ ${LIB}
#ENTRYPOINT $PAYARA_PATH/bin/asadmin start-domain --verbose ${DOMAIN}
#ADD target/dac-session.war  ${DEPLOY}