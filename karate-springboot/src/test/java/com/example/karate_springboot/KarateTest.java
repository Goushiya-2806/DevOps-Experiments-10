
package com.example.karate_springboot;

import com.intuit.karate.junit5.Karate;

class KarateTest {

    @Karate.Test
    Karate testHello() {
        return Karate.run("Hello").relativeTo(getClass());
    }
}
