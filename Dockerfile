FROM openjdk:17
# 프로젝트를 복사해서,
RUN ["mkdir", "project"]
COPY . ./project
# 도커 파일안에서,
# 빌드를 치고 그 후에,
RUN ["./chmod", "744", "/project/gradlew"]
RUN ["./project/gradlew", "clean", "build"]
# jar파일을 실행시킨다.
ENTRYPOINT ["java", "jar", "Dspring.profiles.active=pord", "project/build/libs/*T.jar"]

