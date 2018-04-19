package Models;

import java.util.Date;
import java.util.UUID;

public class User {
    private long id;
    private String name;
    private String password;
    private Date creationDate;

    public User(String Name, String Password){
        //Hack: generate real ID
        id = 1;
        creationDate = new Date();
        name = Name;
        password = Password;
    }
    public long getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getPasswordHash() {
        //Hack: Need to do password hashing
        return password.hashCode();
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
