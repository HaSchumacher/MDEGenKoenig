/**--- Generated at Fri Mar 05 17:39:16 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaService.commands;
import generated.cinemaService.*;
import commands.*;
public class deleteRoleFromUser_Command extends ServiceCommand<Boolean>{
   private static final long serialVersionUID = -455291460L;
   private User u;
   private Role r;
   public deleteRoleFromUser_Command(User u, Role r){
      super();
      this.u = u;
      this.r = r;
   }
   public void execute(){
      try{this.result = CinemaService.getInstance().deleteRoleFromUser(u, r);
      }catch(Exception e){this.e = e;
      }finally{CinemaService.getInstance().notifyObservers(this);}
   }
}
