package source;

public class Dictionary {
    private String name;
    private String mot1;
    private String mot2;


   public  Dictionary(){
   }
    public void isEmpty(){ name = null;  }


    public String getName(){
        return "Example";
    }

    public void addTranslation(String francais, String anglais) {
       this.mot1=francais;
       this.mot2=anglais;
    }

    public String getTranslation(String contre) {
       return mot2;
    }
}
