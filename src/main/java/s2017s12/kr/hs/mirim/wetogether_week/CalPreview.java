package s2017s12.kr.hs.mirim.wetogether_week;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class CalPreview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal_preview);

        Intent intent = getIntent();

        int date = intent.getExtras().getInt("date");

        TextView textDay = (TextView)new TextView(this);
        textDay.setText("2018년 10월 "+date+"일");
        textDay.setTextSize(19);
        setContentView(textDay);



    }
}
