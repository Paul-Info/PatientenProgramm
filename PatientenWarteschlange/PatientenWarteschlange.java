public class PatientenWarteschlange {
    private final int N;
    private int n;
    private Patient[] patienten;
    
    public PatientenWarteschlange(int N){
        this.N = N;
        patienten = new Patient [n];
        int n = 1;
        
    }
    public void anmelden(){
   Patient patient1 = null;
    if (n < N)
    {

        n=n+1;
        
    }
    else {
        System.out.println ("Fehler, Warteschlange ist voll!");
    }
    
}
public void abmelden(){

    if (n>0){
        n = n-1;
       
    

}
else {
    System.out.println ("Fehler, keine Patienten in der Warteschlange");

}

   

}
  public int AnzahlPatienten(){
        return n;
        
    }
        public boolean isEmpty(){
            return n == 0;
    }
}