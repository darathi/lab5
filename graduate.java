/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */public class degree
 {
     void getdegree()
     {
         System.out.println("i got degree");
     }
    public static void main(String[] args){
        degree d=new degree();
        d.getdegree();
        d=new undergraduate();
        d.getdegree();
        d=new postgraduate();
        d.getdegree();
            
        
    }
}
class undergraduate extends degree
{
     public void getdegree()
    {
            System.out.println("i am an undergraduate");
    }
}
class postgraduate extends degree
{
     public void getdegree()
    {
        System.out.println("i am a posr graduate");
    }
}