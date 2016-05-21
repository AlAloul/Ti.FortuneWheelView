/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package de.appwerft.fortunewheelview;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.common.Log;

import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiC;

import org.appcelerator.titanium.util.TiConvert;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiCompositeLayout;
import org.appcelerator.titanium.view.TiCompositeLayout.LayoutArrangement;
import org.appcelerator.titanium.view.TiUIView;

import android.app.Activity;

import  	java.util.ArrayList;
import  	java.util.HashMap;


// This proxy can be created by calling Wheel.createExample({message: "hello world"})
@Kroll.proxy(creatableInModule = WheelViewModule.class)
public class WheelViewProxy extends TiViewProxy {
	// Standard Debugging variables
	private static final String LCAT = "WheelView";
	public WheelView mView;
	public String[] icons;
	public HashMap<String,Object> options;
	
	// Constructor
	public WheelViewProxy() {
		super();
	}

	@Override
	public TiUIView createView(Activity activity) {
		mView = new WheelView(this);
		mView.getLayoutParams().autoFillsHeight = true;
		mView.getLayoutParams().autoFillsWidth = true;
		mView.addWheel(icons,options);
		return mView;
	}

	// Handle creation options
	@Override
	public void handleCreationDict(KrollDict args) {
		super.handleCreationDict(args);
		if (args.containsKey("icons")) {
			icons = args.getStringArray("icons");
		}
		if (args.containsKey("options")) {
			options = args.getKrollDict("options");
		}
		
	}
	
}