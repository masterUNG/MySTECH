package appewtc.masterung.mystech;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Explicit
    private EditText userEditText, passwordEditText;
    private TextView textView;
    private Button button;
    private String userString, passwordString;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initial View คือการผูกตัวแปร กับ View ที่ อยู่ที่ Activity
        initialView();

        //Create Controller
        controller();


    }   // Main Method

    private void controller() {
        textView.setOnClickListener(MainActivity.this);
        button.setOnClickListener(MainActivity.this);
    }

    private void initialView() {
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        textView = (TextView) findViewById(R.id.txtRegister);
        button = (Button) findViewById(R.id.btnLogin);
    }

    @Override
    public void onClick(View view) {

        String tag = "SriwattanaV1";

        //For TextView
        if (view == textView) {
            Log.d(tag, "You Click TextView");

            //Create Intent
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        }

        //For Button
        if (view == button) {
            Log.d(tag, "You Click Button");

            //Get Value From Edit Text
            userString = userEditText.getText().toString().trim();
            passwordString = passwordEditText.getText().toString().trim();

            //Check Space
            if (userString.equals("") || passwordString.equals("")) {
                //Have Space
                MyAlert myAlert = new MyAlert(MainActivity.this);
                myAlert.myDialog("Have Space", "Please Fill All");
            } else {
                //No Space
                checkUserAnPass();
            }


        }


    }   // onClick

    private void checkUserAnPass() {
        try {

        } catch (Exception e) {
            Log.d("TestV2", "e check ==> " + e.toString());
        }
    }

}   // Main Class นี่คือ คลาสหลัก
