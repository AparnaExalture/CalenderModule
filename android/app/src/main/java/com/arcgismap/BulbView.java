package com.arcgismap;

import android.content.Context;
import android.graphics.Color;
import android.widget.Button;
import androidx.appcompat.widget.AppCompatButton;

public class BulbView extends AppCompatButton {

    public BulbView(Context context) {
        super(context);
        this.setTextColor(Color.BLUE);
        this.setText("This button is created from JAVA code");
    }
}
