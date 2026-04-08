
package computersystem;

public class ComputerSystem 
{

   
    public static void main(String[] args) 
    {
        SystemBuilder sb = new SystemBuilder();
        
        Systems s = sb.getName("Office Computer").getProcessor("Intel i3").
                getRAM("8Gb RAM").getStorage("256GB SSD").getGraphicsCard("Integrated Graphics").
                getOperatingSystem("Windows 10").build();
        
        s.showDetails();
        
        
        System.out.println("**********************************");
        
        
        SystemBuilder sb1 = new SystemBuilder();
        
        Systems s1 = sb1.getName("Gaming Computer").getProcessor("Intel i7").getRAM("16Gb RAM").getStorage("1TB SSD").getGraphicsCard("NVIDIA RTX 3060").getOperatingSystem("Windows 11").build();
        
        s1.showDetails();
        
        
        System.out.println("**********************************");
        
        SystemBuilder sb2 = new SystemBuilder();
        
        Systems s2 = sb2.getName("Developer Computer").getProcessor("Intel i5").getRAM("16Gb RAM").getStorage("512 SSD").getGraphicsCard("Integrated Graphics").getOperatingSystem("Linux").build();
        
        s2.showDetails();
        
        
        
        
        
        
        
        
        
        
    }
    
}
