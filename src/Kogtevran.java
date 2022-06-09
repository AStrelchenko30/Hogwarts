public class Kogtevran extends Hogwarts {
    private int smart;
    private int wisdom;
    private int clever;
    private int creative;

    public Kogtevran(String name, String secondName, int powerOfMagic, int distance, int smart, int wisdom, int clever, int creative) {
        super(name, secondName, powerOfMagic, distance);
        this.smart = smart;
        this.wisdom = wisdom;
        this.clever = clever;
        this.creative = creative;
    }

    public int getSmart() {
        return smart;
    }

    public void setSmart(int smart) {
        this.smart = smart;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getClever() {
        return clever;
    }

    public void setClever(int clever) {
        this.clever = clever;
    }

    public int getCreative() {
        return creative;
    }

    public void setCreative(int creative) {
        this.creative = creative;
    }

    public void whoIsBetter(Kogtevran student2) {
        int sum1 = this.getClever() + this.getCreative() + this.getSmart() + this.getWisdom();
        int sum2 = student2.getClever() + student2.getCreative() + student2.getSmart() + student2.getWisdom();
        if (sum1 > sum2) {
            System.out.println("Из Когтеврана " + this.getSecondName() + " лучше,чем " + student2.getSecondName());
        } else {
            System.out.println("Из Когтеврана " + student2.getSecondName() + " лучше,чем " + this.getSecondName());
        }
    }
}

