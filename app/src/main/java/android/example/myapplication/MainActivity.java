package android.example.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private EditText name ;
private EditText email;
private EditText pasw;
private Button but_re;
    private Button but_log;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_register);
        //setContentView(R.layout.layout_login);
        //setContentView(R.layout.activity_main);

    name=findViewById(R.id.name);
    email=findViewById(R.id.email);
    pasw=findViewById(R.id.password);
    but_re=findViewById(R.id.btnRegister);
    but_log=findViewById(R.id.buttonlo);

    but_re.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            saveUsersInfo();

        }
    });
but_log.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent i =new Intent();
        i.setClass(MainActivity.this,Main2Activity.class);
        startActivity(i);
    }
});
    }



    private void saveUsersInfo() {
        SharedPreferences sharedPreferences = getSharedPreferences("UsersInfo", 0);
        SharedPreferences.Editor editor = sharedPreferences.edit();
      editor.putString("username", name.getText().toString());
        editor.putString("email", email.getText().toString());

          editor.putString("password", pasw.getText().toString());

       editor.commit();
    }
    private void getinfo()

    {
        SharedPreferences sPreferences=getSharedPreferences("UsersInfo", 0);
        String username=sPreferences.getString("username", "");
        String password =sPreferences.getString("password", "");
        Toast.makeText(MainActivity.this,"123", Toast.LENGTH_LONG);
    }



}


