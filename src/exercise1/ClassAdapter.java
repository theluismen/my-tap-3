package exercise1;

public class ClassAdapter extends Usb implements CigaretteLighterReceptacle {
    public ClassAdapter () {

    }

    @Override
    public int getEnergy() {
        return super.getPower();
    }
}
