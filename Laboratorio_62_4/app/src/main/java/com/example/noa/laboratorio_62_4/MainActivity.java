package com.example.noa.laboratorio_62_4;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView animationTarget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        animationTarget = (ImageView) this.findViewById(R.id.imageViewAndroid);
    }

    public void rota (View v){
        ///*
        Animator animation = AnimatorInflater.loadAnimator
                (this, R.anim.rotate_around_center_point);
        animation.setTarget(animationTarget);
        animation.start();
        //*/
        /*Descomentar para ver la ejecución manual del código Item Actividad 4, Pregunta 4*/
        /*
        ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat
                (animationTarget, "rotation", 360f);
        scaleXAnimator.setRepeatCount(0);
        scaleXAnimator.setDuration(1000);
        scaleXAnimator.start();
        */
    }

    public void escala (View v){
        ///*
        Animator animation = AnimatorInflater.loadAnimator
                (this, R.anim.escala);
        animation.setTarget(animationTarget);
        animation.start();
        ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat
                (animationTarget, "scaleX", 0.5f);
        scaleXAnimator.setRepeatMode(ValueAnimator.REVERSE);
        scaleXAnimator.setRepeatCount(1);
        scaleXAnimator.setDuration(1000);
        scaleXAnimator.start();
        //*/
        /*Descomentar para ver la ejecución manual del código Item Actividad 4, Pregunta 4*/
        /*
        ObjectAnimator scaleXAnimator = ObjectAnimator.ofFloat
                (animationTarget, "scaleX", 0.5f);
        scaleXAnimator.setRepeatMode(ValueAnimator.REVERSE);
        scaleXAnimator.setRepeatCount(1);
        scaleXAnimator.setDuration(1000);
        scaleXAnimator.start();
        */
    }

}

































