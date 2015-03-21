package vandyhacks.dios.hsphuc.healthystart.Models;

import org.json.JSONArray;

import java.util.Calendar;

/**
 * Created by paulrachwalski on 3/21/15.
 */
public class Alarm {

    public static final String ID_TAG = "id";
    public static final String TIME_TAG = "time";
    public static final String SET_TAG = "set";
    public static final String MSG_TAG = "msg";

    private int id;
    private Calendar time;
    private boolean isSet;
    private String message;

    private AlarmPersistanceCallback persistanceCallback;

    /**
     * Default alarm constructor
     *
     * @param time The time of the alarm
     * @param isSet Whether the alarm is set to go off
     */
    public Alarm(Calendar time, boolean isSet) {
        this.time = time;
        this.isSet = isSet;
        this.message = null;
    }

    /**
     * Sets the alarm's id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets the alarm's id
     *
     * @return The alarm's id
     */
    public int getId() {
        return this.id;
    }

    /**
     * Gets the alarm's time
     *
     * @return The Calendar object of the time
     */
    public Calendar getTime() {
        return this.time;
    }

    /**
     * Gets whether the alarm is set or not
     *
     * @return The boolean for whether it is set or not
     */
    public boolean isSet() {
        return this.isSet;
    }

    /**
     * Set the alarm's message
     *
     * @param message The new message for the alarm
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Gets the alarm's message
     *
     * @return The message as a string
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * Sets the alarm callback to the proper manager to be able to save to disk
     */
    public void setPersistanceCallback(AlarmPersistanceCallback callback) {
        this.persistanceCallback = callback;
    }

    /**
     * Calls the alarm manager's method to be able to save to disk
     */
    public void save() {
        persistanceCallback.save();
    }

    /**
     * Should return a JSON array of the relevant fields in the object in order to store on device
     *
     * @return The JSON array
     */
    public JSONArray toJson() {
        JSONArray alarmArray = new JSONArray();

        return alarmArray;
    }

    /**
     * Schedules the alarm with the phone
     */
    public void schedule() {
        int a = 1;
        return;
    }

    /**
     * Cancels the past alarm and schedules a new one
     */
    public void reschedule() {
        return;
    }

    /**
     * Cancels the alarm if it is set
     */
    public void unschedule() {
        return;
    }

}
