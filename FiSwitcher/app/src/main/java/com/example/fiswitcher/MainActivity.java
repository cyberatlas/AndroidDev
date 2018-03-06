package com.example.fiswitcher;

        import android.Manifest;
        import android.content.Intent;
        import android.content.pm.PackageManager;
        import android.net.Uri;
        import android.support.annotation.MainThread;
        import android.support.v4.app.ActivityCompat;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.content.BroadcastReceiver;
        import android.content.BroadcastReceiver;

//TODO messed up the formatting in Activity main a little bit, take a look at that later
public class MainActivity extends AppCompatActivity {

    //TODO Find out how to auto ask the user for permission that it does not to be toggled in the settings menu

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //adds the autobutton (Actually the test button)
        Button autoBtn = (Button) findViewById(R.id.autoBtn);
        //add the secret code button for testing
        Button secretCodeTestBtn = (Button) findViewById(R.id.secretCodeTestBtn);
        //Adds the sprint button
        Button sprintBtn = (Button) findViewById(R.id.SprintBtn);
        //Adds the US Cellular Button
        Button uscBtn = (Button) findViewById(R.id.USCBtn);
        //Add the T-Mobile Button
        Button tmobileBtn = (Button) findViewById(R.id.TMobileBtn);
        //Adds the autochose button
        Button autochoseBtn = (Button) findViewById(R.id.AutoChoseBtn);




        //When the autoBtn is pressed
        autoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Should now call the preprogrammed number
                //Need to look at this a bit more

                Intent callIntent = new Intent(Intent.ACTION_CALL);
                //Set as my phone number for now for testing purposes
                callIntent.setData(Uri.parse("tel:3096433326"));
//                callIntent.setData(Uri.parse("*#*#342886#*#*")); //TODO figure out how to get it to work with this number.

                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED){
                    return;
            }
                {
                    startActivity(callIntent);
                }




            }

        });

        secretCodeTestBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendBroadcast(new Intent("android.provider"));
                //sendBroadcast(new Intent("android.provider.Telephony.SECRET_CODE", Uri.parse("android_secret_code://342886")));
                sendBroadcast(new Intent("android.provider.Telephony.SECRET_CODE", Uri.parse("android_secret_code://4636")));

//                String secretCode = "*#4636#*";
//                String action = "android.provider.Telephony.SECRET_CODE";
//                Uri uri = Uri.parse("android_secret_code://" + secretCode);
//                Intent intent = new Intent(action, uri);
//                sendBroadcast(intent);

//                Intent dialIntent = new Intent(Intent.ACTION_DIAL);
//                dialIntent.setData(Uri.parse("tel: *#*#4636#*#*"));
//                startActivity(dialIntent);

//                Intent in = new Intent(Intent.ACTION_MAIN);
//                in.setClassName("com.android.settings", "com.android.settings.TestingSettings");
//                startActivity(in);


//                String ussdCode = "*" +Uri.encode ("#")+"*"+Uri.encode ("#")+ "4636" + Uri.encode ("#")+"*"+Uri.encode ("#")+"*";
//                startActivity (new Intent ("android.intent.action.DIAL", Uri.parse ("tel:" + ussdCode)));

//                Intent intent = new Intent(Intent.ACTION_MAIN);
//                intent.setClassName("com.android.settings", "com.android.settings.TestingSettings");
//                startActivity(intent );



            }
        });

        //Calls specified number when sprint button is clicked
        sprintBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendBroadcast(new Intent("android.provider"));

                sendBroadcast(new Intent("android.provider.Telephony.SECRET_CODE", Uri.parse("android_secret_code://34777")));

            }
        });

        //Calls specified number when USC button is clicked
        uscBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendBroadcast(new Intent("android.provider"));

                sendBroadcast(new Intent("android.provider.Telephony.SECRET_CODE", Uri.parse("android_secret_code://34872")));

            }
        });
        //Calls specified number when tmobile button is clicked
        tmobileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendBroadcast(new Intent("android.provider"));

                sendBroadcast(new Intent("android.provider.Telephony.SECRET_CODE", Uri.parse("android_secret_code://34866")));

            }
        });

        //Calls specified number when autchose button is clicked
        autochoseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendBroadcast(new Intent("android.provider"));

                sendBroadcast(new Intent("android.provider.Telephony.SECRET_CODE", Uri.parse("android_secret_code://342886")));

            }
        });




    }
}
