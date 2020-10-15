package dhruv.bandaria.s301102928;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<ListItems> {

    private Context applicationContext;
    private int applicationResource;

    public CustomListAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ListItems> objects) {
        super(context, resource, objects);

        applicationContext=context;
        applicationResource=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = LayoutInflater.from(applicationContext);

        convertView = layoutInflater.inflate(applicationResource,parent,false);

        ImageView imageView=convertView.findViewById(R.id.imageView);
        TextView homeTitle=convertView.findViewById(R.id.homeTitle);
        TextView homeAddress=convertView.findViewById(R.id.homeAddress);
        TextView homePrice=convertView.findViewById(R.id.homePrice);

        imageView.setImageResource(getItem(position).getImage());
        homeTitle.setText(getItem(position).homeTitle);
        homeAddress.setText(getItem(position).getHomeAddress());
        homePrice.setText(getItem(position).getHomePrice());


        return convertView;
    }
}
