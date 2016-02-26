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
    
    private PointOfSaleUI pos;
    private String userID;
    private String password; // not sure if we need this
    
    public PointOfSaleController(String id, String pass){
        userID = id;
        password = pass;
        pos = new PointOfSaleUI(this);
        pos.setVisible(true);
    }
}
