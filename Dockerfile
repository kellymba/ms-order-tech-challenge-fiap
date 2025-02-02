FROM maven:4.0.0-amazoncorretto-17 as build
WORKDIR /app
COPY pom.xml
COPY src ./src
RUN mvn clean package -DskipTests

FROM amazoncorretto:17
WORKDIR /app
COPY --from/build /app/target/ms-order.jar

ENV DB_URL=URL

EXPOSE 3000

CMD [ "java", "-jar", "-DDB_URL=${DB_URL}", "ms-order.jar" ]