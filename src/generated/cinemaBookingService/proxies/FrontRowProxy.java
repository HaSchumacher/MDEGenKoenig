/**--- Generated at Sun Feb 28 15:53:01 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaBookingService.proxies;
import db.executer.PersistenceException;
import java.util.Optional;
import db.executer.*;
import generated.cinemaBookingService.FrontRow;
import java.sql.ResultSet;
import generated.cinemaBookingService.Seat;
public class FrontRowProxy extends CinemaRowProxy implements IFrontRow{
   private Integer id;
   private Optional<FrontRow> theObject;
   private DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
   public FrontRowProxy(Integer id){
      this.id = id;
      this.theObject = Optional.empty();
   }
   public FrontRowProxy(FrontRow theObject) throws PersistenceException{
      this(theObject.getId());
      this.theObject = Optional.of(theObject);
   }
   public boolean isObjectPresent() {
      return this.theObject.isPresent();
   }
   public FrontRow getTheObject()
   {
      try{if(!this.isObjectPresent()) this.theObject = Optional.of(this.load());}catch(PersistenceException pe){assert false : "Fatal Error Occured when loading an existing object from DB: " + "FrontRow";}
      return this.theObject.get();
   }
   public Integer getId(){
      return this.id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof IFrontRow)) return false;
      return ((IFrontRow)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   private FrontRow load() throws PersistenceException {
      ResultSet rs = null;
      try {
         rs = DBExecuterFactory.getConfiguredFactory().getDBDMLExecuter().selectIdSpecifiedCursorAleadyAtFirstRow("CinemaRow", this.id);
         Integer price = rs.getInt("price");
         Boolean bookedUp = rs.getBoolean("bookedUp");
         return FrontRow.createAlreadyPersistent(this, price, bookedUp);
      } catch (Exception e) {throw new PersistenceException(e.getMessage());}
   }
   public void addSeat(Seat seat){
      this.getTheObject().addSeat(seat);
   }
   public Boolean deleteSeat(Seat seat){
      return this.getTheObject().deleteSeat(seat);
   }
}