package ch.epfl.sweng.bootcamp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "ch.epfl.sweng.bootcamp.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Starts the {@link GreetingActivity} when the user taps the button.
     *
     * @param view the button that was clicked
     */
    public void greet(View view) {
        Intent intent = new Intent(this, GreetingActivity.class);

        EditText editText = findViewById(R.id.mainName);
        String message = String.format("Hello %s!", editText.getText().toString());

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
