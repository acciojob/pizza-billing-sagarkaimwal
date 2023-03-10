package com.driver;

public class Pizza {

    private int price;// Calculating the final bill price
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int toppingsPrice;
    private int takeAwayPrice;
    boolean isCheeseAdded;
    boolean isToppingAdded;
    boolean isTakeAwayAdded;
    boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrice=80;
        this.takeAwayPrice=20;
        if(isVeg==true)
        {
            this.price=300;
            this.toppingsPrice=20;
        }
        else
        {
            this.price=400;
            this.toppingsPrice=120;
        }
        this.isTakeAwayAdded=false;
        this.isToppingAdded=false;
        this.isCheeseAdded=false;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false)
        {
            //Add the cheese
            this.price=this.price+this.cheesePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(isToppingAdded==false)
        {
            this.price=this.price+this.toppingsPrice;
            isToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(isTakeAwayAdded==false)
        {
            this.price=this.price+this.takeAwayPrice;
            isTakeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false)
        {
            if(isCheeseAdded==true)
            {
                this.bill=this.bill+ "Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(isToppingAdded==true)
            {
                this.bill=this.bill + "Extra Toppings Added: "+this.toppingsPrice+"\n";
            }
            if(isTakeAwayAdded==true)
            {
                this.bill=this.bill+ "Paperbag Added: "+this.takeAwayPrice + "\n";
            }
            this.bill = this.bill + "Total Price: "+this.price+"\n";
            isBillGenerated=true;
        }
        return this.bill;
    }
}
