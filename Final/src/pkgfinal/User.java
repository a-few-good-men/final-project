package pkgFinal;

import java.io.Serializable;

public class User implements Serializable{
    String username;
    String password;
    String secLevel;

    User(String username, String password, String secLevel) {
        this.username = username;
        this.password = password;
        this.secLevel = secLevel;
    }

    User() {
    }
  
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecLevel() {
        return secLevel;
    }

    public void setSecLevel(String secLevel) {
        this.secLevel = secLevel;
    } 
}


