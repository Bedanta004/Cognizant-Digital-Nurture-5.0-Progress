import java.sql.DriverManager;
import java.sql.SQLException;

public class LaunchClassForNameEx {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
	}

}
class Demo{
	static {
		System.out.println("Static Block");
	}
	{
		System.out.println("Instance Bolck ==> Non static");
	}
}
