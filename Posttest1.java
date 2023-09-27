/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.posttest1;

/**
 *
 * @author Acer
 */


class Priceofgame {
    public String title;
    public int pog;
    public Priceofgame(String title, int pog) {
        this.title = title;
        this.pog = pog;
    }
}

public class Posttest1 {
    public static void main(String[] args) {
        Priceofgame[] item = new Priceofgame[5];
        item[0] = new Priceofgame("Battlebit Remastered", 150500);
        item[1] = new Priceofgame("Dying Light", 239900);
        item[2] = new Priceofgame("Counter Strike : Global Offensive", 229000);
        item[3] = new Priceofgame("Half Life : Blackmesa ", 108999);
        item[4] = new Priceofgame("Need for Speed Heat", 759000);
        
        for (int i = 0; i < item.length; i++) {
            System.out.print("\n  " + (i + 1) + ": " + item[i].title);
            System.out.print( " |Price " + ": " + item[i].pog + "IDR");
        }
    }
}