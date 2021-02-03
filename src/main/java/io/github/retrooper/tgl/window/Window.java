package io.github.retrooper.tgl.window;

import io.github.retrooper.tgl.renderer.TGLInternalManager;

public class Window {
    private final String title;
    private final int width;
    private final int height;
    public final int index;

    public Window(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
        index = TGLInternalManager.LIB.construct_window(title, width, height);
    }

    public String getTitle() {
        return title;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void create() {
        TGLInternalManager.LIB.create_window(index);
    }

    public boolean shouldClose() {
        return TGLInternalManager.LIB.window_should_close(index);
    }

    public void update() {
        TGLInternalManager.LIB.update_window(index);
    }

    public void destroy() {
        TGLInternalManager.LIB.destroy_window(index);
    }
}
