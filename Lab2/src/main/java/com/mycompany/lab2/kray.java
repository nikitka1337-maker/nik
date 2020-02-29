package com.mycompany.lab2;

import java.util.ArrayList;

public abstract class kray {
    private String Name;
    
    private static ArrayList<kray> kraye;
    
  
    public static void Addkraye(kray p) {
        if(kraye == null) kraye = new ArrayList<kray>();
        kraye.add(p);
    }
    
    public static kray Getkraye(int Index) {
        return kraye.get(Index);
    }

    public static String getkrayeInfo() {
        if(kraye == null) return "Нет данных в коллекци Organisations";
        
        String InfoString = new String();
        for (int i = 0; i < kraye.size(); i++) {
            InfoString = InfoString + "\n" + kraye.get(i).getInfo();
        }  
        
        return InfoString;         
    }

    public String getName() {
        return Name;
    }


    public kray(String Name) {
        this.Name = Name;
    }

    public String getInfo() {
        return Name;
    }
}
