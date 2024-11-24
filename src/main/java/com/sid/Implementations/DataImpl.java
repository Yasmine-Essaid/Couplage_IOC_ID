package com.sid.Implementations;

import com.sid.Interfaces.IData;
import org.springframework.stereotype.Component;

@Component("data")
public class DataImpl implements IData {
    @Override
    public Double getData() {
        return 10.6;
    }
}
