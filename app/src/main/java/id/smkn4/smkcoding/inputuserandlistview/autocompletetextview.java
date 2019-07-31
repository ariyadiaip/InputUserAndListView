package id.smkn4.smkcoding.inputuserandlistview;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class autocompletetextview extends AppCompatActivity {
    String[] Countries = { "Indonesia", "USA", "Australia", "Arab", "Italy", "Japan", "Bandung" };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.autocompletetextview);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, Countries);
        AutoCompleteTextView actv = (AutoCompleteTextView)findViewById(R.id.ac_Country);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Selected Item: " + parent.getSelectedItem(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}