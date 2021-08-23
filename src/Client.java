
public class Client {
	public static void main(String[] ages) {
		IUser iuser = new EmployeeUser();
		UserManager user = new UserManager(iuser);
		System.out.println(" "+user.getName());
	}
}