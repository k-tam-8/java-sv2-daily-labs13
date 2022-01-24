package day05;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TransferAggregator {

    public List<TransferClient> readTransfers(Path path) throws IOException {
        List<String> lines = Files.readAllLines(path);
        List<TransferClient> summarize = new ArrayList<>();
        for (String s : lines) {
            String[] arrSt = s.split(",");
            summarize.add(new TransferClient(arrSt[0], arrSt[1], Integer.parseInt(arrSt[2])));
        }
        return summarize;
    }

    public Map<String, TransferPerClient> makeMapFromList(List<TransferClient> summarize) {
        Map<String, TransferPerClient> resultMap = new TreeMap<>();
        for (TransferClient tc : summarize) {
            if (!resultMap.containsKey(tc.getGetId())) {
                resultMap.put(tc.getGetId(), new TransferPerClient(tc.getGetId(), 0, 0));
            }
            if (!resultMap.containsKey(tc.getSenderId())) {
                resultMap.put(tc.getSenderId(), new TransferPerClient(tc.getSenderId(), 0, 0));
            }
            resultMap.get(tc.getGetId()).increase(tc.getAmount());
            resultMap.get(tc.getSenderId()).decrease(tc.getAmount());
        }
        return resultMap;
    }


}
