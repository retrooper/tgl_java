package io.github.retrooper.tgl.utils.system;

/**
 * System Operating system.
 * @author retrooper
 */
public enum SystemOS {
    WINDOWS, MACOS, LINUX, OTHER;

    private static SystemOS value;

    /**
     * Get the server's operating system.
     * This method will NOT cache.
     *
     * @return Operating System.
     */
    public static SystemOS getOSNoCache() {
        final String os = System.getProperty("os.name");
        for (final String osName : getOperatingSystemNames()) {
            if (os.toLowerCase().contains(osName.toLowerCase())) {
                return SystemOS.valueOf(osName);
            }
        }
        return OTHER;
    }

    /**
     * Get the server's operating system.
     * This method will CACHE for you.
     *
     * @return Operating System.
     */
    public static SystemOS getOS() {
        if (value == null) {
            value = getOSNoCache();
        }
        return value;
    }

    /**
     * Get the server's operating system.
     * This method will CACHE for you.
     *
     * @return Operating System.
     * @deprecated Use {@link #getOS()}, method renamed.
     */
    @Deprecated
    public static SystemOS getOperatingSystem() {
        return getOS();
    }

    /**
     * Internally used method to get the names of all operating systems.
     *
     * @return Operating system names array.
     */
    private static String[] getOperatingSystemNames() {
        final SystemOS[] values = values();
        final int valuesLength = values.length - 1;
        final String[] arr = new String[valuesLength];
        for (int i = 0; i < valuesLength; i++) {
            arr[i] = values[i].name();
        }
        return arr;
    }
}