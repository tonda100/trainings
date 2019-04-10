import java.io.File;
import java.util.List;

import org.datavec.image.loader.BaseImageLoader;
import org.datavec.image.loader.NativeImageLoader;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.util.ModelSerializer;
import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.dataset.DataSet;


/**
 * TODO write JavaDoc
 *
 * @author Antonin Stoklasek
 */
public class AnimalExecutor {
    protected static int height = 100;
    protected static int width = 100;
    protected static int channels = 3;

    private static final String[] labels = { "giraffe", "rainbow" };

    public static void main(String[] args) throws Exception {
        MultiLayerNetwork network = ModelSerializer.restoreMultiLayerNetwork("model.bin");

        BaseImageLoader imageLoader = new NativeImageLoader(height, width, channels);
        INDArray image = imageLoader.asMatrix(new File("test-images/c.jpg"));


        INDArray output = network.output(image);

        double[] result = new double[(int) output.data().length()];
        for (int i = 0; i < result.length; i++) {
            System.out.println(labels[i] + ": " + output.data().getDouble(i));
        }
    }

}
