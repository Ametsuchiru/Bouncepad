package com.cleanroommc.bouncepad.api.property;

import java.util.Objects;

public final class SystemProps {

    public static String set(String key, Object value) {
        Objects.requireNonNull(key, "System property key cannot be null!");
        Objects.requireNonNull(value, "System property value cannot be null!");
        return System.setProperty(key, value.toString());
    }

    public static String set(String key, long value) {
        return set(key, String.valueOf(value));
    }

    public static String set(String key, double value) {
        return set(key, String.valueOf(value));
    }

    public static String set(String key, char value) {
        return set(key, String.valueOf(value));
    }

    public static String set(String key, boolean value) {
        return set(key, String.valueOf(value));
    }

    public static String get(String key) {
        Objects.requireNonNull(key, "System property key cannot be null!");
        return System.getProperty(key);
    }

    public static int getInt(String key) {
        return Integer.parseInt(get(key));
    }

    public static long getLong(String key) {
        return Long.parseLong(get(key));
    }

    public static float getFloat(String key) {
        return Float.parseFloat(get(key));
    }

    public static double getDouble(String key) {
        return Double.parseDouble(get(key));
    }

    public static double getChar(String key) {
        return get(key).charAt(0);
    }

    public static boolean getBool(String key) {
        return Boolean.parseBoolean(get(key));
    }

    private SystemProps() { }

}
