
# Java Spring Boot GraphQL API with JPA and H2 Database Integration

This project is a **Java Spring Boot** application that demonstrates the integration of **GraphQL**, **Spring Data JPA**, and **H2 Database**. It provides a GraphQL API to manage orders and customers, allowing for complex data retrieval operations using GraphQL queries.

## Features

- **GraphQL API**: Utilizes Spring GraphQL to expose data operations and simplify frontend-backend interactions.
- **Spring Data JPA**: Provides easy database interaction with entity management and query generation.
- **H2 Database**: Uses an in-memory H2 database for quick setup and testing.
- **Customer and Order Entities**: Represents a one-to-many relationship, modeling real-world e-commerce scenarios.
- **GraphQL Query Mapping**: Implements a custom GraphQL query to fetch orders by customer email.

## Project Structure

- `Customer` and `Order` entities with a one-to-many relationship.
- Repository layer with custom JPA queries.
- Service layer to handle business logic.
- GraphQL Controller to map GraphQL queries with `@QueryMapping`.
- In-memory H2 database configuration for fast setup.

## Getting Started

1. Clone the repository.
2. Run the application (no database setup required, as it uses H2 in-memory).
3. Use GraphQL queries to interact with the API.

