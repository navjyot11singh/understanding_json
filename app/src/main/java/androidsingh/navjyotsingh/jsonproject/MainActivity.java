package androidsingh.navjyotsingh.jsonproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson=new Gson();
//        Student student=new Student("Navjyot",5,"h@gmail");
//
//        String json = gson.toJson(student);

//        String json = "{\"course_count\":5,\"email\":\"h@gmail\",\"name\":\"Navjyot\"}";
//        Student student = gson.fromJson(json,Student.class);
//
//
//        Log.d("Test", student.toString());

        List<Video> videos=new ArrayList<>();
        videos.add(new Video("intro",5));
        videos.add(new Video("Exerxise Files",8));
        videos.add(new Video("Instalation",12));

//        Course course = new Course("Java","Bootcamp");
//        Student student=new Student("Navjyot",3,"navjyot.in",course,videos);
//        String json=gson.toJson(student);

//        String json="{\"course_count\":3,\"email\":\"navjyot.in\",\"course\":{\"description\":\"Bootcamp\",\"name\":\"Java\"},\"name\":\"Navjyot\"}";
//        Student student = gson.fromJson(json,Student.class);

        String json="{\"course_count\":3,\"email\":\"navjyot.in\",\"course\":{\"description\":\"Bootcamp\",\"name\":\"Java\"},\"video\":[{\"duration\":5,\"name\":\"intro\"},{\"duration\":8,\"name\":\"Exerxise Files\"},{\"duration\":12,\"name\":\"Instalation\"}],\"name\":\"Navjyot\"}";
        Student student=gson.fromJson(json,Student.class);
       Log.d("Test",student.toString());
//       Log.d("Test",json);

    }
}
