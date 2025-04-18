# 📚 Library Information System

A full-stack Library Information System to manage users, books, borrowing history, fines, and more. Built with **Vue 3 + Vuetify** on the frontend and **Spring Boot + MySQL** on the backend, this project is designed to be modern, modular, and secure using **JWT authentication**.

---

## 🚀 Features

### 👩‍🎓 User Side
- User-friendly dashboard with a modern UI
- Browse and sort books with cover images
- Add books to cart (wishlist) for checkout
- View profile, edit personal details
- Check fine history and borrowing records

### 👩‍🏫 Faculty/Admin Side
- Upload course materials and assignments
- Post spotlight announcements
- Manage user fines and payments

### 🔐 Authentication & Roles
- JWT-based secure login/registration
- Role-based access (Student, Faculty, Admin)

---

## 🧱 Tech Stack

### Frontend
- [Vue 3](https://vuejs.org/)
- [Vuetify](https://vuetifyjs.com/)
- Axios for HTTP requests

### Backend
- [Spring Boot 3.4.4](https://spring.io/projects/spring-boot)
- Spring Security (JWT authentication)
- Spring Data JPA (Hibernate)
- MySQL

---

## ⚙️ Getting Started

### 🖥️ Backend

```bash
cd backend
./mvnw spring-boot:run
