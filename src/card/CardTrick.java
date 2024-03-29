/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;
import java.util.Scanner;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * Name: SimranjeetKaur
 * StudentNumber : 991715949
 */
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue(generateRandomValue());
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            c.setSuit(Card.SUITS[generateRandomNumber(0,3)]);
            magicHand[i]=c;
        }
        
        // add one luckcard hard code 2,clubs
        Card luckyCard= new Card();
        luckyCard.setValue(2);
        luckyCard.setSuit(Card.SUITS[3]);
    
        
        // and search magicHand here
        boolean isCardInMagicHand= false;
        for (Card card: magicHand){
            if (card.equals(luckyCard)){
                isCardInMagicHand = true;
                 break;
                
            }  
        }
            //Then report the result here
             if(isCardInMagicHand){
                    System.out.println("Congratulations! your card is in the magic hand.");
                }else{
                    System.out.println("Sorry, your card is not in the magic hand.");
                }
           
    }
            private static int generateRandomNumber(int min, int max){
                return (int)(Math.random() * (max-min + 1)+ min);
            }
            
            private static int generateRandomValue(){
                return generateRandomNumber(1,13);
            }
    
}

