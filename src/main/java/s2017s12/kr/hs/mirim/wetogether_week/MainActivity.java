package s2017s12.kr.hs.mirim.wetogether_week;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final LinearLayout layout1 = (LinearLayout) findViewById(R.id.linear_mon);
        final LinearLayout layout2 = (LinearLayout) findViewById(R.id.linear_tue);
        final LinearLayout layout3 = (LinearLayout) findViewById(R.id.linear_wed);
        final LinearLayout layout4 = (LinearLayout) findViewById(R.id.linear_thu);
        final LinearLayout layout5 = (LinearLayout) findViewById(R.id.linear_fri);
        final LinearLayout layout6 = (LinearLayout) findViewById(R.id.linear_sat);
        final LinearLayout layout7 = (LinearLayout) findViewById(R.id.linear_sun);

        Button btnMon = (Button) findViewById(R.id.mon_btn);
        Button btnTue = (Button) findViewById(R.id.tue_btn);
        Button btnWed = (Button) findViewById(R.id.wed_btn);
        Button btnThu = (Button) findViewById(R.id.thu_btn);
        Button btnFri = (Button) findViewById(R.id.fri_btn);
        Button btnSat = (Button) findViewById(R.id.sat_btn);
        Button btnSun = (Button) findViewById(R.id.sun_btn);
        Button btnGo = (Button)findViewById(R.id.go_btn);


        /////////////////////////////////////////////////////////////MONDAY
        final ArrayList<String> midList1 = new ArrayList<String>();
        ListView list = (ListView) findViewById(R.id.listView1);

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, midList1);
        list.setAdapter(adapter);

        final EditText editText1 = (EditText) findViewById(R.id.edit_mon1);
        final EditText editText2 = (EditText) findViewById(R.id.edit_mon2);
        final EditText editText3 = (EditText) findViewById(R.id.edit_mon3);
        Button btnAdd = (Button) findViewById(R.id.plus_btn);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String src = editText1.getText().toString() +"  "+editText2.getText().toString()+"  "+ editText3.getText().toString();
                midList1.add(src);


                adapter.notifyDataSetChanged();
                editText1.setText("");editText2.setText("");editText3.setText("");
            }
        });

        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                midList1.remove(position);
                adapter.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(), "삭제되었습니다.", Toast.LENGTH_LONG).show();
                return false;
            }
        });
        ////////////////////////////////////////////TuesDaY
        final ArrayList<String> midList2 = new ArrayList<String>();
        ListView list2 = (ListView) findViewById(R.id.listView2);

        final ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, midList2);
        list2.setAdapter(adapter2);

        final EditText editText4 = (EditText) findViewById(R.id.edit_tue1);
        final EditText editText5 = (EditText) findViewById(R.id.edit_tue2);
        final EditText editText6 = (EditText) findViewById(R.id.edit_tue3);
        Button btnAdd2 = (Button) findViewById(R.id.plus_btn2);

        btnAdd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String src = editText4.getText().toString() +"  "+editText5.getText().toString()+"  "+ editText6.getText().toString();
                midList2.add(src);


                adapter2.notifyDataSetChanged();
                editText4.setText("");editText5.setText("");editText6.setText("");
            }
        });

        list2.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                midList2.remove(position);
                adapter2.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(), "삭제되었습니다.", Toast.LENGTH_LONG).show();
                return false;
            }
        });
        ////////////////////////////////Wednsday
        final ArrayList<String> midList3 = new ArrayList<String>();
        ListView list3= (ListView) findViewById(R.id.listView3);

        final ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, midList3);
        list3.setAdapter(adapter3);

        final EditText editText7 = (EditText) findViewById(R.id.edit_wed1);
        final EditText editText8 = (EditText) findViewById(R.id.edit_wed2);
        final EditText editText9 = (EditText) findViewById(R.id.edit_wed3);
        Button btnAdd3 = (Button) findViewById(R.id.plus_btn3);

        btnAdd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String src = editText7.getText().toString() +"  "+editText8.getText().toString()+"  "+ editText9.getText().toString();
                midList3.add(src);


                adapter3.notifyDataSetChanged();
                editText7.setText("");editText8.setText("");editText9.setText("");
            }
        });

        list3.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                midList3.remove(position);
                adapter3.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(), "삭제되었습니다.", Toast.LENGTH_LONG).show();
                return false;
            }
        });
        ////////////////Thursday
        final ArrayList<String> midList4 = new ArrayList<String>();
        ListView list4= (ListView) findViewById(R.id.listView4);

        final ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, midList4);
        list4.setAdapter(adapter4);

        final EditText editText10 = (EditText) findViewById(R.id.edit_thu1);
        final EditText editText11= (EditText) findViewById(R.id.edit_thu2);
        final EditText editText12 = (EditText) findViewById(R.id.edit_thu3);
        Button btnAdd4 = (Button) findViewById(R.id.plus_btn4);

        btnAdd4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String src = editText10.getText().toString() +"  "+editText11.getText().toString()+"  "+ editText12.getText().toString();
                midList4.add(src);


                adapter4.notifyDataSetChanged();
                editText10.setText("");editText11.setText("");editText12.setText("");
            }
        });

        list4.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                midList4.remove(position);
                adapter4.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(), "삭제되었습니다.", Toast.LENGTH_LONG).show();
                return false;
            }
        });
///////////////////Friday
        final ArrayList<String> midList5 = new ArrayList<String>();
        ListView list5= (ListView) findViewById(R.id.listView5);

        final ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, midList5);
        list5.setAdapter(adapter5);

        final EditText editText13 = (EditText) findViewById(R.id.edit_fri1);
        final EditText editText14= (EditText) findViewById(R.id.edit_fri2);
        final EditText editText15 = (EditText) findViewById(R.id.edit_fri3);
        Button btnAdd5 = (Button) findViewById(R.id.plus_btn5);

        btnAdd5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String src = editText13.getText().toString() +"  "+editText14.getText().toString()+"  "+ editText15.getText().toString();
                midList5.add(src);
                adapter5.notifyDataSetChanged();
                editText13.setText("");editText14.setText("");editText15.setText("");
            }
        });

        list5.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                midList5.remove(position);
                adapter5.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(), "삭제되었습니다.", Toast.LENGTH_LONG).show();
                return false;
            }
        });
        //////////////////Saterday
        final ArrayList<String> midList6 = new ArrayList<String>();
        ListView list6= (ListView) findViewById(R.id.listView6);

        final ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, midList6);
        list6.setAdapter(adapter6);

        final EditText editText16 = (EditText) findViewById(R.id.edit_sat1);
        final EditText editText17= (EditText) findViewById(R.id.edit_sat2);
        final EditText editText18 = (EditText) findViewById(R.id.edit_sat3);
        Button btnAdd6 = (Button) findViewById(R.id.plus_btn6);

        btnAdd6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String src = editText16.getText().toString() +"  "+editText17.getText().toString()+"  "+ editText18.getText().toString();
                midList6.add(src);


                adapter6.notifyDataSetChanged();
                editText16.setText("");editText17.setText("");editText18.setText("");
            }
        });

        list6.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                midList6.remove(position);
                adapter6.notifyDataSetChanged();
                Toast.makeText(getApplicationContext(), "삭제되었습니다.", Toast.LENGTH_LONG).show();
                return false;
            }
        });
        ///////////////////////SUnday
        final ArrayList<String> midList7 = new ArrayList<String>();
        ListView list7= (ListView) findViewById(R.id.listView7);

        final ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, midList7);
        list6.setAdapter(adapter7);

        final EditText editText19 = (EditText) findViewById(R.id.edit_sun1);
        final EditText editText20= (EditText) findViewById(R.id.edit_sun2);
        final EditText editText21 = (EditText) findViewById(R.id.edit_sun3);
        Button btnAdd7 = (Button) findViewById(R.id.plus_btn7);

        btnAdd7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String src = editText19.getText().toString() +"  "+editText20.getText().toString()+"  "+ editText21.getText().toString();
                midList7.add(src);
                adapter7.notifyDataSetChanged();
                editText19.setText("");editText20.setText("");editText21.setText("");
            }
        });

        list7.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                midList7.remove(position);
                Toast.makeText(getApplicationContext(), "삭제되었습니다.", Toast.LENGTH_LONG).show();
                adapter7.notifyDataSetChanged();
                return false;
            }
        });


        btnMon.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                layout1.setVisibility(View.VISIBLE);
                layout2.setVisibility(View.INVISIBLE);
                layout3.setVisibility(View.INVISIBLE);
                layout4.setVisibility(View.INVISIBLE);
                layout5.setVisibility(View.INVISIBLE);
                layout6.setVisibility(View.INVISIBLE);
                layout7.setVisibility(View.INVISIBLE);
            }
        });
        btnTue.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                layout1.setVisibility(View.INVISIBLE);
                layout2.setVisibility(View.VISIBLE);
                layout3.setVisibility(View.INVISIBLE);
                layout4.setVisibility(View.INVISIBLE);
                layout5.setVisibility(View.INVISIBLE);
                layout6.setVisibility(View.INVISIBLE);
                layout7.setVisibility(View.INVISIBLE);
            }
        });
        btnWed.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                layout1.setVisibility(View.INVISIBLE);
                layout2.setVisibility(View.INVISIBLE);
                layout3.setVisibility(View.VISIBLE);
                layout4.setVisibility(View.INVISIBLE);
                layout5.setVisibility(View.INVISIBLE);
                layout6.setVisibility(View.INVISIBLE);
                layout7.setVisibility(View.INVISIBLE);
            }
        });
        btnThu.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                layout1.setVisibility(View.INVISIBLE);
                layout2.setVisibility(View.INVISIBLE);
                layout3.setVisibility(View.INVISIBLE);
                layout4.setVisibility(View.VISIBLE);
                layout5.setVisibility(View.INVISIBLE);
                layout6.setVisibility(View.INVISIBLE);
                layout7.setVisibility(View.INVISIBLE);
            }
        });
        btnFri.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                layout1.setVisibility(View.INVISIBLE);
                layout2.setVisibility(View.INVISIBLE);
                layout3.setVisibility(View.INVISIBLE);
                layout4.setVisibility(View.INVISIBLE);
                layout5.setVisibility(View.VISIBLE);
                layout6.setVisibility(View.INVISIBLE);
                layout7.setVisibility(View.INVISIBLE);
            }
        });
        btnSat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                layout1.setVisibility(View.INVISIBLE);
                layout2.setVisibility(View.INVISIBLE);
                layout3.setVisibility(View.INVISIBLE);
                layout4.setVisibility(View.INVISIBLE);
                layout5.setVisibility(View.INVISIBLE);
                layout6.setVisibility(View.VISIBLE);
                layout7.setVisibility(View.INVISIBLE);
            }
        });
        btnSun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout1.setVisibility(View.INVISIBLE);
                layout2.setVisibility(View.INVISIBLE);
                layout3.setVisibility(View.INVISIBLE);
                layout4.setVisibility(View.INVISIBLE);
                layout5.setVisibility(View.INVISIBLE);
                layout6.setVisibility(View.INVISIBLE);
                layout7.setVisibility(View. VISIBLE);
            }
        });

        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,CalendarActivity.class);
                startActivity(intent);
            }
        });

    }////////////////////////
}