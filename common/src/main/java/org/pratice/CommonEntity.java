package org.pratice;

import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class CommonEntity {
    public CommonEntity(int id) {
        this.id = id;
    }

    public int id;
    private final Map map = new ImmutableMap.Builder<Object, Object>()
            .put(1, "")
            .build();
}
