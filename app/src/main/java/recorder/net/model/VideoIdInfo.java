package recorder.net.model;

import java.io.Serializable;

/**
 * Created by rmss on 2015/11/19.
 */
public class VideoIdInfo implements Serializable{
    public String letvid;
    public String result;

    public  String getLetvId(){
        return  letvid;
    }
    public String getResult(){
        return  result;
    }

}
