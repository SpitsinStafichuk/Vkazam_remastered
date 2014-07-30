package com.SpitsinStafichuk.vkazam_remastered.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Specifying imageView, that can be represented only in square shape.
 * It can be useful, when you need to draw square, which covers the entire screen width.
 *
 * @author Michael Spitsin
 * @since 2014-07-22
 */
@SuppressWarnings("unused")
public class SquareImageView extends ImageView{

    public SquareImageView(Context context) {
        super(context);
    }

    public SquareImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SquareImageView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @SuppressWarnings("SuspiciousNameCombination")
    @Override
    protected void onMeasure(int width, int height) {
        super.onMeasure(width, height);

        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();

        if (measuredWidth > measuredHeight) {
            setMeasuredDimension(measuredHeight, measuredHeight);
        } else {
            setMeasuredDimension(measuredWidth, measuredWidth);
        }
    }
}
