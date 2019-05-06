package com.example.tam_u4_animacionnasica_gonzalezalondra;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
private ImageView imageView;
private Button animacion, rota,rotaa,rotaaa;
    private MediaPlayer reproductor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView=findViewById(R.id.tigree);
        rota=findViewById(R.id.rota);
        rotaa=findViewById(R.id.rotaa);
        rotaaa=findViewById(R.id.rotaaa);

    }
    public void onButtonClick(View v) {
        switch (v.getId()) {
            case (R.id.animacion):
                reproductor=MediaPlayer.create(this,R.raw.ruido);
                ///investigar animation
                Animation animation = AnimationUtils.loadAnimation(this, R.anim.grow);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {
                    }

                    @Override
                    //
                    public void onAnimationEnd(Animation animation) {

                        imageView.setScaleX(2);
                        imageView.setScaleY(2);

                        reproductor.start();
                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {
                    }
                });
                imageView.startAnimation(animation);
                break;

            case (R.id.rota):
                Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.rotate);
                animation2.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                imageView.startAnimation(animation2);
                break;
            case (R.id.rotaa):
                Animation animation3 = AnimationUtils.loadAnimation(this, R.anim.rebotar);
                animation3.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
                imageView.startAnimation(animation3);
                break;
        }

    }
}
