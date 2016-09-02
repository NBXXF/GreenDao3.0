package com.xuan.greendao3;

import android.app.Activity;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;

import com.db.greendao.gen.DaoMaster;
import com.db.greendao.gen.DaoSession;
import com.xuan.greendao3.bean.User;

import java.util.List;
import java.util.Random;

public class MainActivity extends Activity {


    private DaoMaster.DevOpenHelper devOpenHelper;
    SQLiteDatabase writableDatabase;
    DaoMaster daoMaster;
    private DaoSession daoSession;


    TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_result = (TextView) findViewById(R.id.tv_result);

        devOpenHelper = new DaoMaster.DevOpenHelper(this, "user_db");
        writableDatabase = devOpenHelper.getWritableDatabase();
        daoMaster = new DaoMaster(writableDatabase);
        daoSession = daoMaster.newSession();


    }

    public void onQuery(View v) {
        List<User> users = daoSession.loadAll(User.class);
        if (users != null) {
            StringBuilder stringBuilder = new StringBuilder("查询结果:\n");
            for (int i = 0; i < users.size(); i++) {
                stringBuilder.append(users.get(i).toString() + "\n");
            }
            tv_result.setText(stringBuilder.toString());
        }
    }

    public void onInsert(View v) {
        User user = new User(String.valueOf(new Random().nextInt(10)), "name_" + SystemClock.elapsedRealtime());
        daoSession.insertOrReplace(user);
    }

    public void onUpdate(View v) {
        User user = new User("1", "user_被update_" + SystemClock.elapsedRealtime());
        daoSession.update(user);
    }

    public void onDelete(View v) {
        daoSession.getUserDao().deleteByKey("1");
    }

}
