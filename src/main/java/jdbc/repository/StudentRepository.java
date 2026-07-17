package jdbc.repository;

import jdbc.config.DBConfig;
import jdbc.entity.Student;
import jdbc.enums.Gender;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class StudentRepository {

    public Optional<Student> save(Student student){
        // SQL insert statement
        String sql = "INSERT INTO student (id, name, age, gender, password) " +
                "VALUES (?,?,?,?,?)";
        try(
                Connection conn = getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql);
                ){
            stmt.setString(1, student.getId());
            stmt.setString(2, student.getName());
            stmt.setInt(3, student.getAge());
            stmt.setString(4, student.getGender().name());
            stmt.setString(5, student.getPassword());

            int rowsInserted = stmt.executeUpdate();
            if(rowsInserted > 0) {
                System.out.println("Student record inserted successfully!");
            } else {
                System.out.println("Failed to insert student record.");
                return Optional.empty();
            }
        }
        catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
            return Optional.empty();
        }
        return Optional.ofNullable(student);
    }

    public List<Student> findAll(){
        List<Student> students = new ArrayList<>();
        String sql = "SELECT * FROM student";

        try(
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ResultSet rs = pstmt.executeQuery();
                ) {

            while(rs.next()){
                Student student = new Student();
                student.setId(rs.getString("id"));
                student.setName(rs.getString("name"));
                student.setAge(rs.getInt("age"));
                student.setGender(Gender.valueOf(rs.getString("gender")));
                student.setPassword(rs.getString("password"));
                students.add(student);
            }

            return students;
        } catch (SQLException e) {
            System.out.println("Error fetching students: " + e.getMessage());
            return Collections.emptyList();
        }

    }

    public Optional<Student> findById(String id) {
        String sql = "SELECT * FROM student WHERE id = ?";

        try(
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ) {
            pstmt.setString(1, id);
            try(ResultSet rs = pstmt.executeQuery()) {
                Student student = new Student();
                if(rs.next()) {
                    student.setId(rs.getString("id"));
                    student.setName(rs.getString("name"));
                    student.setAge(rs.getInt("age"));
                    student.setGender(Gender.valueOf(rs.getString("gender")));
                    student.setPassword(rs.getString("password"));
                    return Optional.of(student);
                }
            }
        }
        catch(SQLException e) {
            System.out.println("Error fetching student: " + e.getMessage());
        }
        return Optional.empty();
    }

    public boolean update(Student student) {
        String sql = "UPDATE student SET name = ?, age = ?, gender = ?, password = ?" +
                "WHERE id = ?";
        try(
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ) {
            pstmt.setString(1, student.getName());
            pstmt.setInt(2, student.getAge());
            pstmt.setString(3, student.getGender().name());
            pstmt.setString(4, student.getPassword());
            pstmt.setString(5, student.getId());

            int rowsUpdated = pstmt.executeUpdate();
            return rowsUpdated > 0;
        }
        catch(SQLException e){
            System.out.println("Error updating student: " +e.getMessage());
        }
        return false;
    }

    public boolean deleteById(String id) {
        String sql = "DELETE FROM student WHERE id = ?";
        try(
                Connection conn = getConnection();
                PreparedStatement pstmt = conn.prepareStatement(sql);
                ) {
            pstmt.setString(1, id);
            int rowSDeleted = pstmt.executeUpdate();
            return rowSDeleted > 0;
        }
        catch(SQLException e) {
            System.out.println("Error deleting student: " + e.getMessage());
        }
        return false;
    }

    private Connection getConnection() throws SQLException {
        return DriverManager.getConnection(
                DBConfig.getInstance().getUrl(),
                DBConfig.getInstance().getUsername(),
                DBConfig.getInstance().getPassword()
        );
    }
}
