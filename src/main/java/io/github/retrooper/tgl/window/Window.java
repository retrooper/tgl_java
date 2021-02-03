package io.github.retrooper.tgl.window;

import io.github.retrooper.tgl.renderer.TGLInternalManager;

public class Window {
    private String title;
    private int width;
    private int height;

    public Window(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
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
        TGLInternalManager.LIB.create_window(title, width, height);
    }

    public void destroy() {
        TGLInternalManager.LIB.destroy_window();
    }
}
