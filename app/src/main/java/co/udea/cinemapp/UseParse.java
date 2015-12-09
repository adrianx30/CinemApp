package co.udea.cinemapp;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;
import com.parse.ParseObject;
import com.parse.ParseUser;

import dto.Pelicula;

/**
 * Created by Adrián on 08/12/2015.
 */
public class UseParse extends Application{
    @Override
    public void onCreate(){
        super.onCreate();

        ParseObject.registerSubclass(Pelicula.class);
        Parse.initialize(this, "WoE7haGV7azBQtHOYt0fp5ViS3R7ZzGAZwpj2gDo", "MKNPhSuTLdpg26vEcKjv1drTDaQ2vE7J61V84Y0I");
        ParseUser.enableAutomaticUser();
        ParseACL defauAcl = new ParseACL();

        defauAcl.setPublicReadAccess(true);
        ParseACL.setDefaultACL(defauAcl, true);


    }
}
