package day04;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VowelFindTest {
    @Test
    void name() {
        VowelFind vf = new VowelFind();
        System.out.println(vf.findVowels("aatheist"));
    }
}