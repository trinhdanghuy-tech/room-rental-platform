# Room Rental Platform - ERD (Entity Relationship Diagram)

This diagram describes the database structure for the Room Rental Platform, supporting three main roles: **ADMIN**, **LANDLORD**, and **TENANT**.

```mermaid
erDiagram
    USER ||--o{ ROOM : "manages (Landlord)"
    USER ||--o{ BOOKING : "makes (Tenant)"
    CATEGORY ||--o{ ROOM : "classifies"
    ROOM ||--o{ ROOM_IMAGE : "has"
    ROOM ||--o{ ROOM_UTILITY : "has"
    ROOM ||--o{ BOOKING : "is booked"
    ROOM ||--o{ REVIEW : "receives"
    USER ||--o{ REVIEW : "writes"

    USER {
        bigint id PK
        string username
        string password
        string email
        string full_name
        string role "ADMIN, LANDLORD, TENANT"
        string phone
        string avatar_url
        string status "ACTIVE, BLOCKED"
        timestamp created_at
    }

    CATEGORY {
        bigint id PK
        string name
        string description
    }

    ROOM {
        bigint id PK
        bigint landlord_id FK
        bigint category_id FK
        string title
        string description
        decimal price
        string address
        string city
        string district
        string ward
        float area
        string status "AVAILABLE, PENDING, RENTED"
        timestamp created_at
    }

    ROOM_IMAGE {
        bigint id PK
        bigint room_id FK
        string url
        boolean is_primary
    }

    ROOM_UTILITY {
        bigint id PK
        bigint room_id FK
        string name
    }

    BOOKING {
        bigint id PK
        bigint tenant_id FK
        bigint room_id FK
        date check_in_date
        date check_out_date
        decimal total_price
        string status "PENDING, APPROVED, REJECTED, CANCELLED"
        timestamp created_at
    }

    REVIEW {
        bigint id PK
        bigint room_id FK
        bigint user_id FK
        int rating
        string comment
        timestamp created_at
    }
```
