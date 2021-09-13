package com.techment;  
import static org.junit.Assert.assertEquals;  
import org.junit.Test;  
public class JunitTestCase {  
           
    TestCase obj = new TestCase();  
     
    @Test  
    public void testAdd() {  
        obj.add("Pankaj");  
        obj.add("Arjit");  
        
        assertEquals("Adding 4 student to list", 2, obj.sizeOfStudent());  
    }  
      
    @Test  
    public void testSize() {  
        obj.add("Pankaj");  
        obj.add("Arjit");  
       
        assertEquals("Checking size of List", 2, obj.sizeOfStudent());  
    }  
      
    @Test  
    public void testRemove() {  
        obj.add("Kamal");  
        obj.add("Apple");  
        obj.remove("Arjit");  
        assertEquals("Removing 1 student from list", 1, obj.sizeOfStudent());  
    }  
      
    @Test  
    public void removeAll() {  
        obj.removeAll();  
    }  
}  