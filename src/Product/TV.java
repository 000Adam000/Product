
package Product;


public class TV extends electronics {
    
    private int size;
    private String TVtype;
    
    
    public void setsize(int size){
        this.size=size;
        
    }
    public int getsize(){
        return size;
        
    }
    
      public void setTVtype(String TVtype){
        this.TVtype=TVtype;
        
    }
    public String getTVtype(){
        return TVtype;
        
    }
}
