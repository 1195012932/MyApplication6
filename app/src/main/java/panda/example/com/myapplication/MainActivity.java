package panda.example.com.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //李鑫
        //刘鹏辉
        //黄振通
        //第二次
        //第一次会有点疼
        System.out.println("hahahahhaahhahahahhahaahahha");
        Log.e("TGP","妈的，李老板，有哒哒哒哒哒冒蓝火的加特林吗？");
        //方清正
        //方清正
        Log.e("", "onCreate:aaaaaaaaaaaaaaaaaaaaaaaaaaaaa ");
        Intent it=new Intent(MainActivity.this,MainActivity.class);
        startActivity(it);
    }
}
