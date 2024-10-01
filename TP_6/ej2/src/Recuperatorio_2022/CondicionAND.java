package Recuperatorio_2022;

public class CondicionAND implements Condicion{
    private Condicion condicion1;
    private Condicion condicion2;

    
    public CondicionAND(Condicion condicion1, Condicion condicion2) {
        this.condicion1 = condicion1;
        this.condicion2 = condicion2;
    }


    @Override
    public boolean cumple(AUTOPARTE autoparte) {
        return condicion1.cumple(autoparte) && condicion2.cumple(autoparte);
    }

    

    
}