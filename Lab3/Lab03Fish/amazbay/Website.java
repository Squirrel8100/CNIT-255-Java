package amazbay;

public class Website
{
    private Person[] users;
    
    private Message[] messages;

    public Website()
    {
        users = new Person[0];
        messages = new Message[0];
    }

    public void addPerson(Person p)
    {
        // We will need to create a new Person[] array that is 1 more in size
        // than what `users` used to be, and copy the contents of `users`
        // into it.
        Person newArray[] = new Person[users.length+1];
        for(int i = 0; i < users.length; i+=1)
        {
            newArray[i] = users[i];
        }

        // TODO - add p to newUsers, and update `users`
        newArray[newArray.length-1] = p;
        users = newArray;
    }

    public Person getPersonByUID(int uid)
    {
        // TODO - loop through `users`, and return the first person whose uid
        // matches.  Otherwise, return null as below.
        if(users[0] == null)
        {
            return null;
        }
        
        for(int i = 0; i < users.length; i++)
        {
            if(uid == users[i].getUID())
            {
                return users[i];
            }
        } 
        return null;
    }

    void addMessage(Message m)
    {
        
        // TODO - decide how to store m, so that you can later retrieve the
        // right ones in getMessagesFor().
        
        Message newArray[] = new Message[messages.length+1];
        for (int i = 0; i < messages.length; i++)
        {
            newArray[i] = messages[i];
        }    
        newArray[messages.length] = m;
        messages = newArray;
        
    }

    public Message[] getMessagesFor(int uid)
    {
        // TODO - return all messages added on the Website where either
        // the sender or the receiver was the person with uid `uid`, in
        // the order they were sent.
        int count = 0;
        for(int i = 0; i < messages.length; i++ )
        {
            if(messages[i] .getReceiver().getUID() == uid || messages[i].getSender().getUID() == uid)
            {
                count++;
                
            }
        }
        int number = 0;
        Message total[] = new Message[count];
        for(int i = 0; i < messages.length; i++)
        {
            if(messages[i] .getReceiver().getUID() == uid || messages[i].getSender().getUID() == uid)
            {
                total[number] = messages[i];
                number++;
            }
        }
        return total;
        
        //return new Message[0]; 
    }
}
