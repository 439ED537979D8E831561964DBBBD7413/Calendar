package in.co.ashclan.calender;

import android.graphics.Color;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Calendar;
import java.util.GregorianCalendar;
import in.co.ashclan.ashclanzcalendar.widget.CollapsibleCalendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setElevation(0);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.google_red));
        }

        CollapsibleCalendar collapsibleCalendar = findViewById(R.id.collapsibleCalendarView);
        Calendar today=new GregorianCalendar();
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.GREEN);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.GRAY);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.MAGENTA);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLACK);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.GREEN);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);
        today.add(Calendar.DATE,1);
        collapsibleCalendar.addEventTag(today.get(Calendar.YEAR),today.get(Calendar.MONTH),today.get(Calendar.DAY_OF_MONTH), Color.BLUE);

        System.out.println("Testing date "+collapsibleCalendar.getSelectedDay().getDay()+"/"+collapsibleCalendar.getSelectedDay().getMonth()+"/"+collapsibleCalendar.getSelectedDay().getYear());

        collapsibleCalendar.setCalendarListener(new CollapsibleCalendar.CalendarListener() {
            @Override
            public void onDaySelect() {

            }

            @Override
            public void onItemClick(View v) {

            }

            @Override
            public void onDataUpdate() {

            }

            @Override
            public void onMonthChange() {

            }

            @Override
            public void onWeekChange(int position) {

            }
        });


    }
}
