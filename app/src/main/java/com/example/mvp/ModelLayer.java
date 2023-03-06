package com.example.mvp;

import java.util.ArrayList;
import java.util.List;

public class ModelLayer {
    public static List<Users> users(){
List<Users> users = new ArrayList<>();
users.add(new Users("MERAJ","MUSAVI"));
users.add(new Users("ALI","MUSAVI"));
users.add(new Users("AHMAD","MUSAVI"));
users.add(new Users("REZA","MUSAVI"));
users.add(new Users("HAMED","MUSAVI"));
users.add(new Users("KIMIA","MUSAVI"));
        return users;

    }
}
