/**
 * Copyright © 2013, Brien Coffield. All rights reserved.
 *
 * This file is part of SocialBase project; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License, Version 3.
 *
 * SocialBase is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License,
 * along with this program. If not, see http://www.gnu.org/licenses/.
 */
package com.bcoffield.socialbase;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class SocialBaseActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }

    public void facebookClick(View v) {
        // Give the app permissions.
    }

    public void linkedInClick(View v) {
        // Give the app permissions.
    }

    public void pinterestClick(View v) {
        // Give the app permissions.
    }

    public void googlePlusClick(View v) {
        // Give the app permissions.
    }

    public void twitterClick(View v) {
        // Give the app permissions.
    }
}

