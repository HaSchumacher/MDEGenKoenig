/**--- Generated at Thu Feb 25 15:23:56 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaBookingService.commands;
import generated.cinemaBookingService.*;
import commands.*;
public class MainStartCinema_constructor_Command extends ServiceCommand<MainStartCinema>{
   private static final long serialVersionUID = 1123109559L;
   public MainStartCinema_constructor_Command(){
      super();
   }
   public void execute(){
      try{this.result = MainStartCinema.createFresh();
      }catch(Exception e){this.e = e;
      }finally{CinemaBookingService.getInstance().notifyObservers(this);}
   }
}
