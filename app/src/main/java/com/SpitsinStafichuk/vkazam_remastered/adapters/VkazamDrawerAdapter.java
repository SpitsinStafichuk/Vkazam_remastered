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

import com.SpitsinStafichuk.vkazam_remastered.adapters.components.VkazamDrawerAdapterElement;

import java.util.List;

/**
 * Main implementation of {@link BindBaseAdapter} for drawer. It handles 3 types of elements:
 * header element, primary menu element and secondary menu element.
 * <br>
 * First type using to
 *
 * @author Michael Spitsin
 * @since 2014-07-23
 */
public class VkazamDrawerAdapter extends BindBaseAdapter {

    private List<VkazamDrawerAdapterElement> mItems;

    public VkazamDrawerAdapter(List<VkazamDrawerAdapterElement> items) {
        if (items == null) {
            throw new NullPointerException("items must not be null");
        }

        mItems = items;
    }

    @Override
    protected View newView(ViewGroup parent) {
        //TODO implement
        return null;
    }

    @Override
    protected void bindView(View view, int position) {
        //TODO implement
    }

    @Override
    public int getCount() {
        //TODO implement
        return 0;
    }

    @Override
    public Object getItem(int position) {
        //TODO implement
        return null;
    }

    @Override
    public long getItemId(int position) {
        //TODO implement
        return 0;
    }
}
