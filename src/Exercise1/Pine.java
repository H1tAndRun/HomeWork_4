package Exercise1;

public class Pine extends Wood implements Smell {

    public Pine(boolean corne) {
        this.corne=corne;
    }

    @Override
    public void smell() {
        System.out.println("Сосна : умеет пахнуть");
    }
}
