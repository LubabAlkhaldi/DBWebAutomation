package DataBaseTesting.DataBaseTesting;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatabaseTesting {

    Connection con;
    Statement stsm;
    ResultSet rs;
    String URL = "https://smartbuy-me.com/account/register";
    WebDriver driver = new ChromeDriver();
    
	String CustomerName;	 
    String lastName;
    String email;
    String password;

    
    @BeforeTest
    public void Setup() throws SQLException {
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels", "root", "Pith35...");
        driver.get(URL);
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void InsertIntoDatabase() throws SQLException {
        String Query = "INSERT INTO customers (customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, city, country, salesRepEmployeeNumber, creditLimit) " +
                       "VALUES (999, 'New Corp', 'Smith', 'John', '123456789', '123 Main St', 'Los Angeles', 'USA', 1370, 50000.00)";
        
        stsm = con.createStatement();
        int rowAffected = stsm.executeUpdate(Query);
        System.out.println("Rows affected: " + rowAffected);
    }
    
    @Test(priority = 2)
    public void UpdateIntoDatabase() throws SQLException {
        String Query = "UPDATE customers SET creditLimit = 75000 WHERE customerNumber = 999";
        
        stsm = con.createStatement();
        int rowAffected = stsm.executeUpdate(Query);
        System.out.println("Rows affected: " + rowAffected);
    }
    
    @Test(priority = 3)
    public void ReadFromDatabase() throws SQLException {
        String Query = "SELECT * FROM customers WHERE customerNumber = 999";

        stsm = con.createStatement();
        rs = stsm.executeQuery(Query);

        while (rs.next()) {
            CustomerName = rs.getString("contactFirstName");
            lastName = rs.getString("contactLastName");
            email = rs.getString("contactFirstName") + rs.getString("contactLastName") + "@gmail.com";
            password = rs.getString("phone");
        }

        driver.findElement(By.id("customer[first_name]")).sendKeys(CustomerName);
        driver.findElement(By.id("customer[last_name]")).sendKeys(lastName);
        driver.findElement(By.id("customer[email]")).sendKeys(email);
        driver.findElement(By.id("customer[password]")).sendKeys(password);
       // WebElement btn = driver.findElement(By.id("form__submit"));
       // btn.click();
    }
   
    /*
    @Test(priority = 4)
    public void DeleteFromDatabase() throws SQLException {
        String Query = "DELETE FROM customers WHERE customerNumber = 999";
        
        stsm = con.createStatement();
        int rowAffected = stsm.executeUpdate(Query);
        System.out.println("Rows affected: " + rowAffected);
    }
    */
}