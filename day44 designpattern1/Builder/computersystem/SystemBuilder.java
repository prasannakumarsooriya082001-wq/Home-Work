
package computersystem;


public class SystemBuilder 
{
    
    private Systems sy;

    public SystemBuilder()
    {
        
        sy = new Systems();
    }
    
    public SystemBuilder getName(String name)
    {
        this.sy.setName(name);
        return this;
    }
    
    
    public SystemBuilder getProcessor(String processor)
    {
        this.sy.setProcessor(processor);
        return this;
    }
    
    public SystemBuilder getRAM(String RAM)
    {
        this.sy.setRAM(RAM);
        return this;
    }
    
    public SystemBuilder getStorage(String Storage)
    {
        this.sy.setStorage(Storage);
        return this;
    }
    
    public SystemBuilder getGraphicsCard(String GraphicsCard)
    {
        this.sy.setGraphicsCard(GraphicsCard);
        return this;
    }
    
    public SystemBuilder getOperatingSystem(String OperatingSystem)
    {
        this.sy.setOperatingSystem(OperatingSystem);
        return this;
    }
    
    public Systems build()
    {
        return sy;
    }
    
    
}
