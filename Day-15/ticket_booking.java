class Theater {

    private int totalSeats = 5;

    synchronized void bookSeat(int seats) {

        if (totalSeats >= seats) {

            System.out.println(Thread.currentThread().getName()
                    + " Booking Successful");

            totalSeats -= seats;

            System.out.println("Remaining Seats = " + totalSeats);

        } else {

            System.out.println(Thread.currentThread().getName()
                    + " Booking Failed");
        }
    }
}

class BookingThread extends Thread {

    Theater theater;
    int seatsRequired;

    BookingThread(Theater theater, int seatsRequired, String name) {
        this.theater = theater;
        this.seatsRequired = seatsRequired;
        setName(name);
    }

    public void run() {
        theater.bookSeat(seatsRequired);
    }
}

public class ticket_booking {

    public static void main(String[] args) {

        Theater theater = new Theater();

        BookingThread t1 = new BookingThread(theater, 2, "Thread1");

        BookingThread t2 = new BookingThread(theater, 2, "Thread2");

        BookingThread t3 = new BookingThread(theater, 2, "Thread3");

        t1.start();
        t2.start();
        t3.start();
    }
}