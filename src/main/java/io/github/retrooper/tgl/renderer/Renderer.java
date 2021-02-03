package io.github.retrooper.tgl.renderer;

public class Renderer {
    public void create() {
        TGLInternalManager.LIB.create_renderer();
    }

    public void destroy() {
        TGLInternalManager.LIB.destroy_renderer();
    }
}
