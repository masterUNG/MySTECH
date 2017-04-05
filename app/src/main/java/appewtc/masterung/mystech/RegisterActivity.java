package appewtc.masterung.mystech;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText nameEditText, surnameEditText, addressEditText,
            userEditText, passwordEditText;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        initialView();

        controller();

    }   // Main Method

    private void controller() {
        button.setOnClickListener(RegisterActivity.this);
    }

    private void initialView() {
        nameEditText = (EditText) findViewById(R.id.edtName);
        surnameEditText = (EditText) findViewById(R.id.edtSurname);
        addressEditText = (EditText) findViewById(R.id.edtAddress);
        userEditText = (EditText) findViewById(R.id.edtUser);
        passwordEditText = (EditText) findViewById(R.id.edtPassword);
        button = (Button) findViewById(R.id.btnSave);
    }

    @Override
    public void onClick(View view) {

        //Get Value From EditText


    }   // onClick

}   // Main Class
