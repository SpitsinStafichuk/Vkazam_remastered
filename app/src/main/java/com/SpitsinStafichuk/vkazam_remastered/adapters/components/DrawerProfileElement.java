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

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;

import com.SpitsinStafichuk.vkazam_remastered.R;

/**
 * Implementation of abstract drawer element, that contains
 * information about vk profile of vkazam user.
 *
 * @author Michael Spitsin
 * @since 2014-07-25
 */
@SuppressWarnings("unused")
public class DrawerProfileElement extends SimpleDrawerAdapterElement{

    private DrawerProfileElement(Builder builder) {
        super(builder);
    }

    @Override
    public int getTypeId() {
        return 0;
    }

    @Override
    public int getLayoutId() {
        return R.layout.drawer_header;
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
        return R.id.summary;
    }

    @Override
    public void setIconSelected(Context context, ImageView v, boolean selected) {
        v.setSelected(selected);
    }

    @Override
    public void setTitleSelected(Context context, TextView v, boolean selected) {
        //nothing
    }

    @Override
    public void setSummarySelected(Context context, TextView v, boolean selected) {
        //nothing
    }

    public static class Builder extends SimpleDrawerAdapterElement.Builder {

        public Builder(Context context) {
            super(context);
        }

        @Override
        public SimpleDrawerAdapterElement build() {
            return new DrawerProfileElement(this);
        }
    }
}
