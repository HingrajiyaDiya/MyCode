package MyPackage;

class Restaurant 
{
    @SuppressWarnings("unused")
	private String order;
    private boolean orderPlaced = false;
    private boolean orderCooked = false;

    public synchronized void foodOrder(String orderName) 
    {
        this.order = orderName;
        orderPlaced = true;
        System.out.println("Order received: " + orderName);
        notifyAll(); 
    }

    public synchronized void cookedOrder(String orderName) 
    {
        while (!orderPlaced)
        {
            try {
                wait();
            } 
            catch (InterruptedException e) 
            {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("Chef has received the order: " + orderName + ", The cooking is under process.");
        try
        {
            Thread.sleep(1000); 
        } 
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        orderCooked = true;
        notifyAll(); 
    }

    public synchronized void receivedOrder(String orderName)
    {
        while (!orderCooked)
        {
            try
            {
                wait(); 
            } 
            catch (InterruptedException e) 
            {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("The customer received the order: " + orderName);
    }
}

public class Lab_9_RestaurantSimulation 
{
    public static void main(String[] args)
    {
        Restaurant restaurant = new Restaurant();
        String order = "Pizza"; 

        Thread customer = new Thread(() -> restaurant.receivedOrder(order), "customer");
        Thread waiter = new Thread(() -> restaurant.foodOrder(order), "Waiter");
        Thread cook = new Thread(() -> restaurant.cookedOrder(order), "cook");

        waiter.start();
        cook.start();
        customer.start();

        try 
        {
            waiter.join();
            cook.join();
            customer.join();
        } 
        catch (InterruptedException e) 
        {
            Thread.currentThread().interrupt();
        }

        System.out.println("All threads have completed execution.");
    }
}