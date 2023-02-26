FROM openjdk:17-jdk-slim

ADD target/my-budget-planner-0.0.1-SNAPSHOT.jar /data/my-budget-planner-0.0.1-SNAPSHOT.jar
CMD exec -Xms64m -Xmx256m - jar /data/my-budget-planner-0.0.1-SNAPSHOT.jar