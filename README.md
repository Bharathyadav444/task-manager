# task-manager Application
Technologies

	●	Java 21

	●	Spring Boot 4

	●	Spring Data JPA

	●	H2 Database

	●	Maven
Prerequisites

	●	Install Java 21.

	●	Install Maven.

	●	Install STS or IntelliJ IDEA.
Setup Instructions
1. Clone the project

git clone https://github.com/Bharathyadav444/task-manager.git

cd taskmanager
2. Configure H2 Database

Update src/main/resources/application.properties:

spring.datasource.url=jdbc:h2:file:./data/taskmanagerdb

spring.datasource.username=sa

spring.datasource.password=

spring.h2.console.enabled=true

spring.jpa.hibernate.ddl-auto=update
3. Build the application

mvn clean install
4. Run the application

mvn spring-boot:run
5. Access the application

Backend: http://localhost:8080

H2 Console: http://localhost:8080/h2-console

JDBC URL: jdbc:h2:file:./data/taskmanagerdb

Username: sa

Password: Leave empty.
REST API Endpoints

|Method|Endpoint       |Description   |

|------|---------------|--------------|

|POST  |/api/tasks     |Create task   |

|GET   |/api/tasks     |Get all tasks |

|GET   |/api/tasks/{id}|Get task by ID|

|PUT   |/api/tasks/{id}|Update task   |

|DELETE|/api/tasks/{id}|Delete task   |
Run Tests

mvn test
Database

H2 in-memory database is used for task data persistence during application runtime.
 
