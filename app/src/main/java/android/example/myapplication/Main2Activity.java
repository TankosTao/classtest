package android.example.myapplication;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
private Button but_login;
    private EditText email;
    private EditText pasw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
   but_login=findViewById(R.id.btnLogin);
   email=findViewById(R.id.email);
   pasw=findViewById(R.id.password);
   but_login.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           SharedPreferences sPreferences=getSharedPreferences("UsersInfo", 0);
           String emaill=sPreferences.getString("email", "");
           String password =sPreferences.getString("password", "");

           if((emaill.equals(email.getText().toString()))&&(password.equals(pasw.getText().toString())))
               Toast.makeText(getApplicationContext(),"success",Toast.LENGTH_SHORT).show();
       else
               Toast.makeText(getApplicationContext(),emaill+" "+password+"wrong",Toast.LENGTH_SHORT).show();
       }
   });
    }


}
