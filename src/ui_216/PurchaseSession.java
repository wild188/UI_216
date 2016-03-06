public class PurchaseSession {
  
  private String mUserID, mPassword;
  private Transaction mCurrent_Transaction;
  private Transaction mFinalize_Transaction;
  private Database mDB;
  
  public PurchaseSession(String userID, String password) {
    mUserID = userID;
    mPassword = password;
  }
    
  
  public boolean login(String userId, String password) {
    mDB = new Database(userId, password);
    return mDB.isconnected();
  }
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}