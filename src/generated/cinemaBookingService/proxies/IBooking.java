/**--- Generated at Sun Feb 28 15:53:02 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaBookingService.proxies;
import idManagement.Identifiable;
import db.executer.PersistenceException;
import generated.cinemaBookingService.Booking;
import generated.cinemaBookingService.Reservation;
public interface IBooking extends Identifiable{
   public Booking getTheObject();
   public Integer getId();
   public Reservation getMyReservation() throws PersistenceException;
   public void setMyReservation(Reservation newMyReservation)throws PersistenceException;
}