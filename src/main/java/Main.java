import io.github.retrooper.tgl.TGL;
import io.github.retrooper.tgl.renderer.Renderer;
import io.github.retrooper.tgl.window.Window;

public class Main {
    public static void main(String[] args) {
        TGL.init();
        Window window = new Window("Hey", 800, 600);
        window.create();

        Renderer renderer = new Renderer();
        renderer.create();

        TGL.handleLoop();

        renderer.destroy();
        window.destroy();

        TGL.terminate();
    }
}
