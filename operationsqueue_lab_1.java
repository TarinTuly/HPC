import java.util.ArrayList;
import java.util.List;;
public class OperationsQueue {
    private final List<Integer> operations = new ArrayList<>();
    //private final List<Integer> operationsdeposite = new ArrayList<>();

    public  synchronized void addSimulation(int totalSimulation) {

        // Add 50 random numbers in the operations list. The number will be range from -100 to 100. It cannot be zero.
        for (int i = 0; i < totalSimulation;) {
            int random = (int) (Math.random() * 200) - 100;
            if (random != 0) {
                operations.add(random);
                //operationsdeposite.add(random);
                System.out.println(i + ". New operation added: " + random);
                // add small delay to simulate the time taken for a new customer to arrive
                i++;     ///changed is done here
            }
            
            try {
                int delaytime= (int) (1+Math.random() * 80);
                Thread.sleep(delaytime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        operations.add(-9999);
    }
    public void add(int amount) {
        operations.add(amount);
    }

    public synchronized int getNextItem() {
        // add a small delay to simulate the time taken to get the next operation.
       while(operations.isEmpty()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        return operations.remove(0);
    }
}
