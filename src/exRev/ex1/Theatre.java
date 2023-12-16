package exRev.ex1;

public class Theatre {
    private int totalTickets = 10;

    public synchronized void bookTickets(int ticketsRequested, String person) {
        if (ticketsRequested <= totalTickets) {
            System.out.println(ticketsRequested + " ticket(s) booked for " + person);
            totalTickets -= ticketsRequested;
            System.out.println("Remaining tickets: " + totalTickets);
        } else {
            System.out.println("Sorry, not enough tickets available for " + person);
        }
    }


}
