public class GinFillingMachine implements IGinFillingMachine {
    private final FillingMachine fillingMachine;

    public GinFillingMachine(FillingMachine fillingMachine) {
        this.fillingMachine = fillingMachine;
    }

    @Override
    public void activate() {
        fillingMachine.activate();
    }

    @Override
    public void deactivate() {
        fillingMachine.deactivate();
    }

    @Override
    public void fillingBottle() {
        fillingMachine.fillingBottle();
    }
}
