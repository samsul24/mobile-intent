package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.intent.model.User;


public class ParcelableActivity extends AppCompatActivity {
    private EditText usernameInput;
    private EditText nameInput;
    private EditText ageInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parcelable);
        usernameInput = findViewById(R.id.input_username);
        nameInput = findViewById(R.id.input_name);
        ageInput = findViewById(R.id.input_age);
    }
    public void handleParcelable(View view){
        Intent intent = new Intent(this,ProfileParcelableActivity.class);
        String usernameValue = usernameInput.getText().toString();
        String nameValue = nameInput.getText().toString();
        int ageValue = Integer.parseInt(ageInput.getText().toString());
        User user = new User(usernameValue,nameValue,ageValue);
        intent.putExtra("user",user);
        startActivity(intent);
    }

}
