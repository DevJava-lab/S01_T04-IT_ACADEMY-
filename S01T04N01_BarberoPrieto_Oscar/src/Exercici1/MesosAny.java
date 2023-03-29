package Exercici1;
import java.util.ArrayList;
import java.util.List;

public class MesosAny {
    private List<String> mesos;

    public MesosAny() {
    	
        mesos = new ArrayList<String>();
        
        mesos.add("Gener");
        mesos.add("Febrer");
        mesos.add("Març");
        mesos.add("Abril");
        mesos.add("Maig");
        mesos.add("Juny");
        mesos.add("Juliol");
        mesos.add("Agost");
        mesos.add("Setembre");
        mesos.add("Octubre");
        mesos.add("Novembre");
        mesos.add("Desembre");

    }

    public List<String> getMesos() {
    	
        return mesos;
        
    }
}
