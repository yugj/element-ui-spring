package org.github.yugj.element.ui.spring.endpoint;

import org.github.yugj.element.ui.spring.model.TestData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yugj
 * @date 2020/7/1 5:47 下午.
 */
@RestController
public class TestEndpoint {


    @RequestMapping("/t/list")
    public ResponseEntity<List<TestData>> list() {
        List<TestData> data = new ArrayList<>();
        TestData t1 = new TestData("20200101","880-111","yugj");
        TestData t2 = new TestData("20200103","880-111","yugj");
        TestData t3 = new TestData("20200105","880-111","yugj");

        data.add(t1);
        data.add(t2);
        data.add(t3);

        return new ResponseEntity<>(data, HttpStatus.OK);
    }
}
