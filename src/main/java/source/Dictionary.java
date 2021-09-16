package source;

import java.util.Map;

public class Dictionary {
    private String name;
    private String mot1;
    private String mot2;


   public  Dictionary(String name){
   }
    public void isEmpty(){ name = null;  }


    public String getName(){
        return "Example";
    }

    public Map<String,String> translation;

    public void addTranslation(String francais, String anglais) {
       this.mot1=francais;
       this.mot2=anglais;
    }

    public String getTranslation(String contre) {
       return mot2;
    }
}
