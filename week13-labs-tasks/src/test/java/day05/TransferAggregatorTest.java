package day05;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TransferAggregatorTest {
    @Test
    void name() throws IOException {
        TransferAggregator ta = new TransferAggregator();
        List<TransferClient> tcList = ta.readTransfers(Path.of("src/main/resources/transfers.csv"));
        assertEquals(1000, tcList.size());
        Map<String, TransferPerClient> results= ta.makeMapFromList(tcList);
        System.out.println(results);
    }
}