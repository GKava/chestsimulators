package treasure.fortnite_battleroyale.chestsimulator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity{
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
                    case MotionEvent.ACTION_UP: // отпускание
                        progressBar.setVisibility(ProgressBar.INVISIBLE);
                        break;
                    case MotionEvent.ACTION_DOWN:
                        float x = event.getX();
                        float y = event.getY();
                        progressBar.setX(x-300);
                        progressBar.setY(y-500);
                        progressBar.setVisibility(ProgressBar.VISIBLE);
                        break;

        }
        return true;
    }
}
