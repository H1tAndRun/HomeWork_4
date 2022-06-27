package Exercise2;

public class Watch {
   private boolean broken ;


    Watch(boolean broken){
        this.broken=broken;
    }


    public void tick() throws WatchBrokenError{

            if (!broken){
                System.out.println("Часы тикают");
            }else {
                throw new WatchBrokenError();
            }



    }
}
