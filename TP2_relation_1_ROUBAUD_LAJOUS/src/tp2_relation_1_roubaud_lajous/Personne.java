/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_roubaud_lajous;

/**
 *
 * @author ROUBAUD Mathieu
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures = 0;
    Voiture [] liste_voitures = new Voiture[3];
    
    
    public Personne(String Nom, String Prenom) {
        nom = Nom;
        prenom = Prenom;
    }
    
    public boolean ajouter_voiture(Voiture voiture_a_ajouter){
        if(voiture_a_ajouter.proprietaire != null){
            return false;
        }else{
            if(nbVoitures > 2){
                return false;
            } else{
                liste_voitures[nbVoitures] = voiture_a_ajouter;
                nbVoitures += 1;
                voiture_a_ajouter.proprietaire = this;
                return true;
            }
        }
    }
    
    @Override 
    public String toString() {
        return (prenom+" "+nom);
    }
}
