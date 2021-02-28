/**--- Generated at Sun Feb 28 15:10:31 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaService.commands;
import generated.cinemaService.*;
import commands.*;
public class changePriceCategory_Command extends ServiceCommand<Void>{
   private static final long serialVersionUID = -1231369488L;
   private PriceCategory c;
   private Integer price;
   public changePriceCategory_Command(PriceCategory c, Integer price){
      super();
      this.c = c;
      this.price = price;
   }
   public void execute(){
      try{CinemaService.getInstance().changePriceCategory(c, price);
      }catch(Exception e){this.e = e;
      }finally{CinemaService.getInstance().notifyObservers(this);}
   }
}