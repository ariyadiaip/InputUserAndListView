package id.smkn4.smkcoding.inputuserandlistview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class button extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.button);
        final EditText firstNum = (EditText)findViewById(R.id.firstNum);
        final EditText secNum = (EditText)findViewById(R.id.secondNum);
        Button btnAdd = (Button)findViewById(R.id.addBtn);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(firstNum.getText().toString().isEmpty() || secNum.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(), "Harap isi semua Field", Toast.LENGTH_SHORT).show();
                }
                else {
                    int num1 = Integer.parseInt(firstNum.getText().toString());
                    int num2 = Integer.parseInt(secNum.getText().toString());
                    Toast.makeText(getApplicationContext(), "Hasil = " + (num1 + num2), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

