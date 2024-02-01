import java.util.List;
import java.util.Collections;
public class StreamService {
    public void sortStreams(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator());
    }
    
}
