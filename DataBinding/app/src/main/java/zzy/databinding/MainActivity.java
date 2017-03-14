package zzy.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import zzy.databinding.databinding.ActivityMainBinding;

/**
 * dataBinding的使用
 *
 * 变量绑定：
 * 相比以前使用的xml，根节点由具体的某个layout（比如LinearLayout ）变成了layout，
 * 里面包括了data节点和传统的视图。这里的data节点就像是连接 View 和 Modle 的桥梁
 * <p>
 * 事件绑定：（方法引用、监听器绑定）
 *
 */
public class MainActivity extends AppCompatActivity {
    ActivityMainBinding mMainBinding;
    User mUser = new User("name", "2017");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        mMainBinding.firstname.setText("拉拉秀");
        mMainBinding.setUser(mUser);//数据绑定方法一

        mMainBinding.setPresenter(new presenter());

    }

    //事件绑定
    public class presenter {
        //方法引用onTextChanged   随输入内容变化
        public void onTextChanged(CharSequence s, int start, int count, int after) {
            mUser.setName(s.toString());
            mMainBinding.setUser(mUser);

        }

        //方法引用onClick
        public void onClick(View view) {
            Toast.makeText(MainActivity.this, "赳赳老秦，共赴国难", Toast.LENGTH_SHORT).show();

        }

        //监听器绑定，未完成...
        public void onClicklistenerBing(User user) {
            Toast.makeText(MainActivity.this, user.getAge(), Toast.LENGTH_SHORT).show();

        }


    }
}
