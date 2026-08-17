package io.sentry;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class D1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h4 f44249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f44250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f44251c;

    public D1(h4 h4Var, AbstractC3722j abstractC3722j, Double d10, Map map) {
        this.f44249a = (h4) io.sentry.util.w.c(h4Var, "transactionContexts is required");
        this.f44250b = d10;
        this.f44251c = map == null ? Collections.EMPTY_MAP : map;
    }

    public Double a() {
        return this.f44250b;
    }

    public h4 b() {
        return this.f44249a;
    }
}
