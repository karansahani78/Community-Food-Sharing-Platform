# Community Food Sharing Platform

## Developer Information

- **Developer**: Karan Sahani
- **Email**: karansahani723@gmail.com
- **Repository Name**: Community-Food-Sharing-Platform

## Project Description

The Community Food Sharing Platform is designed to facilitate food sharing within a community. This platform enables user registration, food item management, and pickup request handling.

## Setup Instructions

### Step 1: Clone the Repository

Clone the repository using the following command:
```sh
git clone https://github.com/your-username/Community-Food-Sharing-Platform.git

Navigate to the project directory:
cd Community-Food-Sharing-Platform


### Step 2: Configure the Database
Update the application.properties file with your PostgreSQL settings:

spring.datasource.url=jdbc:postgresql://localhost:5432/your-database-name
spring.datasource.username=your-database-username
spring.datasource.password=your-database-password
spring.jpa.hibernate.ddl-auto=update

## Step 3: Build the Project
Build the project using Maven:
mvn clean install

## Step 4: Run the Application
mvn spring-boot:run
## now you can call the all EndPoints 

