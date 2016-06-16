package com.example.imageswitchviewtest;

import android.content.Context;
import android.graphics.Camera;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.widget.ImageView;

public class Image3DView extends ImageView {

	private Camera mCamera;

	private Matrix mMatrix;

	private int mIndex;

	public Image3DView(Context context, AttributeSet attrs) {
		super(context, attrs);
		mCamera = new Camera();
		mMatrix = new Matrix();
	}

}
