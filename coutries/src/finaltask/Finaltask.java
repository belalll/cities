/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltask;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static jdk.nashorn.internal.objects.NativeArray.map;

/**
 *
 * @author 20115
 */
public class Finaltask {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

     
       Data data = new Data();
      List<Cities> cities = data.readCitiesFromCsv("‪F:\\Cities.csv");
      
      int i =0;
      for (Cities c : cities) 
      {
          System.out.println("#" +(i++) +c);
      }
       System.out.println("\n\n\n\n");
    
    
     List<Countries> countries = data.readCountriesFromCsv1("F:\\Countries.csv");
      
      int j =0;
      for (Countries a : countries) 
      {
          System.out.println("#" +(j++) +a);
      }
       System.out.println("\n\n\n\n");
    
       Map<String,List<Cities>> map = new HashMap<>();
       //cities.stream().map(Cities::getmap).distinct().forEach(System.out::println);
       
        double AvrPop = countries.stream().mapToInt(Countries::getCountryPopulation).average().getAsDouble();
        System.out.println("AveragePopulation:"+AvrPop);
       
        Integer maxPop = countries.stream().mapToInt(Countries::getCountryPopulation).max().getAsInt();
        System.out.println("MaxPopulation:"+maxPop);
        
     data.map();
        
    }
}
    

    