package co.roncartwright.eggminder;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void flockStatsBtnClick(View view){
        Intent i = new Intent(this, FlockStatsActivity.class);
        startActivity(i);
    }
    public void eggCountBtnClick(View view){
        Intent i = new Intent(this, EggCountActivity.class);
        startActivity(i);
    }
    public void changeFlockBtnClick(View view){
        Intent i = new Intent(this, FlockChangeActivity.class);
        startActivity(i);
    }
    public void flockSetupBtnClick(View view){
        Intent i = new Intent(this, SetupActivity.class);
        startActivity(i);
    }

    private void writeToFile(String data,Context context) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("egg_minder_config.txt", Context.MODE_PRIVATE));
            outputStreamWriter.write(data);
            outputStreamWriter.close();
        }
        catch (IOException e) {
            Log.e("Exception", "File write failed: " + e.toString());
        }
    }

}
