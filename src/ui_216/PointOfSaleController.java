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
    private PurchaseSession model;
    
    public PointOfSaleController(String id, String pass){
        userID = id;
        password = pass;
        pos = new PointOfSaleUI(this);
        pos.setVisible(true);            //start POS ui
        populateCashierID();
    }
    
    public PointOfSaleController(String id, String pass, PurchaseSession ses){
        userID = id;
        password = pass;
        pos = new PointOfSaleUI(this);
        pos.setVisible(true);            //start POS ui
        setModel(ses);
    }
    
    private void populateCashierID(){
        String cID = model.getCashierID();
        pos.setID(cID);
    }
    
    public void setModel(PurchaseSession ses){
        model = ses;
    }
    
    public void addItem(String itemIDString){
        Integer id;
        Triplet itemInfo = null;
        Item item = null;
        Integer quantity = 0;
        if((id = Integer.getInteger(itemIDString)) == null){
            pos.displayError("Item ID invalid, not a number");
        }else{
            //tripple a = item b = in quant c = purchase type
            itemInfo = model.addItem();
            item = itemInfo.getA();
            quantity = item.Info.getB();
            // get item purchase type
            pos.addLineItem(item.getID().toString(), item.getName(), item.getPrice().toString(), quantity.toString());
        }
        
        
        
    }
    
    private void getTotal(){
        Double totes = model.getTotal();
        pos.addTotal(totes.toString());
    }
    
    private void getSubtotal(){
        Double sub = model.getSubtotal();
        pos.addSubtotal(sub.toString());
    }
    
    private void getTax(){
        Double tax = model.getTotal();
        pos.addTax(tax.toString());
    }
    
    public void removeItem(int itemID){
        //idk man
    }
    
}
