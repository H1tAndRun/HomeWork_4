package Exercise1;

public class Spruce extends Wood implements Smell{
    public Spruce(boolean corne) {
        this.corne=corne;
    }

    @Override
    public void smell() {
        System.out.println("Ель : умеет пахнуть");
    }
}
