package examplefacerecog.com.android_login_signup_challenge;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView signupbtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        signupbtn = (TextView) findViewById(R.id.signup_txt);
        signupbtn.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    signupbtn.setTextColor(Color.parseColor("#2ecc72"));
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    signupbtn.setTextColor(Color.parseColor("#817F80"));
                    Intent intent = new Intent(getApplicationContext(), SignupActivity.class);
                    startActivity(intent);
                }
                return true;
            }
        });

    }
}
