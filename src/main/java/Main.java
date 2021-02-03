import io.github.retrooper.tgl.TGL;
import io.github.retrooper.tgl.renderer.Renderer;
import io.github.retrooper.tgl.window.Window;

public class Main {
    public static void main(String[] args) {
        TGL.init();

        Window window = new Window("Hello, World", 1280, 720);

        Renderer renderer = new Renderer(window);

        window.create();

        renderer.prepare(); //Window is not in use at this point

        renderer.init(); //Window is in use at this point

        while (!window.shouldClose()) {
            window.update();

            renderer.preRenderProcess();

            renderer.render();
        }

        renderer.destroy();
        window.destroy();

        TGL.terminate();
    }
}
