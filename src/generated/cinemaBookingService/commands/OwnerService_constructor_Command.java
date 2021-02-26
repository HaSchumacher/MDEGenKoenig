/**--- Generated at Thu Feb 25 17:10:43 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaBookingService.commands;
import generated.cinemaBookingService.*;
import commands.*;
public class OwnerService_constructor_Command extends ServiceCommand<OwnerService>{
   private static final long serialVersionUID = 174610968L;
   private Cinema cinema;
   public OwnerService_constructor_Command(Cinema cinema){
      super();
      this.cinema = cinema;
   }
   public void execute(){
      try{this.result = OwnerService.createFresh(cinema);
      }catch(Exception e){this.e = e;
      }finally{CinemaBookingService.getInstance().notifyObservers(this);}
   }
}
