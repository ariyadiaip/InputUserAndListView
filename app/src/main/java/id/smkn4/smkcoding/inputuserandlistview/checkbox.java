package id.smkn4.smkcoding.inputuserandlistview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class checkbox extends AppCompatActivity {
    CheckBox android, java, angular, python;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.checkbox);
        android = (CheckBox)findViewById(R.id.chkAndroid);
        angular = (CheckBox)findViewById(R.id.chkAngular);
        java = (CheckBox)findViewById(R.id.chkJava);
        python = (CheckBox)findViewById(R.id.chkPython);
        Button btn = (Button)findViewById(R.id.getBtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String result = "Selected Courses";
                if(android.isChecked()){
                    result += "\nAndroid";
                }
                if(angular.isChecked()){
                    result += "\nC++";
                }
                if(java.isChecked()){
                    result += "\nJava";
                }
                if(python.isChecked()){
                    result += "\nPython";
                }
                Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
            }
        });
    }
    public void onCheckboxClicked(View view) {
        boolean checked = ((CheckBox) view).isChecked();
        String str="";
        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.chkAndroid:
                str = checked?"Android Selected":"Android Deselected";
                break;
            case R.id.chkAngular:
                str = checked?"C++ Selected":"C++ Deselected";
                break;
            case R.id.chkJava:
                str = checked?"Java Selected":"Java Deselected";
                break;
            case R.id.chkPython:
                str = checked?"Python Selected":"Python Deselected";
                break;
        }
        Toast.makeText(getApplicationContext(), str, Toast.LENGTH_SHORT).show();
    }
}