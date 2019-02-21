class Bank{
    float getRateOfInterest(){
        return 0;
    }
}
class MAIB extends Bank{
    float getRateOfInterest(){
        return 8.4f;
    }
}
class MICB extends Bank{
    float getRateOfInterest(){
        return 7.3f;
    }
}
class BCR extends Bank{
    float getRateOfInterest(){
        return 9.7f;
    }
}
class TestPolymorphism{
    public static void main(String args[]){
        Bank b;
        b=new MAIB();
        System.out.println("MAIB Rate of Interest: "+b.getRateOfInterest());
        b=new MICB();
        System.out.println("MICB Rate of Interest: "+b.getRateOfInterest());
        b=new BCR();
        System.out.println("BCR Rate of Interest: "+b.getRateOfInterest());
    }
}  