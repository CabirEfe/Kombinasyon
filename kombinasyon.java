/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
import java.util.Scanner;
public class kombinasyon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Kümenin Eleman Sayısını Giriniz: ");
        int sayi = input.nextInt();
        System.out.println("Lütfen Kombinasyonunu Giriniz: ");
        int sayi2 = input.nextInt();
        int çarpım = 1;
        int çarpım2 = 1;
        int çarpım3 = 1;
        
        
        
        
        if(sayi >= sayi2)
        {   
          for(int a = 1; a <= sayi; a++)
          {
           çarpım = çarpım * a;
          } 
         for(int b = 1; b <= sayi2; b++)
          {
           çarpım2 = çarpım2 * b;
          }
         int fark = sayi - sayi2; 
          for(int c = 1; c <= fark; c++)
          {
           çarpım3 = çarpım3 * c;
          }
         int son = çarpım / (çarpım2 * çarpım3);
         System.out.println("Lütfen Girdiğiniz Kümenin Kombinasyonlarının Sayısı =  " + son );
        }
        else
        {
        System.out.println("Lütfen Kümenin Kombinasyonlarını Eleman Sayısından Daha Küçük Giriniz.");
        }
        
        
        
        
        
        
        
    }
    
}
