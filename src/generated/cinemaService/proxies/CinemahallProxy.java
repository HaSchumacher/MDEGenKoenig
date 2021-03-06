/**--- Generated at Fri Mar 05 17:39:16 CET 2021 
 * --- No Change Allowed!  
 */
package generated.cinemaService.proxies;
import db.executer.PersistenceException;
import java.util.Optional;
import db.executer.*;
import generated.cinemaService.Cinemahall;
import java.sql.ResultSet;
import generated.cinemaService.CinemaRow;
import java.util.List;
public class CinemahallProxy implements ICinemahall{
   private Integer id;
   private Optional<Cinemahall> theObject;
   private DBDMLExecuter dmlExecuter = PersistenceExecuterFactory.getConfiguredFactory().getDBDMLExecuter();
   public CinemahallProxy(Integer id){
      this.id = id;
      this.theObject = Optional.empty();
   }
   public CinemahallProxy(Cinemahall theObject) throws PersistenceException{
      this(theObject.getId());
      this.theObject = Optional.of(theObject);
   }
   public boolean isObjectPresent() {
      return this.theObject.isPresent();
   }
   public Cinemahall getTheObject()
   {
      try{if(!this.isObjectPresent()) this.theObject = Optional.of(this.load());}catch(PersistenceException pe){assert false : "Fatal Error Occured when loading an existing object from DB: " + "Cinemahall";}
      return this.theObject.get();
   }
   public Integer getId(){
      return this.id;
   }
   public boolean equals(Object o) {
      if(!(o instanceof ICinemahall)) return false;
      return ((ICinemahall)o).getId().equals(this.getId());
   }
   public int hashCode() {return this.getId().hashCode();}
   private Cinemahall load() throws PersistenceException {
      ResultSet rs = null;
      try {
         rs = DBExecuterFactory.getConfiguredFactory().getDBDMLExecuter().selectIdSpecifiedCursorAleadyAtFirstRow("Cinemahall", this.id);
         Boolean open = rs.getBoolean("open");
         String name = rs.getString("name");
         return Cinemahall.createAlreadyPersistent(this, open, name);
      } catch (Exception e) {throw new PersistenceException(e.getMessage());}
   }
   public List<CinemaRow> getMyRows() throws PersistenceException{
      return this.getTheObject().getMyRows();
   }
   public void addToMyRows(CinemaRow arg) throws PersistenceException{
      this.getTheObject().addToMyRows(arg);
   }
   public boolean removeFromMyRows(CinemaRow arg) throws PersistenceException{
      return this.getTheObject().removeFromMyRows(arg);
   }
   public Boolean getOpen() {
      return this.getTheObject().getOpen();
   }
   public void setOpen(Boolean newOpen) throws PersistenceException{
      this.getTheObject().setOpen(newOpen);
   }
   public String getName() {
      return this.getTheObject().getName();
   }
   public void setName(String newName) throws PersistenceException{
      this.getTheObject().setName(newName);
   }
}
