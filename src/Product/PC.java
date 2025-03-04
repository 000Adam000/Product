
package Product;


public class PC extends electronics {
    
    private String model;
    private String MonitorType;

    public void setModel(String model){
        this.model= model;
    }
    
    public String getModel(){
        return model;
    }
    
    public void setMonitortype(String MonitorType){
         this.MonitorType=MonitorType;
         
     }
    public String getMonitortype(){
         return MonitorType;
         
     }
}
