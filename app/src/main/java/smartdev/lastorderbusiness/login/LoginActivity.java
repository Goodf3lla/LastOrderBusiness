package smartdev.lastorderbusiness.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import smartdev.lastorderbusiness.MainActivity;
import smartdev.lastorderbusiness.MainNavigationDrawer;
import smartdev.lastorderbusiness.R;

import static smartdev.lastorderbusiness.R.id.button_login;
import static smartdev.lastorderbusiness.R.id.button_login_registration;


public class LoginActivity extends AppCompatActivity {

    private final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Button login = (Button) findViewById(button_login);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,MainNavigationDrawer.class);
                startActivity(intent);
            }
        });

        Button register = (Button) findViewById(button_login_registration);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this,RegistrationActivity.class);
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
