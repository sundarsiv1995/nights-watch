import java.sql.*;

public class Example {
    public static void main(String[] args) {
        String username = request.getParameter("username"); // Assume this is the user input
        String password = request.getParameter("password"); // Assume this is the user input

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "username", "password");
        Statement statement = connection.createStatement();

        String query = "SELECT * FROM users WHERE username='" + username + "' AND password='" + password + "'";
        ResultSet resultSet = statement.executeQuery(query);

        // Rest of the code...
    }
}
