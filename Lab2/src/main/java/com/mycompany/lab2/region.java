
package com.mycompany.lab2;

public class region extends kray {
  private int oldyear;
    
    public region(String Name, int oldyear) {
        super(Name);
          this.oldyear = oldyear;
  
    }
    
    public String getInfo() {
        return "Регион: '" + super.getInfo() + "', Средний возраст: " + oldyear;
    }
}

    

