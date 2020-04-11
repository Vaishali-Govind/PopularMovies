/*
 * Copyright (C) 2015 Teddy Rodriguez (TROD)
 *   email: cia.123trod@gmail.com
 *   github: TROD-123
 *
 * For Udacity's Android Developer Nanodegree
 * P1-2: Popular Movies
 *
 * Currently for educational purposes only.
 */

package com.thirdarm.popularmovies.constant;

/**
 * Created by TROD on 20150911.
 *
 * Class of constants for retrieving images
 */
public final class IMAGE {

    public static final class SIZE {

        public static final class BACKDROP {
            public static final String w300 = "w300";
            public static final String w780 = "w780";
            public static final String w1280 = "w1280";
            public static final String ORIGINAL = "original";
            public static final String[] ALL = {w300, w780, w1280, ORIGINAL};
        }

        public static final class LOGO {
            public static final String w45 = "w45";
            public static final String w92 = "w92";
            public static final String w154 = "w154";
            public static final String w185 = "w185";
            public static final String w300 = "w300";
            public static final String w500 = "w500";
            public static final String ORIGINAL = "original";
            public static final String[] ALL = {w45, w92, w154, w185, w300, w500, ORIGINAL};
        }

        public static final class POSTER {
            public static final String w92 = "w92";
            public static final String w154 = "w154";
            public static final String w185 = "w185";
            public static final String w342 = "w342";
            public static final String w500 = "w500";
            public static final String w780 = "w780";
            public static final String ORIGINAL = "original";
            public static final String[] ALL = {w92, w154, w185, w500, w780, ORIGINAL};
        }

        public static final class PROFILE {
            public static final String w45 = "w45";
            public static final String w185 = "w185";
            public static final String h632 = "h632";
            public static final String ORIGINAL = "original";
            public static final String[] ALL = {w45, w185, h632, ORIGINAL};
        }

        public static final class STILL {
            public static final String w92 = "w92";
            public static final String w185 = "w185";
            public static final String w300 = "w300";
            public static final String ORIGINAL = "original";
            public static final String[] ALL = {w92, w185, w300, ORIGINAL};
        }
    }
}
