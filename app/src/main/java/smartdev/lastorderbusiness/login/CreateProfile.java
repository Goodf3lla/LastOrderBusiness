package smartdev.lastorderbusiness.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import smartdev.lastorderbusiness.MainActivity;
import smartdev.lastorderbusiness.R;
import smartdev.lastorderbusiness.TESTERINO;

public class CreateProfile extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Last Order Business ");
        setContentView(R.layout.activity_create_profile);
        TextView t = (TextView) findViewById(R.id.textView_welcome);

        //t.setText("Hello " + getIntent().getExtras().getString("Email") + "Please fill the empty fields to finish the registration");
        t.setText("Willkommen bei Last Order, Bitte geben Sie hier Ihre Restaurantdaten an");
    }

    public void btnRestaurantSaveData_Click(View view) {
        Intent i = new Intent(CreateProfile.this, MainActivity.class);
        startActivity(i);

    }
}