/**--- Generated at Tue Mar 02 17:45:31 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaService.commands;
import generated.cinemaService.*;
import commands.*;
public class addFilmprojection_Command extends ServiceCommand<Void>{
   private static final long serialVersionUID = -70485291L;
   private Cinemahall c;
   private Movie m;
   public addFilmprojection_Command(Cinemahall c, Movie m){
      super();
      this.c = c;
      this.m = m;
   }
   public void execute(){
      try{CinemaService.getInstance().addFilmprojection(c, m);
      }catch(Exception e){this.e = e;
      }finally{CinemaService.getInstance().notifyObservers(this);}
   }
}
