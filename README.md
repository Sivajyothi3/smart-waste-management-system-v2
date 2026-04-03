# 🌱 Smart Waste Management System

## 📌 Project Overview

The **Smart Waste Management System** is a web-based application designed to improve city cleanliness by efficiently managing waste collection, monitoring bin levels, and enabling users to report issues.

It helps:

* Track bin status (empty, partially filled, full)
* Optimize waste collection
* Allow users to report garbage issues
* Provide admin control for managing the system

---

## 🚀 Features

### 👤 User Features

* 🔐 User Login
* 📊 Dashboard View
* 🗑️ Bin Summary Page

  * Shows bin status:

    * Empty
    * Partially Filled
    * Completely Filled
  * Search by **District** and **State**
* 💬 Feedback Page

  * Users can submit feedback
* 🚨 Report Waste Page

  * Users can report garbage issues with:

    * Issue description
    * Location
    * Bin status
* 🚚 Pickups Page

  * Shows bins that are completely filled and need pickup

---

### 🛠️ Admin Features

(Admin has access to all user features + additional controls)

#### 🔧 Manage System

* 🗑️ **Manage Bins**

  * Add new bins
  * Update bin details
  * Delete bins
  * Search by District and City

* 🚚 **Manage Pickups**

  * View full bins
  * Mark pickups as:

    * Pending
    * Completed
  * When marked **Completed** → bin status becomes **Empty automatically**

* 📢 **Manage Reports**

  * View reported issues
  * Mark as:

    * Pending
    * Resolved
  * When marked **Resolved** → report is removed to avoid duplication/confusion

---

## 🏗️ Tech Stack

### Frontend

* HTML
* CSS
* JavaScript

### Backend

* Java (Spring Boot)

### Database

* MySQL

---


### 🏠 Home Page

<img width="1920" height="1080" alt="Screenshot 2026-04-03 115811" src="https://github.com/user-attachments/assets/0862753b-ff25-417e-833f-6dc89ebcd351" />

---

### 🔐 Login Page

<img width="1920" height="1080" alt="Screenshot 2026-03-20 170348" src="https://github.com/user-attachments/assets/10debebd-72e7-4acd-b77b-d0af5b55c804" />


---

### 📊 Dashboard

<img width="1071" height="908" alt="Screenshot 2026-04-03 115916" src="https://github.com/user-attachments/assets/28daddda-0adb-46fc-88f6-3990add0bf98" />


---

### 🗑️ Bin Summary

<img width="504" height="902" alt="Screenshot 2026-04-03 120024" src="https://github.com/user-attachments/assets/ef052d37-b3aa-47f3-ba9f-1546c4951609" />


---

### 💬 Feedback Page

<img width="997" height="907" alt="Screenshot 2026-04-03 120044" src="https://github.com/user-attachments/assets/593502c2-cc05-474b-967a-09ce7bb51486" />


---

### 🚨 Report Waste Page

<img width="992" height="905" alt="Screenshot 2026-04-03 120107" src="https://github.com/user-attachments/assets/a2ec6aea-61b0-431f-b045-4606a4ebd238" />


---

### 🚚 Pickups Page

<img width="746" height="910" alt="Screenshot 2026-04-03 120130" src="https://github.com/user-attachments/assets/d023f793-41d1-449d-8fb7-232c9de59f28" />


---

### 🛠️ Admin Manage System

<img width="1355" height="902" alt="Screenshot 2026-04-03 120254" src="https://github.com/user-attachments/assets/5c61d0a3-678c-4b5b-b2c0-2dd2a5ee2185" />

---

### 🗑️ Manage Bins

<img width="747" height="904" alt="Screenshot 2026-04-03 120337" src="https://github.com/user-attachments/assets/e86bdaf2-6d05-4f32-a9e0-aef2a101f6c2" />


---

### 🚚 Manage Pickups

<img width="985" height="898" alt="Screenshot 2026-04-03 120427" src="https://github.com/user-attachments/assets/fb0027de-c66d-40a1-a2d9-2828f637a8b6" />


---

### 🚨 Manage Reports

<img width="1065" height="898" alt="Screenshot 2026-04-03 124001" src="https://github.com/user-attachments/assets/219da29e-b3c9-42fd-8852-023cb7dcc8b3" />


---

## ⚙️ How to Run the Project

1. Clone the repository:

```bash
git clone https://github.com/your-username/smart-waste-management-system.git
```

2. Navigate to backend:

```bash
cd backend
```

3. Configure database in `application.properties`

4. Run the project:

```bash
mvn spring-boot:run
```

5. Open in browser:

```
http://localhost:8080
```

---

## 🔐 Security Note

Sensitive data like database credentials are **not included** in the repository.
Use `application-example.properties` as a reference.

---

## 🎯 Future Enhancements

* Real-time bin tracking using IoT
* Map integration for location tracking
* Notifications for garbage collection
* Mobile app support
* Deploy on cloud

---

## 👩‍💻 Author

**Varikunta Siva Jyothi**
B.Tech Student | Aspiring Full Stack Developer

---
