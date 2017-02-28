package uits.jv1614.basictypes; 

import java.util.Scanner;

public class Test2 {
   public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        boolean fin = false;
        while(!fin){
            System.out.println("Введите номер необходимой операции: ");
            System.out.println("1 - рассчитать площадь окружности - S = pi*sqr(r)");
            System.out.println("2 - рассчитать длинну окружности - C = 2*pi*r");
            System.out.println("3 - рассчитать площадь кольца - S = pi*(sqr(R)-sqr(r))");
            System.out.println("4 - рассчитать периметр треугольника - P = a+b+c");
            System.out.println("5 - рассчитать площадь треугольника - S = p*r");
            System.out.println("6 - рассчитать периметр прямоугольника - P = 2*a+2*b");
            System.out.println("7 - рассчитать площадь прямоугольника - S = a*b");
            System.out.println("иной символ для выхода");
            
           try{
                
               int operation = Integer.parseInt(sc.next());
               switch(operation) {
                    case 1:{
                        System.out.println("Введите r ");
                        Scanner in = new Scanner(System.in);
                        int r = in.nextInt();     
                        System.out.println("площадь окружности: " + Math.PI*Math.pow(r, 2.0));
                                              
               }break;
                    case 2:{
                        System.out.println("Введите r ");
                        Scanner in = new Scanner(System.in);
                        int r = in.nextInt();    
                        System.out.println("длинна окружности: " + 2*Math.PI*r);
               }break;
                    case 3:{
                        System.out.println("Введите r, R ");
                        Scanner in = new Scanner(System.in);
                        int r = in.nextInt();  
                        int R = in.nextInt(); 
                        System.out.println("площадь кольца: " + Math.PI *(Math.pow(R, R)- Math.pow(r, 2.0)));
               }break;
                    case 4:{
                        System.out.println("Введите a, b, c ");
                        Scanner in = new Scanner(System.in);
                        int a = in.nextInt();  
                        int b = in.nextInt(); 
                        int c = in.nextInt();
                        System.out.println("периметр треугольника: " + a+b+c);
               }break;
                    case 5:{
                        System.out.println("Введите r, p");
                        Scanner in = new Scanner(System.in);
                        int p = in.nextInt();  
                        int r = in.nextInt(); 
                        System.out.println("площадь треугольника: " + p*r);
               }break;
                    case 6:{
                        System.out.println("Введите a, b ");
                        Scanner in = new Scanner(System.in);
                        int a = in.nextInt();  
                        int b = in.nextInt(); 
                        System.out.println("периметр прямоугольника: " + 2*a+2*b);
               }break;
                    case 7:{
                        System.out.println("Введите a, b ");
                        Scanner in = new Scanner(System.in);
                        int a = in.nextInt();  
                        int b = in.nextInt(); 
                        System.out.println("площадь прямоугольника: " + a*b);
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
