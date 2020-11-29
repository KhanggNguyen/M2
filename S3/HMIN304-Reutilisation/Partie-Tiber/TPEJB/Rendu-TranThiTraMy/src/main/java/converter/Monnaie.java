package converter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Monnaie implements Serializable {
    public List<String> pays = new ArrayList<String>();
    private String nom;
    private String code;
    private float taux;

    public Monnaie(){
        this.nom = "";
        this.code = "";
        this.taux = -1;
    }

    public Monnaie(List<String> listePays, String name, String code, Float taux){
        this.pays = listePays;
        this.nom = name;
        this.code = code;
        this.taux = taux;
    }

    public String getNom(){ return this.nom; }

    public void setNom(String nom){ this.nom = nom; }

    public String getCode(){ return this.code; }

    public void setCode(String code){ this.code = code; }

    public float getTaux(){ return this.taux; }

    public void setTaux(Float taux){ this.taux = taux; }
}
