package amazbay;

public class Person
{
    // TODO - add the other fields mentioned in the handout, and create
    // getters and setters for each.
    private String FirstName;
    private String LastName;
    private String FullName;
    
    
    private int uid;

    public Person(int uid, String FirstName, String LastName)
    {
        setUID(uid);
        setFirstName(FirstName);
        setLastName(LastName); 
        
    }
    
   
    public String getFirstName()
    {
        // TODO - this is one of the getters, but it doesn't
        // do the right thing currently...
        return FirstName; 
    }

    // setting the familyname
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }
    
    // returns the lastname
    public String getLastName() {
        return LastName;
    }
    //setting the LastName
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }
    
    public String getFullName() {
        
        FullName = FirstName + " " + LastName;
        return FullName;
    }
    
   

    public int getUID()
    {
        return uid;
    }

    public void setUID(int uid)
    {
        this.uid = uid;
    }

    public void sendMessageTo(Person receiver, String message, long when,
                              Website website)
    {
        Message m = new Message(this, receiver, message, when);
        website.addMessage(m);
    }

    

    
}
