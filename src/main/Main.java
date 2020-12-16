package main;

public class Main {
    public static void main(String[] args){
        String str= null;
        try{
            System.out.println(str.length());
        }catch(NullPointerException e){
            System.out.println("Null入ってますよー");
            System.out.println(e.getMessage());
        }
        
    }
}

