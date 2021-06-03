/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaltask;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.logging.Level;
import java.util.logging.Logger;
import static jdk.nashorn.internal.objects.NativeArray.map;
 
    

/**
 *
 * @author 20115
 */
public class Data {


    List<Cities> cities = new ArrayList<>();
    List<Countries> countries = new ArrayList<>();
    
    public Data(){}
        
    
       public List<Cities> readCitiesFromCsv(String filename) {
        
      
      FileReader fr = null;
         try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
           
           String line = br.readLine();
           
           
                if (line != null) {
                    line = br.readLine();
                    cities.forEach(System.out::println);
                }
                while (line != null) {
                    String []attributes = line.split(",");
                    Cities city = createCities(attributes);
                    cities.add(city);
                    
                    line = br.readLine();
                
         //cities.stream().map(Cities::getCountryName).distinct().forEach(System.out::println);
           //      cities.stream().map(Cities::getmap).distinct().forEach(System.out::println);   
                }
                
         }
    

        catch (IOException ioe) {
           ioe.printStackTrace();
           
       } finally {
       }
        return cities ;
       }
       
       
       public List<Countries> readCountriesFromCsv1(String filename) {
        
      
      FileReader fr = null;
         try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
           
           String line = br.readLine();
           
           
                if (line != null) {
                    line = br.readLine();
                }
                while (line != null) {
                    String []attributes = line.split(",");
                    Countries country = createCountries(attributes);
                    countries.add(country);
                    
                    line = br.readLine();
                
         
                    
                }
         }
    

        catch (IOException ioe) {
           ioe.printStackTrace();
           
       } finally {
       }
        return countries ;
       }

    public Cities createCities(String [] data) {
        String CityName = data[1];
        int CityID = Integer.parseInt(data[0]);
        int CityPopulation = Integer.parseInt(data[2]);
        String CityAbb = data[3];
        return new Cities(CityName , CityID , CityPopulation , CityAbb);
        
    }
    
    public Countries createCountries(String [] data) {
        String CountryAbb = data[0];
        String Continent = data[2];
        String CountryName = data[1];
        int CountryPopulation = Integer.parseInt(data[3]);
        String CountryCapital = data[6];
        return new Countries(CountryAbb , Continent , CountryName , CountryPopulation , CountryCapital);
    }
    
    
   
    
    public void map() {
        Map<String,List<String>> map = new HashMap<>();
            
            for (Cities c : cities) {
                List<String> b = new ArrayList<>();
            String key1 = c.getCityAbb();
             
             
            if(map.get(key1)==null)
        {
            
            b.add(c.getCityName());
            map.put(key1,b);
        }
        else
            { b = map.get(key1);
            b.add(c.getCityName());
                        map.put(key1,b);}
            }
               map.forEach((key,value) -> {
                   System.out.println(key + ":" + value);
            });
 
       
           
            }
        }
        
    