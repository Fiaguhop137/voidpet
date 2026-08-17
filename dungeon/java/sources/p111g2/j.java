package p111g2;

import java.util.Collections;
import java.util.List;
import p182k2.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class j implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f42076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f42077c;

    protected j(String str, List list, boolean z10) {
        this.f42075a = str;
        this.f42076b = Collections.unmodifiableList(list);
        this.f42077c = z10;
    }
}
