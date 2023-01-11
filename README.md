# Siviso Lite
An android app changes your phone's ringmode based on location. I made this so that when I was in a college class my phone would go on vibrate as I had once had a call in the middle of class which was quite embarrassing.

# Personal Experience
Personally, I made several different versions to explore different programming procedures. Older iterations [1st](https://github.com/pplluumm/SiViSo-Map-Schedule/tree/master/AndroidStudio/SiViSoMapSchedule "SiViSoMapSchedule"), [2nd](https://github.com/pplluumm/SiViSo-Map-Schedule/tree/master/AndroidStudio/SivisoLite "SivisoLite"), [3rd](https://github.com/pplluumm/SiViSo-Map-Schedule/tree/master/AndroidStudio/Siviso "Siviso Older"), [4th](https://github.com/pplluumm/Siviso "Siviso")

While the app is entirely written in Java I did experiment with different libraries junit, mockito, roboletric, SQLite. As well as different methodologies evolving from the test last, to test first, to code coverage is 100% in classes that manipulated data and 0% for classes that initialized the classes aka the classes that change frequently due to constraints. There were two instances where I learned KISS. The first was when I needed some way to store the GPS location for the home and the ringmode type for inside and outside the home. I used SQLite in the first iteration but then I watched one of Uncle Bob's videos and realized that I didn't need something that powerful and instead I should go with the less elegant but more practical solution of storing the small amount of data in user preferences. The second encounter with KISS was ditching robolectric and espresso as they didn't fit with such a small project that had so many rapid changes and experiments and instead stuck with the core of testing JUnit and Mockito.

# Published Here
[Google Play Store](https://play.google.com/store/apps/details?id=com.jordan.betcher.siviso.sivisolite&hl=en&gl=US "Siviso Lite").

# Issues
The heavy usage of GPS drains a lot of battery. And workarounds that I've explored are invasive permission-wise, i.e. changing ringmode based on wifi requires bigger permission which I'm not comfortable requiring of the user.


