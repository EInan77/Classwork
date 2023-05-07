/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eren.classwork;

/**
 *
 * @author ereni
 */
public class Classwork {

    public static void methodC() throws ExceptionC {
        System.out.println("In side the method C...");
        throw new ExceptionC("ExceptionC is thrown");
    }
    
    public static void methodB() throws ExceptionB{
        System.out.println("Inside method B");
        throw new ExceptionB("Exception is thrown");
    }
    public static void main(String[] args){
        System.out.println("First line before try");
        
        try{
            System.out.println("Second line top of try");
            methodC();
            System.out.println("Third line bottom of try");
            
            
        }
        catch(ExceptionC ec){
            System.out.println("Inside of exceptionc Catch");
        }
        catch(ExceptionA ea){
            System.out.println("foruth line catch");
        }
        finally{
            System.out.println("Fifth line inside finally");
        }
        System.out.println("Sixth line last line of main");
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
