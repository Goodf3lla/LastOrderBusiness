package smartdev.lastorderbusiness.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import smartdev.lastorderbusiness.MainActivity;
import smartdev.lastorderbusiness.R;


public class RegistrationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);


        Button signup = (Button) findViewById(R.id.button_restaurant_signUp);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText name = (EditText) findViewById(R.id.editText_restaurant_name);
                Toast.makeText(getApplicationContext(), "Hello " + name.getText(), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(RegistrationActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
