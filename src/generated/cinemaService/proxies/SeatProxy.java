/**--- Generated at Fri Mar 05 17:39:16 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaService.proxies;
import db.executer.PersistenceException;
import java.util.Optional;
import db.executer.*;
import generated.cinemaService.Seat;
import java.sql.ResultSet;
import generated.cinemaService.CinemaRow;
import generated.cinemaService.relationControl.CinemaRow_SeatsSupervisor;
import generated.cinemaService.Reservation;
import java.util.Set;
public class SeatProxy implements ISeat{
   private Integer id;
   private Optional<Seat> theObject;
   private DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
   public SeatProxy(Integer id){
      this.id = id;
      this.theObject = Optional.empty();
   }
   public SeatProxy(Seat theObject) throws PersistenceException{
      this(theObject.getId());
      this.theObject = Optional.of(theObject);
   }
   public boolean isObjectPresent() {
      return this.theObject.isPresent();
   }
   public Seat getTheObject()
   {
      try{if(!this.isObjectPresent()) this.theObject = Optional.of(this.load());}catch(PersistenceException pe){assert false : "Fatal Error Occured when loading an existing object from DB: " + "Seat";}
      return this.theObject.get();
   }
   public Integer getId(){
      return this.id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof ISeat)) return false;
      return ((ISeat)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   private Seat load() throws PersistenceException {
      ResultSet rs = null;
      try {
         rs = DBExecuterFactory.getConfiguredFactory().getDBDMLExecuter().selectIdSpecifiedCursorAleadyAtFirstRow("Seat", this.id);
         Integer number = rs.getInt("number");
         CinemaRow myRow = CinemaRow_SeatsSupervisor.getInstance().getMyRow(this).getTheObject();
         return Seat.createAlreadyPersistent(this, number, myRow);
      } catch (Exception e) {throw new PersistenceException(e.getMessage());}
   }
   public Integer getNumber() {
      return this.getTheObject().getNumber();
   }
   public void setNumber(Integer newNumber) throws PersistenceException{
      this.getTheObject().setNumber(newNumber);
   }
   public CinemaRow getMyRow() throws PersistenceException{
      return this.getTheObject().getMyRow();
   }
   public Set<Reservation> getMyReservation() throws PersistenceException{
      return this.getTheObject().getMyReservation();
   }
}
