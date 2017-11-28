package bwie.com.rikaodemo1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 注册
     */
    private Button mLoginBtnRegister;
    /**
     * 登录
     */
    private Button mLoginBtnLogin;
    private ImageView mLogo;
    /**
     * 请输入您的密码
     */
    private EditText mLoginEditPwd;
    /**
     * 请输入您的用户名
     */
    private EditText mLoginEditAccount;
    /**
     * 注销
     */
    private Button mLoginBtnCancle;
    /**
     * 记住密码
     */
    private CheckBox mLoginRemember;
    /**
     * 修改密码
     */
    private TextView mLoginTextChangePwd;
    private RelativeLayout mLoginView;
    private TextView mLoginSuccessShow;
    private RelativeLayout mLoginSuccessView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        //修改的代码
		//我是pjc添加的代码
        //我刘光虎也添加代码

    }

    private void initView() {
        mLoginBtnRegister = (Button) findViewById(R.id.login_btn_register);
        mLoginBtnRegister.setOnClickListener(this);
        mLoginBtnLogin = (Button) findViewById(R.id.login_btn_login);
        mLoginBtnLogin.setOnClickListener(this);
        mLogo = (ImageView) findViewById(R.id.logo);
        mLoginEditPwd = (EditText) findViewById(R.id.login_edit_pwd);
        mLoginEditAccount = (EditText) findViewById(R.id.login_edit_account);
        mLoginBtnCancle = (Button) findViewById(R.id.login_btn_cancle);
        mLoginBtnCancle.setOnClickListener(this);
        mLoginRemember = (CheckBox) findViewById(R.id.Login_Remember);
        mLoginTextChangePwd = (TextView) findViewById(R.id.login_text_change_pwd);
        mLoginView = (RelativeLayout) findViewById(R.id.login_view);
        mLoginSuccessShow = (TextView) findViewById(R.id.login_success_show);
        mLoginSuccessView = (RelativeLayout) findViewById(R.id.login_success_view);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.login_btn_register:
                break;
            case R.id.login_btn_login:
                Intent intent=new Intent(MainActivity.this,Register.class);
                startActivity(intent);
                break;
            case R.id.login_btn_cancle:
                break;
        }
    }
}
