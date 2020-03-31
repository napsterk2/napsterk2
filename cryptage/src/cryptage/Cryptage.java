
package cryptage;

import java.util.Scanner;


public class Cryptage {

    
    public static void main(String[] args) {
       
        



   Scanner userInput = new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~ nous allons faire un cryptage DES! ~~~~~~~~~~~~~~~~~~~\n\n entrer la clé de chiffrement (avec une taille de 8 charactères):");
        String key = userInput.nextLine();
        if (key.length() == 8){
            System.out.println("entrer le texte à chiffrer:");
            String msg = userInput.nextLine();
            SDES des = new SDES();

            String encrypted_msg = des.Cipher(msg, key, 1);
            des.Cipher(encrypted_msg, key, 2);
        }
        else
            System.out.println("la clé que vous avez entrée n'est pas valide (la taille c'est  " + key.length() + " charactere).");
    }
}

















/*//Matrice  matrice = new Matrice();
        Scanner napster = new Scanner(System.in);
        char[] alphabet = { 'A','B', 'C', 'D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        
        
        System.out.println("entrer le message  chiffrer");
        String message = napster.nextLine();
        
        for (int i = 0; i<message.length();i++)
        
        {
            for (int j = 0; j<alphabet.length;j++)
            {
                if (message.toUpperCase().charAt(i)==alphabet[j])
                {
                    System.out.println(j);
                }
                else
                {
                    continue;
                }
            }
        }
      */  
    

