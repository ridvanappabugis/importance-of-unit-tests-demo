package org.example.string;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StringUtilsTest {

    @Test
    void concatenate() {
        Assertions.assertEquals(StringUtils.concatenate("AA", "BB"), "AABB");
    }

    @Test
    void concatenate_null() {
        // Unit tests ask questions!
        // What would happen if we concat with null?
        // Will it fail? Should it fail?
        // What do we need to change for it to not fail?
    }
}