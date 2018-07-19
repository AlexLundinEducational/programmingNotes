package alex_lundin.android_block_group_sms;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import android.telephony.SmsManager;
import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.app.Activity;

import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.telephony.SmsManager;

import android.util.Log;
import android.view.Menu;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements IncomingSMSReceiver.AutoReadSMSListener {
    private static final int MY_PERMISSIONS_REQUEST_SEND_SMS =0 ;
    private EditText mMobile;
    private TextView mYourOtp;
    private TextView mSendOtp;

    String phoneNumber;
    String message;

    private String GET_OTP_URL = "Your get OTP URL";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
/*        if (Build.VERSION.SDK_INT >= 23) {//self check permissions for Read SMS
            if (!AndroidPermissions.getInstance().checkReadSmsPermission(MainActivity.this)) {
                AndroidPermissions.getInstance().displaySmsPermissionAlert(MainActivity.this);
            } else {

            }
        } else {

        }*/
    }

    private void init() {

        mMobile = (EditText) findViewById(R.id.phone);
        mYourOtp = (TextView) findViewById(R.id.otp);
        mSendOtp = (TextView) findViewById(R.id.sendCode);
        IncomingSMSReceiver.setListener(this);
        mSendOtp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Click started.", Toast.LENGTH_SHORT).show();
                verifySendPermission();

            }


        });


    }

    protected void verifySendPermission() {
        Toast.makeText(getApplicationContext(),
                "Permission started.", Toast.LENGTH_SHORT).show();

        if (ContextCompat.checkSelfPermission(this,
                Manifest.permission.SEND_SMS)
                != PackageManager.PERMISSION_GRANTED) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this,
                    Manifest.permission.SEND_SMS)) {
            } else {
                ActivityCompat.requestPermissions(this,
                        new String[]{Manifest.permission.SEND_SMS},
                        MY_PERMISSIONS_REQUEST_SEND_SMS);
            }
        }

    }

    @Override
    public void onRequestPermissionsResult(int requestCode,String permissions[], int[] grantResults) {


        switch (requestCode) {
            case MY_PERMISSIONS_REQUEST_SEND_SMS: {
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(getApplicationContext(),
                            "Permission Granted.", Toast.LENGTH_SHORT).show();
                    sendSMS();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Permission failed.", Toast.LENGTH_LONG).show();
                    return;
                }
            }
        }

    }
    public void sendSMS(){

        Toast.makeText(getApplicationContext(),
                "Send started.", Toast.LENGTH_SHORT).show();

        phoneNumber = mMobile.getText().toString();
        phoneNumber = "4693945175";
        message = "Custom message for proof of understanding";
        PendingIntent sentPI;
        String SENT = "SMS_SENT";
        sentPI = PendingIntent.getBroadcast(this, 0,new Intent(SENT), 0);

        SmsManager smsManager = SmsManager.getDefault();

        try {
            smsManager.sendTextMessage(phoneNumber, null, message, sentPI, null);

        } catch (Exception e) {
            Toast.makeText(getApplicationContext(),
                    "SMS failed, please try again.", Toast.LENGTH_LONG).show();
        }

    }
    @Override
    public void onReadSMS(int otp) {
        //assigning otp after received by IncomingSMSReceiver//Broadcast receiver
        Toast.makeText(getApplicationContext(),
                "Read started", Toast.LENGTH_LONG).show();
        mYourOtp.setText("Your OTP is: " + otp);//this otp can be use for verify ur mobile or user
    }



}
