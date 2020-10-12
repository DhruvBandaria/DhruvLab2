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
        /*Fragment frag = new BandariaAppartmentFragment();
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer,frag,"Demo Fragment");
        fragmentTransaction.commit();*/
        changeFragment(new BandariaDetachedHome());
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
                changeFragment(new BandariaAppartmentFragment());
                break;
            case R.id.item2:
                changeFragment(new BandariaDetachedHome());
                break;
            case R.id.item3:
                changeFragment(new BandariaSemiDetachedFragment());
                break;
            case R.id.item4:
                changeFragment(new BandariaCondominiumFragment());
                break;
            case R.id.item5:
                changeFragment(new BandariaTownHouse());
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void changeFragment(Fragment frag){
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer,frag,"Demo Fragment");
        fragmentTransaction.commit();
    }
}