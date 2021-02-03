package io.github.retrooper.tgl;
public interface TGLLibrary {
    void init_tgl();

    void create_window(String title, int width, int height);

    void create_renderer();

    void handle_loop();

    void destroy_renderer();

    void destroy_window();

    void terminate_tgl();
}
