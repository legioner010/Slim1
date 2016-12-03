package sh.dfm.slim1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //находим фрагмент
        WorkoutDetailFragment frag = (WorkoutDetailFragment) getSupportFragmentManager()
                .findFragmentById(R.id.detali_frag);

        frag.setWorkout(0);

    }
}
