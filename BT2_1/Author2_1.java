package BT2_1;
public class Author2_1 {
    private String name;
    private String email;
    private char gender;
    public Author2_1(String name, String email, char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email= email;
    }
    public char getGender() {
        return gender;
    }
    public String toString() {
        return "Author2_1{" + "name='" + name + '\'' + ", email='" + email + '\'' + ", gender=" + gender + '}';
    }
}
