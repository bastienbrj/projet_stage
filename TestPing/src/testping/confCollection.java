package testping;

import java.util.ArrayList;


public class confCollection {
    
    ArrayList<confPing> confCollection = new ArrayList(); 
    
    static int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    public void confPing (confPing[] confCollection) {
        this.confCollection = new ArrayList<confPing>();    // à revoir
                
    }
    
    public void add (confPing[] configToAdd) throws Exception {      // throw error exception si config existe déjà
        for (testping.confPing confPing : confCollection) {
            if (confPing.ip == configToAdd.ip){
                throw new Exception("Cette configuration de ping existe déjà");               
            }
        }
    }
    
    public void remove() {        
        ip.remove();
    }
}
    
