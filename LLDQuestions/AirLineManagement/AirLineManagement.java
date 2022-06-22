package AirLineManagement;

import java.util.Date;
import java.util.List;


/* Actors
 * Users ,SYSTEM ,Admin
 */
/*USE CASES
 * 1: Search flights with date and arrival and depature destinations
 * 2: manage the ticket and Iteneray details
 * 3: payment system
 * 4: Add a flight schedule, add a airport by admin
 * 5: Notification System
 * 
 */


 class Airport{
	String name;
	String code;
	List<Flight> flights;
}
 class Flight{
	 int flightNo;
	 Airline airline;
	 List<Seat>seats;
	 List<FlightSchedule> flightScedule;
 }
 class Airline{
	 String name;
	 List<Flight> flights;
 }
 class Seat{
	 seatStatus status;
	 int seatNo;
	 SeatType seatType;
	 Fare price;
 }
 class Fare{
	 
 }
 enum seatStatus{
	Reserved,Avaliable 
 }
 enum SeatType{
	 Business,Economy
 }
 class FlightSchedule {
	 Flight flight;
	 int flightScheduleNo;
	 FlightStatus status;
	 Airport arrival;
	 Airport Destination;
	 Date dateOfArrival;
	 Date dateofDestination;
 }
 enum FlightStatus{
	 Delay,OnTime,Cancelled
 }
 
 class User{
	 String name;
	 Passport passport;
	 Date dateOfBirth;
 }
 class Passport{
	 String Nationality;
	 String passportNumber;
	 String userName;
	 String PlaceOfIssue;
 }
 public class AirLineManagement {
	 String name;
	 //List<FlightSchedule> searchFlights(Date date, Airport arrival,Airport destination );
	 //List<Users> userLogin(String name ,String password);
	 //BookTicket(FlightScedule flight,User user);
	 //ConfirmTicket(BookingDetails bookingDetails,User user);
	 }
 class BookingDetails{
PNR pnrNo;
FlightSchedule flightSchedule;
User user;
}
 class PNR{
	 
 }
