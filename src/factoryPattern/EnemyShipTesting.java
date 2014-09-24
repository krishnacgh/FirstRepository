package factoryPattern;

import java.util.Scanner;

public class EnemyShipTesting {

	public static void main(String args[]){
		EnemyShip theEnemy = null;
		EnemyShipFactory enemyShipFactory = new EnemyShipFactory();
		Scanner userInput = new Scanner(System.in);
		String enemyShipOption = "";
		System.out.println("What type of Ship?");
		if(userInput.hasNextLine()){
			enemyShipOption = userInput.nextLine();
		}
		theEnemy = enemyShipFactory.makeEnemyShip(enemyShipOption);
		doStuffEnemy(theEnemy);
	}

	private static void doStuffEnemy(EnemyShip anEnemyShip) {
		anEnemyShip.displayEnemyShip();
		anEnemyShip.followHeroShip();
		anEnemyShip.enemyShipShoots();
		
	}
}
