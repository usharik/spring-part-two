FROM openjdk:8-jdk-alpine

ARG JAR_FILE

ENV DATABASE_URL ""

COPY ./target/${JAR_FILE} /bin/app.jar
COPY ./entrypoint.sh /bin/entrypoint.sh
RUN chmod +x /bin/entrypoint.sh

CMD ["/bin/entrypoint.sh"]