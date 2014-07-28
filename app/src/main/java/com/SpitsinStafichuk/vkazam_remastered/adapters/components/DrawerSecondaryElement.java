/*******************************************************************************
 * Copyright 2014 SpitsinStafichuk
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.SpitsinStafichuk.vkazam_remastered.adapters.components;

import android.graphics.Typeface;
import android.widget.ImageView;
import android.widget.TextView;

import com.SpitsinStafichuk.vkazam_remastered.Constants;
import com.SpitsinStafichuk.vkazam_remastered.R;

/**
 * Implementation of abstract drawer element, that navigates user to
 * secondary pages: options, about, send feedback.
 *
 * @author Michael Spitsin
 * @since 2014-07-25
 */
@SuppressWarnings("unused")
public class DrawerSecondaryElement extends SimpleDrawerAdapterElement{

    private DrawerSecondaryElement(Builder builder) {
        super(builder);
    }

    @Override
    public int getTypeId() {
        return 2;
    }

    @Override
    public int getLayoutId() {
        return R.layout.drawer_item_secondary;
    }

    @Override
    public int getIconLayoutResId() {
        return R.id.icon;
    }

    @Override
    public int getTitleLayoutResId() {
        return R.id.title;
    }

    @Override
    public int getSummaryLayoutResId() {
        return Constants.NO_ID;
    }

    @Override
    public void setIconSelected(ImageView v, boolean selected) {
        v.setSelected(selected);
    }

    @Override
    public void setTitleSelected(TextView v, boolean selected) {
        if (selected) {
            v.setTypeface(null, Typeface.BOLD);
        } else {
            v.setTypeface(null, Typeface.NORMAL);
        }
    }

    @Override
    public void setSummarySelected(TextView v, boolean selected) {
        //nothing because there is no summary
    }

    public static class Builder extends SimpleDrawerAdapterElement.Builder {

        @Override
        public SimpleDrawerAdapterElement build() {
            return new DrawerSecondaryElement(this);
        }
    }
}
