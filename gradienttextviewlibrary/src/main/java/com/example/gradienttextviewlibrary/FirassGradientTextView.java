package com.example.gradienttextviewlibrary;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.widget.TextView;


public class FirassGradientTextView extends AppCompatTextView {
    public String  startColor;
    public String endColor;
    public int gradientWidth;
    public int gradientHeight;
    public FirassGradientTextView(Context context,String startColor , String endColor,int gradientWidth , int gradientHeight, TextView textView) {
        super(context);
        this.startColor = startColor;
        this.endColor = endColor;
        this.gradientWidth = gradientWidth;
        this.gradientHeight = gradientHeight;
        setGradient(textView);
    }
    public FirassGradientTextView (Context context)
    {
        super(context);
    }
    public FirassGradientTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public FirassGradientTextView(Context context,
                            AttributeSet attrs,
                            int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

   public void setGradient (TextView textView)
   {
       Shader myShader = new LinearGradient(
               0, 0, gradientWidth, gradientHeight,
               Color.parseColor(startColor), Color.parseColor(endColor),
               Shader.TileMode.CLAMP );
       textView.getPaint().setShader(myShader);
   }



}