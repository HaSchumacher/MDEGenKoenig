/**--- Generated at Tue Mar 02 17:45:31 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaService.commands;
import generated.cinemaService.*;
import commands.*;
public class Cinemahall_constructor_Command extends ServiceCommand<Cinemahall>{
   private static final long serialVersionUID = -794675754L;
   private Boolean  open;
   private String  name;
   public Cinemahall_constructor_Command(Boolean  open, String  name){
      super();
      this.open = open;
      this.name = name;
   }
   public void execute(){
      try{this.result = Cinemahall.createFresh(open, name);
      }catch(Exception e){this.e = e;
      }finally{CinemaService.getInstance().notifyObservers(this);}
   }
}
