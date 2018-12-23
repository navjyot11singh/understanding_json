package androidsingh.navjyotsingh.jsonproject;

import com.google.gson.annotations.SerializedName;

import java.lang.ref.SoftReference;

public class Course {
    @SerializedName("name")
    private String mName;
    @SerializedName("description")
    private String mDescription;

    public Course(String mName, String mDescription) {
        this.mName = mName;
        this.mDescription = mDescription;
    }
}
