package calc.com.davidetruong.tcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/**
 * @author davidetruong
 * @version 1.0
 * @see MainActivity
 * @since 21 November 2017
 * My main activity using ButterKnife to show a simple example in Android development app.
 * Nothing special, enjoy.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
