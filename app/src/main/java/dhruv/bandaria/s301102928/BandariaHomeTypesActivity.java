package dhruv.bandaria.s301102928;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class BandariaHomeTypesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandaria_home_types);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.bandaria_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        BandariaAppartmentFragment frag1 = new BandariaAppartmentFragment();
        BandariaDetachedHome frag2=new BandariaDetachedHome();
        BandariaSemiDetachedFragment frag3=new BandariaSemiDetachedFragment();
        BandariaCondominiumFragment frag4 = new BandariaCondominiumFragment();
        BandariaTownHouse frag5 = new BandariaTownHouse();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction;
        switch (item.getItemId()){
            case R.id.item1:
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainer,frag1,"Demo Fragment");
                fragmentTransaction.commit();
                break;
            case R.id.item2:
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainer,frag2,"Demo Fragment");
                fragmentTransaction.commit();
                break;
            case R.id.item3:
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainer,frag3,"Demo Fragment");
                fragmentTransaction.commit();
                break;
            case R.id.item4:
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainer,frag4,"Demo Fragment");
                fragmentTransaction.commit();
                break;
            case R.id.item5:
                fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainer,frag5,"Demo Fragment");
                fragmentTransaction.commit();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}