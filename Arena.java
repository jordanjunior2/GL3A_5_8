public Robot fight( Robot rb1,Robot rb2){

        Robot vainqueur = null ;

        while ((rb1.pt_vie > 0 && rb1.pt_vie <= 10) || (rb2.pt_vie > 0 && rb2.pt_vie <= 10)){

        rb1.fire(rb2);

        if(rb2.isDead(rb2.pt_vie) == "Est vivant")
        {
        rb2.fire(rb1);

        if(rb1.isDead(rb1.pt_vie) == "Est vivant")
        {
        rb1.fire(rb2);
        }
        else
        {
        vainqueur = rb2;
        }
        }

        else
        {
        vainqueur = rb1;
        }


        }
        return  vainqueur;


        }

public  void main(String[] args){

        Robot D2R2 = new Robot("D2R2");
        Robot Data = new Robot("Data");

        fight(D2R2,Data);
        }
        }