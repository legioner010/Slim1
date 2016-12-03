package sh.dfm.slim1;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by е on 03.12.2016.
 */
public class WorkoutDetailFragment extends android.support.v4.app.Fragment {

    private long workoutId = 0;

    public WorkoutDetailFragment() {
        //empty constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);

    }

    @Override
    public void onStart() {
        super.onStart();

        View view = getView();
        if (view != null) {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            Workout workout = Workout.workouts[(int) workoutId];
            title.setText(workout.getName());

            TextView description = (TextView) view.findViewById(R.id.textDscription);
            description.setText(workout.getDescription());

            ImageView imageResourceId = (ImageView) view.findViewById(R.id.image_workout);
            imageResourceId.setImageResource(workout.getImageResourceId());

        }
    }

    public void setWorkout(long id) {
        this.workoutId = id;
    }
}
