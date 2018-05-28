package membermanager.db;

public class UserImpl implements User {
    private Long id;
    private String name;
    private String phonenumber;
    private String email;
    private String birth;

    public Long getId() {return id;}
    public String getName(){
        return name;
    }
    public String getPhonenumber(){
        return phonenumber;
    }
    public String getEmail(){
        return email;
    }
    public String getBirth(){
        return birth;
    }

    public void setId(Long id) {this.id = id; }
    public void setName(String name){
        this.name = name;
    }
    public void setPhonenumber(String phonenumber){
        this.phonenumber = phonenumber;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setBirth(String birth){
        this.birth = birth;
    }

    public String toString() {
        return getName()+", " +getEmail()+", "+getPhonenumber()+", "+getBirth();
    }
}
