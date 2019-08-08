package com.force.click.cfaadinnerinterstitalviewsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.clickforce.ad.AdInnerInterstitalView;
import com.clickforce.ad.Listener.AdInnerInterstitalViewListener;

public class MainActivity extends AppCompatActivity {

    private AdInnerInterstitalView adInnerItstl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adInnerItstl = (AdInnerInterstitalView) findViewById(R.id.innerItstl);
        adInnerItstl.init(this);
        adInnerItstl.getInnerFullScreenAd(9702);
        adInnerItstl.AbsoluteErrorValueY = 100;
        adInnerItstl.outputDebugInfo = true;
        adInnerItstl.setOnAdInnerInterstitalViewListener(new AdInnerInterstitalViewListener() {
            @Override
            public void onFailToInnerFullAd() {
                Log.d("Clickforce","onFailToInnerFullAd");
            }

            @Override
            public void onSuccessToInnerFullAd() {
                Log.d("Clickforce","onSuccessToInnerFullAd");
                adInnerItstl.show();
            }

            @Override
            public void onClickToInnerFullAd() {
                Log.d("Clickforce","onClickToInnerFullAd");
            }
        });

    }
}
