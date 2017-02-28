package uits.jv1614.basictypes;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        boolean fin = false;
        while(!fin){
            System.out.println("Введите номер необходимой операции: ");
            System.out.println("1 - рассчитать обьем цилиндра - V = pi*sqr(r)*H");
            System.out.println("2 - рассчитать обьем полного цилиндра - V = pi*H*(sqr(r2)-sqr(r1)), r2>r1");
            System.out.println("3 - рассчитать площадь боковой поверхности цилиндра - Sбок = 2*pi*r*H");
            System.out.println("4 - рассчитать обьем шара - V = pi*D*D*D / 6");
            System.out.println("5 - рассчитать площадь поверхности шара - S = pi*sqr(D)");
            System.out.println("6 - рассчитать обьем поверхности прямоугольного параллелипипеда - V = a*b*c");
            System.out.println("7 - рассчитать площадь поверхности прямоугольного параллелипипеда - S = 2*(ab + bc + ac)");
            System.out.println("8 - рассчитать обьем поверхности тэтраэдра - V=1/3*S*H");
            System.out.println("9 - рассчитать площадь поверхности тэтраэдра - S=sqrt(3)*sqr(a)");
            System.out.println("иной символ для выхода");
            
           try{
                
                int operation = Integer.parseInt(sc.next());
               switch(operation) {
                    case 1:{
                        System.out.println("Введите r, H ");
                        Scanner in = new Scanner(System.in);
                        int r = in.nextInt();
                        int H = in.nextInt();                        
                        System.out.println("обьем цилиндра: " + Math.PI*Math.pow(r, 2.0)*H);
               }break;
                    case 2:{
                        System.out.println("Введите r1, r2, H ");
                        Scanner in = new Scanner(System.in);
                        int r1 = in.nextInt();
                        int r2 = in.nextInt(); 
                        int H = in.nextInt();                        
                        System.out.println("обьем полного цилиндра: " + 2*Math.PI*H*(Math.pow(r2, 2.0)- Math.pow(r1, 2.0)));
               }break;
                    case 3:{
                        System.out.println("Введите r, H ");
                        Scanner in = new Scanner(System.in);
                        int r = in.nextInt();  
                        int H = in.nextInt(); 
                        System.out.println("площадь боковой поверхности цилиндра: " + 2*Math.PI *r*H);
               }break;
                    case 4:{
                        System.out.println("Введите D ");
                        Scanner in = new Scanner(System.in);
                        int D = in.nextInt();  
                        System.out.println("обьем шара: " + Math.PI*D*D*D/6);
               }break;
                    case 5:{
                        System.out.println("Введите D ");
                        Scanner in = new Scanner(System.in);
                        int D = in.nextInt();  
                        System.out.println("площадь поверхности шара: " + Math.PI*Math.pow(D, 2.0));
               }break;
                    case 6:{
                        System.out.println("Введите a, b, c ");
                        Scanner in = new Scanner(System.in);
                        int a = in.nextInt();  
                        int b = in.nextInt();
                        int c = in.nextInt();
                        System.out.println("обьем поверхности прямоугольного параллелипипеда: " + a*b*c);
               }break;
                    case 7:{
                        System.out.println("Введите a, b, c ");
                        Scanner in = new Scanner(System.in);
                        int a = in.nextInt();  
                        int b = in.nextInt();
                        int c = in.nextInt();
                        System.out.println("площадь поверхности прямоугольного параллелипипеда: " + 2*(a*b+b*c+c*a));
               }break;
                    case 8:{
                        System.out.println("Введите S, H ");
                        Scanner in = new Scanner(System.in);
                        int S = in.nextInt();  
                        int H = in.nextInt(); 
                        System.out.println("обьем поверхности тэтраэдра:" + 1/3*S*H);
               }break;
                    case 9:{
                        System.out.println("Введите a ");
                        Scanner in = new Scanner(System.in);
                        int a = in.nextInt();  
                        System.out.println("площадь поверхности тэтраэдра: " + Math.sqrt(3)*Math.pow(a, 2.0) );
               }break;
                    default:{
                        fin = true;
                    }
                    
               }
            } catch(Exception ex){
                fin = true;
            }
        }
        System.out.println("До новых встреч!"); 
    }
    
   }
    

