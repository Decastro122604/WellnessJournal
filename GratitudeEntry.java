
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class GratitudeEntry extends JournalEntry {
    private String gratitude;

    public GratitudeEntry(String date, String gratitude) {
        super(date, "Gratitude");
        this.gratitude = gratitude;
    }

    @Override
    public void logEntry() {
        System.out.println("Gratitude logged: " + gratitude);
        saveToDatabase();
    }

    private void saveToDatabase() {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/WellnessJournalDB", "root", "your_password")) {
            String query = "INSERT INTO GratitudeEntry (date, gratitude) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, getDate());
            preparedStatement.setString(2, gratitude);
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String analyzeEntry() {
        return "Reflect on your gratitude entries to maintain a positive outlook.";
    }
}
