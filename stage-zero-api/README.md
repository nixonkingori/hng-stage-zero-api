# HNG12 Stage Zero Backend Task

This is a simple Spring Boot API that returns basic information in JSON format.

## API Endpoint
- **URL**: `GET /api/info`
- **Response**:
  ```json
  {
    "email": "kibsnick@ymail.com",
    "current_datetime": "2023-10-05T14:30:00Z",
    "github_url": "https://github.com/nixonkingori/hng-stage-zero-api"
  }

# Setup Instructions

**Clone the repository**:
 
    git clone https://github.com/nixonkingori/hng-stage-zero-api.git

**Navigate to the project directory:**
    
    cd hng-stage-zero-api

**Run the application:**
  
    ./mvnw spring-boot:run

**Access the API at http:**  //localhost:8080/api/info.


