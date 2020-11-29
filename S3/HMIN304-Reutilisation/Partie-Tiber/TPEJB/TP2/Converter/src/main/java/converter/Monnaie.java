package converter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Monnaie implements Serializable {
    public List<String> nom = new ArrayList<String>();
    public String nomComplet;
    public String code;
    public float taux;

    public Monnaie(){

    }

}
