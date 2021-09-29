package com.shapps.factorialservice;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class FactorialService extends Service {
    public FactorialService() {

    }

    @Override
    public IBinder onBind(Intent intent) {
        throw new UnsupportedOperationException("NOT INPLEMENTED");
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        int res = 1;
        for (int i = 1; i <= 5; i++) {
            res *= i;
        }
        Toast.makeText(this, "factorial of 5 is" + res, Toast.LENGTH_LONG).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, "SERVICE STOPPED..!", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }
}