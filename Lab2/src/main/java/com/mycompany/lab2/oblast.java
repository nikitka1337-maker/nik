
package com.mycompany.lab2;

public class oblast extends kray {
    private int naselenie;
    
    public oblast(String Name, int naselenie) {
        super(Name);
        this.naselenie = naselenie;
    }
    
    public String getInfo() {
        return "Область: '" + super.getInfo() + "', кол-во Населения: " + naselenie;
    }
}
