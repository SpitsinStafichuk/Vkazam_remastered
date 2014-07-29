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

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.SpitsinStafichuk.vkazam_remastered.Constants;
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
    public static final int COUNT_OF_ITEM_TYPES = 3;

    private Context mContext;
    private List<VkazamDrawerAdapterElement> mItems;
    private int mSelectedItemPosition = 1;

    public VkazamDrawerAdapter(Context context, List<VkazamDrawerAdapterElement> items) {
        if (items == null) {
            throw new NullPointerException("items must be not null");
        }

        if (context == null) {
            throw new NullPointerException("context must be not null");
        }

        mItems = items;
        mContext = context;
    }

    @Override
    protected View newView(ViewGroup parent, int position) {
        VkazamDrawerAdapterElement element = mItems.get(position);
        LayoutInflater layoutInflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(element.getLayoutId(), parent, false);

        if (view != null) {
            VkazamDrawerAdapterElement.ViewHolder holder = new VkazamDrawerAdapterElement.ViewHolder();
            holder.icon = (ImageView) view.findViewById(element.getIconLayoutResId());
            holder.title = (TextView) view.findViewById(element.getTitleLayoutResId());
            holder.summary = (TextView) view.findViewById(element.getSummaryLayoutResId());
            view.setTag(holder);
        } else {
            throw new IllegalStateException("View not created");
        }

        return view;
    }

    @Override
    protected void bindView(View view, int position) {
        if (view.getTag() == null) {
            throw new IllegalArgumentException("view must contains this own holder");
        }

        VkazamDrawerAdapterElement element = mItems.get(position);
        VkazamDrawerAdapterElement.ViewHolder holder = (VkazamDrawerAdapterElement.ViewHolder) view.getTag();

        if (holder.icon != null) {
            if (element.getIconId() != Constants.NO_ID) {
                holder.icon.setImageResource(element.getIconId());
            } else if (element.getIconDrawable() != null) {
                holder.icon.setImageDrawable(element.getIconDrawable());
            } else if (element.getIconBitmap() != null) {
                holder.icon.setImageBitmap(element.getIconBitmap());
            }

            element.setIconSelected(mContext, holder.icon, mSelectedItemPosition == position);
        }

        if (holder.title != null) {
            if (element.getTitleId() != Constants.NO_ID) {
                holder.title.setText(element.getTitleId());
            } else if (element.getTitleString() != null) {
                holder.title.setText(element.getTitleString());
            }

            element.setTitleSelected(mContext, holder.title, mSelectedItemPosition == position);
        }

        if (holder.summary != null) {
            if (element.getSummaryId() != Constants.NO_ID) {
                holder.summary.setText(element.getSummaryId());
            } else if (element.getSummaryString() != null) {
                holder.summary.setText(element.getSummaryString());
            }

            element.setSummarySelected(mContext, holder.summary, mSelectedItemPosition == position);
        }
    }

    @Override
    public int getItemViewType(int position) {
        return mItems.get(position).getTypeId();
    }

    @Override
    public int getViewTypeCount() {
        return COUNT_OF_ITEM_TYPES;
    }

    @Override
    public int getCount() {
        return mItems.size();
    }

    @Override
    public Object getItem(int position) {
        return mItems.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public void setItemChecked(int position) {
        mSelectedItemPosition = position;
    }
}
