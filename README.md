# 🏠 Hệ Thống Quản Lý & Tìm Kiếm Phòng Trọ (Room Rental Platform)

> **Mô tả:** Ứng dụng đa nền tảng giúp kết nối người cho thuê và người tìm trọ. Cung cấp các tính năng tìm kiếm phòng theo khu vực, quản lý tin đăng, đánh giá chất lượng và tích hợp hệ thống xác thực an toàn.

---

## 📐 Kiến trúc & Thiết kế Hệ thống

Dự án được thiết kế theo mô hình Client-Server, đảm bảo tính mở rộng và dễ dàng bảo trì. Các tài liệu thiết kế (System Modeling) được lưu trữ tại thư mục `docs/`.

- **Mô hình Dữ liệu (ERD):** Thiết kế tối ưu hóa cho hệ quản trị cơ sở dữ liệu quan hệ (MySQL).
- **Luồng Nghiệp vụ (BPMN):** Chuẩn hóa quy trình đăng tin, duyệt tin và giao dịch thuê phòng.
- **Biểu đồ Use Case & Sequence:** Định nghĩa rõ ràng phân quyền người dùng (Guest, Tenant, Landlord, Admin) và luồng gọi API (được vẽ bằng PlantUML/Draw.io).

---

## 🚀 Công nghệ sử dụng (Tech Stack)

### **Backend (API Server)**

- **Framework:** Java (JDK 17/21), Spring Boot 3.x
- **Database:** MySQL 8.0
- **ORM:** Spring Data JPA / Hibernate
- **Security:** Spring Security, JSON Web Token (JWT)
- **API Documentation:** Swagger / OpenAPI

### **Mobile Client (Frontend)**

- **Framework:** React Native, Expo
- **Ngôn ngữ:** TypeScript
- **State Management:** Zustand / Redux
- **Networking:** Axios (tích hợp Interceptors xử lý Token)

### **Vận hành & Triển khai (DevOps)**

- **Containerization:** Docker, Docker Compose
- **Version Control:** Git, GitHub Flow

---

## 📂 Cấu trúc Thư mục

```text
room-rental-platform/
├── backend/                # Source code Spring Boot RESTful API
├── mobile/                 # Source code React Native (Expo)
├── database/               # Script SQL và các bản vẽ thiết kế (ERD, BPMN)
├── docker-compose.yml      # Cấu hình container cho DB và các services
└── README.md               # Tài liệu dự án
```
