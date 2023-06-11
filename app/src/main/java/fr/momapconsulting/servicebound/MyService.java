package fr.momapconsulting.servicebound;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.widget.Toast;

import java.util.Random;

public class MyService extends Service {
    private final IBinder iBinder = new LocalBinder();
    private Random mGenerator = new Random();

    public class LocalBinder extends Binder {
        MyService getService() {
            Toast.makeText(MyService.this, "Myservices.getService " , Toast.LENGTH_SHORT).show();
            return MyService.this;
         }
    }

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        Toast.makeText(MyService.this, "Myservices onBind " , Toast.LENGTH_SHORT).show();
        return iBinder;
    }
    public int getRandom(){
        return mGenerator.nextInt(200);
    }
    public int getAnniversaire(){
       return 1956;
    }

}