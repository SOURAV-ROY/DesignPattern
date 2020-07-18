package FactoryPattern;

import java.util.Scanner;

public class EnemyShipTesting {
    public static void main(String[] args) {
        EnemyShipFactory shipFactory = new EnemyShipFactory();
        EnemyShip theEnemy = null;
        Scanner userInput = new Scanner(System.in);

        System.out.println("What Type Ship? (U / R / B)");
        if (userInput.hasNextLine()) {
            String typeOfShip = userInput.nextLine();
            theEnemy = shipFactory.makeEnemyShip(typeOfShip);
        }
        if (theEnemy != null) {
            doStuffEnemy(theEnemy);
        } else {
            System.out.println("Enter ('U' , 'R' or 'B') Next Time");
        }
//        EnemyShip ufoShip = new UFOEnemyShip();
//        EnemyShip theEnemy = null;
//
//        Scanner userInput = new Scanner(System.in);
//        String enemyShipOption = "";
//        System.out.println("What Type of Ship? (U / R)");
//
//        if (userInput.hasNextLine()) {
//            enemyShipOption = userInput.nextLine();
//        }
//        if (enemyShipOption.equals("U")) {
//            theEnemy = new UFOEnemyShip();
//
//        } else if (enemyShipOption.equals("R")) {
//            theEnemy = new RocketEnemyShip();
//        }
//        doStuffEnemy(theEnemy);
//        doStuffEnemy(ufoShip);
    }

    public static void doStuffEnemy(EnemyShip anEnemyShip) {
        anEnemyShip.displayEnemyShip();
        anEnemyShip.followHeroShip();
        anEnemyShip.enemyShipShoots();
    }
}
