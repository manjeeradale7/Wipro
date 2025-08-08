package Day3aftn;
import java.util.Scanner;
public class GameMain {	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Game game = null;
	        System.out.println("Select a game to play:");
	        System.out.println("1.Snake Game");
	        System.out.println("2.Car Game");
	        System.out.print("Enter choice: ");
	        int choice = scanner.nextInt();
	        scanner.nextLine(); 
	        switch (choice) {
	            case 1:
	                game = new SnakeGame();
	                break;
	            case 2:
	                game = new CarGame();
	                break;
	            default:
	                System.out.println("Invalid choice.");
	                scanner.close();
	                return;
	        }
	        boolean running = true;
	        while (running) {
	            System.out.println(" Menu ");
	            System.out.println("1.Start");
	            System.out.println("2.Play");
	            System.out.println("3.Pause");
	            System.out.println("4.Stop");
	            System.out.println("5.Exit");
	            System.out.print("Enter option: ");
	            int option = scanner.nextInt();
	            switch (option) {
	                case 1: game.start(); break;
	                case 2: game.play(); break;
	                case 3: game.pause(); break;
	                case 4: game.stop(); break;
	                case 5: 
	                    System.out.println("Exiting game");
	                    running = false;
	                    break;
	                default: System.out.println("Invalid option.");
	            }
	        }
	        scanner.close();
	    }
	}

