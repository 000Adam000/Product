
package Product;

import java.util.Scanner;


public class MainProducts {
    
    public static void main(String[] args) {
        
        
        
        PC pc = new PC();
        TV tv = new TV();
        
        Scanner scanner = new Scanner(System.in);
        
        int validNumber = 0;
        
        while (true) {
            System.out.println();
            System.out.println("Please enter either 1- to show TV or 2- to show PC or 0- Close: ");
            String ch = scanner.nextLine();
            
            try {
                int number = Integer.parseInt(ch);
                if (number == 1 || number == 2 || number == 0) {
                    validNumber = number;
                    System.out.println("Success! You entered: " + validNumber);

                    switch(ch){
                        case "1":
                            
                    tv.setID(101);
                    tv.setName("LG");
                    tv.setCount(4);
                    tv.setPrice(500);
                    tv.setPlace("DotNet");
                    tv.setTVtype("4K");
                    tv.setsize(60);
                    tv.setGaranty(2);
                    tv.setcompany("LG Company");
                    
                    
                    System.out.println("id\t name\t count\t price\t seller\t TV type\tTV size\t garanty\t company");
                    System.out.println("*****************************************************************************");
                    System.out.println(tv.getID()+"\t "+tv.getName()+"\t "+tv.getCount()+"\t "+tv.getPrice()+"\t "+tv.getplace()+"\t "+tv.getTVtype()+"\t\t "+tv.getsize()+"\t "+tv.getgaranty()+"\t\t "+tv.getcompany() );
                    break;
                    
                        case "2":
                            
                    pc.setID(102);
                    pc.setName("thinkpad");
                    pc.setCount(8);
                    pc.setPrice(500);
                    pc.setPlace("DotNet");
                    pc.setMonitortype("4K");
                    pc.setModel("lenovo");
                    pc.setGaranty(2);
                    pc.setcompany("LENOVO COMPANY");
                    
                    
                    System.out.println("id\t name\t count\t price\t seller\t Monitor type\tTV Model\t garanty\t company");
                    System.out.println("*****************************************************************************");
                    System.out.println(pc.getID()+"\t "+pc.getName()+"\t "+pc.getCount()+"\t "+pc.getPrice()+"\t "+pc.getplace()+"\t "+pc.getMonitortype()+"\t\t "+pc.getModel()+"\t "+pc.getgaranty()+"\t\t "+pc.getcompany() );
                    break;
                    
                        case "0":

                    System.exit(0);

                    
                    }
                    
                } else {
                    System.out.println("Error: " + number + " is not 1 or 2. Please try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: '" + ch + "' is not a valid number. Please try again.");
            }
        }
        

        

        
        
        
        
    }
    
}
