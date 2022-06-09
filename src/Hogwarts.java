public class Hogwarts {
    private String name;
    private String secondName;
    private int powerOfMagic;
    private int distance;

    public Hogwarts(String name, String secondName, int powerOfMagic, int distance) {
        this.name = name;
        this.secondName = secondName;
        this.distance = distance;
        this.powerOfMagic = powerOfMagic;
    }

    public int getPowerOfMagic() {
        return powerOfMagic;
    }

    public void setPowerOfMagic(int powerOfMagic) {
        this.powerOfMagic = powerOfMagic;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
public void whoIsBetterInHogwarts(Hogwarts student2){
        int sum1=this.getPowerOfMagic()+this.getDistance();
        int sum2=student2.getPowerOfMagic()+student2.getDistance();
        if(sum1>sum2){
            if(sum1>sum2){
                System.out.println("В Хогвартсе " + this.getSecondName()+" сильнее, чем "+ student2.getSecondName());
            }else {
                System.out.println("В Хогвартсе "+student2.getSecondName()+"сильнее ,чем "+ this.getSecondName());
            }
        }
}
}
