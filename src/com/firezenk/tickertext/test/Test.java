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
package com.firezenk.tickertext.test;

import java.util.ArrayList;

import com.firezenk.tickertext.FZTickerText;

import android.app.Activity;
import android.os.Bundle;

public class Test extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		FZTickerText ticker1 = (FZTickerText) findViewById(R.id.ticker1);
		
		ArrayList<char[]> phrases = new ArrayList<char[]>();
		phrases.add(new String("Hello!").toCharArray());
		phrases.add(new String("My name is FireZenk").toCharArray());
		phrases.add(new String("This is the Firezenk's Ticker Text test").toCharArray());
		phrases.add(new String("Visit http://firezenk.com for more...").toCharArray());
		
		ticker1.ANIMATION_DELAY = 300;
		ticker1.setPhrases(phrases);
		ticker1.animationStart();
	} 
	
}
