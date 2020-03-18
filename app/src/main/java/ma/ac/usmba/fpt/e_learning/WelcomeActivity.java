package ma.ac.usmba.fpt.e_learning;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

import java.net.URI;

public class WelcomeActivity extends AppCompatActivity {
    VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        videoView = (VideoView) findViewById(R.id.welcome_video);
        String videopath =  "android.resource://"+getPackageName()+"/"+R.raw.welcome_video;
        videoView.setVideoPath(videopath);
        videoView.start();
    }
}
