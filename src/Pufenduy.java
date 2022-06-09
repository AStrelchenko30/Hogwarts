public class Pufenduy extends Hogwarts {
    private int hardworking;
    private int trusty;
    private int honest;

    public Pufenduy(String name, String secondName,int powerOfMagic,int distance, int hardworking, int trusty, int honest) {
        super(name,secondName,powerOfMagic,distance);
        this.hardworking = hardworking;
        this.trusty = trusty;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public void setHardworking(int hardworking) {
        this.hardworking = hardworking;
    }

    public int getTrusty() {
        return trusty;
    }

    public void setTrusty(int trusty) {
        this.trusty = trusty;
    }

    public int getHonest() {
        return honest;
    }

    public void setHonest(int honest) {
        this.honest = honest;
    }
    public void printAll(Pufenduy student){
        System.out.println(getName()+" "+ getSecondName()+
                ";"+"сила магии: "+student.getPowerOfMagic()+";"
                +"трансгрессия: "+ student.getDistance()+";"+"трудолюбие: "+getHardworking()+";"
                +"верность: "+ getTrusty()+";"+"честь: "+getHonest());

    }
    public void whoIsBetter(Pufenduy student2){
        int sum1=this.getHardworking()+this.getHonest()+this.getTrusty();
        int sum2=student2.getHardworking()+student2.getHonest()+student2.getTrusty();
        if(sum1>sum2){
            System.out.println("Из Пуффендуй " + this.getSecondName()+" лучше,чем "+ student2.getSecondName());
        }else {
            System.out.println("Из Пуффендуй "+student2.getSecondName()+" лучше,чем "+ this.getSecondName());
        }
    }

}
