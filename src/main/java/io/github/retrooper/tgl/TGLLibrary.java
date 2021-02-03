package io.github.retrooper.tgl;
public interface TGLLibrary {
    void init_tgl();

    int construct_window(String title, int width, int height);

    void create_window(int index);

    int construct_renderer(int windowIndex);

    void prepare_renderer(int index);

    void init_renderer(int index);

    boolean window_should_close(int index);

    void update_window(int index);

    void pre_render_process(int index);

    void render(int index);

    void handle_loop();

    void destroy_renderer(int index);

    void destroy_window(int index);

    void terminate_tgl();
}
