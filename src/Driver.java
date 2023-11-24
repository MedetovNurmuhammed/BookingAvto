public class Driver {
    private String name;
    private String lastname;
    private int age;
    private long phonenumber;





    public Driver(String name, String lastname,  long phonenumber) {
        this.name = name;
        this.lastname = lastname;
        this.phonenumber = phonenumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(long phonenumber) {
        this.phonenumber = phonenumber;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", phonenumber=" + phonenumber +
                '}';
    }
}
