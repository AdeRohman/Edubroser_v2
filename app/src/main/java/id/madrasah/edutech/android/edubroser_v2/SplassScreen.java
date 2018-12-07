package id.madrasah.edutech.android.edubroser_v2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.lang.annotation.Annotation;

public class SplassScreen extends AppCompatActivity {

    private ImageView logo;
    private Thread timer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splass_screen);

        logo = (ImageView)findViewById(R.id.logo);

        Annotation xss = (Annotation) AnimationUtils.loadAnimation(this, R.anim.mytransitor);
        logo.startAnimation((Animation) xss);

        final Intent i = new Intent(this,MainActivity.class);

        Thread timer=new Thread(){
            public void run(){
                try{
                    sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                finally {
                    startActivity(i);
                    finish();
                }
            }
        };
       timer.start();
    }
}
