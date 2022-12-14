FROM openjdk:18-oraclelinux8

ARG JAR_FILE

RUN microdnf install nc && microdnf clean all

RUN mkdir -p /apps
COPY ./build/libs/${JAR_FILE} /apps/app.jar
COPY entrypoint.sh /apps/entrypoint.sh
RUN chmod +x /apps/entrypoint.sh

CMD ["/apps/entrypoint.sh"]
