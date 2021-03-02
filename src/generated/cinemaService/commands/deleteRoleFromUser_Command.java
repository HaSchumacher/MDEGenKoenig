/**--- Generated at Tue Mar 02 17:45:31 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaService.commands;
import generated.cinemaService.*;
import commands.*;
public class deleteRoleFromUser_Command extends ServiceCommand<Void>{
   private static final long serialVersionUID = -1266400614L;
   private User u;
   private Role r;
   public deleteRoleFromUser_Command(User u, Role r){
      super();
      this.u = u;
      this.r = r;
   }
   public void execute(){
      try{CinemaService.getInstance().deleteRoleFromUser(u, r);
      }catch(Exception e){this.e = e;
      }finally{CinemaService.getInstance().notifyObservers(this);}
   }
}
