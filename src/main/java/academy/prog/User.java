package academy.prog;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class User {
    private String userName;
    private boolean active;

    public User(String userName, boolean active) {
        this.userName = userName;
        this.active = active;
    }

    public String toJSON() {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        return gson.toJson(this);
    }

    public static User fromJSON(String s) {
        Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
        return gson.fromJson(s, User.class);
    }

    @Override
    public String toString() {
        return new StringBuilder().append("[").append(" userName: ").append(userName).append(", active: ").append(active).append("] ").toString();
    }
}
