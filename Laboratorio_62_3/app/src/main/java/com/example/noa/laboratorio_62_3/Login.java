package com.example.noa.laboratorio_62_3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by noa on 27/02/16.
 */
public class Login extends LinearLayout{

    private OnLoginListener listener;
    private EditText txtUsuario;
    private EditText txtPassword;
    private Button btnLogin;
    private TextView lblMensaje; //el mensaje de CustomView

    public Login(Context context){
        super(context);
        inicializar();
    }

    public Login(Context context, AttributeSet attrs) {
        super(context, attrs);
        inicializar();
        TypedArray a =  getContext().obtainStyledAttributes(attrs,
                        R.styleable.ControlLogin);
        String textoBoton = a.getString(
                R.styleable.ControlLogin_login_text);
        btnLogin.setText(textoBoton);
        a.recycle();
    }

    private void inicializar() {
        String infService = Context.LAYOUT_INFLATER_SERVICE;
        LayoutInflater li = (LayoutInflater)
                getContext().getSystemService(infService);
        li.inflate(R.layout.login, this, true);

        txtUsuario = (EditText)findViewById(R.id.editTextUser);
        txtPassword = (EditText)findViewById(R.id.editTextPassword);
        btnLogin = (Button)findViewById(R.id.buttonLogin);
        lblMensaje = (TextView)findViewById(R.id.textViewMessage);

        asignarEventos();
    }

    public void setOnLoginListener(OnLoginListener l) {
        listener = l;
    }

    private void asignarEventos(){
        btnLogin.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {
                listener.onLogin(txtUsuario.getText().toString(),
                        txtPassword.getText().toString());
            }
        });
    }

    public void setMensaje(String msg){
        lblMensaje.setText(msg);
    }

}

























