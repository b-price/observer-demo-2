import java.util.ArrayList;

public class SensorSystem {
    private ArrayList<AlarmListener> listeners;

    public SensorSystem(){
        listeners = new ArrayList<AlarmListener>();
    }

    void register(AlarmListener alarmListener){
        listeners.add(alarmListener);
    }

    void soundTheAlarm(){
        for(AlarmListener listener: listeners){
            listener.alarm();
        }
    }
}
