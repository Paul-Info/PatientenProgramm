

public class PatientenWarteschlange {
    private int n;
    private Patient[] patienten;
    
    public PatientenWarteschlange(int n){
        n=0;
        patienten = new Patient [9];
    }
    public void anmelden(){
         Patient patient1 = null;
    if (n < patienten.length)
    {
        patienten[n] = patient1;
        n=n+1;
        
    }
    
}
public Patient abmelden(){
    Patient ergebnis = null;
    if (n>0){
        ergebnis = patienten[0];
        n=n-1;

        for (int i=0; i>n;i++)
        {
            patienten[i]=patienten[i++];
        }
       
    
    patienten[n]=null;

}
else {
    System.out.println ("Fehler, keine Patienten in der Warteschlange");

}
    return ergebnis;

}
  public int size(){
        return n;
    }
        public boolean isEmpty(){
            return n == 0;
    }
}
