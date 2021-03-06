/**--- Generated at Fri Mar 05 17:39:16 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaService.commands;
import generated.cinemaService.*;
import commands.*;
public class changePriceCategory_Command extends ServiceCommand<Boolean>{
   private static final long serialVersionUID = 1817811120L;
   private PriceCategory c;
   private Integer price;
   public changePriceCategory_Command(PriceCategory c, Integer price){
      super();
      this.c = c;
      this.price = price;
   }
   public void execute(){
      try{this.result = CinemaService.getInstance().changePriceCategory(c, price);
      }catch(Exception e){this.e = e;
      }finally{CinemaService.getInstance().notifyObservers(this);}
   }
}
