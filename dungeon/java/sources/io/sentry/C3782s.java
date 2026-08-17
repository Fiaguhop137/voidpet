package io.sentry;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: renamed from: io.sentry.s, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3782s implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractC3787t f46478a;

    public /* synthetic */ C3782s(AbstractC3787t abstractC3787t) {
        this.f46478a = abstractC3787t;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        return this.f46478a.c(str);
    }
}
