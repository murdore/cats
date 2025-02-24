package com.endava.cats.fuzzer.http;

import com.endava.cats.annotations.HttpFuzzer;
import com.endava.cats.fuzzer.executor.SimpleExecutor;
import com.endava.cats.model.FuzzingData;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@Singleton
@HttpFuzzer
public class NullUnicodeSymbolBodyFuzzer extends BaseHttpWithPayloadSimpleFuzzer {

    @Inject
    public NullUnicodeSymbolBodyFuzzer(SimpleExecutor executor) {
        super(executor);
    }

    @Override
    protected String getPayload(FuzzingData data) {
        return "␀";
    }

    @Override
    protected String getScenario() {
        return "Send a request with a ␀ body";
    }

    @Override
    public String description() {
        return "send a request with a ␀ body";
    }
}