package io.github.retrooper.tgl;

import io.github.retrooper.tgl.renderer.TGLInternalManager;

public class TGL {
    public static void init() {
        TGLInternalManager.LIB.init_tgl();
    }

    public static void terminate() {
        TGLInternalManager.LIB.terminate_tgl();
    }

    public static void handleLoop() {
        TGLInternalManager.LIB.handle_loop();
    }
}
