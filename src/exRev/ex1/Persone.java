package exRev.ex1;

public class Persone extends  Thread{
    int ticketsRequested;
    String name;
    Theatre theatre;
    public Persone(String name,int ticketsRequested,Theatre theatre)

    {
        this.name=name;
        this.ticketsRequested=ticketsRequested;
        this.theatre =theatre;
    }
    @Override
    public void run() {
        theatre.bookTickets(ticketsRequested,name);
    }
}
