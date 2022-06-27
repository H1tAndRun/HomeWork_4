package Exercise1;

public class Rose implements Smell,Blossom{
    @Override
    public void blossom() {
        System.out.println("Роза : умеет цвести");

    }

    @Override
    public void smell() {
        System.out.println("Роза : умеет пахнуть");

    }
}
