package pkgFinal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mainScreen {
    @SuppressWarnings("unchecked")
    public static ArrayList<User> userList          = new ArrayList<User>();
    public static ArrayList<Patient> patientList    = new ArrayList<Patient>();
//------------------------------------------------------------------------------    
    public static void main(String[] args) throws ClassNotFoundException, IOException {

            Login screen = new Login();
            screen.setVisible(true);
            
            //createList();
            initUserList();
            initPatientList();    
          
    }
//------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    private static void initUserList() {
            
            
            FileInputStream fis = null;
        try {
            fis = new FileInputStream("users.l");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            userList = (ArrayList<User>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
//------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    private static void initPatientList() {

            FileInputStream fis = null;
        try {
            fis = new FileInputStream("patients.l");
            ObjectInputStream ois = new ObjectInputStream(fis);
            
            patientList = (ArrayList<Patient>) ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fis.close();
            } catch (IOException ex) {
                Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
//------------------------------------------------------------------------------
    private static void saveList()  {
            FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("users.l");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(userList);
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(mainScreen.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
//------------------------------------------------------------------------------
    private static void createList() {
        User admin = new User("admin","pass","Admin");
        
        userList.add(admin);
        
        saveList();
    }
//------------------------------------------------------------------------------       
}
