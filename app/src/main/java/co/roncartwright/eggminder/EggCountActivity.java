package co.roncartwright.eggminder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class EggCountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egg_count);
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
}
