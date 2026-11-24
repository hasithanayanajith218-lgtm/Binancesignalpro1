package com.binancesignalpro;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setGravity(Gravity.CENTER);
        layout.setPadding(30, 30, 30, 30);
        layout.setBackgroundColor(Color.rgb(15, 20, 30));

        TextView title = new TextView(this);
        title.setText("BINANCE SIGNAL PRO");
        title.setTextSize(26);
        title.setTextColor(Color.WHITE);
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("Crypto Trading Signals");
        subtitle.setTextSize(16);
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setGravity(Gravity.CENTER);

        TextView signal = new TextView(this);
        signal.setText("BTC / USDT");
        signal.setTextSize(22);
        signal.setTextColor(Color.YELLOW);
        signal.setGravity(Gravity.CENTER);
        signal.setPadding(0, 40, 0, 20);

        TextView message = new TextView(this);
        message.setText("Signal data is not connected yet.");
        message.setTextSize(16);
        message.setTextColor(Color.WHITE);
        message.setGravity(Gravity.CENTER);

        layout.addView(title);
        layout.addView(subtitle);
        layout.addView(signal);
        layout.addView(message);

        setContentView(layout);
    }
}
