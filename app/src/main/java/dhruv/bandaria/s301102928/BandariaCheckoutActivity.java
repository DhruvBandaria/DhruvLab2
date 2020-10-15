package dhruv.bandaria.s301102928;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

public class BandariaCheckoutActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    int temp;
    TextView tv;
    public static final String CHECKOUT_DATA="CheckOutData";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandaria_checkout);

        tv=findViewById(R.id.textView);
        sharedPreferences=getSharedPreferences(CHECKOUT_DATA,MODE_PRIVATE);
        temp=sharedPreferences.getInt("AP1",0);

        tv.setText("Data:"+temp);
    }
}