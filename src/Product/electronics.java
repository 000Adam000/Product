
package Product;


public class electronics extends PRODUCTS  {
    
    private int garanty;
    private String company ;
    
    
    
    public void setGaranty(int garanty){
        this.garanty= garanty;
    }
    
    public int getgaranty(){
        return garanty;
    }
    
     public void setcompany(String company){
         this.company=company;
         
     }
     public String getcompany(){
         return company;
         
     }
}
