package io.github.retrooper.tgl.renderer;

import io.github.retrooper.tgl.window.Window;

public class Renderer {
    private final int index;
    public Renderer(Window window) {
        index = TGLInternalManager.LIB.construct_renderer(window.index);
    }

    public void prepare() {
        TGLInternalManager.LIB.prepare_renderer(index);
    }

    public void init() {
        TGLInternalManager.LIB.init_renderer(index);
    }

    public void preRenderProcess() {
        TGLInternalManager.LIB.pre_render_process(index);
    }

    public void render() {
        TGLInternalManager.LIB.render(index);
    }

    public void destroy() {
        TGLInternalManager.LIB.destroy_renderer(index);
    }
}
