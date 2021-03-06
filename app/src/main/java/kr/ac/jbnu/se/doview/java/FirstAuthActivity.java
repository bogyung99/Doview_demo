package kr.ac.jbnu.se.doview.java;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import kr.ac.jbnu.se.doview.java.helloar.R;

public class FirstAuthActivity extends AppCompatActivity {
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_auth);

        if(SaveSharedPreference.getUserName(FirstAuthActivity.this).length() == 0) {
            // call Login Activity
            intent = new Intent(FirstAuthActivity.this, LogInActivity.class);
            startActivity(intent);
            this.finish();
        } else {
            // Call Next Activity
            intent = new Intent(FirstAuthActivity.this, MainActivity.class);
            intent.putExtra("STD_NUM", SaveSharedPreference.getUserName(this).toString());
            startActivity(intent);
            this.finish();
        }
    }
}
