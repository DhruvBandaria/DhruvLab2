package dhruv.bandaria.s301102928;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class BandariaCheckoutActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    ArrayList<CheckOutItems> arrayList;
    CheckOutListAdapter adapter;
    int temp;
    ListView listView;
    public static final String CHECKOUT_DATA="CheckOutData";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandaria_checkout);
        CheckOutItems[] checkOutItems=new CheckOutItems[20];
        checkOutItems[0]=new CheckOutItems(R.drawable.app_1,R.string.app1_description,R.string.app1_address,R.string.app1_price,1);
        checkOutItems[1]=new CheckOutItems(R.drawable.app_2,R.string.app2_description,R.string.app2_address,R.string.app2_price,2);
        checkOutItems[2]=new CheckOutItems(R.drawable.app_3,R.string.app3_description,R.string.app3_address,R.string.app3_price,3);
        checkOutItems[3]=new CheckOutItems(R.drawable.app_4,R.string.app4_description,R.string.app4_address,R.string.app4_price,4);
        checkOutItems[4]=new CheckOutItems(R.drawable.detch_1,R.string.detch1_description,R.string.detch1_address,R.string.detch1_price,5);
        checkOutItems[5]=new CheckOutItems(R.drawable.smdt_4,R.string.detch2_description,R.string.detch2_address,R.string.detch2_price,6);
        checkOutItems[6]=new CheckOutItems(R.drawable.detch_3,R.string.detch3_description,R.string.detch3_address,R.string.detch3_price,7);
        checkOutItems[7]=new CheckOutItems(R.drawable.detch_4,R.string.detch4_description,R.string.detch4_address,R.string.detch4_price,8);
        checkOutItems[8]=new CheckOutItems(R.drawable.smdt_1,R.string.smdt1_description,R.string.smdt1_address,R.string.smdt1_price,9);
        checkOutItems[9]=new CheckOutItems(R.drawable.smdt_2,R.string.smdt2_description,R.string.smdt2_address,R.string.smdt2_price,10);
        checkOutItems[10]=new CheckOutItems(R.drawable.smdt_3,R.string.smdt3_description,R.string.smdt3_address,R.string.smdt3_price,11);
        checkOutItems[11]=new CheckOutItems(R.drawable.smdt_4,R.string.smdt4_description,R.string.smdt4_address,R.string.smdt4_price,12);
        checkOutItems[12]=new CheckOutItems(R.drawable.condo_1,R.string.condo1_description,R.string.condo1_address,R.string.condo1_price,13);
        checkOutItems[13]=new CheckOutItems(R.drawable.condo_2,R.string.condo2_description,R.string.condo2_address,R.string.condo2_price,14);
        checkOutItems[14]=new CheckOutItems(R.drawable.condo_3,R.string.condo3_description,R.string.condo3_address,R.string.condo3_price,15);
        checkOutItems[15]=new CheckOutItems(R.drawable.condo_4,R.string.condo4_description,R.string.condo4_address,R.string.condo4_price,16);
        checkOutItems[16]=new CheckOutItems(R.drawable.town_1,R.string.town1_description,R.string.town1_address,R.string.town1_price,17);
        checkOutItems[17]=new CheckOutItems(R.drawable.town_2,R.string.town2_description,R.string.town2_address,R.string.town2_price,18);
        checkOutItems[18]=new CheckOutItems(R.drawable.town_3,R.string.town3_description,R.string.town3_address,R.string.town3_price,19);
        checkOutItems[19]=new CheckOutItems(R.drawable.town_4,R.string.town4_description,R.string.town4_address,R.string.town4_price,20);

        sharedPreferences=getSharedPreferences(CHECKOUT_DATA,MODE_PRIVATE);
        for(int i=1;i<=20;i++){
            temp=sharedPreferences.getInt(String.valueOf(i),0);
            if(temp!=0){
                arrayList.add(checkOutItems[i-1]);
            }
        }
        listView=findViewById(R.id.checkOutListView);
        adapter=new CheckOutListAdapter(this,R.layout.checkout_menu,arrayList);
        listView.setAdapter(adapter);
    }
}