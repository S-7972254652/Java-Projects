package models;

import java.sql.*;
import java.io.*;
import java.util.*;

public class UserProfile{
    private Integer profileId;
    private String imagePath;

    public static void closeConnection(Connection con){
		try{
			con.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}


    public void setProfileId(Integer profileId){
        this.profileId = profileId;
    }

    public void setImagePath(String imagePath){
        this.imagePath = imagePath;
    }

    public Integer getProfileId(){
        return profileId;
    }

    public String getImagePath(){
        return imagePath;
    }

    public static void setUserImage(String imagePath){

    }
}