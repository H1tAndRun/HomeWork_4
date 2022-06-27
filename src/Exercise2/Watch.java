package Exercise2;

public class Watch {
   private boolean broken ;


    Watch(boolean broken){
        this.broken=broken;
    }


    public void tick(){
        try {
            if (!broken){
                System.out.println("Часы тикают");
            }else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Ошибка часы сломаны");
        }


    }
}
