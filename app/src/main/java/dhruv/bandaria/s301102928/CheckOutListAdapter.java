package dhruv.bandaria.s301102928;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CheckOutListAdapter extends ArrayAdapter<CheckOutItems> {

    private Context applicationContext;
    private int applicationResource;
    SharedPreferences sharedPreferences;
    public static final String CHECKOUT_DATA="CheckOutData";
    public CheckOutListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<CheckOutItems> objects) {
        super(context, resource, objects);
        applicationContext=context;
        applicationResource=resource;
        sharedPreferences=applicationContext.getSharedPreferences(CHECKOUT_DATA,applicationContext.MODE_PRIVATE);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ImageView imageView=convertView.findViewById(R.id.imageViewCheckOut);
        TextView homeTitle=convertView.findViewById(R.id.homeTitleCheckOut);
        TextView homeAddress=convertView.findViewById(R.id.homeAddressCheckout);
        TextView homePrice=convertView.findViewById(R.id.homePriceCheckout);
        final CheckBox checkBox=convertView.findViewById(R.id.checkOutCheck);

        imageView.setImageResource(getItem(position).getImage());
        homeTitle.setText(getItem(position).homeTitle);
        homeAddress.setText(getItem(position).getHomeAddress());
        homePrice.setText(getItem(position).getHomePrice());

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                int temp=sharedPreferences.getInt("final_price",0);
                if(!checkBox.isChecked()) {
                    if (temp==0) {
                        editor.putInt("final_price", getItem(position).getHomePrice());
                        editor.commit();
                    } else {
                        if (temp==getItem(position).getHomePrice()) {
                            checkBox.setChecked(false);
                        }
                    }
                }
                else{
                    editor.remove("final_price");
                    editor.commit();
                }
            }
        });

        return convertView;
    }
}
