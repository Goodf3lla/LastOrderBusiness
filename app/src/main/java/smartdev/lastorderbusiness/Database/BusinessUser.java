package smartdev.lastorderbusiness.Database;



public class BusinessUser {

    private double id;
    private String eigentuemer;
    private String restaurantName;
    private String adresse;
    private String email;
    private String password;
    private String phonenumber;


    public BusinessUser (){}

    public BusinessUser(double id, String eigentuemer, String restaurantName, String adresse, String email, String password, String phonenumber) {

        this.id = id;
        this.eigentuemer = eigentuemer;
        this.restaurantName = restaurantName;
        this.adresse = adresse;
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

    public String getEigentuemer() {
        return eigentuemer;
    }

    public void setEigentuemer(String eigentuemer) {
        this.eigentuemer = eigentuemer;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
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
