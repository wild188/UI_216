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
    private LoginUI gui;
    
    
    public LoginController(){
        gui = new LoginUI(this);
        gui.setVisible(true);
    }
    
    public void onLoginAttempt(String userID, String password){
        //recieves login information from UI and passes it on to be verified
        boolean verified = verifyLoginInfo(userID, password);
        
        if(verified){
            gui.validLogin();
            switchToPOS(userID, password);
        } else{
            gui.invalidLogin();
        }
    }
    
    private boolean verifyLoginInfo(String userId, String password){
        //will contact session to verify
        return false;
    }
    
    private void switchToPOS(String id, String pass){
        gui.setVisible(false);
        PointOfSaleController pos = new PointOfSaleController(id, pass);
        gui = null;
    }
}
