---
description: Build and Run Room Rental Platform
---

This workflow guides you through setting up and running the complete Room Rental Platform ecosystem (Database, Backend, and Mobile).

### Prerequisites
- Docker & Docker Compose
- Java 17+ & Maven
- Node.js & npm
- Expo Go (on your mobile device)

### 1. Start Database
// turbo
```bash
docker-compose up -d
```
> [!NOTE]
> This starts the MySQL 8.0 container on port 3306. The database `room_rental` will be created automatically.

### 2. Initialize Database Schema
If this is your first time, you may want to run the initial schema script:
```bash
docker exec -i room_rental_db mysql -u root -ptdhuy0909 room_rental < database/schema.sql
```

### 3. Run Backend (Spring Boot)
Open a new terminal:
```bash
cd backend
mvn spring-boot:run
```
- **API Base:** `http://localhost:8080/api`
- **Swagger UI:** `http://localhost:8080/swagger-ui.html`

### 4. Run Mobile (React Native / Expo)
Open another terminal:
```bash
cd mobile
npm install
npm start
```
- Press `a` for Android Emulator, `i` for iOS Simulator, or scan the QR code with **Expo Go**.

---

### Troubleshooting
- **Database Connection Error:** Ensure the container is running and port 3306 is not occupied.
- **Backend Error:** Check if `application.yaml` credentials match `docker-compose.yml`.
- **Mobile Error:** Run `npm start --clear` if you encounter cache issues.
