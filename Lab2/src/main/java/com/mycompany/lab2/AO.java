
package com.mycompany.lab2;
public class AO extends kray {

    private float area;
    public AO(String Name, float area) {
        super(Name);
        this.area=area;
    }

    public String getInfo() {
        return "Название округа: '" + super.getInfo() + "', Площадь: " + area;
    }
}
