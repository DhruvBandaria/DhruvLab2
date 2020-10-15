package dhruv.bandaria.s301102928;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class BandariaHomeTypesActivity extends AppCompatActivity {

    ListView listView;
    TextView textView;
    SharedPreferences sharedPreferences;
    ArrayList<ListItems> arrayList;
    CustomListAdapter listAdapter;
    int currentType=1;
    public static final String CHECKOUT_DATA="CheckOutData";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandaria_home_types);

        sharedPreferences=getSharedPreferences(CHECKOUT_DATA,MODE_PRIVATE);

        textView=findViewById(R.id.textView2);
        listView=findViewById(R.id.listView);

        arrayList = new ArrayList<>();
        arrayList.add(new ListItems(R.drawable.app_1,R.string.app1_description,R.string.app1_address,R.string.app1_price,1));
        arrayList.add(new ListItems(R.drawable.app_2,R.string.app2_description,R.string.app2_address,R.string.app2_price,2));
        arrayList.add(new ListItems(R.drawable.app_3,R.string.app3_description,R.string.app3_address,R.string.app3_price,3));
        arrayList.add(new ListItems(R.drawable.app_4,R.string.app4_description,R.string.app4_address,R.string.app4_price,4));
        listAdapter = new CustomListAdapter(this,R.layout.list_menu,arrayList);
        listView.setAdapter(listAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.bandaria_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                setHomeTypeOne();
                break;
            case R.id.item2:
                setHomeTypeTwo();
                break;
            case R.id.item3:
                setHomeTypeThree();
                break;
            case R.id.item4:
                setHomeTypeFour();
                break;
            case R.id.item5:
                setHomeTypeFive();
                break;
            case R.id.checkout:
                startActivity(new Intent(getApplicationContext(),BandariaCheckoutActivity.class));
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setHomeTypeOne(){
        textView.setText(R.string.hometype_1);
        currentType=1;
        arrayList.add(new ListItems(R.drawable.app_1,R.string.app1_description,R.string.app1_address,R.string.app1_price,1));
        arrayList.add(new ListItems(R.drawable.app_2,R.string.app2_description,R.string.app2_address,R.string.app2_price,2));
        arrayList.add(new ListItems(R.drawable.app_3,R.string.app3_description,R.string.app3_address,R.string.app3_price,3));
        arrayList.add(new ListItems(R.drawable.app_4,R.string.app4_description,R.string.app4_address,R.string.app4_price,4));
        removeAll();
        listAdapter.notifyDataSetChanged();
    }
    private void setHomeTypeTwo(){
        textView.setText(R.string.hometype_2);
        currentType=2;

        arrayList.add(new ListItems(R.drawable.detch_1,R.string.detch1_description,R.string.detch1_address,R.string.detch1_price,5));
        arrayList.add(new ListItems(R.drawable.smdt_4,R.string.detch2_description,R.string.detch2_address,R.string.detch2_price,6));
        arrayList.add(new ListItems(R.drawable.detch_3,R.string.detch3_description,R.string.detch3_address,R.string.detch3_price,7));
        arrayList.add(new ListItems(R.drawable.detch_4,R.string.detch4_description,R.string.detch4_address,R.string.detch4_price,8));
        removeAll();
        listAdapter.notifyDataSetChanged();
    }
    private void setHomeTypeThree(){
        textView.setText(R.string.hometype_3);
        currentType=3;

        arrayList= new ArrayList<>();
        arrayList.add(new ListItems(R.drawable.smdt_1,R.string.smdt1_description,R.string.smdt1_address,R.string.smdt1_price,9));
        arrayList.add(new ListItems(R.drawable.smdt_2,R.string.smdt2_description,R.string.smdt2_address,R.string.smdt2_price,10));
        arrayList.add(new ListItems(R.drawable.smdt_3,R.string.smdt3_description,R.string.smdt3_address,R.string.smdt3_price,11));
        arrayList.add(new ListItems(R.drawable.smdt_4,R.string.smdt4_description,R.string.smdt4_address,R.string.smdt4_price,12));

        listAdapter = new CustomListAdapter(this,R.layout.list_menu,arrayList);
        listView.setAdapter(listAdapter);
    }
    private void setHomeTypeFour(){
        textView.setText(R.string.hometype_4);
        currentType=4;

        arrayList.add(new ListItems(R.drawable.condo_1,R.string.condo1_description,R.string.condo1_address,R.string.condo1_price,13));
        arrayList.add(new ListItems(R.drawable.condo_2,R.string.condo2_description,R.string.condo2_address,R.string.condo2_price,14));
        arrayList.add(new ListItems(R.drawable.condo_3,R.string.condo3_description,R.string.condo3_address,R.string.condo3_price,15));
        arrayList.add(new ListItems(R.drawable.condo_4,R.string.condo4_description,R.string.condo4_address,R.string.condo4_price,16));
        removeAll();
        listAdapter.notifyDataSetChanged();
    }
    private void setHomeTypeFive(){
        textView.setText(R.string.hometype_5);
        currentType=5;

        arrayList.add(new ListItems(R.drawable.town_1,R.string.town1_description,R.string.town1_address,R.string.town1_price,17));
        arrayList.add(new ListItems(R.drawable.town_2,R.string.town2_description,R.string.town2_address,R.string.town2_price,18));
        arrayList.add(new ListItems(R.drawable.town_3,R.string.town3_description,R.string.town3_address,R.string.town3_price,19));
        arrayList.add(new ListItems(R.drawable.town_4,R.string.town4_description,R.string.town4_address,R.string.town4_price,20));
        removeAll();
        listAdapter.notifyDataSetChanged();
    }

    private void removeAll(){
        arrayList.remove(0);
        arrayList.remove(0);
        arrayList.remove(0);
        arrayList.remove(0);
    }

}