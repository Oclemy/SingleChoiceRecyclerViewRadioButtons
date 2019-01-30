package info.camposha.singlechoicerecyclerview_vela;

import java.io.Serializable;

/**
 * Please take note that our data object will implement Serializable.This
 * will allow us to pass this serialized object to DetailsActivity,
 */
public class Galaxy implements Serializable{
    private String name,description;
    private int image;

    public Galaxy(String name, String description,int image) {
        this.name = name;
        this.description = description;
        this.image=image;
    }

    public String getName() {return name;}
    public String getDescription() {return description;}
    public int getImage() {return image;}

}
