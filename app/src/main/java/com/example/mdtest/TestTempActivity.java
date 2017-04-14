package com.example.mdtest;

import android.app.Activity;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.util.Log;

/**
 * Created by tanwei on 2017/3/6.
 */
public class TestTempActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_temp);

//        boolean focus = findViewById(R.id.test_marque).requestFocus();
//        Log.v("test", "focus1 " + focus);
//        focus = findViewById(R.id.test_marque2).requestFocus();
//        Log.v("test", "focus2 " + focus);

        ConstraintLayout layout = (ConstraintLayout) findViewById(R.id.temp_constraint_layout);

        // new
        ConstraintSet set = new ConstraintSet();
        set.connect(ConstraintSet.LEFT, R.id.temp_text1, ConstraintSet.RIGHT, R.id.temp_text2);
        set.applyTo(layout);

        // clone
        set.clone(layout);
        set.setHorizontalChainStyle(R.id.temp_text1, ConstraintSet.CHAIN_SPREAD_INSIDE);
        set.applyTo(layout);
    }
}
