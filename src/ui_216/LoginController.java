/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_216;

/**
 *
 * @author Owner
 */
public class LoginController {
    
    //private Session loginSession;
    
    public LoginController(){
        
    }
    
    public boolean onLogin(String userID, String password){
        //recieves login information from UI and passes it on to be verified
        boolean verified = verifyLoginInfo(userID, password);
        return verified;
    }
    
    private boolean verifyLoginInfo(String userId, String password){
        //will contact loginsession to verify
        return true;
    }
}
