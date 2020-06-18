FROM openjdk:8-jre

LABEL maintainer="Frederick Moschkowich <frederick.nazario@pti.org.br>"

RUN apt update & apt install tzdata -y

# Application variables
ENV APP_HOME /app
ENV APP_NAME api
ENV APP_FILE ${APP_NAME}-*.war
ENV SPRING_PROFILES_ACTIVE production

WORKDIR ${APP_HOME}

COPY target/${APP_FILE} ${APP_HOME}

CMD ["sh", "-c", "java -jar ${APP_FILE}"]

# docker build -t uniamerica/unijobs .
