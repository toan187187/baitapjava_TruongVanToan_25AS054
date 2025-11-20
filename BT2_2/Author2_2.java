package BT2_2;
public class Author2_2 {
    private String name;
    private String email;
    private char gender;
    public Author2_2 (String name, String email, char gender){
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
    public char getGender(){
        return gender;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String toString(){
        return "Author2_2{" + "name=" +name+"\'" +",email="+email+",gender"+gender+'}';
    }
}
