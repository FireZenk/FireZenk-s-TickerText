/**
 * 	FireZenk's Ticker text <Ticker text for real>
 *  Copyright (C) 2012 Jorge Garrido Oval (aka: FireZenk)
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.firezenk.tickertext;

import java.util.ArrayList;

import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextView;

public class FZTickerText extends TextView {

	public int ANIMATION_DELAY = 400; //DEFAULT
	
	private int pointer = 0;
	
	private Handler animator = new Handler();
	private Runnable animation = new Runnable() {

		@Override
		public void run() {
			setText(buffer);
			
			buffer = new StringBuffer( buffer.substring(1, buffer.length()) );
			
			buffer.append(bufferCpy.substring(pointer, pointer+1));
			++pointer;
				
			if(pointer+1> bufferCpy.length())
				pointer = 0;
			
			
			if(buffer.length()<1)
				buffer.append(bufferCpy);
			
			animator.postDelayed(animation, ANIMATION_DELAY);
		}
		
	};
	
	private ArrayList<char[]> phrases = new ArrayList<char[]>();
	private StringBuffer buffer = new StringBuffer();
	private StringBuffer bufferCpy = new StringBuffer();
	
	public FZTickerText(Context context) {
		super(context);
		setLines(1);
		setSingleLine(true);
	}
	
	public FZTickerText(Context context, AttributeSet attrs) {
		super(context, attrs);
		setLines(1);
		setSingleLine(true);
	}
	
	@Override
	protected void onDetachedFromWindow() {
		super.onDetachedFromWindow();
		animationStop();
	}

	public void setPhrases(ArrayList<char[]> phrases) {
		this.phrases = phrases;
	}

	public void animationStart() {
		for (char[] chars : phrases) {
			buffer.append("   ");
			buffer.append(chars);
		}
		
		bufferCpy.append(buffer);
		setText(buffer);
		
		animator.postDelayed(animation, ANIMATION_DELAY);
	}
	
	public void animationStop() {
		animator.removeCallbacks(animation);
	}
}
