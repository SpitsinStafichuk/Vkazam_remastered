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

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

import com.SpitsinStafichuk.vkazam_remastered.Constants;

/**
 * Simple implementation of {@link VkazamDrawerAdapterElement}. Contains
 * own Builder and implementations of function that gives information
 * about concrete text and images.
 * <br>
 * All subclasses need only specify layout and ids of necessary elements and
 * extend their own Builder.
 *
 * @author Michael Spitsin
 * @since 2014-07-25
 */
@SuppressWarnings("unused")
public abstract class SimpleDrawerAdapterElement implements VkazamDrawerAdapterElement{

    private int iconRes;
    private Drawable iconDrawable;
    private Bitmap iconBitmap;
    private int titleRes;
    private String titleString;
    private int summaryRes;
    private String summaryString;

    protected SimpleDrawerAdapterElement(Builder builder) {
        this.iconRes = builder.iconRes;
        this.iconDrawable = builder.iconDrawable;
        this.iconBitmap = builder.iconBitmap;
        this.titleRes = builder.titleRes;
        this.titleString = builder.titleString;
        this.summaryRes = builder.summaryRes;
        this.summaryString = builder.summaryString;
    }

    @Override
    public Drawable getIconDrawable() {
        return iconDrawable;
    }

    @Override
    public Bitmap getIconBitmap() {
        return iconBitmap;
    }

    @Override
    public int getIconId() {
        return iconRes;
    }

    @Override
    public String getTitleString() {
        return titleString;
    }

    @Override
    public int getTitleId() {
        return titleRes;
    }

    @Override
    public String getSummaryString() {
        return summaryString;
    }

    @Override
    public int getSummaryId() {
        return summaryRes;
    }

    /**
     * Common builder for {@link SimpleDrawerAdapterElement} that allows to choose
     * what type of icon (res, drawable, bitmap), title (res, string) and summary (res, string)
     * will be added.
     *
     * @author Michael Spitsin
     * @since 2014-07-25
     */
    public abstract static class Builder {
        private int iconRes = Constants.NO_ID;
        private Drawable iconDrawable;
        private Bitmap iconBitmap;
        private int titleRes = Constants.NO_ID;
        private String titleString;
        private int summaryRes = Constants.NO_ID;
        private String summaryString;

        @SuppressWarnings("unused")
        public Builder setIconRes(int iconRes) {
            this.iconRes = iconRes;
            return this;
        }

        @SuppressWarnings("unused")
        public Builder setIconDrawable(Drawable iconDrawable) {
            this.iconDrawable = iconDrawable;
            return this;
        }

        @SuppressWarnings("unused")
        public Builder setIconBitmap(Bitmap iconBitmap) {
            this.iconBitmap = iconBitmap;
            return this;
        }

        @SuppressWarnings("unused")
        public Builder setTitleRes(int titleRes) {
            this.titleRes = titleRes;
            return this;
        }

        @SuppressWarnings("unused")
        public Builder setTitleString(String titleString) {
            this.titleString = titleString;
            return this;
        }

        @SuppressWarnings("unused")
        public Builder setSummaryRes(int summaryRes) {
            this.summaryRes = summaryRes;
            return this;
        }

        @SuppressWarnings("unused")
        public Builder setSummaryString(String summaryString) {
            this.summaryString = summaryString;
            return this;
        }

        public abstract SimpleDrawerAdapterElement build();
    }
}
