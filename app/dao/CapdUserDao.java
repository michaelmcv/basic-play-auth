package dao;

import models.CapdUser;
import play.db.jpa.JPA;

public class CapdUserDao {

    public static CapdUser findById(Long id) {
        return JPA.em().find(CapdUser.class, id);
    }
}
