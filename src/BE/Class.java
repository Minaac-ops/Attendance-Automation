package BE;

import java.time.LocalDateTime;

public class Class {

    private int classID;
    private String name;
    private String schedule;

    public Class(int classID, String name, String schedule){
        this.classID = classID;
        this.name = name;
        this.schedule = schedule;
    }

    public int getClassID(){
        return classID;
    }

    public String getName(){
        return name;
    }

    public String getSchedule(){
        return schedule;
    }

}
