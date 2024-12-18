import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MoodEntry extends JournalEntry {
    private String mood;
    private String reflection;

    public MoodEntry(String date, String mood, String reflection) {
        super(date, "Mood");
        this.mood = mood;
        this.reflection = reflection;
    }

    @Override
    public void logEntry() {
        System.out.println("Mood Entry logged: " + mood + " - " + reflection);
        saveToDatabase();
    }

    private void saveToDatabase() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/WellnessJournalDB", "root", "your_password")) {
            String query = "INSERT INTO MoodEntry (date, mood, reflection) VALUES (?, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, getDate());
            preparedStatement.setString(2, mood);
            preparedStatement.setString(3, reflection);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String analyzeEntry() {
        switch (mood.toLowerCase()) {
            case "happy":
                return "Keep up the positive mindset!";
            case "sad":
                return "Consider reaching out to a friend or trying a new hobby.";
            case "anxious":
                return "Try breathing exercises or a quick meditation session.";
            default:
                return "Stay mindful and take care of yourself!";
        }
    }
}

