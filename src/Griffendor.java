public class Griffendor extends Hogwarts {
    private int nobility;
    private int honor;
    private int brave;

    public Griffendor(String name, String secondName, int powerOfMagic, int distance, int nobility, int honor, int brave) {
        super(name, secondName, powerOfMagic, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.brave = brave;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBrave() {
        return brave;
    }

    public void setBrave(int brave) {
        this.brave = brave;
    }

    public void whoIsBetter(Griffendor student2) {
        int sum1 = this.getBrave() + this.getHonor() + this.getNobility();
        int sum2 = student2.getBrave() + student2.getHonor() + student2.getNobility();
        if (sum1 > sum2) {
            System.out.println("Из Гриффендора " + this.getSecondName() + " лучше,чем " + student2.getSecondName());
        } else {
            System.out.println("Из Гриффендора " + student2.getSecondName() + " лучше,чем " + this.getSecondName());
        }
    }
}
