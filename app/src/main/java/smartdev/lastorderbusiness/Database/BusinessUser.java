package smartdev.lastorderbusiness.Database;



public class BusinessUser {

    private double id;
    private String Name;
    private String Adresse;
    private String email;
    private String password;
    private String phonenumber;


    public BusinessUser (){}


    public BusinessUser(double id, String name, String adresse, String email, String password, String phonenumber) {

        this.id = id;
        Name = name;
        Adresse = adresse;
        this.email = email;
        this.password = password;
        this.phonenumber = phonenumber;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }






}
