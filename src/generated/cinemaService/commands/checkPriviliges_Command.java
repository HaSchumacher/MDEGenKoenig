/**--- Generated at Fri Mar 05 17:39:16 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaService.commands;
import generated.cinemaService.*;
import commands.*;
public class checkPriviliges_Command extends ServiceCommand<Boolean>{
   private static final long serialVersionUID = -1523146844L;
   private User u;
   public checkPriviliges_Command(User u){
      super();
      this.u = u;
   }
   public void execute(){
      try{this.result = CinemaService.getInstance().checkPriviliges(u);
      }catch(Exception e){this.e = e;
      }finally{CinemaService.getInstance().notifyObservers(this);}
   }
}
