package panda.example.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button but;
    private RelativeLayout activity_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //李鑫
        //刘鹏辉
        //黄振通
        //第二次
        //第一次会有点疼
        //方清正
        //方清正
        System.out.println("hahahahhaahhahahahhahaahahha");
        Log.e("TGP", "妈的，李老板，有哒哒哒哒哒冒蓝火的加特林吗？");

        Log.e("", "onCreate:aaaaaaaaaaaaaaaaaaaaaaaaaaaaa ");
        Intent it = new Intent(MainActivity.this, MainActivity.class);
        startActivity(it);
        Intent its = new Intent(MainActivity.this, MainActivity.class);
        startActivity(it);
        Toast.makeText(this, "jajfid", Toast.LENGTH_SHORT).show();

    }

    private void initView() {
        but = (Button) findViewById(R.id.but);
        activity_main = (RelativeLayout) findViewById(R.id.activity_main);

        but.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but:
                Intent its = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(its);
                break;
        }
    }
}
