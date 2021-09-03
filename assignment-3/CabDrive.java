import java.util.*;

class Cab {
    int travelDistance;
    int fare;

    // Constructor to initialize the fare
    public Cab() {
        fare = 30;
    }

    public Cab(int amount) {
        fare = amount;
    }

    // Method to take input
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance travelled by customer: ");
        travelDistance = sc.nextInt();
        sc.nextLine();
    }

    // Method to display output
    void display() {
        int totalFare = fare + travelDistance * 10;
        System.out.println("The total fare of this ride is " + totalFare);
    }
}

public class CabDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cab distance from customer: ");
        int cabDistance = sc.nextInt();
        sc.nextLine();

        if (cabDistance > 5) {
            /*
             * If the distance from Cab to Customer is the greater than 5, it's fare
             * increases by 10 per kilometer above 5
             */
            Cab cab = new Cab(30 + 10 * (cabDistance - 5));
            cab.input();
            cab.display();
        } else {
            Cab cab = new Cab();
            cab.input();
            cab.display();
        }
    }
}
