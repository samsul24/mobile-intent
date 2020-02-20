package id.ac.polinema.intent;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileBundleActivity extends AppCompatActivity {
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_bundle);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);


        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            // TODO: display value here
            usernameText.setText(bundle.getString("username"));
            nameText.setText(bundle.getString("name"));
            ageText.setText(String.valueOf(bundle.getInt("age")));

        }
    }
}