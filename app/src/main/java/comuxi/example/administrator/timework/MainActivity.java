package comuxi.example.administrator.timework;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class MainActivity extends Activity {
    Handler handler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            switch (msg.what){
                case 300:
                    Intent intent = new Intent();




                break;
            }

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new Thread(){
            public void run(){

                try {
                    sleep(1000);
                    handler.sendEmptyMessage(300);

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();




    }
}
