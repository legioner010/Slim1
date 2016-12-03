package sh.dfm.slim1;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class WorkoutListFragment  extends ListFragment{

    private WorkoutListListner mainAcrivityReference;

    public static interface WorkoutListListner {
        void itemClicked(long id);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.mainAcrivityReference =(WorkoutListListner) activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        String[] names = new String[Workout.workouts.length];
        for (int i = 0; i < names.length; i++) {
//            names[i] = W
        }

        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
