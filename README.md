# Car Factory

This project is simple Car Factory application. Abstract factory design pattern is preferred. Unit tests were written.

### Prerequisites
1- JDK 11

2- Maven Commands

### Http Requests

###### Request:
GET localhost:8080/car/?car=cabrio

###### Response:
```json
Cabrio Car has produced.
```

###### Request:
GET localhost:8080/car/?car=sedan

###### Response:
```json
Sedan Car has produced.
```

###### Request:
GET localhost:8080/car/?car=hatchback

###### Response:
```json
Hatchback Car has produced.
```