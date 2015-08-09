/*
Copyright 2014 Yahoo Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package com.yahoo.mobile.client.android.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.yahoo.mobile.client.android.util.rangeseekbar.RangeSeekBar;

public class DemoActivity extends Activity {

    private static final String TAG = "DemoActivity";

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        ((RangeSeekBar)findViewById(R.id.sb_setter_0)).setOnRangeSeekBarChangeListener(new RangeSeekBar.OnRangeSeekBarChangeListener() {
            @Override
            public void onRangeSeekBarValuesChanged(RangeSeekBar bar, Object minValue, Object maxValue) {
                Log.d(TAG, "single thumb current value: " + maxValue);
            }
        });
    }
}
