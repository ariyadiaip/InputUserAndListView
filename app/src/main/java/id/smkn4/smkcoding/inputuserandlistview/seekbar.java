package id.smkn4.smkcoding.inputuserandlistview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class seekbar extends AppCompatActivity {
    private SeekBar sBar;
    private TextView tView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.seekbar);
        sBar = (SeekBar) findViewById(R.id.seekBar1);
        tView = (TextView) findViewById(R.id.textview1);
        tView.setText(sBar.getProgress() + "/" + sBar.getMax());
        sBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            int pval = 0;
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                pval = progress;
            }
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                //write custom code to on start progress
            }
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                tView.setText(pval + "/" + seekBar.getMax());
            }
        });
    }
}
