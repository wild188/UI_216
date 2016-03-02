/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_216;

/**
 *
 * @author Billy
 */
public class PointOfSaleController {
    
    private PointOfSaleUI pos;          //data fields to be passed to the session
    private String userID;
    private String password; 
    
    public PointOfSaleController(String id, String pass){
        userID = id;
        password = pass;
        pos = new PointOfSaleUI(this);
        pos.setVisible(true);            //start POS ui
    }
}
