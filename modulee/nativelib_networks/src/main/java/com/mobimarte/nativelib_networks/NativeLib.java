package com.mobimarte.nativelib_networks;

public class NativeLib {

    // Used to load the 'nativelib_networks' library on application startup.
    static {
        System.loadLibrary("nativelib_networks");
    }

    /**
     * A native method that is implemented by the 'nativelib_networks' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}