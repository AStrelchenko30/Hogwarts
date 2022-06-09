public class Slizaren extends Hogwarts {
    private int sly;
    private int resolute;
    private int ambitious;
    private int savvy;
    private int imperious;

    public Slizaren(String name, String secondName, int powerOfMagic, int distance, int sly, int resolute, int ambitious, int savvy, int imperious) {
        super(name, secondName, powerOfMagic, distance);
        this.sly = sly;
        this.resolute = resolute;
        this.ambitious = ambitious;
        this.savvy = savvy;
        this.imperious = imperious;
    }

    public int getSly() {
        return sly;
    }

    public void setSly(int sly) {
        this.sly = sly;
    }

    public int getResolute() {
        return resolute;
    }

    public void setResolute(int resolute) {
        this.resolute = resolute;
    }

    public int getAmbitious() {
        return ambitious;
    }

    public void setAmbitious(int ambitious) {
        this.ambitious = ambitious;
    }

    public int getSavvy() {
        return savvy;
    }

    public void setSavvy(int savvy) {
        this.savvy = savvy;
    }

    public int getImperious() {
        return imperious;
    }

    public void setImperious(int imperious) {
        this.imperious = imperious;
    }

    public void whoIsBetter(Slizaren student2) {
        int sum1 = this.getAmbitious() + this.getImperious() + this.getResolute() + this.getSavvy() + this.getSly();
        int sum2 = student2.getAmbitious() + student2.getImperious() + student2.getResolute() + student2.getSavvy() + student2.getSly();
        if (sum1 > sum2) {
            System.out.println("Из Слизарина " + this.getSecondName() + " лучше,чем " + student2.getSecondName());
        } else {
            System.out.println("Из Слизарина " + student2.getSecondName() + " лучше,чем " + this.getSecondName());
        }
    }
}

