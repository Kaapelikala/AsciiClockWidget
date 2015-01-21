package org.brometheus.asciiclockwidget;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Date;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Kalle on 21.1.2015.
 */
public class ClockWidgetProvider extends AppWidgetProvider {


    private static int hours=0;
    private static int minutes=0;
    private static int seconds=0;

    @Override
    public void onUpdate(Context c, AppWidgetManager manager, int[] ids){
    final int N=ids.length;
        for (int i=0;i<N;i++){
            int id=ids[i];
            updateWidget(c,manager,id);
        }

    }

    @Override
    public void onEnabled(Context c)
    {

    }

    @Override
    public void onDeleted(Context c, int[] ids)
    {

    }

    @Override
    public void onDisabled (Context c)
    {

    }

    private void updateWidget(Context c, AppWidgetManager manager, int id)
    {
        getTime();
    }

    private static String getTime()
    {

        String numbers[][]={
                {"..**",".**.","***.","..**","****",".***","****",".**.",".**.",".**."},
                {"...*","*..*","...*",".*.*","*...","*...","...*","*..*","*..*","*..*"},
                {"...*","..*.","****","****","***.","***.","..*.","****",".***","*..*"},
                {"...*",".*..","...*","...*","...*","*..*",".*..","*..*","...*","*..*"},
                {"...*","****","***.","...*","***.",".**.","*...",".**.",".**.",".**."}};

        String temp="";

        Calendar calendar = new GregorianCalendar();

        hours = calendar.get(Calendar.HOUR_OF_DAY);
        minutes=calendar.get(Calendar.MINUTE);
        String time=Integer.toString(hours)+Integer.toString(minutes);

        //5 rows per number
        for (int i=0;i<5;i++)
        {
            for (int i=0;)
        }



        return temp;

    }


}
