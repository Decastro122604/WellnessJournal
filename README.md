# 🧘 **Mental Wellness Journal** 🌟  
A simple yet effective **Java program** integrated with a **MySQL database** to help users track their daily moods and gratitude entries. Promoting **positivity** and mental well-being one entry at a time!

---

## 📜 **Overview**  
The **Mental Wellness Journal** allows users to:  
1. Log **Mood Entries** with reflections.  
2. Log **Gratitude Entries** to appreciate the good things in life.  
3. View all their entries in a structured format.  

Each entry is stored in a **MySQL database** to ensure data persistence, making it easy to revisit reflections and track emotional well-being over time.

---

## 🚀 **Features**  
- 🎯 **Mood Tracking**: Record your mood (Happy, Sad, Anxious, etc.) and a short reflection for the day.  
- 🙏 **Gratitude Journaling**: Write what you’re grateful for and focus on positivity.  
- 📊 **View Entries**: Display all journal entries (moods & gratitude) along with helpful analyses.  
- 💾 **Data Persistence**: All entries are securely stored in a MySQL database, ensuring they are never lost.  
- 📦 **Clean Code Structure**: Implemented using **OOP principles** for easy scalability and maintenance.

---

## 🏗️ **Project Structure**  
The project follows a clean and modular structure using **Object-Oriented Programming**:  

```
MentalWellnessJournal/
│
├── src/
│   ├── JournalEntry.java          # Abstract class for common properties/methods
│   ├── MoodEntry.java             # Handles mood-related entries
│   ├── GratitudeEntry.java        # Handles gratitude entries
│   └── WellnessJournal.java       # Main program (handles user interaction)
│
├── Database/
│   └── wellness_journal.sql       # SQL script for creating the database and table
│
└── README.md                      # Project documentation
```

---

## 🛠️ **Technologies Used**  
- **Java** (Core programming language)  
- **MySQL** (Database for storing journal entries)  
- **JDBC** (Java Database Connectivity for database integration)  
- **VS Code** (Code editor)

---

## 🗄️ **Database Schema**  
The MySQL table used for this project has the following structure:  

| Column       | Type           | Description                          |
|--------------|----------------|--------------------------------------|
| `id`         | INT (PK, Auto) | Unique identifier for each entry.    |
| `entry_date` | DATE           | Date of the entry.                  |
| `type`       | VARCHAR(20)    | Type of entry: "Mood" or "Gratitude" |
| `mood`       | VARCHAR(50)    | Mood (e.g., Happy, Sad) (Mood Only). |
| `reflection` | TEXT           | Reflection note for mood.           |
| `gratitude`  | TEXT           | Gratitude text (Gratitude Only).    |

---

## 🖥️ **How to Run the Project**  

Follow these steps to run the program locally:  

### 1️⃣ **Set up MySQL Database**  
1. Install MySQL and create a new database:  
   ```sql
   CREATE DATABASE wellness_journal;
   USE wellness_journal;

   CREATE TABLE entries (
       id INT AUTO_INCREMENT PRIMARY KEY,
       entry_date DATE NOT NULL,
       type VARCHAR(20),
       mood VARCHAR(50),
       reflection TEXT,
       gratitude TEXT
   );
   ```
2. Note your MySQL credentials (username, password, database name).  

---

### 2️⃣ **Configure JDBC in the Code**  
1. In the `WellnessJournal.java` file, locate the database connection section:  
   ```java
   String url = "jdbc:mysql://localhost:3306/wellness_journal";
   String username = "YOUR_USERNAME";
   String password = "YOUR_PASSWORD";
   ```
2. Replace `YOUR_USERNAME` and `YOUR_PASSWORD` with your MySQL credentials.  

---

### 3️⃣ **Run the Program**  
1. Open the project in **VS Code**.  
2. Compile the program:  
   ```bash
   javac WellnessJournal.java
   ```
3. Run the program:  
   ```bash
   java WellnessJournal
   ```
4. Follow the on-screen menu to log your **mood** or **gratitude** entries and view all your journal reflections.

---

## 📸 **Sample Output**  

Here is a screenshot of the MySQL table after running the program:  

### **Entries in the Database**  
![Database Screenshot 1](file-Bs8gMEG2SSHCbaQ5jbakYS)  

**Updated Entries**:  
![Database Screenshot 2](file-CjbfPA6drSw2FUKBNXBARo)  

---

## 📈 **Future Improvements**  
- Add **search functionality** to view specific entries based on mood or date.  
- Integrate **chart libraries** to display mood trends over time.  
- Enhance the user interface using a **GUI** framework like JavaFX.  


## 💡 **Conclusion**  
The Mental Wellness Journal is a great way to track your daily reflections, promoting a healthy mindset through consistent journaling. By integrating Java with MySQL, this project demonstrates the power of programming in building tools that positively impact well-being.
The **Mental Wellness Journal** is a great way to track your daily reflections, promoting a **healthy mindset** through consistent journaling. By integrating Java with MySQL, this project demonstrates the power of programming in building tools that positively impact well-being.
