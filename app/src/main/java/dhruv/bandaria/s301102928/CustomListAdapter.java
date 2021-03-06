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

public class CustomListAdapter extends ArrayAdapter<ListItems> {

    private Context applicationContext;
    private int applicationResource;
    SharedPreferences sharedPreferences;
    public static final String CHECKOUT_DATA="CheckOutData";

    public CustomListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ListItems> objects) {
        super(context, resource, objects);

        applicationContext=context;
        applicationResource=resource;
        sharedPreferences=applicationContext.getSharedPreferences(CHECKOUT_DATA,applicationContext.MODE_PRIVATE);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(applicationContext);

        convertView = layoutInflater.inflate(applicationResource,parent,false);

        ImageView imageView=convertView.findViewById(R.id.imageView);
        TextView homeTitle=convertView.findViewById(R.id.homeTitle);
        TextView homeAddress=convertView.findViewById(R.id.homeAddress);
        TextView homePrice=convertView.findViewById(R.id.homePrice);
        final CheckBox checkBox=convertView.findViewById(R.id.homeCheck);

        imageView.setImageResource(getItem(position).getImage());
        homeTitle.setText(getItem(position).homeTitle);
        homeAddress.setText(getItem(position).getHomeAddress());
        homePrice.setText(getItem(position).getHomePrice());
        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor=sharedPreferences.edit();
                int id=getItem(position).getId();
                String key=Integer.toString(id);
                if(checkBox.isChecked()){
                    editor.putInt(key,id);
                    editor.commit();
                }
                else{
                    editor.remove(key);
                    editor.commit();
                }
            }
        });


        return convertView;
    }
}
