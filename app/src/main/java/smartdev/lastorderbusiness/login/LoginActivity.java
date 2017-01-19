package smartdev.lastorderbusiness.login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import junit.framework.Test;

import smartdev.lastorderbusiness.MainActivity;
import smartdev.lastorderbusiness.MainNavigationDrawer;
import smartdev.lastorderbusiness.R;
import smartdev.lastorderbusiness.TESTERINO;

import static smartdev.lastorderbusiness.R.id.button_login;
import static smartdev.lastorderbusiness.R.id.button_login_registration;
import static smartdev.lastorderbusiness.R.id.editText_login_email;
import static smartdev.lastorderbusiness.R.id.editText_login_password;


public class LoginActivity extends AppCompatActivity {

    private final String LOG_TAG = MainActivity.class.getSimpleName();
    private Button btnLogin, btnRegistration;
    private EditText email, password;
    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = (Button) findViewById(button_login);
        btnRegistration = (Button) findViewById(button_login_registration);
        email = (EditText) findViewById(editText_login_email);
        password = (EditText) findViewById(editText_login_password);
        firebaseAuth = FirebaseAuth.getInstance();

    }

    public void btnRestaurantLogin_OnClick(View view){

        final ProgressDialog progressDialog = ProgressDialog.show(LoginActivity.this,"Please wait ...","Processing", true);
        (firebaseAuth.signInWithEmailAndPassword(email.getText().toString(), password.getText().toString()))
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();

                        if(task.isSuccessful()) {
                            Toast.makeText(getApplicationContext(), "Your login was successfull ", Toast.LENGTH_LONG);


                            Intent intent = new Intent(LoginActivity.this, TESTERINO.class);
                            intent.putExtra("Email",firebaseAuth.getCurrentUser().getEmail());
                            startActivity(intent);
                        }
                        else{
                            Log.e("LOGIN ERROR", task.getException().toString());
                            Toast.makeText(getApplicationContext(), "Login error, please check your email and password" , Toast.LENGTH_LONG);

                        }
                    }
                });

    }

    public void btnLoginToRegistration_OnClick (View view){
        Intent intent = new Intent(LoginActivity.this,RegistrationActivity.class);
        startActivity(intent);
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

    public void Skiperino (View view){
        Intent i = new Intent(LoginActivity.this,TESTERINO.class);
        startActivity(i);
    }
}
