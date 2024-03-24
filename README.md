E-commerce API

The E-commerce API is a powerful backend solution for managing product data in an online store. Built using Spring Boot, Spring Data JPA, Hibernate, and RESTful principles, this API provides efficient data retrieval, manipulation, and querying capabilities for seamless integration with various front-end applications and client devices.

Key Features
RESTful Endpoints: Clear and intuitive RESTful endpoints for interacting with product data.
Data Access Layer: Simplified data access using Spring Data JPA and Hibernate.
Secure Authentication: Authentication and authorization mechanisms ensure secure access to endpoints.
Product Management: Comprehensive operations for managing product data, including CRUD operations.
Pagination and Filtering: Optimized performance with pagination and filtering capabilities.
Exception Handling: Robust exception handling for graceful error management.
Integration Ready: Seamless integration with front-end applications, enabling rapid development of e-commerce solutions.
Scalability and Performance: Highly scalable and performant architecture to handle large volumes of requests.
Getting Started
Prerequisites:

Java Development Kit (JDK) installed on your system.
Apache Maven for building the project.
MySQL or any other supported SQL database installed and configured.
Clone the Repository:


git clone <repository-url>
cd e-commerce-api

Configure Database:

Create a MySQL database and update the database configuration in application.properties.
Deploying to AWS Elastic Beanstalk:

Install and configure the AWS CLI on your local machine.

Package the application into a JAR file: mvn clean package

Create an Elastic Beanstalk application and environment using the AWS Management Console or AWS CLI.

Deploy the packaged JAR file to Elastic Beanstalk using the AWS Management Console or AWS CLI.

Once the application is running, you can access the API documentation at 
http://localhost:8080/swagger-ui.html.

Testing with Postman:

Import the provided Postman collection to quickly test API endpoints. The collection includes requests for each API endpoint with sample payloads.

API Endpoints

GET /products: Retrieve all products.

GET /product?productID={id}: Retrieve a specific product by ID.

GET /products-by-name?productName=Laptop

POST /products: Create a new product.

PUT /product?productID={id}: Update an existing product.

DELETE /product?productID={id}: Delete a product by ID.

For detailed information about each endpoint and request/response payloads, refer to the API documentation.

Contributing
Contributions are welcome! If you find any issues or have suggestions for improvement, please open an issue or submit a pull request.