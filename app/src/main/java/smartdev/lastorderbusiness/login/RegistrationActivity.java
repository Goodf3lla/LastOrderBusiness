package smartdev.lastorderbusiness.login;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import smartdev.lastorderbusiness.MainActivity;

import smartdev.lastorderbusiness.R;
import smartdev.lastorderbusiness.TESTERINO;


public class RegistrationActivity extends AppCompatActivity {

    private final String LOG_TAG = MainActivity.class.getSimpleName();


    private EditText  email, password;
    private FirebaseAuth firebaseAuth;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        setTitle("Registration");

        button =(Button)findViewById(R.id.button_restaurant_signUp);
        email = (EditText) findViewById(R.id.editText_restaurant_email);
        password = (EditText) findViewById(R.id.editText_restaurant_password);
        firebaseAuth = FirebaseAuth.getInstance();
    }


    public void btnRestaurantSignUp_Click(View view){
        Log.e("Eroor","1");

        final ProgressDialog progressDialog = ProgressDialog.show(RegistrationActivity.this,"Please wait...", "Processing...", true);
        Log.e("Eroor","1.5");
        (firebaseAuth.createUserWithEmailAndPassword(email.getText().toString(),password.getText().toString()))
                .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        Log.e("Eroor","2");
                        progressDialog.dismiss();

                        if(task.isSuccessful()){
                            Log.e("Eroor","3");
                            Toast.makeText(getApplicationContext(), "Your registration was successfull " , Toast.LENGTH_LONG);
                            Intent intent = new Intent(RegistrationActivity.this, CreateProfile.class);
                            intent.putExtra("Email",firebaseAuth.getCurrentUser().getEmail());
                            startActivity(intent);
                        }
                        else{
                            Log.e("REGISTRATION ERROR", task.getException().toString());
                            Toast.makeText(getApplicationContext(), "Your registration failed, please check your email and password " , Toast.LENGTH_LONG);
                        }

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
