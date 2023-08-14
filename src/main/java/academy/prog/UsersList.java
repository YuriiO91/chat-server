package academy.prog;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class UsersList {
    private static final UsersList usrList = new UsersList();
    private final List<User> list = new ArrayList<>();
    private final Gson gson;

    public static UsersList getInstance() {return  usrList;}

    private UsersList() {
        gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
    }

    public synchronized void add(User user) {
        list.add(user);
    }

    public synchronized void remove(User user) {list.remove(user);}

    public synchronized String toJSON(int n) {
        if (n >= list.size()) return null;
        return gson.toJson(new JsonUsers(list, n));
    }



}
