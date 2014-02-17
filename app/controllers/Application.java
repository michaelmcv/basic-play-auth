package controllers;

import dao.CapdUserDao;
import models.CapdUser;
import play.*;
import play.db.jpa.Transactional;
import play.mvc.*;

import views.html.*;

import java.util.List;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render());
    }

    @Transactional(readOnly=true)
    public static Result user(Long userId) {

        //JPA lookup into database
        CapdUser capdUser = CapdUserDao.findById(userId);

        return ok(user.render(capdUser));
    }

}
