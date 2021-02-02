package com.library.pocketanims;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import java.time.Duration;

public class PocketAnims {

    public static void blink(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.blink);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }

    public static void bounce(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.bounce);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }

    public static void fade_scale(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.fade_scale);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }

    public static void fadein(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.fadein);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }

    public static void fadeout(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.fadeout);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }

    public static void move_up_down(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.move_up_down);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }

    public static void nullanim(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.nullanim);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }

    public static void rotate(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.rotate);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }

    public static void slide_down(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.slide_down);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }
    public static void slide_in_left(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.slide_in_left);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }

    public static void slide_in_right(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.slide_in_right);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }

    public static void slide_out_left(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.slide_out_left);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }

    public static void slide_out_right(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.slide_out_right);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }

    public static void slide_up(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.slide_up);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }

    public static void zoom_in_out_infinity(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.zoom_in_out_infinity);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }

    public static void zoomin(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.zoomin);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }

    public static void zoomout(Context context, long duration, View view){

        Animation aniFade = AnimationUtils.loadAnimation(context,R.anim.zoomout);
        aniFade.setDuration(duration);
        view.startAnimation(aniFade);
    }

}
