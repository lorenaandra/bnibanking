import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConnectDB {
    /*
     * variable used for connection
     */
    static Connection connection = null;

    /*
     * database to which we will connect variable
     */
    static String databaseName = "";

    /*
     * string used for creatign url
     */
    static String url = "jdbc:mysql://bnibanking.cct0fovy8hem.us-east-1.rds.amazonaws.com:3306/" + databaseName;

    /*
     * username set at the creation of database
     */
    static String username = "bnibanking";

    /*
     * password set at the creation of database
     */
    static String password = "bnibanking";

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException, NoSuchMethodException, InvocationTargetException {

        Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

        connection = DriverManager.getConnection(url, username, password);

        /*
         * inserts a record in table
         */
        PreparedStatement ps = connection.prepareStatement("INSERT INTO `bni`.`user` (`id_user`, `email`, `password`, `surname`, `first_name`, `iban`, `id_savings_account`) VALUES ('2', 'gigela@yahoo.com', 'gigela', 'becali', 'gigela', '777777222222333333444444', '2')");

        /*
         * execute statement
         */
        int status = ps.executeUpdate();

        if (status != 0) {
            System.out.println("Database connected successfully.");
            System.out.println("Statement executed successfully!");
        } else {
            System.out.println("Error at execution of statement.");
        }
    }
}
