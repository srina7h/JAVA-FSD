
public class Emp {
    public Emp() {
    }

    public Emp(int id, long phone, String name) {
        this.id = id;
        Phone = phone;
        Name = name;

    }

    private int id;
    private long Phone;
    private String Name;
    private String Role;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPhone(long phone) {
        Phone = phone;
    }

    public long getPhone() {
        return Phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void showDetails() {
        System.out.println("Name :" + Name);
        System.out.println("id :" + id);
        System.out.println("role :" + Role);
        System.out.println("email :" + email);
        System.out.println("phone :" + Phone);
    }


}
