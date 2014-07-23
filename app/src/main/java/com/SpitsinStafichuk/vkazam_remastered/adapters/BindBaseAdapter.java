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
package com.SpitsinStafichuk.vkazam_remastered.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Abstract implementation of {@link android.widget.BaseAdapter}, that separates
 * getView into creating new view {@link BindBaseAdapter#newView(android.view.ViewGroup)}
 * and binding existing view {@link BindBaseAdapter#bindView(android.view.View, int)}.
 *
 * @author Michael Spitsin
 * @since 2014-07-09
 */
public abstract class BindBaseAdapter extends BaseAdapter {

    @Override
    public final View getView(int position, View convertView, ViewGroup parent) {

        View v;
        if (convertView == null) {
            v = newView(parent);
        } else {
            v = convertView;
        }

        bindView(v, position);
        return v;
    }

    /**
     * Calls when another taken in {@link BindBaseAdapter#getView(int, android.view.View, android.view.ViewGroup)}
     * element is not exists and it is needed to create it from layout.
     *
     * @param parent parent view group
     * @return created View
     */
    protected abstract View newView(ViewGroup parent);

    /**
     * Calls when another taken in {@link BindBaseAdapter#getView(int, android.view.View, android.view.ViewGroup)}
     * element is exists and it is needed to bind it (set up it).
     *
     * @param view given created of existing view
     * @param position position of this view
     */
    protected abstract void bindView(View view, final int position);
}
