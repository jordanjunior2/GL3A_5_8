public class Robot {
    public int pt_vie;
    public String nom;

    public Robot(String nom){

        this.nom = nom;
        this.pt_vie = 10;
        System.out.println("Robot : "+nom);
    }

    public int fire(Robot rb)
    {

        rb.pt_vie = rb.pt_vie - 2;

        if (rb.pt_vie < 0) //Pour éviter d'avoir une vie négative
        {
            rb.pt_vie = 0; //On met la vie à 0 (cela veut dire mort)
            //System.out.println("Impossible de tirer sur le robot,il est deja mort");
        }
        if (rb.pt_vie > 10) //Pour éviter d'avoir une vie superieure à 10
        {
            rb.pt_vie = 10; //On met la vie à 10

        }
        //On enlève le nombre de dégâts reçus à la vie du personnage

        System.out.println("Robot :  "+ rb.nom +" touché par le robot : "+ nom);
        return rb.pt_vie;
    }
    /*private  void recevoirDegats(int nbDegats)
    {
        pt_vie -= nbDegats;
        //On enlève le nombre de dégâts reçus à la vie du personnage

    }
    */

    public void boirePotionDeVie(int quantitePotion)
    {
        pt_vie += quantitePotion;
        if (pt_vie > 10) //Interdiction de dépasser 100 de vie
        {
            pt_vie = 10;
        }
    }



    public  String isDead(int pt_vie){

        String   message;
        if (pt_vie > 0) //Plus de 0 de vie
        {
            message = "Est vivant";
            return message; //FAUX, il est vivant !
        }
        else
        {
            pt_vie = 0;
            message = "Est mort";
            return message; //VRAI, il n'est plus vivant !
        }
    }
}




