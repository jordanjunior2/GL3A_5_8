public class  Main{

    public static void  main(String arg []){

        Robot rt= new Robot("bekono");
        rt.fire();
        rt.boirePotionDeVie(2);
        rt.isDeat();

System.out.println("le combat est rude ");

        Robot rt2= new Robot("joey");
        rt2.fire();
        rt2.boirePotionDeVie(2);
        rt2.isDeat();
    }
}