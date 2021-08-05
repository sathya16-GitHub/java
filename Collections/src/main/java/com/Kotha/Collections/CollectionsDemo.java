package com.Kotha.Collections;
import java.util.*;


public class CollectionsDemo 
{
    @SuppressWarnings("unchecked")
	public static void main( String[] args )
    {
       List<String> al = new ArrayList<String>();
       
       al.add("Sathya");
       al.add("Narayana");
       al.add("Rayanaboina");
       al.add("Yadav");
       al.add("Rama");
       al.add("Krishna");
       
   /*------------------  print the output using for loop-----------------  */
      /* for(String s:al) {
    	   System.out.println(s);
       } */
    	
       
       /* -------------- print the output using normally ---------- */   
       //System.out.println("al:" +al);
       
     
       /* -------------- print the output using for loop ---------- */     
       /* for(int i=0;i<al.size();i++) {
    	  System.out.println(al.get(i)); 
       }*/
    
       
       /* -------------- print the output using ListIterator ---------- */  
      /* ListIterator<String> itr = al.listIterator();
       System.out.println("In forward direction");
       while(itr.hasNext()) {
    	   System.out.println(itr.next()); 
       }
       
       
       System.out.println("In REVERSE direction");
       while(itr.hasPrevious()) {
    	   System.out.println(itr.previous());
       } */
    
       /* -------------- print the output using Iterator Interface ---------- */
      /* Iterator itr= al.iterator();
       while(itr.hasNext()) {
    	   System.out.println(itr.next());
       } */
       
       /* -------------- print the output using for each method ---------- */  
     
      /* al.forEach((a) -> {
           System.out.println(a);
       });*/
      
       
       /* -------------- print the output using for each Remaining method ---------- */      
       Iterator<String> itr = al.iterator();
       ((Iterator<String>) al).forEachRemaining((a) -> {
    	   
           System.out.println(a); 
   });  
       
    }
}
