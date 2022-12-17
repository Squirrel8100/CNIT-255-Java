/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author logan
 */

import java.util.*;



public class Employee extends Customer {


    public ArrayList<Customer> name = new ArrayList<Customer>();

    public String[] customerName = {"John", "Grant,", "Wright", "Rachel", "Carlos", "Pip"};
    public int[] discVal = {50,60,70};

    public Employee()
    {
        for(int x = 0; x < 52; x++)
        {
            int customerN = (int)(Math.random() * 1);


            Customer s = new Customer(discVal[customerN], customerName[customerN]);

            if(!Arrays.asList(name).contains(s))
            {
                name.add(s);
            }

            else{
                x--;
            }
        }
    }


    public String get(int x) {
        Customer print = name.get(x);
        return "Discount " + print.getcustomerDiscount() + " Name " + print.getcustomerDName();
    }


    public String toString() {
        String stringreturn = "";

        for(int y = 0; y < name.size() - 1; y++)
        {
            stringreturn = stringreturn + getCard(y) + " ";
        }

        return stringreturn;
    }


    public Customer get(int x){
        return name.get(x);
    }

    //Remove an individual card from the deck
    public void remove(int x){
        name.remove(x);
    }
}
