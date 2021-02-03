package io.github.retrooper.tgl.renderer;

import io.github.retrooper.tgl.TGLLibrary;
import io.github.retrooper.tgl.utils.system.SystemOS;
import jnr.ffi.LibraryLoader;

public class TGLInternalManager {
    public static TGLLibrary LIB;

    static {
        String libLocation = "src/main/resources/libtinygamelibrary";
        String prefix;
        switch (SystemOS.getOS()) {
            case WINDOWS:
                prefix = ".dll";
                break;
            case MACOS:
                prefix = ".dylib";
                break;
            default:
                prefix = ".so"; //Linux or other unix os
                break;
        }
        LIB = LibraryLoader.create(TGLLibrary.class).load(libLocation + prefix);
    }
}
