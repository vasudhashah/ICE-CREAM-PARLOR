/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author VASUDHA SHAH
 */
public class Item {
    
    String name;
    int rate;
    int qty;

    public Item(String name, int rate, int qty) {
        this.name = name;
        this.rate = rate;
        this.qty = qty;
    }

    public Item() {
    }

    public void setItemName(String name) {
        this.name = name;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getItemName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getQty() {
        return qty;
    }
    
   @Override
    public String toString() {
return  String.format("%-20s",name+"("+rate+"/-)").replace(' ', '.') + String.format("%6d",qty)+String.format("%10s",rate*qty+"/-")+"\n\n";        
     }

}
