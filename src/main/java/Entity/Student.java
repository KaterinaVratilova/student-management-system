package Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "students")
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String firstName;
  private String lastName;
  private String companyName;
  private String email;
  private String courseName;
  private LocalDateTime courseDate;
  private LocalTime courseStartTime;
  private String courseID;
  private Integer costs;

  public Student() {
  }

  public Student(String firstName, String lastName, String companyName, String email, String courseName, LocalDateTime courseDate, LocalTime courseStartTime, String courseID, Integer costs) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.companyName = companyName;
    this.email = email;
    this.courseName = courseName;
    this.courseDate = courseDate;
    this.courseStartTime = courseStartTime;
    this.courseID = courseID;
    this.costs = costs;
  }



  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCourseName() {
    return courseName;
  }

  public void setCourseName(String courseName) {
    this.courseName = courseName;
  }

  public LocalDateTime getCourseDate() {
    return courseDate;
  }

  public void setCourseDate(LocalDateTime courseDate) {
    this.courseDate = courseDate;
  }

  public LocalTime getCourseStartTime() {
    return courseStartTime;
  }

  public void setCourseStartTime(LocalTime courseStartTime) {
    this.courseStartTime = courseStartTime;
  }

  public String getCourseID() {
    return courseID;
  }

  public void setCourseID(String courseID) {
    this.courseID = courseID;
  }

  public Integer getCosts() {
    return costs;
  }

  public void setCosts(Integer costs) {
    this.costs = costs;
  }


}
