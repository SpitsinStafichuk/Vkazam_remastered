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

import android.app.Fragment;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.SpitsinStafichuk.vkazam_remastered.FragmentName;

/**
 * Main class for all {@link com.SpitsinStafichuk.vkazam_remastered.adapters.VkazamDrawerAdapter}
 * elements. All new types of adapter elements must extends this class of it subclasses and
 * provides their own layout.
 *
 * @author Michael Spitsin
 * @since 2014-07-23
 */
public interface VkazamDrawerAdapterElement {

    /**
     * Retrieves id of type of specific implementation.
     * ListView has different types of elements, with different layouts.
     * Therefor it is needed to specify type identifier to refresh we,
     * if new view differs from old view, when you scrolling.
     *
     * @return id of type
     */
    int getTypeId();

    /**
     * Retrieves id of layout linked with specific implementation.
     * Each layout of subclass consists of icon, title and summary.
     * <br>
     * So each subclass <strong>must care</strong>, that their own layouts will be with this
     * three components.
     * If subclass's layout not have one of this three elements, that all operations with this
     * missing element will be ignored.
     * <br>
     * <strong>Also</strong> subclasses cannot add new elements, that needed to be handled.
     *
     * @return id of defined layout
     */
    int getLayoutId();

    /**
     * Retrieves id of icon of element. <strong>Note:</strong> if subclass has not
     * this resource in layout, then this method should return
     * {@link com.SpitsinStafichuk.vkazam_remastered.Constants#NO_ID}
     *
     * @return specified id of icon
     */
    int getIconLayoutResId();

    /**
     * Retrieves id of title of element. <strong>Note:</strong> if subclass has not
     * this resource in layout, then this method should return
     * {@link com.SpitsinStafichuk.vkazam_remastered.Constants#NO_ID}
     *
     * @return specified id of icon
     */
    int getTitleLayoutResId();

    /**
     * Retrieves id of summary of element. <strong>Note:</strong> if subclass has not
     * this resource in layout, then this method should return
     * {@link com.SpitsinStafichuk.vkazam_remastered.Constants#NO_ID}
     *
     * @return specified id of icon
     */
    int getSummaryLayoutResId();

    /**
     * Retrieves concrete icon as Drawable
     *
     * @return drawable representing icon
     */
    Drawable getIconDrawable();

    /**
     * Retrieves concrete icon as Bitmap
     *
     * @return drawable representing icon
     */
    Bitmap getIconBitmap();

    /**
     * Retrieves concrete icon as resource element
     *
     * @return id representing icon
     */
    int getIconId();


    /**
     * Retrieves concrete title as String
     *
     * @return title string
     */
    String getTitleString();

    /**
     * Retrieves concrete title as resource element
     *
     * @return id of title string
     */
    int getTitleId();

    /**
     * Retrieves concrete summary as String
     *
     * @return summary string
     */
    String getSummaryString();

    /**
     * Retrieves concrete summary as resource element
     *
     * @return id of summary string
     */
    int getSummaryId();

    /**
     * Calls when some external adapter wants to highlight its item or select this.
     * Each type of drawer item must implement this method to provide it own
     * selection style.
     *
     * @param context
     * @param v view of icon
     * @param selected selected state (true - selected, false - not)
     */
    void setIconSelected(Context context, ImageView v, boolean selected);

    /**
     * Calls when some external adapter wants to highlight its item or select this.
     * Each type of drawer item must implement this method to provide it own
     * selection style.
     *
     * @param context
     * @param v view of title
     * @param selected selected state (true - selected, false - not)
     */
    void setTitleSelected(Context context, TextView v, boolean selected);

    /**
     * Calls when some external adapter wants to highlight its item or select this.
     * Each type of drawer item must implement this method to provide it own
     * selection style.
     *
     * @param context
     * @param v view of summary
     * @param selected selected state (true - selected, false - not)
     */
    void setSummarySelected(Context context, TextView v, boolean selected);

    /**
     * Retrieve fragment name related to this drawer item. Fragment that associated whit this name
     * should be opened, when item is clicked
     *
     * @return fragment linked to this item.
     */
    FragmentName getOpeningFragmentName();

    /**
     * Common holder for all subclasses, that used by
     * {@link com.SpitsinStafichuk.vkazam_remastered.adapters.VkazamDrawerAdapter}.
     *
     * @author Michael Spitsin
     * @since 2014-07-23
     */
    public static class ViewHolder {
        public ImageView icon;
        public TextView title;
        public TextView summary;
    }
}
