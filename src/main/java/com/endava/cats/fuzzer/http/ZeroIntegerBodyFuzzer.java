package com.endava.cats.fuzzer.http;

import com.endava.cats.annotations.HttpFuzzer;
import com.endava.cats.fuzzer.executor.SimpleExecutor;
import com.endava.cats.model.FuzzingData;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@HttpFuzzer
public class ZeroIntegerBodyFuzzer extends BaseHttpWithPayloadSimpleFuzzer {
    @Inject
    public ZeroIntegerBodyFuzzer(SimpleExecutor executor) {
        super(executor);
    }

    @Override
    protected String getPayload(FuzzingData data) {
        return "0";
    }

    @Override
    protected String getScenario() {
        return "Send a request with integer 0 (zero) as body";
    }

    @Override
    public String description() {
        return "send a request with integer 0 (zero) as body";
    }
}
