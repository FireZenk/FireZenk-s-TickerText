FireZenk's TickerText
======================

Android Ticker Text for real

Live demo: [YouTube video](uploading...)

USAGE:
----------------------

1- Add FireZenk's TickerText to your project has a library

2- Add the progress bar on your xml layout for example:

    <com.firezenk.tickertext.FZTickerText
        android:layout_width="fill_parent"
        android:layout_height="wrap_content"
        android:id="@+id/ticker1" />
          
3- In your code:

  1- Import the progress bar:
  
    import com.firezenk.tickertext.FZTickerText;
    
  2- Retrieve the element:
  
    FZTickerText ticker1 = (FZTickerText) findViewById(R.id.ticker1);
    
  3- Create and add the content:
  
    ArrayList<char[]> phrases = new ArrayList<char[]>();

    phrases.add(new String("Hello!").toCharArray());
    phrases.add(new String("My name is FireZenk").toCharArray());
    phrases.add(new String("This is the Firezenk's Ticker Text test").toCharArray());
    phrases.add(new String("Visit http://firezenk.com for more...").toCharArray());

    ticker1.setPhrases(phrases);
    
  4- Start/stop the progress animation:
  
    ticker1.animationStart();
    ticker1.animationStop();

4- Enjoy!

LICENSE:
----------------------

    FireZenk's Ticker text <Ticker text for real>
    Copyright (C) 2012 Jorge Garrido Oval (aka: FireZenk)

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see http://www.gnu.org/licenses/