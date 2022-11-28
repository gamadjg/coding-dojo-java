import java.util.ArrayList;
import java.util.Arrays;
public class CafeUtil {

    public int getStreakGoal(){
        int sum = 0;
        for(int i=1; i<=10; i++){
            sum = sum + i;
        }
        return sum;
    }

    public double getOrderTotal(double[] prices){
        double sum = 0;
        for(double item: prices){
            sum += item;
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for(int i=0; i<menuItems.size(); i++){
            System.out.println(i+": "+menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.printf("Hello, %s!\n", userName);

        customers.add(userName);

        System.out.printf("There are %d customers in front of you.\n", customers.size()-1);

        for(int i=0; i<customers.size()-1;i++){
            System.out.printf(" - %d: %s\n", i+1, customers.get(i));
        }

    }
}
