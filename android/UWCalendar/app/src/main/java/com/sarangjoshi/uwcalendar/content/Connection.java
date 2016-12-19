package com.sarangjoshi.uwcalendar.content;

import com.sarangjoshi.uwcalendar.data.FirebaseData;

/**
 * Representative of a connection between this user and another user.
 */
public class Connection {
    public String id;
    public FirebaseData.UsernameAndId with;

    public Connection(String id, FirebaseData.UsernameAndId with) {
        this.id = id;
        this.with = with;
    }
}