import java.io.*;
import java.util.*;
class Garbage{
    public static void main(String[] args){
        Runtime rt = Runtime.getRuntime();
        System.out.println("Available memory =" + rt.freeMemory());
        int i;
        int s=0;
        int[] array = {10, 20, 30, 40};
        for(i=0;i<4;i++){
           s+=array[i];
        }
        
        System.gc();
        
        System.out.println ("Garbage Collection done");
        
        System.out.println("Available memory =" + rt.freeMemory());
    }
}