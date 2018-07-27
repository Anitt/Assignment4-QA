
public class UserAuthentication {

    protected String userName;
    protected String password;

    public boolean AuthenticateUser()
    {
        return (userName.equals("joe") && password.equals("joepass"));
    }

}
