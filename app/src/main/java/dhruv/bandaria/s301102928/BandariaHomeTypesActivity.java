package dhruv.bandaria.s301102928;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(getApplicationContext(),"item1",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item2:
                Toast.makeText(getApplicationContext(),"item2",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item3:
                Toast.makeText(getApplicationContext(),"item3",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item4:
                Toast.makeText(getApplicationContext(),"item4",Toast.LENGTH_SHORT).show();
                break;
            case R.id.item5:
                Toast.makeText(getApplicationContext(),"item5",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}