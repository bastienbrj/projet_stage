package testping;

public class confPing {
    
    // Stockage des variables
    private String ip; 
    private int intervalle;
    private String titre; 

    public confPing(String ip, int intervalle, String titre) {
        this.ip = ip;
        this.intervalle = intervalle;
        this.titre = titre;
    }

    public String getIp() {     // Retourne l'ip 
        return ip;
    }

  
    public int getIntervalle() {    // Retourne l'intervalle
        return intervalle;
    }

   
    public String getTitre() {      // Retourne le titre 
        return titre;
    }

    public void setIp(String ip) {  // Définit l'ip 
        this.ip = ip;
    }

    public void setIntervalle(int intervalle) {     // Définit l'intervalle
        this.intervalle = intervalle;
    }

    public void setTitre(String titre) {    // Définit le titre
        this.titre = titre;
    }
}

