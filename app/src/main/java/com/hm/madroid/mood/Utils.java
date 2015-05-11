package com.hm.madroid.mood;

import android.os.Environment;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created by madroid on 15-5-11.
 */
public class Utils {

    public static boolean haveSDCard(){

        return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED) ;
    }

    public static String getSDCardPath(){
        String path = "" ;
        if (haveSDCard()){
            path = Environment.getExternalStorageDirectory().getPath() ;
        }
        return path ;
    }

    public static String getDuration(long s){
        s = s / 1000 ;
        if (s > 60){
            if (s / 60 < 10){
                return  "0" + (int)s / 60 + ":" + (int) s % 60 ;
            }
            return  (int)s / 60 + ":" + (int) s % 60 ;
        }else {
            return "00:" + (int) s % 60 ;
        }
    }

    public static String getDate(Long timestamp){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyy-MM-dd") ;
        return simpleDateFormat.format(new Date(timestamp)) ;
    }

    public static String getAddress(){
        return "anHui hefei" ;
    }

    public static int getMood(){
        Random random = new Random() ;
        return random.nextInt(4)%(4-1+1) + 1 ;
    }

}
