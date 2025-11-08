package model;

public class Reservation{
    private String reservationId;
    private Flight flight;
    private Passenger passenger;
    private String seatNumber; // opsiyonel
    private String status;     // e.g., \"CONFIRMED\", \"CANCELLED\"

    public Reservation(String reservationId, Flight flight, Passenger passenger, String seatNumber){
        this.reservationId = reservationId;
        this.flight = flight;
        this.passenger = passenger;
        this.seatNumber = seatNumber;
        this.status = "CONFIRMED";
    }

    public String getReservationId(){
        return reservationId;
    }

    public Flight getFlight(){ 
        return flight;
    }

    public Passenger getPassenger(){
        return passenger; 
    }
    public String getSeatNumber(){
        return seatNumber;
    }

    public String getStatus(){
        return status;
    }

    public void cancel(){
        this.status = "CANCELLED";
    }

    @Override
    public String toString() {
        return "Reservation ID: " + reservationId + " | Passenger: " + passenger.getName() +
               " | Flight: " + flight.getFlightNumber() + " | Status: " + status;
    }
}

