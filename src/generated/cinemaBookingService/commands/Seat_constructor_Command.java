/**--- Generated at Thu Feb 25 17:10:43 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaBookingService.commands;
import generated.cinemaBookingService.*;
import commands.*;
public class Seat_constructor_Command extends ServiceCommand<Seat>{
   private static final long serialVersionUID = -1641519080L;
   public Seat_constructor_Command(){
      super();
   }
   public void execute(){
      try{this.result = Seat.createFresh();
      }catch(Exception e){this.e = e;
      }finally{CinemaBookingService.getInstance().notifyObservers(this);}
   }
}
