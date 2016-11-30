package com.java.test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapExample{
 
public static void main(String[] args) {
  
//create an Hashmap object
HashMap<String, String> hashmap = new HashMap();
       
//Add key values pairs to hashmap
        
hashmap.put("1","One");
hashmap.put("2","Two");
hashmap.put("3","Three");
hashmap.put("4","Four");
hashmap.put("5","Five");
hashmap.put("6","Six");       
        
       
boolean isExists = hashmap.containsValue("Six");
System.out.println("The value Six exists in HashMap ? : " + isExists);
    
 
if(!hashmap.isEmpty()){
 
Iterator it=hashmap.entrySet().iterator();
             
while(it.hasNext()){

Map.Entry obj=(java.util.Map.Entry) it.next();
System.out.print(obj.getKey()+" ");
System.out.println(obj.getValue());
             
}           
}   
 
}
 
}
 