/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgfinal;

import java.io.Serializable;

/**
 *
 * @author Lauren Sage
 */
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


