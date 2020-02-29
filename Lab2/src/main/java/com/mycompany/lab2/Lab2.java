/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lab2;

import java.util.ArrayList;


public class Lab2 {

    
    public static void main(String[] args) {
  
        oblast SH = new oblast("Орловская", 
                         1000000   
                                 );
        
        AO SK = new AO("Чукотский",
                        524243422  
                                  );
        region Zav = new region("Татарстан",
                              60
                                  );
        kray.Addkraye(SH);
        kray.Addkraye(SK);
        kray.Addkraye(Zav);
        
        System.out.println(kray.getkrayeInfo());

    }
    
}
