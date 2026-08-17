package io.sentry;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class G {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final G f44334b = new G();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f44335a = new CopyOnWriteArrayList();

    public interface a {
    }

    private G() {
    }

    public static G a() {
        return f44334b;
    }

    public void b(a aVar) {
        this.f44335a.add(aVar);
    }
}
