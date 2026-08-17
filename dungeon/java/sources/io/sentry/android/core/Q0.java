package io.sentry.android.core;

/* JADX INFO: loaded from: classes3.dex */
public enum Q0 {
    SENTRY_HANDLER_STRATEGY_DEFAULT(0),
    SENTRY_HANDLER_STRATEGY_CHAIN_AT_START(1);

    private final int value;

    Q0(int i10) {
        this.value = i10;
    }

    public int getValue() {
        return this.value;
    }
}
