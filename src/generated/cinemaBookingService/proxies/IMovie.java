/**--- Generated at Sun Feb 28 15:53:01 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaBookingService.proxies;
import idManagement.Identifiable;
import db.executer.PersistenceException;
import generated.cinemaBookingService.Movie;
public interface IMovie extends Identifiable{
   public Movie getTheObject();
   public Integer getId();
   public String getTitle() ;
   public void setTitle(String newTitle) throws PersistenceException;
}