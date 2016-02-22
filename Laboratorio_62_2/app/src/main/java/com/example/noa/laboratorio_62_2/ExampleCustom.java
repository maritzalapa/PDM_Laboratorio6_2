package com.example.noa.laboratorio_62_2;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.EditText;

/**
 * Created by noa on 22/02/16.
 */
public class ExampleCustom extends EditText {

    float escala;
    Paint p1, p2;

    public ExampleCustom(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs,defStyle);
        inicializacion();
    }
    public ExampleCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
        inicializacion();
    }
    public ExampleCustom(Context context) {
        super(context);
        inicializacion();
    }

    private void inicializacion(){
        p1 = new Paint(Paint.ANTI_ALIAS_FLAG);
        p1.setColor(Color.BLACK);
        p1.setStyle(Paint.Style.FILL);
        p2 = new Paint(Paint.ANTI_ALIAS_FLAG);
        p2.setColor(Color.WHITE);
        p2.setTextSize(20);
        escala = getResources().getDisplayMetrics().density;
    }

    @Override
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(this.getWidth() - 30 * escala, 5 * escala,
                this.getWidth() - 5 * escala, 20 * escala, p1) ;
        canvas.drawText("" + this.getText().toString().length(),
                this.getWidth()-28*escala, 17*escala, p2);
    }


}




























