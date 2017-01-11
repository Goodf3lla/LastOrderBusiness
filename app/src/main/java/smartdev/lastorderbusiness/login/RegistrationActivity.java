package smartdev.lastorderbusiness.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import smartdev.lastorderbusiness.MainActivity;
import smartdev.lastorderbusiness.MainNavigationDrawer;
import smartdev.lastorderbusiness.R;


public class RegistrationActivity extends AppCompatActivity {

    private final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        setTitle("Registration");

        Button signup = (Button) findViewById(R.id.button_restaurant_signUp);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText name = (EditText) findViewById(R.id.editText_restaurant_name);
                Toast.makeText(getApplicationContext(), "Hello " + name.getText(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(RegistrationActivity.this,MainNavigationDrawer.class);
                startActivity(intent);
            }
        });


    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.v(LOG_TAG, "In Callback-Methode: onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v(LOG_TAG, "In Callback-Methode: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v(LOG_TAG, "In Callback-Methode: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v(LOG_TAG, "In Callback-Methode: onStop()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v(LOG_TAG, "In Callback-Methode: onRestart()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(LOG_TAG, "In Callback-Methode: onDestroy()");
    }
}
