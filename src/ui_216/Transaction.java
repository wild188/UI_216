import java.util.ArrayList;

public class Transaction {
private int mTransactionID;
private User mCustomer;
private User mCashier;
private int mTransactionType;
private ArrayList<Triplet<Item, Integer, Integer>> mTripleList;
private int mPaymentMethod;

    public Transaction(int mTransactionID, User mCustomer, User mCashier, int mTransactionType){
		
	setTransactionID(mTransactionID);
	setCustomer(mCustomer);
	setCashier(mCashier);
	setTransactionType(mTransactionType);
	
    }
    
    public void setTransactionID(int mTransactionID){
	this.mTransactionID = mTransactionID;
    }
    
    public void setCustomer(User mCustomer){
	this.mCustomer = mCustomer;
    }
    
    public void setCashier(User mCashier){
	this.mCashier = mCashier;
    }
        
    public void setTransactionType(int mTransactionType){
	this.mTransactionType = mTransactionType;
    }
    
    public int getTransactionID(){
	return this.mTransactionID;
    }
    
    public User getCustomer(){
	return this.mCustomer;
    }
    
    public User getCashier(){
	return this.mCashier;
    }
    
    public ArrayList<Triplet<String, Integer, Integer>> getTripleList(){
	return this.mTriple;
    }
    
    public int getTransactionType(){
	return this.mTransactionType;
    }
    
    public int getPaymentMethod(){
	return this.mPaymentMethod;
    }
    
    public double getTax(){
	Tax_Calc_Interface Calc = new Tax_Calc_Interface();
	return Calc.calculateTax(this);
    }
    //TODO: insert item into arraylist
    public void addItem(Triplet<Item, Integer, Integer> t){
	mTriple.add(t);
    }
    
    //TODO: remove item from list
    public void removeItem(Triplet<Item, Integer, Integer> t){
	for(int i =0; i < mTriple.length(); i++){
	    if(t.geta
    }
    //TODO: not sure
    public void addPayment(){
    }
}
