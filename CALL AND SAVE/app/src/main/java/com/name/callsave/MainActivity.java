package com.name.callsave;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.provider.ContactsContract;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class MainActivity extends AppCompatActivity {
    public EditText edittext;
    public Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9,bs,bha,call,save,del;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext = findViewById(R.id.edittext1);

        b0 = (Button)findViewById(R.id.b0);
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "0");
            }
        });

        b1 = (Button)findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "1");
            }
        });

        b2 = (Button)findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "2");
            }
        });
        b3 = (Button)findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "3");
            }
        });
        b4 = (Button)findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "4");
            }
        });
        b5 = (Button)findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "5");
            }
        });
        b6 = (Button)findViewById(R.id.b6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "6");
            }
        });

        b7 = (Button)findViewById(R.id.b7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "7");
            }
        });

        b8 = (Button)findViewById(R.id.b8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "8");
            }
        });

        b9 = (Button)findViewById(R.id.b9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "9");
            }
        });

        bs = findViewById(R.id.bs);
        bs.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "*");
            }
        });

        bha = (Button)findViewById(R.id.bha);
        bha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText(edittext.getText() + "#");
            }
        });
        call = (Button)findViewById(R.id.call);
        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg) {
                String number = edittext.getText().toString();
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:" + number));
                if (ActivityCompat.checkSelfPermission(MainActivity.this,
                        Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                MainActivity.this.startActivity(callIntent);
            }
        });
        save = (Button)findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String phoneNumber=edittext.getText().toString();
                Intent intent=new Intent(Intent.ACTION_INSERT);
                intent.setType(ContactsContract.Contacts.CONTENT_TYPE);
                intent.putExtra(ContactsContract.Intents.Insert.PHONE,phoneNumber);
                startActivity(intent);
            }
        });
        del=(Button)findViewById(R.id.del1);
        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edittext.setText("");
            }
        });
    }
}