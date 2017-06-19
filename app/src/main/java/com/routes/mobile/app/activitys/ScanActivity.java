package com.routes.mobile.app.activitys;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.google.zxing.Result;

import java.util.ArrayList;
import java.util.List;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class ScanActivity extends AppCompatActivity implements ZXingScannerView.ResultHandler{

    private ZXingScannerView mScannerView;
    private Button btn_flash;
    private ArrayList<String> guiasScan=null;

    @Override
    public void onCreate(Bundle state) {
        super.onCreate(state);
        guiasScan=new ArrayList<String>();
        //mScannerView = new ZXingScannerView(this);   // Programmatically initialize the scanner view
        //setContentView(mScannerView);                // Set the scanner view as the content view
        setContentView(R.layout.activity_scan);
        mScannerView= (ZXingScannerView) findViewById(R.id.zxscan);
        btn_flash = (Button) findViewById(R.id.btn_flash);
        btn_flash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ScanActivity.this, MainActivity.class);
                intent.putStringArrayListExtra("GUIAS_SCAN",guiasScan);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();
        mScannerView.setResultHandler(this); // Register ourselves as a handler for scan results.
        mScannerView.startCamera();          // Start camera on resume
    }

    @Override
    public void onPause() {
        super.onPause();
        mScannerView.stopCamera();           // Stop camera on pause
    }

    @Override
    public void handleResult(Result rawResult) {
        // Do something with the result here
        // Log.v("tag", rawResult.getText()); // Prints scan results
        // Log.v("tag", rawResult.getBarcodeFormat().toString()); // Prints the scan format (qrcode, pdf417 etc.)


        MainActivity.tvresult.setText(rawResult.getText());
        //onBackPressed();
        this.onPause();
        this.onResume();

        // If you would like to resume scanning, call this method below:
        //mScannerView.resumeCameraPreview(this);

        System.out.print(rawResult.getText());
        guiasScan.add(rawResult.getText());
    }


}