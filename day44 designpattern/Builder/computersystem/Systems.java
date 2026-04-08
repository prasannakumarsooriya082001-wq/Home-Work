
package computersystem;

public class Systems 
{

    
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    private String Processor;
    private String RAM;
    private String Storage;
    private String GraphicsCard;
    private String OperatingSystem;

    public Systems() {
    }

   
    
    

    public String getProcessor() {
        return Processor;
    }

    public void setProcessor(String Processor) {
        this.Processor = Processor;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getStorage() {
        return Storage;
    }

    public void setStorage(String Storage) {
        this.Storage = Storage;
    }

    public String getGraphicsCard() {
        return GraphicsCard;
    }

    public void setGraphicsCard(String GraphicsCard) {
        this.GraphicsCard = GraphicsCard;
    }

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String OperatingSystem) {
        this.OperatingSystem = OperatingSystem;
    }

    

    void showDetails()
    {
        
        System.out.println("Name : "+name);
        System.out.println("Processor : "+ Processor);
        System.out.println("RAM : "+ RAM);
        System.out.println("Storage : "+ Storage);
        System.out.println("GraphicsCard : "+ GraphicsCard);
        System.out.println("OperatingSystem : "+ OperatingSystem);
        
        
    }

    
    
    

}
