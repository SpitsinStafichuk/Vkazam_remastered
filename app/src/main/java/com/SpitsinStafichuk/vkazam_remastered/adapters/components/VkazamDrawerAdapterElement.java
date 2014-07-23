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

import android.widget.ImageView;
import android.widget.TextView;

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
    public abstract int getLayoutId();

    /**
     * Retrieves id of icon of element. <strong>Note:</strong> if subclass has not
     * this resource in layout, then this method should return
     * {@link com.SpitsinStafichuk.vkazam_remastered.Constants#NO_ID}
     *
     * @return specified id of icon
     */
    public abstract int getIconResId();

    /**
     * Retrieves id of title of element. <strong>Note:</strong> if subclass has not
     * this resource in layout, then this method should return
     * {@link com.SpitsinStafichuk.vkazam_remastered.Constants#NO_ID}
     *
     * @return specified id of icon
     */
    public abstract int getTitleResId();

    /**
     * Retrieves id of summary of element. <strong>Note:</strong> if subclass has not
     * this resource in layout, then this method should return
     * {@link com.SpitsinStafichuk.vkazam_remastered.Constants#NO_ID}
     *
     * @return specified id of icon
     */
    public abstract int getSummaryResId();

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
