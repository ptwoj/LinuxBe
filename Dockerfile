FROM openjdk:17
# 프로젝트를 복사해서,
#RUN ["mkdir", "project"]
#COPY . /app/
# 도커 파일안에서,
# 빌드를 치고 그 후에,
#RUN ["chmod", "744", "/project/gradlew"]
#RUN ["./project/gradlew", "clean", "build", "--no-debug"]

COPY build/libs/*T.jar app.jar
# jar파일을 실행시킨다.
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "app.jar"]

# docker run --name -d -p 3307:3306 -e MYSQL_ROOT_PASSWORD=1234

# docker run --name my-mysql -d -p 3307:3306 -e MYSQL_ROOT_PASSWORD=1234 -e MYSQL_DATABASE=test mysql